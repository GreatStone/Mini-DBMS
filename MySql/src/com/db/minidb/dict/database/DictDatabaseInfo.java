package com.db.minidb.dict.database;
import java.util.*;
public class DictDatabaseInfo {
	private int databaseId;
	private String databaseName;
	private int nextTableId;
	private int tableCount;
	private List<DictTableInfo> tables;
	public DictDatabaseInfo() {
		this(-1, null);
	}
	public DictDatabaseInfo(int id, String name) {
		this(id, name, 0, 0, new ArrayList<DictTableInfo>());
	}
	public DictDatabaseInfo(int id, String name, int next, int cnt, List<DictTableInfo> tbs) {
		this.databaseId = id;
		this.databaseName = name;
		this.nextTableId = next;
		this.tableCount = cnt;
		this.tables = tbs;
	}
	public int getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(int databaseId) {
		this.databaseId = databaseId;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public int getNextTableId() {
		return nextTableId;
	}
	public void setNextTableId(int nextTableId) {
		this.nextTableId = nextTableId;
	}
	public int getTableCount() {
		return tableCount;
	}
	public void setTableCount(int tableCount) {
		this.tableCount = tableCount;
	}
	public List<DictTableInfo> getTables() {
		return tables;
	}
	public void setTables(List<DictTableInfo> tables) {
		this.tables = tables;
	}
	
}
