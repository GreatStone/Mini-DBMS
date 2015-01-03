package DBMS.execute;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.data.value.ValueBase;
import com.db.minidb.dict.database.DictCenterManager;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.dict.type.TypeDataEnum;

import DBMS.parser.*;
import DBMS.parser.sqlParser.Col_expContext;

public class UpdateConsole {
	private ParseTree checkTree;
	private boolean chooseAll;
	private int cur;
	private String tableName;
	private DataTable table;
	private DictTableInfo tableInfo;
	private List<sqlParser.Col_expContext> sets;

	public UpdateConsole() {
		this.chooseAll = true;
		this.cur = 0;
		this.tableName = "";
		sets = new ArrayList<sqlParser.Col_expContext>();
	}

	public void execute() throws Exception {
		tableInfo = DictCenterManager.findTableWithName(
				QueryInfo.get__dbInfo(), tableName);
		table = DataTableManager.loadTable(tableInfo);
		cur = 0;
		boolean choose;
		int len = table.getRecords().size();
		for (cur = 0; cur < len; cur++) {
			if (chooseAll) {
				choose = true;
			} else {
				visitTree((sqlParser.ExprContext) checkTree);
				choose = (Boolean) (((ValueTree) checkTree).getValue()
						.getValue());
			}
			if (choose) {
				for (sqlParser.Col_expContext e : sets) {
					String __col = e.getChild(0).getText();
					visitTree((sqlParser.ExprContext) e.getChild(2));
					setColValue(__col, ((ValueTree) e.getChild(2)).getValue());
				}
			}
		}
		DataTableManager.storeTable(table);
	}

	private void visitTree(sqlParser.SubvalContext tree) throws Exception {
		if (tree.getChildCount() == 1) {
			if (tree.getChild(0) instanceof sqlParser.ConstsContext) {
				tree.value = ((sqlParser.ConstsContext) tree.getChild(0)).value;
			} else {
				tree.value = this.getColValue(tree.getText());
			}
		} else {
			ParseTree _op = tree.getChild(1);
			if (tree.getChild(0) instanceof sqlParser.Colomn_nameContext) {
				visitTree((sqlParser.Colomn_nameContext) tree.getChild(0));
			}
			if (tree.getChild(2) instanceof sqlParser.Colomn_nameContext) {
				visitTree((sqlParser.Colomn_nameContext) tree.getChild(2));
			}
			String op = _op.getText();
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			if (op.equals("+")) {
				tree.value = Calculate.add(left.getValue(), right.getValue());
			} else if (op.equals("-")) {
				tree.value = Calculate.sub(left.getValue(), right.getValue());
			} else if (op.equals("-")) {
				tree.value = Calculate.sub(left.getValue(), right.getValue());
			} else if (op.equals("-")) {
				tree.value = Calculate.sub(left.getValue(), right.getValue());
			}
		}
	}

	private void visitTree(sqlParser.Colomn_nameContext tree) throws Exception {
		tree.value = getColValue(tree.getText());
	}

	private void visitTree(sqlParser.ValContext tree) throws Exception {
		if (tree.getChildCount() == 1) {
			visitTree((sqlParser.SubvalContext) tree.getChild(0));
			tree.setValue(((ValueTree) tree.getChild(0)).getValue());
		} else {
			String op = tree.getChild(1).getText();
			visitTree((sqlParser.SubvalContext) tree.getChild(0));
			visitTree((sqlParser.SubvalContext) tree.getChild(2));
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			if (op.equals("+")) {
				tree.setValue(Calculate.add(left.getValue(), right.getValue()));
			} else if (op.equals("-")) {
				tree.setValue(Calculate.sub(left.getValue(), right.getValue()));
			} else if (op.equals("*")) {
				tree.setValue(Calculate.mul(left.getValue(), right.getValue()));
			} else if (op.equals("/")) {
				tree.setValue(Calculate.div(left.getValue(), right.getValue()));
			}
		}
	}

