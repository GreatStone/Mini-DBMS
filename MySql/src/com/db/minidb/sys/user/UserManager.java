package com.db.minidb.sys.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.db.minidb.data.database.DataRecord;
import com.db.minidb.data.database.DataTable;
import com.db.minidb.data.database.DataTableManager;
import com.db.minidb.dict.database.DictCenterManager;
import com.db.minidb.dict.database.DictColumnInfo;
import com.db.minidb.dict.database.DictDatabaseInfo;
import com.db.minidb.dict.database.DictTableInfo;
import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.util.BinaryFileIOTool;
import com.db.minidb.util.FileTool;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static Object lockObj = new Object();
	private static File dictUserFile;
	private static int usernameMinLength = -1;
	private static int usernameMaxLength = -1;
	private static int passwdMinLength = -1;
	private static int passwdMaxLength = -1;
	private static List<User> currentUsers = null;
	private static int currentUserCount = -1;
	private static int nextUserId = -1;
	private UserManager() {
		
	}
	public static UserManager getInstance() {
		return instance;
	}
	public static int getUsernameMinLength() {
		return usernameMinLength;
	}
	public static void setUsernameMinLength(int usernameMinLength) {
		UserManager.usernameMinLength = usernameMinLength;
	}
	public static int getUsernameMaxLength() {
		return usernameMaxLength;
	}
	public static void setUsernameMaxLength(int usernameMaxLength) {
		UserManager.usernameMaxLength = usernameMaxLength;
	}
	public static int getPasswdMinLength() {
		return passwdMinLength;
	}
	public static void setPasswdMinLength(int passwdMinLength) {
		UserManager.passwdMinLength = passwdMinLength;
	}
	public static int getPasswdMaxLength() {
		return passwdMaxLength;
	}
	public static void setPasswdMaxLength(int passwdMaxLength) {
		UserManager.passwdMaxLength = passwdMaxLength;
	}
	public static void init(String path, String fname, int usernameMinLen, int usernameMaxLen, int passwdMinLen, int passwdMaxLen) {
		dictUserFile = FileTool.openFile(path, fname);
		setUsernameMinLength(usernameMinLen);
		setUsernameMaxLength(usernameMaxLen);
		setPasswdMinLength(passwdMinLen);
		setPasswdMaxLength(passwdMaxLen);
	}
	
	private static User readUser(InputStream is) {
		synchronized (lockObj) {
			int userId = BinaryFileIOTool.readInt(is);
			String username = BinaryFileIOTool.readString(is);
			String passwd = BinaryFileIOTool.readString(is);
			return new User(userId, username, passwd);
		}
	}
	private static void storeUser(User user, OutputStream os) {
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(user.getUserId(), os);
			BinaryFileIOTool.writeString(user.getUsername(), os);
			BinaryFileIOTool.writeString(user.getPasswd(), os);
		}
	}
	private static List<User> loadUsersAll(InputStream is) {
		ArrayList<User> allUser = new ArrayList<User>();
		User user = null;
		synchronized (lockObj) {
			int cnt = BinaryFileIOTool.readInt(is);
			while(cnt-- > 0) {
				user = readUser(is);
				allUser.add(user);
			}
			return allUser;
		}
	}
	private static void storeUsersAll(List<User> users, OutputStream os) {
		int cnt = users.size();
		synchronized (lockObj) {
			BinaryFileIOTool.writeInt(cnt, os);
			for(User user : users) {
				storeUser(user, os);
			}
		}
	}
	private static void loadDictUserFile() {
		FileInputStream fis = null;
		try {
			synchronized (lockObj) {
				fis = new FileInputStream(dictUserFile);
				currentUserCount = BinaryFileIOTool.readInt(fis);
				nextUserId = BinaryFileIOTool.readInt(fis);
				currentUsers = loadUsersAll(fis);
				fis.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	private static void storeDictUserFile() {
		FileOutputStream fos = null;
		try {
			synchronized (lockObj) {
				fos = new FileOutputStream(dictUserFile);
				BinaryFileIOTool.writeInt(currentUserCount, fos);
				BinaryFileIOTool.writeInt(nextUserId, fos);
				storeUsersAll(currentUsers, fos);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static User findUserWithUsername(String username) {
		DictDatabaseInfo systemDatabase = DictCenterManager.findDatabaseWithName(PropertiesFileManager.getProperty("Dict_SystemDatabase"));
		DictTableInfo systemUserTable = DictCenterManager.findTableWithName(systemDatabase, PropertiesFileManager.getProperty("Dict_SystemUserTable"));
		DataTable userTable = DataTableManager.loadTable(systemUserTable);
		int usernameCol = -1, passwdCol = -1, userIdCol = -1;
		for(int i = 0; i < userTable.getColumns().size(); i++) {
			DictColumnInfo col = userTable.getColumns().get(i);
			if(col.getColumnName().equals("username")) {
				usernameCol = i;
			}
			if(col.getColumnName().equals("passwd")) {
				passwdCol = i;
			}
			if(col.getColumnName().equals("userid")) {
				userIdCol = i;
			}
		}
		for(DataRecord record : userTable.getRecords()) {
			if(record.getValues().get(usernameCol).getValue().equals(username)) {
				int id = (int) record.getValues().get(userIdCol).getValue();
				String name = (String) record.getValues().get(usernameCol).getValue();
				String passwd = (String) record.getValues().get(passwdCol).getValue();
				return new User(id, name, passwd);
			}
		}

		return null;
	}
}
