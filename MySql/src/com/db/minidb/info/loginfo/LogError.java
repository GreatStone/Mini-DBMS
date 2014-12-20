package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class LogError extends LogInfoWithTime {
	public LogError(String msg) {
		this(InfoTypeEnum.ERROR, msg);
	}
	private LogError(InfoTypeEnum type, String msg) {
		super(type, msg);
	}
	
}
