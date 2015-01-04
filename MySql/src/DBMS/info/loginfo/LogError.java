package DBMS.info.loginfo;

import DBMS.info.info.InfoTypeEnum;

public class LogError extends LogInfoWithTime {
	public LogError(String msg) {
		this(InfoTypeEnum.ERROR, msg);
	}

	private LogError(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
