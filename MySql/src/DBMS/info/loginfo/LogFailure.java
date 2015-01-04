package DBMS.info.loginfo;

import DBMS.info.info.InfoTypeEnum;

public class LogFailure extends LogInfoWithTime {
	public LogFailure(String msg) {
		this(InfoTypeEnum.FAILURE, msg);
	}

	private LogFailure(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
