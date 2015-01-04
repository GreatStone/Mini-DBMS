package DBMS.dict.type;

import java.io.InputStream;
import java.io.OutputStream;

public class TypeBool extends TypeBase {
	public TypeBool() {
		this(TypeDataEnum.BOOLEAN);
	}

	public TypeBool(TypeDataEnum type) {
		super(type);
	}

	public void readTypeInfo(InputStream is) {
	}

	public void writeTypeInfo(OutputStream os) {
	}

	public boolean isLegal(Object value) {
		return value.equals(new Boolean(true))
				|| value.equals(new Boolean(false));
	}
}
