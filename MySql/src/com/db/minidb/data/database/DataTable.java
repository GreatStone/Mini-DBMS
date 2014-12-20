package com.db.minidb.data.database;
import java.util.*;

import com.db.minidb.dict.database.DictColumnInfo;
public class DataTable {
	private int databaseId;
	private int tableId;
	private List<DictColumnInfo> columns;
	private List<DataRecord> records;
	public int getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(int databaseId) {
		this.databaseId = databaseId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public List<DictColumnInfo> getColumns() {
		return columns;
	}
	public void setColumns(List<DictColumnInfo> columns) {
		this.columns = columns;
	}
	public List<DataRecord> getRecords() {
		return records;
	}
	public void setRecords(List<DataRecord> datas) {
		this.records = datas;
	}
}
