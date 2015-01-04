package DBMS.dict.database;

import java.util.ArrayList;
import java.util.List;

public class DictTableInfo {
	private DictDatabaseInfo database;
	private int tableId;
	private String tableName;
	private int columnCount;
	private List<DictColumnInfo> columns;
	private List<DictColumnInfo> primaryKeys;

	public DictTableInfo() {
		this(null, -1, null);
	}

	public DictTableInfo(DictDatabaseInfo db, int id, String name) {
		this(db, id, name, 0, new ArrayList<DictColumnInfo>(), new ArrayList<DictColumnInfo>());
	}

	public DictTableInfo(DictDatabaseInfo db, int id, String name, int cnt,
			List<DictColumnInfo> cols, List<DictColumnInfo> keys) {
		this.database = db;
		this.tableId = id;
		this.tableName = name;
		this.columnCount = cnt;
		this.columns = cols;
		this.primaryKeys = keys;
	}

	public DictDatabaseInfo getDatabase() {
		return database;
	}

	public void setDatabase(DictDatabaseInfo database) {
		this.database = database;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}

	public List<DictColumnInfo> getColumns() {
		return columns;
	}

	public void setColumns(List<DictColumnInfo> columns) {
		this.columns = columns;
	}

	public List<DictColumnInfo> getPrimaryKeys() {
		return primaryKeys;
	}

	public void setPrimaryKeys(List<DictColumnInfo> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
	
	public int getPrimaryKeysCount() {
		return this.primaryKeys.size();
	}
	public boolean askReadLock() {
		return DictLockManager.askReadLock(this.database.getDatabaseId(), this.tableId);
	}
	public boolean askWriteLock() {
		return DictLockManager.askWriteLock(this.database.getDatabaseId(), this.tableId);
	}
	public void releaseReadLock() {
		DictLockManager.releaseReadLock(this.database.getDatabaseId(), this.tableId);
	}
	public void releaseWriteLock() {
		DictLockManager.releaseWriteLock(this.database.getDatabaseId(), this.tableId);
	}
}
