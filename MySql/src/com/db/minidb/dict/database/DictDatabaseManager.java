package com.db.minidb.dict.database;
import java.io.*;
import java.util.*;

import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;
import com.db.minidb.util.FileTool;
import com.db.minidb.util.FormatTool;
public class DictDatabaseManager {
	private static Object lockObj = new Object();
	private static DictDatabaseManager instance = new DictDatabaseManager();
	private DictDatabaseManager() {
		
	}
	public static DictDatabaseManager getInstance() {
		return instance;
	}

	public static String getDatabaseDictFileFullPath(DictDatabaseInfo db) {
		synchronized (lockObj) {
			String path = PropertiesFileManager.getProperty("Dict_DataDictDirctory");
			String fullPath = FileTool.openFileFullPath(path, getDatabaseDictFileFullName(db)+".dat" );
			return fullPath;
		}
	}
	public static String getDatabaseDictFileFullPath(int id) {
		synchronized (lockObj) {
			String path = PropertiesFileManager.getProperty("Dict_DataDictDirctory");
			String fullPath = FileTool.openFileFullPath(path, getDatabaseDictFileFullName(id)+".dat" );
			return fullPath;
		}
	}
	public static String getDatabaseDictFileFullName(DictDatabaseInfo db) {
		synchronized (lockObj) {
			int width = Integer.parseInt(PropertiesFileManager.getProperty("Dict_DatabaseIdWidth"));
			String fullName = PropertiesFileManager.getProperty("Dict_DatabaseFileHeader") + "_" 
							+ FormatTool.integerFormatWidth(db.getDatabaseId(), width);
			return fullName;
		}
	}
	public static String getDatabaseDictFileFullName(int id) {
		synchronized (lockObj) {
			int width = Integer.parseInt(PropertiesFileManager.getProperty("Dict_DatabaseIdWidth"));
			String fullName = PropertiesFileManager.getProperty("Dict_DatabaseFileHeader") + "_" 
							+ FormatTool.integerFormatWidth(id, width);
			return fullName;
		}
	}
	public static DictDatabaseInfo readDatabaseInfoFromStream(InputStream is) {
		synchronized (lockObj) {
			DictDatabaseInfo database = new DictDatabaseInfo();
			ArrayList<DictTableInfo> tables = new ArrayList<DictTableInfo>();
			int databaseId = BinaryFileIOTool.readInt(is);
			String databaseName = BinaryFileIOTool.readString(is);
			int tableCount = BinaryFileIOTool.readInt(is);
			int nextTableId = BinaryFileIOTool.readInt(is);
			database.setDatabaseId(databaseId);
			database.setDatabaseName(databaseName);
			database.setTableCount(tableCount);
			database.setNextTableId(nextTableId);
			for(int i = 0; i < tableCount; i++) {
				int tableId = BinaryFileIOTool.readInt(is);
				@SuppressWarnings("unused")
				String tableName = BinaryFileIOTool.readString(is);
				InputStream tis = FileTool.getInputStream(FileTool.openFile(DictTableManager.getTableDictfileFullPath(database, tableId)));
				DictTableInfo table =DictTableManager.readTableInfoFromStream(tis);
				table.setDatabase(database);
				tables.add(table);
			}
			database.setTables(tables);
			return database;
		}
	}
	public static DictDatabaseInfo readDatabaseInfoFromFile(File file) {
		synchronized (lockObj) {
			InputStream is = FileTool.getInputStream(file);
			return readDatabaseInfoFromStream(is);
		}
	}
	public static void writeDatabaseInfoToStream(DictDatabaseInfo database, OutputStream os) {
		synchronized (lockObj) {
			if(database == null) {
				return;
			}
			BinaryFileIOTool.writeInt(database.getDatabaseId(), os);
			BinaryFileIOTool.writeString(database.getDatabaseName(), os);
			BinaryFileIOTool.writeInt(database.getTableCount(), os);
			BinaryFileIOTool.writeInt(database.getNextTableId(), os);
			for(DictTableInfo table : database.getTables()) {
				BinaryFileIOTool.writeInt(table.getTableId(), os);
				BinaryFileIOTool.writeString(table.getTableName(), os);
				OutputStream tos = FileTool.getOutputStream(FileTool.openFile(DictTableManager.getTableDictFileFullPath(table)));
				DictTableManager.writeTableInfoToStream(table, tos);
			}
		}
	}
	public static void writeDatabaseInfoToFile(DictDatabaseInfo database, File file) {
		synchronized (lockObj) {
			if(database == null) {
				return;
			}
			OutputStream os = FileTool.getOutputStream(file);
			writeDatabaseInfoToStream(database, os);
		}
	}
	
	public static String displayDatabase(DictDatabaseInfo database) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("\t" + "database: " + database.getDatabaseId() + " " + database.getDatabaseName() + " hava table: " + database.getTableCount() + "\r\n");
			for(DictTableInfo table : database.getTables()) {
				bf.append("\t\t");
				bf.append(DictTableManager.displayTableInfo(table));
				bf.append("\r\n");
				bf.append(DataTableManager.displayTable(DataTableManager.loadTable(table)));
			}
			return bf.toString();
		}
	}
}
