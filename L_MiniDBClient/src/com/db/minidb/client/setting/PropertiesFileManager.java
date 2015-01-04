package com.db.minidb.client.setting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesFileManager {
	private static PropertiesFileManager instance = new PropertiesFileManager();
	private PropertiesFileManager() {}
	
	private static Properties systemProperties = null;
	
	public static PropertiesFileManager getInstance() {
		return instance;
	}
	public void loadProperties() {
		loadClientProperties();
	}
	public static Properties getSystemProperties() {
		return systemProperties;
	}
	public static String getProperty(String key) {
		return systemProperties.getProperty(key);
	}
	public static void loadClientProperties() {
		InputStream is = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("setting.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		is = fis;
//		is = Class.class.getClass().getResourceAsStream("/setting.properties");
		systemProperties = new Properties();
		try {
			systemProperties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
