package DBMS.dict.type;

import java.io.InputStream;
import java.io.OutputStream;

import DBMS.util.BinaryFileIOTool;

public class TypeDouble extends TypeBase {
	private double minValue;
	private double maxValue;

	public TypeDouble() {
		this(TypeDataEnum.DOUBLE);
	}

	public TypeDouble(TypeDataEnum type) {
		super(type);
		this.minValue = Double.MIN_VALUE;
		this.maxValue = Double.MAX_VALUE;
	}

	// public TypeDouble(TypeDataEnum type, double min, double max) {
	// super(type);
	// this.minValue = min;
	// this.maxValue = max;
	// }
	public void readTypeInfo(InputStream is) {
		this.minValue = BinaryFileIOTool.readDouble(is);
		this.maxValue = BinaryFileIOTool.readDouble(is);
	}

	public void writeTypeInfo(OutputStream os) {
		BinaryFileIOTool.writeDouble(this.minValue, os);
		BinaryFileIOTool.writeDouble(this.maxValue, os);
	}

	public boolean isLegal(Object value) {
		int v = (Integer) value;
		if (v < this.minValue || v > this.maxValue) {
			return false;
		} else {
			return true;
		}
	}

}
