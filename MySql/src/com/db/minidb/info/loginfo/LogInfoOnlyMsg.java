
package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;


public class LogInfoOnlyMsg extends LogInfoBase {

	public LogInfoOnlyMsg(InfoTypeEnum type, String msg) {
		super(type, msg);
	}
	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(this.logMsg);
		return ret.toString();
	}
}
