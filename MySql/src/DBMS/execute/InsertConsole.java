package DBMS.execute;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.parser.ValueTree;

import DBMS.data.database.DataRecord;
import DBMS.data.database.DataTable;
import DBMS.data.database.DataTableManager;
import DBMS.data.value.ValueDouble;
import DBMS.data.value.ValueInt;
import DBMS.data.value.ValueString;
import DBMS.dict.database.DictColumnInfo;
import DBMS.dict.database.DictDatabaseInfo;
import DBMS.dict.database.DictTableInfo;
import DBMS.dict.type.TypeDataEnum;

public class InsertConsole {
	private ParseTree tree;
	private DictTableInfo tableInfo = null;
	private DataRecord record = new DataRecord();
	DataTable __table = new DataTable();

	public void execute() throws Exception {
		DictDatabaseInfo __dbInfo = QueryInfo.get__dbInfo();
		if (__dbInfo == null) {
			throw new Exception("No choosed database");
		}
		int len = tree.getChildCount();
		String __name = tree.getChild(2).getText();
		for (DictTableInfo e : __dbInfo.getTables()) {
			if (e.getTableName().equals(__name)) {
				tableInfo = e;
				break;
			}
		}
		if (tableInfo == null) {
			throw new Exception("Table " + __name + " not found");
		}
		__table = DataTableManager.loadTable(tableInfo);
		List<TypeDataEnum> types = new ArrayList<TypeDataEnum>();
		for (DictColumnInfo e : tableInfo.getColumns()) {
			types.add(e.getType().getTypeEnum());
		}
		try {
			int i, j;
			int cnt = 0;
			for (i = 5, j = 0; i < len; i += 2, j++) {
				cnt++;
				if (types.get(j).equals(TypeDataEnum.INT)) {
					ValueInt tmp = new ValueInt(TypeDataEnum.INT,
							((ValueTree) tree.getChild(i)).getValue()
									.getValue());
					record.getValues().add(tmp);
				} else if (types.get(j).equals(TypeDataEnum.DOUBLE)) {
					ValueDouble tmp = new ValueDouble(TypeDataEnum.DOUBLE,
							((ValueTree) tree.getChild(i)).getValue()
									.getValue());
					record.getValues().add(tmp);
				} else if (types.get(j).equals(TypeDataEnum.STRING)) {
					ValueString tmp = new ValueString(TypeDataEnum.STRING,
							((ValueTree) tree.getChild(i)).getValue()
									.getValue());
					record.getValues().add(tmp);
				} else {
					throw new Exception();
				}
			}

			if (!check()) {
				throw new Exception();
			}

			if (cnt != tableInfo.getColumnCount()) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("Unavailable inserted data");
		}
		__table.getRecords().add(record);
		DataTableManager.storeTable(__table);
	}

	private boolean check() {
		List<Integer> map = new ArrayList<Integer>();
		for (DictColumnInfo e : tableInfo.getPrimaryKeys()) {
			map.add(tableInfo.getColumns().indexOf(e));
		}
		boolean pass = true;
		for (DataRecord e : __table.getRecords()) {
			boolean __tmp = true;
			for (Integer f : map) {
				if (!record.getValues().get(f).equals(e.getValues().get(f))) {
					__tmp = false;
					break;
				}
			}
			if (__tmp) {
				pass = false;
				break;
			}
		}
		return pass;
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}
}
