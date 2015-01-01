package com.db.minidb.dict.type;

import java.io.*;

public abstract class TypeBase {
	protected TypeDataEnum type;

	public TypeBase(TypeDataEnum type) {
		this.type = type;
	}

	public TypeDataEnum getTypeEnum() {
		return this.type;
	}

	public void setTypeEnum(TypeDataEnum type) {
		this.type = type;
	}

	public abstract void readTypeInfo(InputStream is);

	public abstract void writeTypeInfo(OutputStream os);

	public abstract boolean isLegal(Object value);
}
