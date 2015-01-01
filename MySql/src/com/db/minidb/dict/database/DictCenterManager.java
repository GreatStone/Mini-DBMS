package com.db.minidb.dict.database;

import java.util.*;

import com.db.minidb.data.database.DataCenterManager;
import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.sys.server.Session;
import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.FileTool;

public class DictCenterManager {
	private static Object lockObj = new Object();
	private static DictDatabaseListInfo databaseList = null;
	private static DictCenterManager instance = new DictCenterManager();

	private DictCenterManager() {

	}

	public static DictCenterManager getInstance() {
		return instance;
	}

	public static DictDatabaseListInfo getDatabaseList() {
		return databaseList;
	}

	public static void setDatabaseList(DictDatabaseListInfo databaseList) {
		DictCenterManager.databaseList = databaseList;
	}

	public static void init() {
		loadDataDict();
	}

	public static void loadDataDict() {
		synchronized (lockObj) {
			// TODO
			databaseList = DictDatabaseListManager
					.readDatabaseListFromFile(FileTool
							.openFile(DictDatabaseListManager
									.getDatabaseListDictFileFullPath()));
		}
	}

	public static void storeDataDict() {
		synchronized (lockObj) {
			DictDatabaseListManager.writeDatabaseListToFile(databaseList,
					FileTool.openFile(DictDatabaseListManager
							.getDatabaseListDictFileFullPath()));
		}
	}

	public static boolean addDatabase(String databaseName, Session session) {
		synchronized (lockObj) {
			addDatabase(databaseName);
			DictDatabaseListManager.writeDatabaseListToFile(databaseList,
					FileTool.openFile(DictDatabaseListManager
							.getDatabaseListDictFileFullPath()));
			return false;
		}
	}

	public static boolean addDatabase(String databaseName) {
		synchronized (lockObj) {
			DictDatabaseInfo database = createDatabase(databaseName);
			database.setDatabaseId(databaseList.getNextDatabaseId());
			databaseList.getDatabases().add(database);
			databaseList.setDatabaseCount(databaseList.getDatabases().size());
			databaseList
					.setNextDatabaseId(databaseList.getNextDatabaseId() + 1);
			DictDatabaseListManager.writeDatabaseListToFile(databaseList,
					FileTool.openFile(DictDatabaseListManager
							.getDatabaseListDictFileFullPath()));
			return false;
		}
	}

	public static boolean removeDatabase(String databaseName, Session session) {
		synchronized (lockObj) {
			return false;
		}
	}

	public static DictDatabaseInfo findDatabaseWithName(String databaseName) {
		synchronized (lockObj) {
			for (DictDatabaseInfo database : databaseList.getDatabases()) {
				if (database.getDatabaseName().equals(databaseName)) {
					return database;
				}
			}
			return null;
		}
	}

	public static boolean addTable(DictDatabaseInfo database, String tableName,
			String[] columnsName, String[] columnsType, Session session) {
		synchronized (lockObj) {
			addTable(database, tableName, columnsName, columnsType);
			DictDatabaseManager.writeDatabaseInfoToFile(database, FileTool
					.openFile(DictDatabaseManager
							.getDatabaseDictFileFullPath(database)));
			return false;
		}
	}

	public static boolean addTable(DictDatabaseInfo database, String tableName,
			String[] columnsName, String[] columnsType) {
		synchronized (lockObj) {
			DictTableInfo table = createTable(database, tableName, columnsName,
					columnsType);
			database.getTables().add(table);
			database.setTableCount(database.getTables().size());
			database.setNextTableId(database.getNextTableId() + 1);
			DictDatabaseManager.writeDatabaseInfoToFile(database, FileTool
					.openFile(DictDatabaseManager
							.getDatabaseDictFileFullPath(database)));
			DataCenterManager.storeEmptyTable(table,database.getNextTableId()-1);
			return true;
		}
	}

	public static boolean removeTable(String databaseName, String tableName,
			Session session) {
		synchronized (lockObj) {
			return false;
		}
	}

	public static DictTableInfo findTableWithName(DictDatabaseInfo database,
			String tableName) {
		synchronized (lockObj) {
			for (DictTableInfo table : database.getTables()) {
				if (table.getTableName().equals(tableName)) {
					return table;
				}
			}
			return null;
		}
	}

	public static List<DictColumnInfo> createColumns(String[] columnsName,
			String[] columnsType) {
		synchronized (lockObj) {
			ArrayList<DictColumnInfo> columns = new ArrayList<DictColumnInfo>();
			for (int i = 0; i < columnsType.length; i++) {
				String typeEnum = PropertiesFileManager
						.getProperty(columnsType[i]);
				DictColumnInfo col = new DictColumnInfo(
						TypeDataEnum.valueOf(typeEnum));
				col.setColumnName(columnsName[i]);
				columns.add(col);
			}
			return columns;
		}
	}

	public static List<DictColumnInfo> createColumns(DictTableInfo table,
			String[] columnsName, String[] columnsType) {
		synchronized (lockObj) {
			List<DictColumnInfo> columns = createColumns(columnsName,
					columnsType);
			for (DictColumnInfo col : columns) {
				col.setTable(table);
				col.setTableId(table.getTableId());
				col.setDatabaseId(table.getDatabase().getDatabaseId());
			}
			return columns;
		}
	}

	// public static DictTableInfo createTable(String tableName, String[]
	// columnsName, String[] columnsType) {
	// synchronized (lockObj) {
	// DictTableInfo table = new DictTableInfo();
	//
	// return table;
	// }
	// }
	public static DictTableInfo createTable(DictDatabaseInfo database,
			String tableName, String[] columnsName, String[] columnsType) {
		synchronized (lockObj) {
			DictTableInfo table = new DictTableInfo();
			table.setDatabase(database);
			table.setTableId(database.getNextTableId());
			table.setTableName(tableName);
			table.setColumns(createColumns(table, columnsName, columnsType));
			table.setColumnCount(table.getColumns().size());
			return table;
		}
	}

	public static DictDatabaseInfo createDatabase(String databaseName) {
		synchronized (lockObj) {
			DictDatabaseInfo database = new DictDatabaseInfo();
			database.setDatabaseName(databaseName);
			database.setTableCount(0);
			database.setNextTableId(1);
			database.setTables(new ArrayList<DictTableInfo>());
			return database;
		}
	}
}
