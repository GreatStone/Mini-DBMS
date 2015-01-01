package com.db.minidb.dict.database;

import java.util.*;

public class DictDatabaseListInfo {
	private int databaseCount;
	private int nextDatabaseId;
	private List<DictDatabaseInfo> databases;

	public DictDatabaseListInfo() {
		this(-1, -1, null);
	}

	public DictDatabaseListInfo(int cnt, int next, List<DictDatabaseInfo> dbs) {
		this.databaseCount = cnt;
		this.nextDatabaseId = next;
		this.databases = dbs;
	}

	public int getDatabaseCount() {
		return databaseCount;
	}

	public void setDatabaseCount(int databaseCount) {
		this.databaseCount = databaseCount;
	}

	public int getNextDatabaseId() {
		return nextDatabaseId;
	}

	public void setNextDatabaseId(int nextDatabaseId) {
		this.nextDatabaseId = nextDatabaseId;
	}

	public List<DictDatabaseInfo> getDatabases() {
		return databases;
	}

	public void setDatabases(List<DictDatabaseInfo> databases) {
		this.databases = databases;
	}
}
