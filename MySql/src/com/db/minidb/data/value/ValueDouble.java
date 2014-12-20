package com.db.minidb.data.value;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.util.BinaryFileIOTool;

public class ValueDouble extends ValueBase {
	
	public ValueDouble() {
		super();
	}

	public ValueDouble(TypeDataEnum type, Object value) {
		super(type, value);
	}

	public ValueBase readValue(InputStream is) {
		Double v = BinaryFileIOTool.readDouble(is);
		this.value = v;
		return new ValueDouble(TypeDataEnum.DOUBLE, v);
	}

	public void writeValue(OutputStream os) {
		BinaryFileIOTool.writeDouble((Double)this.value, os);
	}

	public String displayValue() {
		return String.format("%.6f", (Double)this.value);
	}
}
