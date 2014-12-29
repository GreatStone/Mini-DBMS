package DBMS.execute;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.dict.database.DictDatabaseInfo;
import com.db.minidb.dict.database.DictTableInfo;
import DBMS.parser.sqlParser;

public class SelectConsole {
	private ParseTree tree;
	private SelectSet set;
	private DictDatabaseInfo dbInfo;
	private List<DictTableInfo> tableInfos;

	public SelectConsole() {
		this.tree = null;
		set = new SelectSet();
		dbInfo = QueryInfo.get__dbInfo();
	}

	public SelectSet execute() throws Exception {
		if (QueryInfo.get__dbInfo() == null){
			throw new Exception ("No choosed database");
		}
		tableInfos = dbInfo.getTables();
		int i;
		int len = tree.getChildCount();
		if (! tree.getChild(1).getText().equals("*")) {
			for (i = 1; i < len; i+=2) {
				if (tree.getChild(i) instanceof sqlParser.ColomnsContext) {
					set.addSelect(tree.getChild(i));
				}
				if (!tree.getChild(i+1).getText().equals(",")){
					i+=2;
					break;
				}
			}
		} else{
			set.setChooseAll(true);
			i = 3;
		}
		for ( ; i < len; i+=2){
			if (tree.getChild(i) instanceof sqlParser.TablesContext){
				ParseTree __table = tree.getChild(i);
				String __colname;
				if (__table.getChildCount() > 1){
					__colname = __table.getChild(2).getText();
				} else{
					__colname = __table.getChild(0).getText();
				}
				set.getAliasNames().add(__colname);
				int j;
				for (j = 0; j < tableInfos.size(); j++){
					if (tableInfos.get(j).getTableName().equals(__table.getChild(0).getText())){
						DataTable __data = DataTableManager.loadTable(tableInfos.get(j));
						set.getTables().add(__data);
						break;
					}
				}
			}
			else{
				break;
			}
		}
		if (tree.getChild(len-1) instanceof sqlParser.Sql_whereContext) {
			set.setCheckTree(tree.getChild(len-1).getChild(1));
		}
		
		set.getResult();
		return this.set;
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}
}
