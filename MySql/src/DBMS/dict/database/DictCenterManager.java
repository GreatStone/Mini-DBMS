package DBMS.dict.database;

import java.util.*;

import DBMS.data.database.DataCenterManager;
import DBMS.dict.type.TypeDataEnum;
import DBMS.sys.server.Session;
import DBMS.sys.setting.PropertiesFileManager;
import DBMS.util.FileTool;

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
			System.out.println(database.getDatabaseName() + "~" + database.getDatabaseId());
			databaseList.getDatabases().add(database);
			databaseList.setDatabaseCount(databaseList.getDatabases().size());
			databaseList
					.setNextDatabaseId(databaseList.getNextDatabaseId() + 1);
			
			storeDataDict();
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
			String[] columnsName, String[] columnsType, String[] keysName, Session session) {
		synchronized (lockObj) {
			addTable(database, tableName, columnsName, columnsType, keysName);
			DictDatabaseManager.writeDatabaseInfoToFile(database, FileTool
					.openFile(DictDatabaseManager
							.getDatabaseDictFileFullPath(database)));
			return false;
		}
	}

	public static boolean addTable(DictDatabaseInfo database, String tableName,
			String[] columnsName, String[] columnsType, String[] keysName) {
		synchronized (lockObj) {
			DictTableInfo table = createTable(database, tableName, columnsName,
					columnsType, keysName);
			database.getTables().add(table);
			database.setTableCount(database.getTables().size());
			database.setNextTableId(database.getNextTableId() + 1);
			DictDatabaseManager.writeDatabaseInfoToFile(database, FileTool
					.openFile(DictDatabaseManager
							.getDatabaseDictFileFullPath(database)));
			DataCenterManager.storeEmptyTable(table,
					database.getNextTableId() - 1);
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
			String tableName, String[] columnsName, String[] columnsType, String[] keysName) {
		synchronized (lockObj) {
			DictTableInfo table = new DictTableInfo();
			table.setDatabase(database);
			table.setTableId(database.getNextTableId());
			table.setTableName(tableName);
			table.setColumns(createColumns(table, columnsName, columnsType));
			table.setColumnCount(table.getColumns().size());
			ArrayList<DictColumnInfo> keys = new ArrayList<DictColumnInfo>();
			for(String key : keysName) {
				for(DictColumnInfo col : table.getColumns()) {
					if(col.getColumnName().equals(key)) {
						keys.add(col);
						break;
					}
				}
			}
			table.setPrimaryKeys(keys);
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
