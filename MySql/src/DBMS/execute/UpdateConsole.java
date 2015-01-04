package DBMS.execute;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.data.database.DataTable;
import DBMS.data.database.DataTableManager;
import DBMS.data.value.ValueBase;
import DBMS.dict.database.DictCenterManager;
import DBMS.dict.database.DictTableInfo;
import DBMS.dict.type.TypeDataEnum;

import DBMS.parser.*;
import DBMS.parser.sqlParser.Col_expContext;

public class UpdateConsole implements ExecuteConsole {
	private ParseTree checkTree;
	private boolean chooseAll;
	private int cur;
	private String tableName;
	private DataTable table;
	private DictTableInfo tableInfo;
	private List<sqlParser.Col_expContext> sets;

	private TreeVisitor visitor;

	public UpdateConsole() {
		this.chooseAll = true;
		this.cur = 0;
		this.tableName = "";
		sets = new ArrayList<sqlParser.Col_expContext>();
		visitor = new TreeVisitor(this);
	}

	public int execute() throws Exception {
		tableInfo = DictCenterManager.findTableWithName(
				QueryInfo.get__dbInfo(), tableName);
		table = DataTableManager.loadTable(tableInfo);
		cur = 0;
		boolean choose;
		int len = table.getRecords().size();
		int ret = 0;
		for (cur = 0; cur < len; cur++) {
			if (chooseAll) {
				choose = true;
			} else {
				visitor.visitTree((sqlParser.ExprContext) checkTree);
				choose = (Boolean) (((ValueTree) checkTree).getValue()
						.getValue());
			}
			if (choose) {
				ret++;
				for (sqlParser.Col_expContext e : sets) {
					String __col = e.getChild(0).getText();
					visitor.visitTree((sqlParser.ExprContext) e.getChild(2));
					setColValue(__col, ((ValueTree) e.getChild(2)).getValue());
				}
			}
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

	private void setColValue(String Column, ValueBase value) throws Exception {
		int i;
		for (i = 0; i < tableInfo.getColumnCount(); i++) {
			if (columnMatch(tableInfo.getColumns().get(i).getColumnName(),
					Column)) {
				table.getRecords().get(cur).getValues().set(i, value);
				return;
			}
		}
		throw new Exception("Fail to find column: " + Column);
	}

	private boolean columnMatch(String a, String b) {
		int _x = a.indexOf(".");
		int _y = b.indexOf(".");
		if (_x == -1 && _y == -1) {
			return a.equals(b);
		} else if (_x == -1) {
			return a.equals(b.split("\\.")[1]);
		} else if (_y == -1) {
			return b.equals(a.split("\\.")[1]);
		} else {
			return a.equals(b);
		}
	}

	public void setCheckTree(ParseTree checkTree) {
		this.checkTree = checkTree;
		this.chooseAll = false;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

	public void addSet(ParseTree tree) {
		this.sets.add((Col_expContext) tree);
	}
}
