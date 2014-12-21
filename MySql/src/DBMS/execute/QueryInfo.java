package DBMS.execute;

import java.util.*;
import com.db.minidb.dict.database.*;

public class QueryInfo {
	private static QueryInfo __qInfo;
	private static DictDatabaseInfo __dbInfo;
	private static Stack<SelectSet> __selectStack;
	private QueryInfo(){
		__qInfo = new QueryInfo();
		__dbInfo = null;
		__selectStack = new Stack<SelectSet>();
	}
	public static QueryInfo getInstance (){
		return __qInfo;
	}
	public static boolean chooseDB(String databaseName){
		DictCenterManager.getInstance();
		__dbInfo = DictCenterManager.findDatabaseWithName(databaseName);
		return (__dbInfo != null);
	}
	public static void pushSelect (SelectSet set){
		__selectStack.push(set);
	}
	public static SelectSet topSelect (){
		return __selectStack.firstElement();
	}
	public static SelectSet popSelect (){
		return __selectStack.pop();
	}
}
