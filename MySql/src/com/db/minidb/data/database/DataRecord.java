package com.db.minidb.data.database;

import java.util.*;

import com.db.minidb.data.value.ValueBase;

public class DataRecord {
	private List<ValueBase> values;
	public DataRecord (){
		values = new ArrayList<ValueBase>();
	}
	public List<ValueBase> getValues() {
		return values;
	}
	public void setValues(List<ValueBase> values) {
		this.values = values;
	}
}
