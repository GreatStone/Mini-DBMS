package com.db.minidb.data.database;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.db.minidb.dict.database.DictColumnInfo;
import com.db.minidb.dict.database.DictColumnManager;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;
import com.db.minidb.util.FileTool;
import com.db.minidb.util.FormatTool;

public class DataTableManager {
	private static Object lockObj = new Object();
	private static DataTableManager instance = new DataTableManager();
	private DataTableManager() {
		
	}
	public static DataTableManager getInstance() {
		return instance;
	}
	public static String getTableDataFileFullPath(DictTableInfo table) {
		synchronized (lockObj) {
			String fullName = getTableDataFileFullName(table);
			String path = PropertiesFileManager.getProperty("Data_DataFileDirctory");
			return FileTool.openFileFullPath(path, fullName+".dat");
		}
	}
	public static String getTableDataFileFullPath(DataTable table) {
		synchronized (lockObj) {
			String fullName = getTableDataFileFullName(table);
			String path = PropertiesFileManager.getProperty("Data_DataFileDirctory");
			return FileTool.openFileFullPath(path, fullName+".dat");
		}
	}
	public static String getTableDataFileFullName(DictTableInfo table) {
		synchronized (lockObj) {
			int databaseIdWidth = Integer.parseInt(PropertiesFileManager.getProperty("Dict_DatabaseIdWidth"));
			int tableIdWidth = Integer.parseInt(PropertiesFileManager.getProperty("Dict_TableIdWidth"));
			String fullName =  PropertiesFileManager.getProperty("Data_DataFileHeader")
								+ "_" 
							+ FormatTool.integerFormatWidth(table.getDatabase().getDatabaseId(), databaseIdWidth)
							+ "_"
							+ FormatTool.integerFormatWidth(table.getTableId(), tableIdWidth);
			return fullName;
		}
	}
	public static String getTableDataFileFullName(DataTable table) {
		synchronized (lockObj) {
			int databaseIdWidth = Integer.parseInt(PropertiesFileManager.getProperty("Dict_DatabaseIdWidth"));
			int tableIdWidth = Integer.parseInt(PropertiesFileManager.getProperty("Dict_TableIdWidth"));
			String fullName =  PropertiesFileManager.getProperty("Data_DataFileHeader")
								+ "_" 
							+ FormatTool.integerFormatWidth(table.getDatabaseId(), databaseIdWidth)
							+ "_"
							+ FormatTool.integerFormatWidth(table.getTableId(), tableIdWidth);
			return fullName;
		}
	}
	public static DataTable loadTable(DictTableInfo table) {
		synchronized (lockObj) {
			InputStream is = FileTool.getInputStream(FileTool.openFile(getTableDataFileFullPath(table)));
			return readDataTableFromStream(is);
		}
	}
	public static DataTable readDataTableFromStream(InputStream is) {
		synchronized (lockObj) {
			DataTable table = new DataTable();
			table.setDatabaseId(BinaryFileIOTool.readInt(is));
			table.setTableId(BinaryFileIOTool.readInt(is));
			table.setColumns(readColumnsFromStream(is));
			table.setRecords(readRecordsFromStream(table.getColumns(), is));
			return table;
		}
	}
	public static List<DictColumnInfo> readColumnsFromStream(InputStream is) {
		synchronized (lockObj) {
			ArrayList<DictColumnInfo> columns = new ArrayList<DictColumnInfo>();
			int count = BinaryFileIOTool.readInt(is);
			for(int i = 0; i < count; i++) {
				columns.add(DictColumnManager.readColumnInfoFromStream(is));
			}
			return columns;
		}
	}
	public static List<DataRecord> readRecordsFromStream(List<DictColumnInfo> columns, InputStream is) {
		synchronized (lockObj) {
			List<DataRecord> records = new ArrayList<DataRecord>();
			int count = BinaryFileIOTool.readInt(is);
			for(int i = 0; i < count; i++) {
				records.add(DataRecordManager.readRecord(columns, is));
			}
			return records;
		}
	}
	public static void storeTable(DataTable table) {
		synchronized (lockObj) {
			OutputStream os = FileTool.getOutputStream(FileTool.openFile(getTableDataFileFullPath(table)));
			writeDataTableToStream(table, os);
		}
	}
	public static void writeDataTableToStream(DataTable table, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(table.getDatabaseId(), os);
			BinaryFileIOTool.writeInt(table.getTableId(), os);
			writeColumnsToStream(table.getColumns(), os);
			writeRecordsToStream(table.getRecords(), os);
		}
	}
	public static void writeColumnsToStream(List<DictColumnInfo> columns, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(columns.size(), os);
			for(DictColumnInfo col : columns) {
				DictColumnManager.writeColumnInfoToStream(col, os);
			}
		}
	}
	public static void writeRecordsToStream(List<DataRecord> records, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(records.size(), os);
			for(DataRecord rec : records) {
				DataRecordManager.writeRecord(rec, os);
			}
		}
	}
	
	public static String displayTable(DataTable table) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			bf.append("\t\t");
			for(DictColumnInfo col : table.getColumns()) {
				bf.append(String.format("%10s", col.getColumnName() ));
			}
			bf.append("\r\n");
			for(DataRecord record : table.getRecords()) {
				bf.append("\t\t" + DataRecordManager.displayRecord(record) + "\r\n");
			}
			return bf.toString();
		}
	}
}
