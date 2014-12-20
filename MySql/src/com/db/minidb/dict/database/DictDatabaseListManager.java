package com.db.minidb.dict.database;
import java.io.*;
import java.util.*;

import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;
import com.db.minidb.util.FileTool;

public class DictDatabaseListManager {
	private static Object lockObj = new Object();
	private static DictDatabaseListManager instance = new DictDatabaseListManager();
	private DictDatabaseListManager() {
		
	}
	public static DictDatabaseListManager getInstance() {
		return instance;
	}
	public static String getDatabaseListDictFileFullPath() {
		synchronized (lockObj) {
			String path = PropertiesFileManager.getProperty("Dict_DataDictDirctory");
			String fullPath = FileTool.openFileFullPath(path, getDatabaseListDictFileFullName()+".dat" );
			return fullPath;
		}
	}
	public static String getDatabaseListDictFileFullName() {
		synchronized (lockObj) {
			String fullName = PropertiesFileManager.getProperty("Dict_DatabaseFileHeader");
			return fullName;
		}
	}
	private static DictDatabaseListInfo readDatabaseListFromStream(InputStream is) {
		synchronized (lockObj) {
			DictDatabaseListInfo databaseList = new DictDatabaseListInfo();
			ArrayList<DictDatabaseInfo> databases = new ArrayList<DictDatabaseInfo>();
			int databaseCount = BinaryFileIOTool.readInt(is);
			int nextDatabaseId = BinaryFileIOTool.readInt(is);
			databaseList.setDatabaseCount(databaseCount);
			databaseList.setNextDatabaseId(nextDatabaseId);
			for(int i = 0; i < databaseCount; i++) {
				int databaseId = BinaryFileIOTool.readInt(is);
				@SuppressWarnings("unused")
				String databaseName = BinaryFileIOTool.readString(is);
				InputStream dis = FileTool.getInputStream(FileTool.openFile(DictDatabaseManager.getDatabaseDictFileFullPath(databaseId)));
				databases.add(DictDatabaseManager.readDatabaseInfoFromStream(dis));				
			}
			databaseList.setDatabases(databases);
			return databaseList;
		}
	}
	private static void writeDatabaseListToStream(DictDatabaseListInfo databaseList, OutputStream os) {
		synchronized (lockObj) {
			if(databaseList == null) {
				return;
			}
			BinaryFileIOTool.writeInt(databaseList.getDatabaseCount(), os);
			BinaryFileIOTool.writeInt(databaseList.getNextDatabaseId(), os);
			for(DictDatabaseInfo database : databaseList.getDatabases()) {
				DictDatabaseManager.writeDatabaseInfoToStream(database, os);
			}
		}
	}
	public static void writeDatabaseListToFile(DictDatabaseListInfo databaseList, File file) {
		synchronized (lockObj) {
			if(databaseList == null) {
				return;
			}
			OutputStream os = FileTool.getOutputStream(file);
			writeDatabaseListToStream(databaseList, os);
		}
	}
	public static DictDatabaseListInfo readDatabaseListFromFile(File file) {
		synchronized (lockObj) {
			InputStream is = FileTool.getInputStream(file);
			return readDatabaseListFromStream(is);
		}
	}
	
	public static String displayDatabaseList(DictDatabaseListInfo databaseList) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("have database " + databaseList.getDatabaseCount() + ": " + "\r\n");
			for(DictDatabaseInfo database : databaseList.getDatabases()) {
				bf.append(DictDatabaseManager.displayDatabase(database));
			}
			return bf.toString();
		}
	}
}
