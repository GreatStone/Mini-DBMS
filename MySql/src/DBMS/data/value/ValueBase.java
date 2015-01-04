package DBMS.data.value;

import java.io.*;

import DBMS.dict.type.TypeDataEnum;

public abstract class ValueBase {
	protected TypeDataEnum type;
	protected Object value;

	public ValueBase() {
		this(null, null);
	}

	public ValueBase(TypeDataEnum type, Object value) {
		this.type = type;
		this.value = value;
	}

	public TypeDataEnum getType() {
		return type;
	}

	public void setType(TypeDataEnum type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public boolean equals(Object obj) {
		return ((ValueBase) obj).getValue().equals(value);
	}

	public abstract ValueBase readValue(InputStream is);

	public abstract void writeValue(OutputStream os);

	public abstract String displayValue();
}
