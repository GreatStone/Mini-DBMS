package DBMS.execute;

import com.db.minidb.data.value.ValueBase;

public interface ExecuteConsole {
	public ValueBase getColValue(String Column) throws Exception;
}
