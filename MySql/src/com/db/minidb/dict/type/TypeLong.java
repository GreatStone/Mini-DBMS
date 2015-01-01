package com.db.minidb.dict.type;

import java.io.InputStream;
import java.io.OutputStream;

import com.db.minidb.util.BinaryFileIOTool;

public class TypeLong extends TypeBase {

	private long minValue;
	private long maxValue;

	public TypeLong() {
		this(TypeDataEnum.LONG);
	}

	public TypeLong(TypeDataEnum type) {
		super(type);
		this.minValue = Long.MIN_VALUE;
		this.maxValue = Long.MAX_VALUE;
	}

	public TypeLong(TypeDataEnum type, long min, long max) {
		super(type);
		this.minValue = min;
		this.maxValue = max;
	}

	public long getMinValue() {
		return minValue;
	}

	public void setMinValue(long minValue) {
		this.minValue = minValue;
	}

	public long getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}

	public void readTypeInfo(InputStream is) {
		this.minValue = BinaryFileIOTool.readLong(is);
		this.maxValue = BinaryFileIOTool.readLong(is);
	}

	public void writeTypeInfo(OutputStream os) {
		BinaryFileIOTool.writeLong(this.minValue, os);
		BinaryFileIOTool.writeLong(this.maxValue, os);
	}

	public boolean isLegal(Object value) {
		long v = (Long) value;
		if (v < this.minValue || v > this.maxValue) {
			return false;
		} else {
			return true;
		}
	}

}
