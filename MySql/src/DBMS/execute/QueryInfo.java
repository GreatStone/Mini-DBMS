package DBMS.execute;

import com.db.minidb.dict.database.*;

public class QueryInfo {
	private static QueryInfo __qInfo = new QueryInfo();
	private static DictDatabaseInfo __dbInfo = null;
	private QueryInfo(){
	}
	public static QueryInfo getInstance (){
		return __qInfo;
	}
	public static boolean chooseDB(String databaseName){
		DictCenterManager.getInstance();
		__dbInfo = DictCenterManager.findDatabaseWithName(databaseName);
		return (__dbInfo != null);
	}
	public static DictDatabaseInfo get__dbInfo() {
		return __dbInfo;
	}
}
