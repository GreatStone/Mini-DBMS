package com.db.minidb.dict.type;

import java.io.*;

import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;

public class TypeManager {
	private static Object lockObj = new Object();
	private static TypeManager instance = new TypeManager();
	private TypeManager() {
		
	}
	public static TypeManager getInstance() {
		return instance;
	}

	public static TypeBase createByType(String type) {
		synchronized (lockObj) {
			String c = PropertiesFileManager.getProperty("TYPE_" + type);
			Class<?> nc = null;
			TypeBase ret = null;
			try {
				nc = Class.forName(c);
				ret = (TypeBase) nc.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			//TODO
			/*catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}*/
			return ret;
		}
	}
	public static TypeBase readTypeFromStream(InputStream is) {
		synchronized (lockObj) {
			String type = BinaryFileIOTool.readString(is);
			TypeBase ret = createByType(type);
			ret.readTypeInfo(is);
			return ret;
		}
	}
	public static void writeTypeToStream(TypeBase type, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeString(type.getTypeEnum().name(), os);
			type.writeTypeInfo(os);
		}
	}
}
