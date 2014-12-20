package com.db.minidb.sys.setting;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.db.minidb.util.FileTool;

public class PropertiesFileManager {
	private static PropertiesFileManager instance = new PropertiesFileManager();
	private PropertiesFileManager() {}
	
	private static String applicationLocation = null;
	private static Properties systemProperties = null;
	
	public static PropertiesFileManager getInstance() {
		return instance;
	}
	public void loadProperties() {
		getApplicationLocation();
		loadSystemProperties();
	}
	public static Properties getSystemProperties() {
		return systemProperties;
	}
	public static String getProperty(String key) {
		return systemProperties.getProperty(key);
	}
	private static void mergeDirctoryFullPath() {
		systemProperties.setProperty("Log_LogFileDirctory", 
				FileTool.openDirctory(PropertiesFileManager.getProperty("Sys_ApplicationLocation"), 
									PropertiesFileManager.getProperty("Log_LogFileDirctory")).getAbsolutePath());
		systemProperties.setProperty("Dict_DataDictDirctory", 
				FileTool.openDirctory(PropertiesFileManager.getProperty("Sys_ApplicationLocation"), 
									PropertiesFileManager.getProperty("Dict_DataDictDirctory")).getAbsolutePath());
		systemProperties.setProperty("Data_DataFileDirctory", 
				FileTool.openDirctory(PropertiesFileManager.getProperty("Sys_ApplicationLocation"), 
									PropertiesFileManager.getProperty("Data_DataFileDirctory")).getAbsolutePath());
		systemProperties.setProperty("Sys_TempFileDirctory", 
				FileTool.openDirctory(PropertiesFileManager.getProperty("Sys_ApplicationLocation"), 
									PropertiesFileManager.getProperty("Sys_TempFileDirctory")).getAbsolutePath());
	}
	private static void loadSystemProperties() {
		InputStream is = null;
		is = Class.class.getClass().getResourceAsStream("/sys.properties");
		systemProperties = new Properties();
		try {
			systemProperties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(systemProperties.getProperty("Sys_ApplicationLocation") == null) {
			systemProperties.setProperty("Sys_ApplicationLocation", applicationLocation);
		}
		mergeDirctoryFullPath();
	}
	private static void getApplicationLocation() {
		try {
			applicationLocation = new File(" ").getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
