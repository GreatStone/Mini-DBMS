package DBMS.info.loginfo;

import java.io.File;
import java.io.IOException;

public class TestLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogInfoManager.init("D:\\", "testlog.txt");
		LogInfoBase log1 = LogInfoManager.getDividingLineLog();
		LogInfoBase log2 = new LogInfo("Info log");
		LogInfoManager.appendLogInfo(log1);
		LogInfoManager.appendLogInfo(log2);
		LogInfoManager.appendLogInfo(new LogError("Error log"));
		LogInfoManager.appendLogInfo(new LogWarning("Warning Log"));
		try {
			String path = new File(" ").getCanonicalPath();
			LogInfoManager.appendLogInfo(new LogInfo("path" + path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogInfoManager.close();
	}

}
