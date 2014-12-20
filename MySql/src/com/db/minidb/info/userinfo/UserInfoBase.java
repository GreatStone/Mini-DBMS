package com.db.minidb.info.userinfo;

import com.db.minidb.info.info.InfoBase;
import com.db.minidb.info.info.InfoTypeEnum;

public abstract class UserInfoBase implements InfoBase {
	protected InfoTypeEnum infoType;
	protected String infoMsg;
	public UserInfoBase(InfoTypeEnum type, String msg) {
		this.infoType = type;
		this.infoMsg = msg;
	}
	public InfoTypeEnum getInfoType() {
		return infoType;
	}
	public void setInfoType(InfoTypeEnum infoType) {
		this.infoType = infoType;
	}
	public String getInfoMsg() {
		return infoMsg;
	}
	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(this.infoType);
		ret.append("\t: ");
		ret.append(this.infoMsg);
		return ret.toString();
	}
}
