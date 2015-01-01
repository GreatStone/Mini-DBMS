package com.db.minidb.info.userinfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class UserInfoOnlyMsg extends UserInfoBase {
	public UserInfoOnlyMsg(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

	public String displayInfoMsg() {
		StringBuffer ret = new StringBuffer();
		ret.append(this.infoMsg);
		return ret.toString();
	}
}
