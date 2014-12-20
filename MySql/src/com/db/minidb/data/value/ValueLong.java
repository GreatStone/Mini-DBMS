package com.db.minidb.data.value;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.util.BinaryFileIOTool;

public class ValueLong extends ValueBase {
	
	public ValueLong() {
		super();
	}
	public ValueLong(TypeDataEnum type, Object value) {
		super(type, value);
	}
	public ValueBase readValue(InputStream is) {
		Long v = BinaryFileIOTool.readLong(is);
		this.value = v;
		return new ValueLong(TypeDataEnum.LONG, v);
	}
	public void writeValue(OutputStream os) {
		BinaryFileIOTool.writeLong((Long)this.value, os);
	}
	public String displayValue() {
		return ((Long)this.value).toString();
	}
}
