package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class LogFailure extends LogInfoWithTime {
	public LogFailure(String msg) {
		this(InfoTypeEnum.FAILURE, msg);
	}
	private LogFailure(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
