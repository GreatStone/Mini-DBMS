package com.db.minidb.util;

public class FormatTool {
	private static FormatTool instance = new FormatTool();
	private FormatTool() {
		
	}
	public static FormatTool getInstance() {
		return instance;
	}
	public static String integerFormatWidth(int value, int width) {
		String format = "%0" + width + "d";
		return String.format(format, value);
	}
	public static String longFormatWidth(long value, int width) {
		String format = "%0" + width + "d";
		return String.format(format, value);
	}
}
