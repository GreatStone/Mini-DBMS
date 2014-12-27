package DBMS.parser;

import com.db.minidb.data.value.ValueBase;

public interface ValueTree {
	public ValueBase getValue ();
	public void setValue(ValueBase value);
}
