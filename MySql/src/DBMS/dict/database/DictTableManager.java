package DBMS.dict.database;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import DBMS.data.database.DataTableManager;
import DBMS.sys.setting.PropertiesFileManager;
import DBMS.util.BinaryFileIOTool;
import DBMS.util.FileTool;
import DBMS.util.FormatTool;

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
			int keysCount = BinaryFileIOTool.readInt(is);
			ArrayList<DictColumnInfo> cols = new ArrayList<DictColumnInfo>();
			ArrayList<DictColumnInfo> keys = new ArrayList<DictColumnInfo>();
			table.setTableId(tableId);
			table.setTableName(tableName);
			table.setColumnCount(columnCount);
			for(int i = 0; i < columnCount; i++) {
				cols.add(DictColumnManager.readColumnInfoFromStream(is));
			}
			table.setColumns(cols);
			for(int i = 0; i < keysCount; i++) {
				keys.add(DictColumnManager.readColumnInfoFromStream(is));
			}
			table.setPrimaryKeys(keys);
			return table;
		}
	}
	public static DictTableInfo readTableInfoFromFile(String fileName) {
		synchronized (lockObj) {
			InputStream is = FileTool.getInputStream(FileTool.openFile(fileName));
			DictTableInfo ret = readTableInfoFromStream(is);
			FileTool.closeInputStream(is);
			return ret;
		}
	}
	public static void writeTableInfoToStream(DictTableInfo table, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(table.getDatabase().getDatabaseId(), os);
			BinaryFileIOTool.writeInt(table.getTableId(), os);
			BinaryFileIOTool.writeString(table.getTableName(), os);
			BinaryFileIOTool.writeInt(table.getColumnCount(), os);
			BinaryFileIOTool.writeInt(table.getPrimaryKeysCount(), os);
			for(DictColumnInfo col : table.getColumns()) {
				DictColumnManager.writeColumnInfoToStream(col, os);
			}
			for(DictColumnInfo col : table.getPrimaryKeys()) {
				DictColumnManager.writeColumnInfoToStream(col, os);
			}
		}
	}
	public static void writeTableInfoToFile(DictTableInfo table, String fileName) {
		synchronized (lockObj) {
			OutputStream os = FileTool.getOutputStream(FileTool.openFile(fileName));
			writeTableInfoToStream(table, os);
			FileTool.closeOutputStream(os);
		}
	}
	
	public static String displayColumns(DictTableInfo table) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("(");
			boolean hasCol = false;
			for (DictColumnInfo col : table.getColumns()) {
				if(!hasCol) {
					hasCol = true;
				}
				else {
					bf.append(", ");
				}
				bf.append(col.getColumnName() + " "
								+ col.getType().getTypeEnum());
			}
			bf.append(") [primary(");
			boolean hasKey = false;
			for (DictColumnInfo key : table.getPrimaryKeys()) {
				if(!hasKey) {
					hasKey = true;
				}
				else {
					bf.append(", ");
				}
				bf.append(String.format("%s", key.getColumnName()));
			}
			bf.append(")]");
			return bf.toString();
		}
	}

	public static String displayTableInfo(DictTableInfo table) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("table: " + table.getTableId() + " "
					+ table.getTableName() + " have columns: "
					+ table.getColumnCount() + "\n");
			for (DictColumnInfo col : table.getColumns()) {
				bf.append(String.format(" %20s", col.getColumnName() + " "
								+ col.getType().getTypeEnum()));
			}
			bf.append(" [primary(");
			boolean hasKey = false;
			for (DictColumnInfo key : table.getPrimaryKeys()) {
				if(!hasKey) {
					hasKey = true;
				}
				else {
					bf.append(",");
				}
				bf.append(String.format("%s", key.getColumnName()));
			}
			bf.append(")]");
			return bf.toString();
		}
	}
	public static boolean removeDataFile(DictTableInfo table) {
		synchronized (lockObj) {
			if(table == null) return false;
			String fileName = DataTableManager.getTableDataFileFullPath(table);
			File file = FileTool.openFile(fileName);
			boolean flag = false;
			if(file.isFile() && file.exists()) {
				flag = file.delete();
			}
			return true;
		}
	}
	public static boolean removeDictFile(DictTableInfo table) {
		synchronized (lockObj) {
			if(table == null) return false;
			String fileName = DictTableManager.getTableDictFileFullPath(table);
			try {
				java.nio.file.Files.delete(FileTool.openFile(fileName).toPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
	}
}