	private void visitTree(sqlParser.Bool_valContext tree) throws Exception {
		if (tree.getChildCount() == 1) {
			visitTree((sqlParser.Sub_bool_valContext) tree.getChild(0));
			tree.setValue(((sqlParser.Sub_bool_valContext) tree.getChild(0))
					.getValue());
		} else if (tree.getChildCount() == 3
				&& tree.getChild(1) instanceof sqlParser.Bool_opContext) {
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			visitTree((sqlParser.Sub_bool_valContext) tree.getChild(0));
			visitTree((sqlParser.Sub_bool_valContext) tree.getChild(2));
			String op = tree.getChild(1).getText();
			if (op.toLowerCase().equals("and")) {
				tree.setValue(Calculate.and(left.getValue(), right.getValue()));
			} else if (op.toLowerCase().equals("or")) {
				tree.setValue(Calculate.or(left.getValue(), right.getValue()));
			}
		}
	}

	private void visitTree(sqlParser.Sub_bool_valContext tree) throws Exception {
		String op = tree.getChild(1).getText();
		visitTree((sqlParser.ValContext) tree.getChild(0));
		visitTree((sqlParser.ValContext) tree.getChild(2));
		ValueTree left = (ValueTree) tree.getChild(0);
		ValueTree right = (ValueTree) tree.getChild(2);
		if (op.equals("<")) {
			tree.setValue(Calculate.less(left.getValue(), right.getValue()));
		} else if (op.equals(">")) {
			tree.setValue(Calculate.more(left.getValue(), right.getValue()));
		} else if (op.equals("=")) {
			tree.setValue(Calculate.eql(left.getValue(), right.getValue()));
		} else if (op.equals("<>")) {
			tree.setValue(Calculate.neql(left.getValue(), right.getValue()));
		} else if (op.equals("<=")) {
			tree.setValue(Calculate.nmore(left.getValue(), right.getValue()));
		} else if (op.equals(">=")) {
			tree.setValue(Calculate.nless(left.getValue(), right.getValue()));
		}
	}

	private void visitTree(sqlParser.ExprContext tree) throws Exception {
		if (tree.getChildCount() == 0) {
			return;
		} else if (tree.getChildCount() == 1) {
			visitTree((sqlParser.ValContext) tree.getChild(0));
			tree.setValue(((ValueTree) tree.getChild(0)).getValue());
		} else if (tree.getChild(1) instanceof sqlParser.OpContext) {
			String op = tree.getChild(1).getText();
			visitTree((sqlParser.ValContext) tree.getChild(0));
			visitTree((sqlParser.ValContext) tree.getChild(2));
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			if (op.equals("+")) {
				tree.setValue(Calculate.add(left.getValue(), right.getValue()));
			} else if (op.equals("-")) {
				tree.setValue(Calculate.sub(left.getValue(), right.getValue()));
			} else if (op.equals("*")) {
				tree.setValue(Calculate.mul(left.getValue(), right.getValue()));
			} else if (op.equals("/")) {
				tree.setValue(Calculate.div(left.getValue(), right.getValue()));
			}
		} else if (tree.getChild(1) instanceof sqlParser.CompareContext) {
			String op = tree.getChild(1).getText();
			visitTree((sqlParser.ValContext) tree.getChild(0));
			visitTree((sqlParser.ValContext) tree.getChild(2));
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			if (op.equals("<")) {
				tree.setValue(Calculate.less(left.getValue(), right.getValue()));
			} else if (op.equals(">")) {
				tree.setValue(Calculate.more(left.getValue(), right.getValue()));
			} else if (op.equals("=")) {
				tree.setValue(Calculate.eql(left.getValue(), right.getValue()));
			} else if (op.equals("<>")) {
				tree.setValue(Calculate.neql(left.getValue(), right.getValue()));
			} else if (op.equals("<=")) {
				tree.setValue(Calculate.nmore(left.getValue(), right.getValue()));
			} else if (op.equals(">=")) {
				tree.setValue(Calculate.nless(left.getValue(), right.getValue()));
			}
		} else if (tree.getChild(1) instanceof sqlParser.Bool_opContext) {
			String op = tree.getChild(1).getText();
			visitTree((sqlParser.Bool_valContext) tree.getChild(0));
			visitTree((sqlParser.Bool_valContext) tree.getChild(2));
			ValueTree left = (ValueTree) tree.getChild(0);
			ValueTree right = (ValueTree) tree.getChild(2);
			if (op.toLowerCase().equals("and")) {
				tree.setValue(Calculate.and(left.getValue(), right.getValue()));
			} else if (op.toLowerCase().equals("or")) {
				tree.setValue(Calculate.or(left.getValue(), right.getValue()));
			}
		}
	}

	private ValueBase getColValue(String Column) throws Exception {
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
