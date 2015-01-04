package DBMS.execute;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import DBMS.parser.sqlParser;

import DBMS.dict.database.DictCenterManager;
import DBMS.dict.database.DictDatabaseInfo;
import DBMS.dict.database.DictTableInfo;

public class CreateConsole {
	private ParseTree tree;
	private String tableName;
	private DictDatabaseInfo dbInfo;

	public CreateConsole() {

	}

	public void execute() throws Exception {
		this.tableName = tree.getChild(2).getText();
		this.dbInfo = QueryInfo.get__dbInfo();
		if (dbInfo == null) {
			throw new Exception("No choosed database.");
		}
		List<DictTableInfo> tables = dbInfo.getTables();
		for (DictTableInfo e : tables) {
			if (e.getTableName().equals(tableName)) {
				throw new Exception("The table named " + tableName
						+ " was existed");
			}
		}

		List<String> columnsName = new ArrayList<String>();
		List<String> columnsType = new ArrayList<String>();

		int i;
		int len = tree.getChildCount();
		for (i = 4; i < len; i += 2) {
			if (tree.getChild(i) instanceof sqlParser.Col_typeContext) {
				sqlParser.Col_typeContext e = (sqlParser.Col_typeContext) tree
						.getChild(i);
				columnsName.add(e.getChild(0).getText());
				columnsType.add(e.getChild(1).getText().toLowerCase());
			} else {
				break;
			}
		}
		List<String> primaryKeys = new ArrayList<String>();
		if (tree.getChild(i) instanceof sqlParser.Primary_colContext) {
			ParseTree primaryTree = tree.getChild(i);
			int j;
			for (j = 3; j < primaryTree.getChildCount(); j += 2) {
				primaryKeys.add(primaryTree.getChild(j).getText());
			}
		}
		// TODO
		// foreign key
		DictCenterManager.addTable(dbInfo, tableName,
				(String[]) columnsName.toArray(new String[0]),
				(String[]) columnsType.toArray(new String[0]),
				(String[]) primaryKeys.toArray(new String[0]));
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}
}
