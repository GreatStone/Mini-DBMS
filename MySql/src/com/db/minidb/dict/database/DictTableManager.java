package com.db.minidb.dict.database;

import java.io.*;
import java.util.*;

import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;
import com.db.minidb.util.FileTool;
import com.db.minidb.util.FormatTool;

public class DictTableManager {
	private static Object lockObj = new Object();
	private static DictTableManager instance = new DictTableManager();

	private DictTableManager() {

	}

	public static DictTableManager getInstance() {
		return instance;
	}

	public static String getTableDictFileFullName(DictDatabaseInfo database,
			int tableId) {
		synchronized (lockObj) {
			int width = Integer.parseInt(PropertiesFileManager
					.getProperty("Dict_DatabaseIdWidth"));
			String fullName = DictDatabaseManager
					.getDatabaseDictFileFullName(database)
					+ "_"
					+ FormatTool.integerFormatWidth(tableId, width);
			return fullName;
		}
	}

	public static String getTableDictFileFullName(DictTableInfo table) {
		synchronized (lockObj) {
			int width = Integer.parseInt(PropertiesFileManager
					.getProperty("Dict_DatabaseIdWidth"));
			String fullName = DictDatabaseManager
					.getDatabaseDictFileFullName(table.getDatabase())
					+ "_"
					+ FormatTool.integerFormatWidth(table.getTableId(), width);
			return fullName;
		}
	}

	public static String getTableDictfileFullPath(DictDatabaseInfo database,
			int tableId) {
		synchronized (lockObj) {
			String fullName = getTableDictFileFullName(database, tableId);
			String path = PropertiesFileManager
					.getProperty("Dict_DataDictDirctory");
			return FileTool.openFileFullPath(path, fullName + ".dat");
		}
	}

	public static String getTableDictFileFullPath(DictTableInfo table) {
		synchronized (lockObj) {
			String fullName = getTableDictFileFullName(table);
			String path = PropertiesFileManager
					.getProperty("Dict_DataDictDirctory");
			return FileTool.openFileFullPath(path, fullName + ".dat");
		}
	}

	public static DictTableInfo readTableInfoFromStream(InputStream is) {
		synchronized (lockObj) {
			DictTableInfo table = new DictTableInfo();
			@SuppressWarnings("unused")
			int databaseId = BinaryFileIOTool.readInt(is);
			int tableId = BinaryFileIOTool.readInt(is);
			String tableName = BinaryFileIOTool.readString(is);
			int columnCount = BinaryFileIOTool.readInt(is);
			ArrayList<DictColumnInfo> cols = new ArrayList<DictColumnInfo>();
			table.setTableId(tableId);
			table.setTableName(tableName);
			table.setColumnCount(columnCount);
			for (int i = 0; i < columnCount; i++) {
				cols.add(DictColumnManager.readColumnInfoFromStream(is));
			}
			table.setColumns(cols);
			return table;
		}
	}

	public static DictTableInfo readTableInfoFromFile(File file) {
		synchronized (lockObj) {
			InputStream is = FileTool.getInputStream(file);
			return readTableInfoFromStream(is);
		}
	}

	public static void writeTableInfoToStream(DictTableInfo table,
			OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(table.getDatabase().getDatabaseId(), os);
			BinaryFileIOTool.writeInt(table.getTableId(), os);
			BinaryFileIOTool.writeString(table.getTableName(), os);
			BinaryFileIOTool.writeInt(table.getColumnCount(), os);
			for (DictColumnInfo col : table.getColumns()) {
				DictColumnManager.writeColumnInfoToStream(col, os);
			}
		}
	}

	public static void writeTableInfoToFile(DictTableInfo table, File file) {
		synchronized (lockObj) {
			OutputStream os = FileTool.getOutputStream(file);
			writeTableInfoToStream(table, os);
		}
	}

	public static String displayTableInfo(DictTableInfo table) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("table: " + table.getTableId() + " "
					+ table.getTableName() + " have columns: "
					+ table.getColumnCount() + "\r\n");
			for (DictColumnInfo col : table.getColumns()) {
				bf.append("\t\t"
						+ String.format("%15s", col.getColumnName() + " "
								+ col.getType().getTypeEnum()));
			}
			return bf.toString();
		}
	}
}
