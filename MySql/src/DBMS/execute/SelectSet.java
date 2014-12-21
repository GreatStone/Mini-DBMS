package DBMS.execute;

import java.util.*;

import org.antlr.runtime.tree.ParseTree;
import com.db.minidb.data.database.DataRecord;
import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.value.ValueBase;
import com.db.minidb.dict.database.DictColumnInfo;

public class SelectSet {
	private List<DataTable> tables;
	private List<String> aliasNames;
	private ParseTree checkTree;
	private List<DataRecord> result;
	private int [] cur;
	
	public List<DataRecord> getResult() {
		check();
		return result;
	}

	private void check () {
		int[] sizes = new int[tables.size()];
		int i;
		for (i = 0; i < tables.size(); i++){
			sizes[i] = tables.get(i).getRecords().size();
		}
		AllCombine combine = new AllCombine(sizes);
		while (combine.hasNext()){
			cur = combine.getNext();
			
		}
	}
	
	public ValueBase getColValue (String Column){
		if (Column.charAt('.')  == -1){
			int i,j;
			for (i = 0; i < tables.size(); i++){
				DataTable table = tables.get(i);
				List<DictColumnInfo> tmpColomn = table.getColumns();
				for (j = 0; j < tmpColomn.size(); j++){
					if (tmpColomn.get(i).getColumnName().equals(Column)){
						return table.getRecords().get(cur[i]).getValues().get(j);
					}
				}
			}
		}
		else{
			String[] all = Column.split("[.]");
			int i,j;
			for (i = 0; i < aliasNames.size(); i++){
				if (aliasNames.get(i).equals(all[0])){
					break;
				}
			}
			for (j = 0; j < tables.size(); j++){
				if (tables.get(i).getColumns().get(j).getColumnName().equals(Column)){
					return tables.get(i).getRecords().get(cur[i]).getValues().get(j);
				}
			}
		}
		return null;
	}
	
	public void setCheckTree(ParseTree checkTree) {
		this.checkTree = checkTree;
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
	public SelectSet  (){
		tables = new ArrayList<DataTable>();
		aliasNames = new ArrayList<String>();
	}
}
