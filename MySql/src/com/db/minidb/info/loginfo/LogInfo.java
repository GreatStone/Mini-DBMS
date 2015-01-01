package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class LogInfo extends LogInfoWithTime {
	public LogInfo(String msg) {
		this(InfoTypeEnum.INFO, msg);
	}

	private LogInfo(InfoTypeEnum type, String msg) {
		super(type, msg);
	}
}
