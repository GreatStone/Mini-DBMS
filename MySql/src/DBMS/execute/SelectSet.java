package DBMS.execute;

public class SelectSet {
	private static int databaseId;
	
	public SelectSet (){
	}
	
	public static int getDatabaseId() {
		return databaseId;
	}

	public static void setDatabaseId(int databaseId) {
		SelectSet.databaseId = databaseId;
	}
}
