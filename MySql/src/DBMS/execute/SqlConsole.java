package DBMS.execute;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.dict.database.DictCenterManager;

import DBMS.execute.QueryInfo;
import DBMS.execute.SelectConsole;
import DBMS.parser.sqlLexer;
import DBMS.parser.sqlParser;

public class SqlConsole {
	private String sqls;

	public void execute() {
		sqlLexer lexer;
		sqlParser parser;
		try {
			lexer = new sqlLexer(new ANTLRInputStream(sqls));
			parser = new sqlParser(new CommonTokenStream(lexer));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		if (sqls.toLowerCase().replace(" ", "").replace("\n", "").equals("showdatabases;")){
			for (int j = 0; j < DictCenterManager.getDatabaseList().getDatabaseCount(); j++){
				System.out.println(DictCenterManager.getDatabaseList().getDatabases().get(j).getDatabaseName());
			}
			return;
		} else if (sqls.toLowerCase().replace(" ", "").replace("\n", "").equals("showtables;")){
			for (int j = 0; j < QueryInfo.get__dbInfo().getTableCount(); j++){
				System.out.println(QueryInfo.get__dbInfo().getTables().get(j).getTableName());
			}
			return;
		}
		try {
			ParseTree tree = parser.sqls();
			for (int i = 0; i < tree.getChildCount(); i++) {
				if (tree.getChild(i) instanceof sqlParser.Sql_selectContext) {
					SelectConsole __console = new SelectConsole();
					__console.setTree(tree.getChild(i));
					String ret = DataTableManager.displayTable(__console.execute()
							.getResult());
					System.out.println(ret);
				} else if (tree.getChild(i) instanceof sqlParser.Sql_useContext) {
					QueryInfo.getInstance();
					QueryInfo.chooseDB(tree.getChild(i).getChild(1).getText());
					System.out.println("Chang current database to " + QueryInfo.get__dbInfo().getDatabaseName());
				} else if (tree.getChild(i) instanceof sqlParser.Sql_create_databaseContext) {
					DictCenterManager.getInstance();
					DictCenterManager.addDatabase(tree.getChild(i).getChild(1).getText());
				} else if (tree.getChild(i) instanceof sqlParser.Sql_insertContext){
					InsertConsole __console = new InsertConsole();
					__console.setTree(tree.getChild(i));
					try{
						__console.execute();
					} catch (Exception e) {
						e.printStackTrace();
						continue;
					}
					System.out.println("Succuess insert");
				} else if (tree.getChild(i) instanceof sqlParser.Sql_deleteContext){
					DeleteConsole __console = new DeleteConsole();
					__console.setTree(tree.getChild(i));
					int __effected = 0;
					try{
						__effected = __console.execute();
					} catch (Exception e){
						e.printStackTrace();
						continue;
					}
					System.out.println(__effected + " rows had been effected.");
				}
				else {
					// TODO;
				}
			}
		} catch (Exception e) {
			System.out.println("Something worng occured when execute: {\n"
					+ sqls + "\n}");
			e.printStackTrace();
		}
	}

	public void setSqls(String sqls) {
		this.sqls = sqls;
	}

	public String getSqls() {
		return sqls;
	}
}
