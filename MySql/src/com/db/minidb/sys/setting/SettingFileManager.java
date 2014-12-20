package com.db.minidb.sys.setting;
public class SettingFileManager {
	private static SettingFileManager instance = new SettingFileManager();
	private SettingFileManager() {}
	public static SettingFileManager getInstance() {
		return instance;
	}
	public void loadSettings() {
		
	}
}
