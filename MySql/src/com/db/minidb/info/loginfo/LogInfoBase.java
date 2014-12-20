package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoBase;
import com.db.minidb.info.info.InfoTypeEnum;

public abstract class LogInfoBase implements InfoBase {
	protected InfoTypeEnum logType = null;
	protected String logMsg = null;
	public LogInfoBase(InfoTypeEnum type, String msg) {
//		msg = msg.replaceAll("\\", "\\\\");
		this.logType = type;
		this.logMsg = msg;
	}
	public void setInfoType(InfoTypeEnum type) {
		this.logType = type;
	}
	public InfoTypeEnum getInfoType() {
		return this.logType;
	}
	public void setInfoMsg(String msg) {
//		msg = msg.replaceAll("\\", "\\\\");
		this.logMsg = msg;
	}
	public String getInfoMsg() {
		return this.logMsg;
	}
	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(this.logType);
		ret.append("\t: ");
		ret.append(this.logMsg);
		return ret.toString();
	}
	
}
