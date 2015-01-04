package DBMS.data.value;

import java.io.InputStream;
import java.io.OutputStream;

import DBMS.dict.type.TypeDataEnum;
import DBMS.util.BinaryFileIOTool;

public class ValueInt extends ValueBase {
	public ValueInt() {
		super();
	}

	public ValueInt(TypeDataEnum type, Object value) {
		super(type, value);
	}

	public ValueBase readValue(InputStream is) {
		Integer v = BinaryFileIOTool.readInt(is);
		this.value = v;
		return new ValueInt(TypeDataEnum.INT, v);
	}

	public void writeValue(OutputStream os) {
		BinaryFileIOTool.writeInt((Integer) this.value, os);
	}

	public String displayValue() {
		return ((Integer) this.value).toString();
	}

}
