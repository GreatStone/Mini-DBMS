package com.db.minidb.dict.type;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.util.BinaryFileIOTool;

public class TypeString extends TypeBase {
	private int minLength;
	private int maxLength;

	public TypeString() {
		this(TypeDataEnum.STRING);
	}

	public TypeString(TypeDataEnum type) {
		super(type);
		this.minLength = 0;
		this.maxLength = Integer.MAX_VALUE;
	}

	public TypeString(TypeDataEnum type, int min, int max) {
		super(type);
		this.minLength = min;
		this.maxLength = max;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public void readTypeInfo(InputStream is) {
		this.minLength = BinaryFileIOTool.readInt(is);
		this.maxLength = BinaryFileIOTool.readInt(is);
	}

	public void writeTypeInfo(OutputStream os) {
		BinaryFileIOTool.writeInt(this.minLength, os);
		BinaryFileIOTool.writeInt(this.maxLength, os);
	}

	public boolean isLegal(Object value) {
		String v = (String) value;
		if (v.length() < this.minLength || v.length() > this.maxLength) {
			return false;
		} else {
			return true;
		}
	}

}
