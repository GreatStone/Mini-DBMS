package com.db.minidb.dict.type;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.util.BinaryFileIOTool;

public class TypeInt extends TypeBase {
	private int minValue;
	private int maxValue;
	public TypeInt() {
		this(TypeDataEnum.INT);
	}
	public TypeInt(TypeDataEnum type) {
		super(type);
		this.minValue = Integer.MIN_VALUE;
		this.maxValue = Integer.MAX_VALUE;
	}
	public TypeInt(TypeDataEnum type, int min, int max) {
		super(type);
		this.minValue = min;
		this.maxValue = max;
	}
	
	public int getMinValue() {
		return minValue;
	}
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	public void readTypeInfo(InputStream is) {
		this.minValue = BinaryFileIOTool.readInt(is);
		this.maxValue = BinaryFileIOTool.readInt(is);
	}

	public void writeTypeInfo(OutputStream os) {
		BinaryFileIOTool.writeInt(this.minValue, os);
		BinaryFileIOTool.writeInt(this.maxValue, os);
	}

	public boolean isLegal(Object value) {
		int v = (Integer)value;
		if(v < this.minValue || v > this.maxValue) {
			return false;
		}
		else {
			return true;
		}
	}

}
