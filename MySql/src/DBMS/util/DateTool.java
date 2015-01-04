package DBMS.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
	public static final String DATETIME_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_DEFAULT = "yyyy-MM-dd";
	public static final String TIME_DEFAULT = "HH:mm:ss";

	public static String getCurrentDateTime(String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);// 设置日期格式
		return df.format(new Date()).toString();// new Date()为获取当前系统时间
	}

	public static long getCurrentDateTime() {
		return new Date().getTime();
	}
}
