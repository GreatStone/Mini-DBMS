package DBMS.execute;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.parse.ANTLRParser.throwsSpec_return;
import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.parser.ValueTree;

import com.db.minidb.data.database.DataRecord;
import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.data.value.ValueDouble;
import com.db.minidb.data.value.ValueInt;
import com.db.minidb.data.value.ValueString;
import com.db.minidb.dict.database.DictColumnInfo;
import com.db.minidb.dict.database.DictDatabaseInfo;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.dict.type.TypeDataEnum;

public class InsertConsole {
	private ParseTree tree;
	private DictTableInfo tableInfo = null;
	private DataRecord record = new DataRecord();
	
	public void execute() throws Exception{
		DictDatabaseInfo __dbInfo = QueryInfo.get__dbInfo();
		if (__dbInfo == null){
			throw new Exception("No choosed database");
		}
		int len = tree.getChildCount();
		String __name = tree.getChild(2).getText();
		for (DictTableInfo e: __dbInfo.getTables()){
			if (e.getTableName().equals(__name)){
				tableInfo = e;
				break;
			}
		}
		if (tableInfo == null){
			throw new Exception("Table "+__name+" not found");
		}
		List<TypeDataEnum> types = new ArrayList<TypeDataEnum>();
		for (DictColumnInfo e: tableInfo.getColumns()){
			types.add(e.getType().getTypeEnum());
		}
		try{
			int i,j;
			int cnt = 0;
			for (i = 5,j = 0; i < len; i+=2,j++){
				cnt++;
				if (types.get(j).equals(TypeDataEnum.INT)){
					ValueInt tmp = new ValueInt(TypeDataEnum.INT,((ValueTree)tree.getChild(i)).getValue().getValue());
					record.getValues().add(tmp);
				} else if (types.get(j).equals(TypeDataEnum.DOUBLE)){
					ValueDouble tmp = new ValueDouble(TypeDataEnum.DOUBLE,((ValueTree)tree.getChild(i)).getValue().getValue());
					record.getValues().add(tmp);
				} else if (types.get(j).equals(TypeDataEnum.STRING)){
					ValueString tmp = new ValueString(TypeDataEnum.STRING,((ValueTree)tree.getChild(i)).getValue().getValue());
					record.getValues().add(tmp);
				} else{
					throw new Exception();
				}
			}
			if (cnt != tableInfo.getColumnCount()){
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("Unavailable inserted data");
		}
		DataTable __table = new DataTable();
		__table = DataTableManager.loadTable(tableInfo);
		__table.getRecords().add(record);
		DataTableManager.storeTable(__table);
	}
	
	public void setTree (ParseTree tree){
		this.tree = tree;
	}
}
