package com.db.minidb.data.value;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.util.BinaryFileIOTool;

public class ValueString extends ValueBase {
	public ValueString() {
		super();
	}

	public ValueString(TypeDataEnum type, Object value) {
		super(type, value);
	}

	public ValueBase readValue(InputStream is) {
		String v = BinaryFileIOTool.readString(is);
		this.value = v;
		return new ValueString(TypeDataEnum.STRING, v);
	}

	public void writeValue(OutputStream os) {
		BinaryFileIOTool.writeString((String) this.value, os);
	}

	public String displayValue() {
		return (String) this.value;
	}
}
