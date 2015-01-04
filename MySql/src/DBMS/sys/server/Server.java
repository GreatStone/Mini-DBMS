package DBMS.sys.server;

import java.io.File;
import java.util.ArrayList;

import DBMS.data.database.DataRecord;
import DBMS.data.database.DataTable;
import DBMS.data.database.DataTableManager;
import DBMS.data.value.ValueBase;
import DBMS.data.value.ValueInt;
import DBMS.data.value.ValueString;
import DBMS.dict.database.DictCenterManager;
import DBMS.dict.database.DictDatabaseInfo;
import DBMS.dict.database.DictDatabaseListInfo;
import DBMS.dict.database.DictDatabaseListManager;
import DBMS.dict.database.DictLockManager;
import DBMS.dict.type.TypeDataEnum;
import DBMS.info.info.InfoTypeEnum;
import DBMS.info.loginfo.LogError;
import DBMS.info.loginfo.LogInfo;
import DBMS.info.loginfo.LogInfoManager;
import DBMS.info.loginfo.LogInfoWithTime;
import DBMS.sys.setting.PropertiesFileManager;
import DBMS.sys.setting.SettingFileManager;

public class Server {
	private int serverPort = -1;
	private PortListener portListener = null;
	private Thread portListenerThread = null;

	private void displayWelcome() {
		System.out
				.println("================================================================================");
		System.out
				.println("****                      Welcome to L_MiniDBMS                             ****");
		System.out
				.println("================================================================================");
		System.out.println();
	}

	private void displayBye() {
		System.out.println("Start to stop L_MiniDBMS");

		System.out.println();
	}

	private void loadPropertyFiles() {
		PropertiesFileManager.getInstance().loadProperties();
	}

	private void loadSettingFiles() {
		SettingFileManager.getInstance().loadSettings();
	}

	private void createSystemUserTable(DictDatabaseInfo systemDatabase) {
		String tableName = PropertiesFileManager
				.getProperty("Dict_SystemUserTable");
		String[] columnsType = PropertiesFileManager.getProperty(
				"Dict_SystemUserTableColumnsType").split(",");
		String[] columnsName = PropertiesFileManager.getProperty(
				"Dict_SystemUserTableColumns").split(",");
		ValueBase[] values = new ValueBase[columnsType.length];
		values[0] = new ValueInt(TypeDataEnum.INT,1);
		values[1] = new ValueString(TypeDataEnum.STRING,
				PropertiesFileManager.getProperty("Dict_SystemAdministrator"));
		values[2] = new ValueString(TypeDataEnum.STRING,
				PropertiesFileManager
						.getProperty("Dict_SystemAdministratorDefaultPasswd"));
		String[] keysName = new String[1];
		keysName[0] = new String(columnsName[0]);
		DictCenterManager.addTable(systemDatabase, tableName, columnsName,
				columnsType, keysName);
		DataTable table = new DataTable();
		table.setDatabaseId(DictCenterManager
				.findTableWithName(systemDatabase, tableName).getDatabase()
				.getDatabaseId());
		table.setTableId(DictCenterManager.findTableWithName(systemDatabase,
				tableName).getTableId());
		table.setColumns(DictCenterManager.findTableWithName(systemDatabase,
				tableName).getColumns());
		table.setRecords(new ArrayList<DataRecord>());
		DataRecord record = new DataRecord();
		ArrayList<ValueBase> lv = new ArrayList<ValueBase>();
		for (int i = 0; i < columnsType.length; i++)
			lv.add(values[i]);
		record.setValues(lv);
		table.getRecords().add(record);
		DataTableManager.storeTable(table);
	}

	private void createSystemDatabase() {
		DictCenterManager.addDatabase(PropertiesFileManager
				.getProperty("Dict_SystemDatabase"));
		createSystemUserTable(DictCenterManager
				.findDatabaseWithName(PropertiesFileManager
						.getProperty("Dict_SystemDatabase")));
	}

