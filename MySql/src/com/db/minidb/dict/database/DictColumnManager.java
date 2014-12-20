package com.db.minidb.dict.database;

import java.io.*;

import com.db.minidb.dict.type.TypeManager;
import com.db.minidb.util.BinaryFileIOTool;

public class DictColumnManager {
	private static Object lockObj = new Object();
	private static DictColumnManager instance = new DictColumnManager();
	private DictColumnManager() {
		
	}
	public static DictColumnManager getInstance() {
		return instance;
	}
	public static DictColumnInfo readColumnInfoFromStream(InputStream is) {
		synchronized (lockObj) {
			DictColumnInfo col = new DictColumnInfo();
			col.setDatabaseId(BinaryFileIOTool.readInt(is));
			col.setTableId(BinaryFileIOTool.readInt(is));
			col.setColumnName(BinaryFileIOTool.readString(is));
			col.setType(TypeManager.readTypeFromStream(is));
			return col;
		}
	}
	public static void writeColumnInfoToStream(DictColumnInfo col, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(col.getDatabaseId(), os);
			BinaryFileIOTool.writeInt(col.getTableId(), os);
			BinaryFileIOTool.writeString(col.getColumnName(), os);
			TypeManager.writeTypeToStream(col.getType(), os);
		}
	}
}
