package com.db.minidb.data.database;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.db.minidb.data.value.*;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.dict.type.TypeDataEnum;
import com.db.minidb.util.FileTool;

public class DataCenterManager {
	public static void storeEmptyTable(DictTableInfo tableInfo, int tableId) {
		String name = DataTableManager.getTableDataFileFullPath(tableInfo);
		System.out.println("test " + name);
		DataTable table = new DataTable();
		table.setColumns(tableInfo.getColumns());
		table.setDatabaseId(tableInfo.getDatabase().getDatabaseId());
		table.setTableId(tableId);
		List<DataRecord> __tmp = new ArrayList<DataRecord>();
		DataRecord e = new DataRecord();
		e.getValues().add(new ValueInt(TypeDataEnum.INT,1));
		e.getValues().add(new ValueDouble(TypeDataEnum.DOUBLE,3.14));
		e.getValues().add(new ValueString(TypeDataEnum.STRING,"root"));
		table.setRecords(__tmp);
		DataTableManager.writeDataTableToStream(table,
				FileTool.getOutputStream(new File(name)));
		DataTableManager.storeTable(table);
	}
}
