package DBMS.data.database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import DBMS.data.value.ValueBase;
import DBMS.data.value.ValueManager;
import DBMS.dict.database.DictColumnInfo;

public class DataRecordManager {
	private static Object lockObj = new Object();
	private static DataRecordManager instance = new DataRecordManager();

	private DataRecordManager() {

	}

	public static DataRecordManager getInstance() {
		return instance;
	}

	private static List<ValueBase> readValues(List<DictColumnInfo> columns,
			InputStream is) {
		synchronized (lockObj) {
			ArrayList<ValueBase> values = new ArrayList<ValueBase>();
			for (DictColumnInfo col : columns) {
				ValueBase value = ValueManager.createByType(col.getType()
						.getTypeEnum().toString());
				values.add(ValueManager.readValueFromStream(value, is));
			}
			return values;
		}
	}

	public static DataRecord readRecord(List<DictColumnInfo> columns,
			InputStream is) {
		synchronized (lockObj) {
			DataRecord record = new DataRecord();
			record.setValues(readValues(columns, is));
			return record;
		}
	}

	private static void writeValues(List<ValueBase> values, OutputStream os) {
		synchronized (lockObj) {
			for (ValueBase value : values) {
				value.writeValue(os);
			}
		}
	}

	public static void writeRecord(DataRecord record, OutputStream os) {
		synchronized (lockObj) {
			writeValues(record.getValues(), os);
		}
	}

	public static String displayRecord(DataRecord record) {
		synchronized (lockObj) {
			StringBuffer bf = new StringBuffer();
			for (ValueBase value : record.getValues()) {
				bf.append(String.format("%10s", value.displayValue()));
			}
			return bf.toString();
		}
	}
}
