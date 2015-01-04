package DBMS.parser;

import DBMS.data.value.ValueBase;

public interface ValueTree {
	public ValueBase getValue();

	public void setValue(ValueBase value);
}
