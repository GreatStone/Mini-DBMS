package com.db.minidb.info.loginfo;

import com.db.minidb.info.info.InfoTypeEnum;

public class LogWarning extends LogInfoWithTime {
	public LogWarning(String msg) {
		this(InfoTypeEnum.WARNING, msg);
	}

	private LogWarning(InfoTypeEnum type, String msg) {
		super(type, msg);
	}

}
