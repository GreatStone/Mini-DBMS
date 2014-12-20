package com.db.minidb.info.loginfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.db.minidb.info.info.InfoTypeEnum;
import com.db.minidb.util.FileTool;

public class LogInfoManager {
	private static Object lockObj = new Object();
	private static LogInfoManager instance = new LogInfoManager();
	private static File logFile;
	private static PrintWriter logFilePW;
	private LogInfoManager() {
		logFilePW = null;
	}
	public static LogInfoManager getInstance() {
		return instance;
	}
	
	public static LogInfoBase getDividingLineLog() {
		return new LogInfoOnlyMsg(InfoTypeEnum.INFO, "=========================================================");
	}
	
	public static void init(String path, String fname) {
		logFile = FileTool.openFile(path, fname);
		try {
			logFilePW = new PrintWriter(new FileWriter(logFile, true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void appendLogInfo(LogInfoBase log) {
		synchronized (lockObj) {
			logFilePW.println(log.displayInfoMsg());
			logFilePW.flush();
		}
	}
	public static void close() {
		synchronized (lockObj) {
			logFilePW.flush();
			logFilePW.close();
		}
	}
}
