package DBMS.execute;

import java.util.*;

public class SelectSet {
	private static int databaseId;
	
	private List<String> tableName;
	
	public SelectSet (){
		this.tableName = new ArrayList<String>();
	}

	public void addTable(String table) {
		tableName.add(table);
		//TODO to load the table in;
	}

	public static int getDatabaseId() {
		return databaseId;
	}

	public static void setDatabaseId(int databaseId) {
		SelectSet.databaseId = databaseId;
	}
}
