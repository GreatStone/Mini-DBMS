package DBMS.execute;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import DBMS.execute.QueryInfo;
import DBMS.parser.ValueTree;
import DBMS.parser.sqlParser;

import com.db.minidb.data.database.DataRecord;
import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.data.value.ValueBase;
import com.db.minidb.dict.database.DictCenterManager;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.dict.type.TypeDataEnum;

public class DeleteConsole implements ExecuteConsole {
	private ParseTree tree;
	private DataTable table;
	private int cur;
	private DictTableInfo tableInfo;
	private DataTable resTable;
	private boolean chooseAll;

	private TreeVisitor visitor;

	public DeleteConsole() {
		tree = null;
		table = new DataTable();
		tableInfo = new DictTableInfo();
		chooseAll = true;
		cur = 0;
		resTable = new DataTable();
		List<DataRecord> __tmp = new ArrayList<DataRecord>();
		resTable.setRecords(__tmp);
		visitor = new TreeVisitor(this);
	}

	public int execute() throws Exception {
		if (QueryInfo.get__dbInfo() == null) {
			throw new Exception("No choosed database");
		}
		String tableName = tree.getChild(2).getText();
		tableInfo = DictCenterManager.findTableWithName(
				QueryInfo.get__dbInfo(), tableName);
		int ret = 0;
		if (!chooseAll) {
			table = DataTableManager.loadTable(tableInfo);
			int len = table.getRecords().size();
			for (cur = 0; cur < len; cur++) {
				visitor.visitTree((sqlParser.ExprContext) tree.getChild(3)
						.getChild(1));
				if (((ValueTree) tree.getChild(3).getChild(1)).getValue()
						.getValue().equals(true)) {
					ret++;
				} else {
					resTable.getRecords().add(table.getRecords().get(cur));
				}
			}
			table.setRecords(resTable.getRecords());
		} else {
			ret = table.getRecords().size();
			table.getRecords().clear();
		}
		DataTableManager.storeTable(table);
		return ret;
	}

	public ValueBase getColValue(String Column) throws Exception {
		if (Column.indexOf(".") == -1) {
			int i;
			for (i = 0; i < table.getColumns().size(); i++) {
				if (table.getColumns().get(i).getColumnName().equals(Column)) {
					ValueBase ret = table.getRecords().get(cur).getValues()
							.get(i);
					if (ret.getValue() instanceof String) {
						ret.setType(TypeDataEnum.STRING);
					} else if (ret.getValue() instanceof Double) {
						ret.setType(TypeDataEnum.DOUBLE);
					} else if (ret.getValue() instanceof Integer) {
						ret.setType(TypeDataEnum.INT);
					}
					return ret;
				}
			}
		} else {
			String[] __tmp = Column.split("\\.");
			if (!__tmp[0].equals(tableInfo.getTableName())) {
				throw new Exception("Forbidden to access table " + __tmp[0]);
			}
			int i;
			for (i = 0; i < table.getColumns().size(); i++) {
				if (table.getColumns().get(i).getColumnName().equals(__tmp[1])) {
					ValueBase ret = table.getRecords().get(cur).getValues()
							.get(i);
					if (ret.getValue() instanceof String) {
						ret.setType(TypeDataEnum.STRING);
					} else if (ret.getValue() instanceof Double) {
						ret.setType(TypeDataEnum.DOUBLE);
					} else if (ret.getValue() instanceof Integer) {
						ret.setType(TypeDataEnum.INT);
					}
					return ret;
				}
			}
		}
		throw new Exception("Fail to find column: " + Column);
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
		if (tree.getChildCount() > 3) {
			chooseAll = false;
		} else {
			chooseAll = true;
		}
	}
}
