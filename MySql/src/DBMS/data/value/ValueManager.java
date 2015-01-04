package DBMS.data.value;

import java.io.*;

import DBMS.sys.setting.PropertiesFileManager;
import DBMS.util.BinaryFileIOTool;

public class ValueManager {
	private static Object lockObj = new Object();
	private static ValueManager instance = new ValueManager();

	private ValueManager() {

	}

	public static ValueManager getInstance() {
		return instance;
	}

	public static ValueBase createByType(String type) {
		synchronized (lockObj) {
			String c = PropertiesFileManager.getProperty("VALUE_" + type);
			Class<?> nc = null;
			ValueBase ret = null;
			try {
				nc = Class.forName(c);
				ret = (ValueBase) nc.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// TODO
			/*
			 * catch (InstantiationException | IllegalAccessException e) {
			 * e.printStackTrace(); }
			 */
			return ret;
		}
	}

	public static ValueBase readValueFromStream(ValueBase value, InputStream is) {
		synchronized (lockObj) {
			value.readValue(is);
			return value;
		}
	}

	public static void writeValueToStream(ValueBase type, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeString(type.toString(), os);
			type.writeValue(os);
		}
	}
}
