package DBMS.execute;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.data.value.ValueBool;
import com.db.minidb.dict.database.DictDatabaseInfo;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.dict.type.TypeDataEnum;

import DBMS.parser.ValueTree;
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
		tableInfos = dbInfo.getTables();
	}

	public SelectSet execute() throws Exception {
		int i;
		int len = tree.getChildCount();
		if (! tree.getChild(1).getText().equals("*")) {
			for (i = 1; i < len; i++) {
				if (tree.getChild(i) instanceof sqlParser.ColomnsContext) {
					set.addSelect(tree.getChild(i));
				} else {
					i++;
					break;
				}
			}
		} else{
			set.setChooseAll(true);
			i = 3;
		}
		for ( ; i < len; i++){
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
		if (i < len) {
			set.setCheckTree(tree.getChild(i).getChild(1));
		} else {
			ParseTree __tree = new sqlParser.Sql_whereContext(null, 0);
			((ValueTree) __tree).setValue(new ValueBool(TypeDataEnum.BOOLEAN, new Boolean(true)));
			set.setCheckTree(__tree);
		}
		
		set.getResult();
		return this.set;
	}

	public void setSet(SelectSet set) {
		this.set = set;
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}
}
