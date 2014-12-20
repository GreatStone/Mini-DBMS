package com.db.minidb.util;

import java.io.*;

public class FileTool {
	public static String openDirctoryFullPath(String parent, String dirname) {
		File dir = new File(parent, dirname);
		return dir.getAbsolutePath();
	}
	public static String openFileFullPath(String path, String fname) {
		File file = new File(path, fname);
		return file.getAbsolutePath();
	}
	public static File openFile(String fname) {
		File file = new File(fname);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	public static File openDirctory(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		return dir;
	}
	public static File openDirctory(String parent, String dirname) {
		File dir = new File(parent, dirname);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		return dir;
	}
	public static File openFile(String path, String fname) {
		File dir = openDirctory(path);
		File file = new File(dir.getAbsolutePath(), fname);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	public static InputStream getInputStream(File file) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fis;
	}
	public static OutputStream getOutputStream(File file) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fos;
	}
}
