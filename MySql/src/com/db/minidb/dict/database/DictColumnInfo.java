package com.db.minidb.dict.database;

import com.db.minidb.dict.type.*;

public class DictColumnInfo {
	private DictTableInfo table;
	private TypeBase type;
	private String columnName;
	private int databaseId;
	private int tableId;
	public DictColumnInfo() {
		this(TypeDataEnum.STRING);
	}
	public DictColumnInfo(TypeDataEnum t) {
		this.type = TypeManager.createByType(t.toString());
		this.table = null;
		this.columnName = null;
	}
	public DictColumnInfo(DictTableInfo tb, TypeDataEnum t, String name) {
		this(t);
		this.table = tb;
		this.columnName = name;
	}
	public DictTableInfo getTable() {
		return table;
	}
	public void setTable(DictTableInfo table) {
		this.table = table;
	}
	public TypeBase getType() {
		return type;
	}
	public void setType(TypeBase type) {
		this.type = type;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
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
}
