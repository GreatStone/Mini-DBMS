
package com.db.minidb.info.info;

public interface InfoBase {
	public void setInfoType(InfoTypeEnum type);
	public InfoTypeEnum getInfoType();
	public void setInfoMsg(String msg);
	public String getInfoMsg();
	public String displayInfoMsg();
}
