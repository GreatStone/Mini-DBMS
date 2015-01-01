package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;
import com.db.minidb.util.DateTool;

public class LogInfoWithTime extends LogInfoBase {
	public LogInfoWithTime(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(DateTool.getCurrentDateTime(DateTool.DATETIME_DEFAULT));// new
																			// Date()为获取当前系统时间
		ret.append(" ");
		ret.append(super.displayInfoMsg());
		return ret.toString();
	}
}
