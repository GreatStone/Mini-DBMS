package DBMS.data.database;

import java.util.*;

import DBMS.data.value.ValueBase;

public class DataRecord {
	private List<ValueBase> values;

	public DataRecord() {
		values = new ArrayList<ValueBase>();
	}

	public List<ValueBase> getValues() {
		return values;
	}

	public void setValues(List<ValueBase> values) {
		this.values = values;
	}
}
