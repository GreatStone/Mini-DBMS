package DBMS.info.loginfo;

import DBMS.info.info.InfoTypeEnum;

public class LogWarning extends LogInfoWithTime {
	public LogWarning(String msg) {
		this(InfoTypeEnum.WARNING, msg);
	}

	private LogWarning(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
