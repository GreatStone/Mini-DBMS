package com.db.minidb.data.value;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.util.BinaryFileIOTool;

public class ValueBool extends ValueBase {

	public ValueBool() {
		super();
	}

	public ValueBool(TypeDataEnum type, Object value) {
		super(type, value);
	}

	public ValueBase readValue(InputStream is) {
		Double v = BinaryFileIOTool.readDouble(is);
		this.value = v;
		return new ValueBool(TypeDataEnum.BOOLEAN, v);
	}

	public void writeValue(OutputStream os) {
		// BinaryFileIOTool.writeDouble((Double)this.value, os);
	}

	public String displayValue() {
		return value.toString();
	}
}