	private void createDatabaseList() {
		DictDatabaseListInfo databaseList = new DictDatabaseListInfo();
		databaseList.setDatabaseCount(0);
		databaseList.setNextDatabaseId(1);
		databaseList.setDatabases(new ArrayList<DictDatabaseInfo>());
		DictCenterManager.setDatabaseList(databaseList);
		DictCenterManager.storeDataDict();
		createSystemDatabase();
	}

	private void checkSystemDatabase() {
		String databaseListFullPath = DictDatabaseListManager
				.getDatabaseListDictFileFullPath();
		File databaseListFile = new File(databaseListFullPath);
		if (!databaseListFile.exists()) {
			System.out.println("Don't find the data dirctory fiels");
			LogInfoManager.appendLogInfo(new LogError(
					"Don't find the data dirctory fiels"));
			LogInfoManager.appendLogInfo(new LogInfo(
					"Create base data dirctory"));
			createDatabaseList();
			DictCenterManager.storeDataDict();
		}
		DictCenterManager.init();

		String systemDatabaseName = PropertiesFileManager
				.getProperty("Dict_SystemDatabase");
		DictDatabaseInfo systemDatabase = DictCenterManager
				.findDatabaseWithName(systemDatabaseName);
		if (systemDatabase == null) {
			System.out.println("Don't find the system default database");
			LogInfoManager.appendLogInfo(new LogError(
					"Don't find the system default database"));
			LogInfoManager.appendLogInfo(new LogInfo(
					"Create system default database"));
			createSystemDatabase();
			systemDatabase = DictCenterManager
					.findDatabaseWithName(systemDatabaseName);
		}
	}

	private void initSystemBase() {
		LogInfoManager.init(
				PropertiesFileManager.getProperty("Log_LogFileDirctory"),
				PropertiesFileManager.getProperty("Log_LogFileName"));
	}

	private void initSystem() {
		System.out.println("Check system default database ...");
		checkSystemDatabase();

		this.serverPort = Integer.parseInt(PropertiesFileManager
				.getProperty("Sys_ServerPort"));
		DictLockManager.clear();
	}

	private void startPortListener() {
		LogInfoManager.appendLogInfo(new LogInfoWithTime(InfoTypeEnum.INFO,
				"Start to listen PORT: " + this.serverPort));

		this.portListener = new PortListener(this.serverPort);
		this.portListener.startListener();
		this.portListenerThread = new Thread(this.portListener);
		this.portListenerThread.start();
	}

	public void startServer() {
		this.displayWelcome();

		System.out.println("Loading Settings ...");
		this.loadPropertyFiles();
		this.loadSettingFiles();

		System.out.println("Initializing System ...");
		this.initSystemBase();
		LogInfoManager.appendLogInfo(LogInfoManager.getDividingLineLog());
		LogInfoManager.appendLogInfo(new LogInfoWithTime(InfoTypeEnum.INFO,
				"Start DBMS Server"));
		this.initSystem();

		System.out.println("Start listenning server on PORT: "
				+ this.serverPort);
		this.startPortListener();

		LogInfoManager.appendLogInfo(new LogInfoWithTime(InfoTypeEnum.SUCCESS,
				"Start DBMS Server Succeed!"));
		System.out.println(DictDatabaseListManager
				.displayDatabaseList(DictCenterManager.getDatabaseList()));
	}

	public void stopServer() {
		this.displayBye();
		System.out.println(DictDatabaseListManager
				.displayDatabaseList(DictCenterManager.getDatabaseList()));

		LogInfoManager.appendLogInfo(new LogInfoWithTime(InfoTypeEnum.INFO,
				"Stop DBMS Server"));

		System.out.println("Stop listenning server");
		this.portListener.stopListener();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Store the data dictionary");
		DictCenterManager.storeDataDict();

		System.out.println("Store the using database");

		System.out.println("Save the settings");

		LogInfoManager.appendLogInfo(new LogInfoWithTime(InfoTypeEnum.SUCCESS,
				"Stop DBMS Server Succeed!"));
		LogInfoManager.appendLogInfo(LogInfoManager.getDividingLineLog());

		System.out.println("Bye!");

	}
}
