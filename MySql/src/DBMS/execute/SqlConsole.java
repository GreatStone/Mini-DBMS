package DBMS.execute;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.data.database.DataTableManager;
import DBMS.dict.database.DictCenterManager;

import DBMS.execute.QueryInfo;
import DBMS.execute.SelectConsole;
import DBMS.parser.sqlLexer;
import DBMS.parser.sqlParser;

public class SqlConsole {
	private String sqls;

	public String execute() {
		sqlLexer lexer;
		sqlParser parser;
		try {
			lexer = new sqlLexer(new ANTLRInputStream(sqls));
			parser = new sqlParser(new CommonTokenStream(lexer));
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail to parse sql.";
		}

		if (sqls.toLowerCase().replace(" ", "").replace("\n", "")
				.equals("showdatabases;")) {
			String ret = "";
			for (int j = 0; j < DictCenterManager.getDatabaseList()
					.getDatabaseCount(); j++) {
				ret += DictCenterManager.getDatabaseList()
						.getDatabases().get(j).getDatabaseName() + "\n";
			}
			return ret;
		} else if (sqls.toLowerCase().replace(" ", "").replace("\n", "")
				.equals("showtables;")) {
			String ret = "";
			for (int j = 0; j < QueryInfo.get__dbInfo().getTableCount(); j++) {
				ret += QueryInfo.get__dbInfo().getTables().get(j)
						.getTableName() + "\n";
			}
			return ret;
		}
		try {
			ParseTree tree = parser.sqls();
			if (tree.getChild(0) instanceof sqlParser.Sql_selectContext) {
				SelectConsole __console = new SelectConsole();
				__console.setTree(tree.getChild(0));
				String ret = DataTableManager.displayTable(__console.execute()
						.getResult());
				return ret;
			} else if (tree.getChild(0) instanceof sqlParser.Sql_useContext) {
				QueryInfo.getInstance();
				QueryInfo.chooseDB(tree.getChild(0).getChild(1).getText());
				return "Chang current database to "
						+ QueryInfo.get__dbInfo().getDatabaseName();
			} else if (tree.getChild(0) instanceof sqlParser.Sql_create_databaseContext) {
				DictCenterManager.getInstance();
				DictCenterManager.addDatabase(tree.getChild(0).getChild(1)
						.getText());
				return "Success to create database " + tree.getChild(0).getChild(1)
				.getText(); 
			} else if (tree.getChild(0) instanceof sqlParser.Sql_insertContext) {
				InsertConsole __console = new InsertConsole();
				__console.setTree(tree.getChild(0));
				__console.execute();
				return "Succuess insert";
			} else if (tree.getChild(0) instanceof sqlParser.Sql_deleteContext) {
				DeleteConsole __console = new DeleteConsole();
				__console.setTree(tree.getChild(0));
				int __effected = 0;
				__effected = __console.execute();
				return __effected + " rows had been effected.";
			} else if (tree.getChild(0) instanceof sqlParser.Sql_create_tableContext) {
				CreateConsole __console = new CreateConsole();
				__console.setTree(tree.getChild(0));
				__console.execute();
				return "Succuess create";
			} else if (tree.getChild(0) instanceof sqlParser.Sql_updateContext) {
				UpdateConsole __console = new UpdateConsole();
				ParseTree e = tree.getChild(0);
				int __len = e.getChildCount();
				__console.setTableName(e.getChild(1).getText());
				for (int j = 3; j < __len; j += 2) {
					if (e.getChild(j) instanceof sqlParser.Col_expContext) {
						__console.addSet(e.getChild(j));
					} else {
						break;
					}
				}
				if (e.getChild(__len - 1) instanceof sqlParser.Sql_whereContext) {
					__console.setCheckTree(e.getChild(__len - 1).getChild(1));
				}
				int __effected = __console.execute();
				return __effected + " rows had been effected.";
			} else if (tree.getChild(0) instanceof sqlParser.Sql_drop_databaseContext){
				//DictCenterManager.removeDatabase(tree.getChild(0).getChild(1).getText(), )
			}
			else {
				// TODO;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Something worng occured when execute: {\n"
					+ sqls + "\n}\n" + e.getMessage();
		}
		return "Nothing to do";
	}

	public void setSqls(String sqls) {
		this.sqls = sqls;
	}

	public String getSqls() {
		return sqls;
	}
}
