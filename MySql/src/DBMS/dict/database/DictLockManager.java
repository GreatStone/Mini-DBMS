package DBMS.dict.database;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import DBMS.sys.setting.PropertiesFileManager;
import DBMS.util.BinaryFileIOTool;
import DBMS.util.FileTool;
import DBMS.util.FormatTool;

public class DictLockManager {
	public static final int READ = 0;
	public static final int WRITE = 1;
	private static Object lockObj = new Object();
	private static DictLockManager instance = new DictLockManager();
	public static DictLockManager getInstance() {
		return instance;
	}
	private static InputStream openInputStream() {
		File lockFile = FileTool.openFile(
				PropertiesFileManager.getProperty("Dict_DataDictDirctory"), 
				PropertiesFileManager.getProperty("Dict_LockFile")+".lck");
		return FileTool.getInputStream(lockFile);
	}
	private static OutputStream openOutputStream() {
		File lockFile = FileTool.openFile(
				PropertiesFileManager.getProperty("Dict_DataDictDirctory"), 
				PropertiesFileManager.getProperty("Dict_LockFile")+".lck");
		return FileTool.getOutputStream(lockFile);
	}
	private static String getFormatLock(int databaseId, int tableId, int rw) {
		return FormatTool.integerFormatWidth(databaseId, 12) + 
				FormatTool.integerFormatWidth(tableId, 12) +
				FormatTool.integerFormatWidth(rw, 3);
	}
	private static void storeLocks(List<String> locks) {
		OutputStream os = openOutputStream();
		BinaryFileIOTool.writeInt(locks.size(), os);
		for(String lock : locks) {
			BinaryFileIOTool.writeString(lock, os);
		}
		FileTool.closeOutputStream(os);
	}
	private static void appendLock(String lock) {
		InputStream is = openInputStream();
		ArrayList<String> locks = new ArrayList<String>();
		int lockCount = BinaryFileIOTool.readInt(is);
		for(int i = 0; i < lockCount; i++) {
			String l = BinaryFileIOTool.readString(is);
			locks.add(l);
		}
		locks.add(lock);
		FileTool.closeInputStream(is);
		storeLocks(locks);
	}
	private static void releaseLock(String lock) {
		InputStream is = openInputStream();
		ArrayList<String> locks = new ArrayList<String>();
		int lockCount = BinaryFileIOTool.readInt(is);
		for(int i = 0; i < lockCount; i++) {
			String l = BinaryFileIOTool.readString(is);
			if(lock.equals(l)) continue;
			locks.add(l);
		}
		FileTool.closeInputStream(is);
		storeLocks(locks);
	}
	public static void clear() {
		synchronized (lockObj) {
			OutputStream os = openOutputStream();
			BinaryFileIOTool.writeInt(0, os);
			FileTool.closeOutputStream(os);
		}
	}
	public static boolean askReadLock(int databaseId, int tableId) {
		synchronized (lockObj) {
			InputStream is = openInputStream();
			ArrayList<String> locks = new ArrayList<String>();
			String lock = getFormatLock(databaseId, tableId, READ);
			int lockCount = BinaryFileIOTool.readInt(is);
			for(int i = 0; i < lockCount; i++) {
				String l = BinaryFileIOTool.readString(is);
				if(lock.equals(l)) return false;
				locks.add(l);
			}
			FileTool.closeInputStream(is);
			appendLock(lock);
			return true;
		}
	} 
	public static boolean askWriteLock(int databaseId, int tableId) {
		synchronized (lockObj) {
			InputStream is = openInputStream();
			ArrayList<String> locks = new ArrayList<String>();
			String lock = getFormatLock(databaseId, tableId, WRITE);
			int lockCount = BinaryFileIOTool.readInt(is);
			for(int i = 0; i < lockCount; i++) {
				String l = BinaryFileIOTool.readString(is);
				if(lock.equals(l)) return false;
				locks.add(l);
			}
			FileTool.closeInputStream(is);
			appendLock(lock);
			return true;
		}
	}
	public static void releaseReadLock(int databaseId, int tableId) {
		synchronized (lockObj) {
			String lock = getFormatLock(databaseId, tableId, READ);
			releaseLock(lock);
		}
	}
	public static void releaseWriteLock(int databaseId, int tableId) {
		synchronized (lockObj) {
			String lock = getFormatLock(databaseId, tableId, WRITE);
			releaseLock(lock);
		}
	}
}
