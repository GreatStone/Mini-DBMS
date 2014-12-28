package DBMS.execute;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTree;
import DBMS.parser.ValueTree;
import DBMS.parser.sqlParser;
import com.db.minidb.data.database.DataRecord;
import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.value.ValueBase;
import com.db.minidb.dict.database.DictColumnInfo;
import com.db.minidb.dict.type.TypeDataEnum;

public class SelectSet {
	private List<DataTable> tables;
	private List<String> aliasNames;
	private ParseTree checkTree;
	private List<DataRecord> tmp_result;
	private List<String> result_name; // it's just a temporary name for tmp_result.
	private DataTable result;
	private int[] cur;
	private boolean checked;
	private List<ParseTree> selectTrees;
	private boolean chooseAll;
	private boolean noWhere;

	public void setChooseAll(boolean chooseAll) {
		this.chooseAll = chooseAll;
	}
	
	public SelectSet() {
		tables = new ArrayList<DataTable>();
		aliasNames = new ArrayList<String>();
		checkTree = null;
		tmp_result = new ArrayList<DataRecord>();
		result_name = new ArrayList<String>();
		result = new DataTable();
		cur = null;
		checked = false;
		selectTrees = new ArrayList<ParseTree>();
		chooseAll = false;
		noWhere = true;
	}

	public DataTable getResult() throws Exception {
		if (!checked) {
			check();
			int i, j;
			for (i = 0; i < tables.size(); i++) {
				for (j = 0; j < tables.get(i).getColumns().size(); j++) {
					result_name.add(aliasNames.get(i)
									+ "."+ tables.get(i).getColumns().get(j).getColumnName());
				}
			}
			DataTable __table = new DataTable();
			__table.setRecords(this.tmp_result);
			List<DictColumnInfo> __colinfo = new ArrayList<DictColumnInfo>();
			for (i = 0; i < result_name.size(); i++) {
				DictColumnInfo tmp = new DictColumnInfo();
				tmp.setColumnName(result_name.get(i));
				__colinfo.add(tmp);
			}
			__table.setColumns(__colinfo);
			this.tables = new ArrayList<DataTable>();
			tables.add(__table);
			if (chooseAll) {
				result = __table;
			} else {
				result.setColumns(new ArrayList<DictColumnInfo>());
				result.setRecords(new ArrayList<DataRecord>());
				for (i = 0; i < selectTrees.size(); i++) {
					if (selectTrees.get(i).getChildCount() == 1) {
						DictColumnInfo _colinfo = new DictColumnInfo();
						_colinfo.setColumnName(selectTrees.get(i).getChild(0).getText());
						result.getColumns().add(_colinfo);
					} else {
						DictColumnInfo _colinfo = new DictColumnInfo();
						_colinfo.setColumnName(selectTrees.get(i).getChild(2).getText());
						result.getColumns().add(_colinfo);
					}
				}
				cur = new int[1];
				cur[0] = 0;
				for (i = 0; i < tmp_result.size(); i++, cur[0]++) {
					result.getRecords().add(new DataRecord());
					for (j = 0; j < selectTrees.size(); j++) {
						result.getRecords().get(i).getValues()
								.add(choose(selectTrees.get(j)));
					}
				}
			}
			checked = true;
		}
		return result;
	}

	private ValueBase choose(ParseTree tree) throws Exception {
		if (tree.getChild(0) instanceof sqlParser.Colomn_nameContext) {
			visitTree((sqlParser.Colomn_nameContext) tree.getChild(0));
			return ((ValueTree) tree.getChild(0)).getValue();
		} else {
			visitTree((sqlParser.ValContext) tree.getChild(0));
			return ((ValueTree) tree.getChild(0)).getValue();
		}
	}

	private void check() throws Exception {
		int[] sizes = new int[tables.size()];
		int i;
		for (i = 0; i < tables.size(); i++) {
			sizes[i] = tables.get(i).getRecords().size();
		}
		AllCombine combine = new AllCombine(sizes);
		while (combine.hasNext()) {
			cur = combine.getNext();
			Boolean pass;
			if (noWhere){
				pass = true;
			} else{
				visitTree((sqlParser.ExprContext) checkTree);
				pass = (Boolean) ((ValueTree) checkTree).getValue()
					.getValue();
			}
			if (pass) {
				int sz = tmp_result.size();
				tmp_result.add(new DataRecord());
				for (i = 0; i < tables.size(); i++) {
					tmp_result
							.get(sz)
							.getValues()
							.addAll(tables.get(i).getRecords().get(cur[i])
									.getValues());
				}
			} else {
				continue;
			}
		}
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
			visitTree((sqlParser.Sub_bool_valContext)tree.getChild(0));
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
		if (tree.getChildCount() == 0){
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

	private ValueBase getColValue(String Column) throws Exception{
		int i, j;
		for (i = 0; i < tables.size(); i++) {
			DataTable table = tables.get(i);
			List<DictColumnInfo> tmpColomn = table.getColumns();
			for (j = 0; j < tmpColomn.size(); j++) {
				if (columnMatch(tmpColomn.get(j).getColumnName(),Column)) {
					ValueBase ret = table.getRecords().get(cur[i]).getValues().get(j);
					if (ret.getValue() instanceof Integer){
						ret.setType(TypeDataEnum.INT);
					} else if (ret.getValue() instanceof Double){
						ret.setType(TypeDataEnum.DOUBLE);
					} else if (ret.getValue() instanceof String){
						ret.setType(TypeDataEnum.STRING);
					}
					return ret;
				}
			}
		}
		String[] all = Column.split("\\.");
		for (i = 0; i < aliasNames.size(); i++) {
			if (aliasNames.get(i).equals(all[0])) {
				break;
			}
		}
		Column = all[1];
		for (j = 0; j < tables.get(i).getColumns().size(); j++) {
			if (columnMatch(tables.get(i).getColumns().get(j).getColumnName(),Column)) {
				ValueBase ret = tables.get(i).getRecords().get(cur[i]).getValues()
						.get(j);
				if (ret.getValue() instanceof Integer){
					ret.setType(TypeDataEnum.INT);
				} else if (ret.getValue() instanceof Double){
					ret.setType(TypeDataEnum.DOUBLE);
				} else if (ret.getValue() instanceof String){
					ret.setType(TypeDataEnum.STRING);
				}
				return ret;
			}
		}
		throw new Exception("Fail to find column: " + Column);
	}

	private boolean columnMatch (String a, String b){
		int _x = a.indexOf(".");
		int _y = b.indexOf(".");
		if (_x == -1 && _y == -1){
			return a.equals(b);
		} else if (_x == -1){
			return a.equals(b.split("\\.")[1]);
		} else if (_y == -1){
			return b.equals(a.split("\\.")[1]);
		} else{
			return a.equals(b);
		}
	}
	
	public void setCheckTree(ParseTree checkTree) {
		this.checkTree = checkTree;
		if (checkTree != null){
			this.noWhere = false;
		}
	}

	public List<DataTable> getTables() {
		return tables;
	}

	public void setTables(List<DataTable> tables) {
		this.tables = tables;
	}

	public List<String> getAliasNames() {
		return aliasNames;
	}

	public void setAliasNames(List<String> aliasNames) {
		this.aliasNames = aliasNames;
	}

	public void addSelect(ParseTree selectTrees) {
		this.selectTrees.add(selectTrees);
	}
}
