package DBMS.info.loginfo;

import DBMS.info.info.InfoTypeEnum;
import DBMS.util.DateTool;

public class LogInfoWithTime extends LogInfoBase {
	public LogInfoWithTime(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(DateTool.getCurrentDateTime(DateTool.DATETIME_DEFAULT));// new
																			// Date()Ϊ��ȡ��ǰϵͳʱ��
		ret.append(" ");
		ret.append(super.displayInfoMsg());
		return ret.toString();
	}
}
