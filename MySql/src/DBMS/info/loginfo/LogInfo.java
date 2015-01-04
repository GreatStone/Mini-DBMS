package DBMS.info.loginfo;

import DBMS.info.info.InfoTypeEnum;

public class LogInfo extends LogInfoWithTime {
	public LogInfo(String msg) {
		this(InfoTypeEnum.INFO, msg);
	}

	private LogInfo(InfoTypeEnum type, String msg) {
		super(type, msg);
	}
}
