package DBMS.info.userinfo;

import java.io.PrintWriter;

public class UserInfoManager {
	private static Object lockObj = new Object();
	private static UserInfoManager instance = new UserInfoManager();

	private UserInfoManager() {

	}

	public static UserInfoManager getInstance() {
		return instance;
	}

	public static void displayUserInfo(UserInfoBase info, PrintWriter pw) {
		synchronized (lockObj) {
			pw.println(info.displayInfoMsg());
			pw.flush();
		}
	}
}
