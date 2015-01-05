package DBMS.execute;

import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.data.database.DataRecord;
import DBMS.data.value.ValueBase;
import DBMS.data.value.ValueBool;
import DBMS.dict.type.TypeDataEnum;

import DBMS.parser.ValueTree;
import DBMS.parser.sqlParser;

public class TreeVisitor {
	private ExecuteConsole console;

	public TreeVisitor(ExecuteConsole console) {
		this.console = console;
	}

	public void visitTree(sqlParser.SubvalContext tree) throws Exception {
		if (tree.getChildCount() == 1) {
			if (tree.getChild(0) instanceof sqlParser.ConstsContext) {
				tree.value = ((sqlParser.ConstsContext) tree.getChild(0)).value;
			} else {
				tree.value = console.getColValue(tree.getText());
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
			} else if (op.equals("*")) {
				tree.value = Calculate.mul(left.getValue(), right.getValue());
			} else if (op.equals("/")) {
				tree.value = Calculate.div(left.getValue(), right.getValue());
			}
		}
	}

	public void visitTree(sqlParser.Colomn_nameContext tree) throws Exception {
		tree.value = console.getColValue(tree.getText());
	}

	public void visitTree(sqlParser.ValContext tree) throws Exception {
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

	public void visitTree(sqlParser.Bool_valContext tree) throws Exception {
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

	public void visitTree(sqlParser.Sub_bool_valContext tree) throws Exception {
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

	public void visitTree(sqlParser.ExprContext tree) throws Exception {
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
		} else if (tree.getChild(0).getText().toLowerCase().equals("exists")
				|| tree.getChild(1).getText().toLowerCase().equals("exists")) {
			int __len = tree.getChildCount();
			ParseTree selectSetTree = tree.getChild(__len - 1);
			if (selectSetTree.getChild(1) instanceof sqlParser.Sql_selectContext) {
				SelectConsole __Console = new SelectConsole();
				__Console.setTree(selectSetTree.getChild(1));
				tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN, __Console
						.execute().getResult().getRecords().size() > 0));
			} else {
				ParseTree e = selectSetTree.getChild(1);
				tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN,
						e instanceof sqlParser.Type_doubleContext
								|| e instanceof sqlParser.Type_intContext
								|| e instanceof sqlParser.Type_stringContext));
			}
			if (tree.getChild(0).getText().toLowerCase().equals("not")) {
				tree.getValue().setValue(
						!(Boolean) (tree.getValue().getValue()));
			}
		} else if (tree.getChild(2).getText().toLowerCase().equals("in")
				|| tree.getChild(1).getText().toLowerCase().equals("in")) {
			visitTree((sqlParser.ValContext) tree.getChild(0));
			ValueBase __tmpValue = ((ValueTree) tree.getChild(0)).getValue();
			int __len = tree.getChildCount();
			ParseTree selectSetTree = tree.getChild(__len - 1);
			tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN, false));
			if (selectSetTree.getChild(1) instanceof sqlParser.Sql_selectContext) {
				SelectConsole __Console = new SelectConsole();
				__Console.setTree(selectSetTree.getChild(1));
				SelectSet set = __Console.execute();
				if (set.getResult().getColumns().size() != 1) {
					throw new Exception(
							"The size of set selected not match value.");
				}
				for (DataRecord e : set.getResult().getRecords()) {
					if (e.getValues().get(0).equals(__tmpValue)) {
						tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN, true));
						break;
					}
				}
			} else {
				tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN, false));

				int i;
				int setlen = selectSetTree.getChildCount();
				for (i = 1; i < setlen; i += 2) {
					if (__tmpValue.equals(((ValueTree) selectSetTree
							.getChild(i)).getValue())) {
						tree.setValue(new ValueBool(TypeDataEnum.BOOLEAN, true));
						break;
					}
				}
			}
			if (tree.getChild(1).getText().toLowerCase().equals("not")) {
				tree.getValue().setValue(
						!(Boolean) (tree.getValue().getValue()));
			}
		}
	}

}
