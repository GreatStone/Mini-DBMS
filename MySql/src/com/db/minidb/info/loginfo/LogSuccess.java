package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class LogSuccess extends LogInfoWithTime {
	public LogSuccess(String msg) {
		this(InfoTypeEnum.SUCCESS, msg);
	}

	private LogSuccess(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
