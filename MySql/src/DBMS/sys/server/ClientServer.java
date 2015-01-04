package DBMS.sys.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import DBMS.execute.SqlConsole;
import DBMS.sys.setting.PropertiesFileManager;

public class ClientServer extends Thread {
	private Object lockObj = new Object();
	private boolean runFlag = false;
	private Socket client = null;
	private Session session = null;
	private String conectionName = null;

	public ClientServer(Session session) {
		this.session = session;
		this.client = this.session.getCurrentClient();
		this.conectionName = this.client.getInetAddress() + ":"
				+ this.client.getPort() + "[" + this.client.hashCode() + "]";
	}

	public void startServer() {
		this.runFlag = true;
		this.start();
	}

	public void stopServer() {
		this.runFlag = false;
	}

	private String readLine(BufferedReader reader) {
		String ret = null;
		try {
			ret = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}	
	private void writeLineToClient(PrintWriter writer, String msg, boolean isFlush) {
		synchronized (lockObj) {
			String msgs[] = msg.split("\n");
			writer.println(msgs.length);
			for(String s : msgs) {
				writer.println(s);
				
			}
			if(isFlush) {
				writer.flush();
			}
		}
	}
	private void writeLine(PrintWriter writer, String msg, boolean isFlush) {
		synchronized (lockObj) {
			writer.println(msg);
			if(isFlush) {
				writer.flush();
			}
		}
	}
	private String executeSql(String sqlString) {
		synchronized (lockObj) {
			SqlConsole console = new SqlConsole();
			console.setSqls(sqlString);
			return console.execute();
		}
	}
	public void run() {
		BufferedReader clientReader = null;
		PrintWriter clientWriter = null;
		try {
			clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			clientWriter = new PrintWriter(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		writeLineToClient(clientWriter, "login successful!", true);
		String exitRequest = PropertiesFileManager.getProperty("Sys_ExitRequest");
		while(this.runFlag && !this.client.isClosed()) {
			String request = readLine(clientReader);
//			System.out.println("ClientServer" + this.conectionName + ": " + request);
			if(request == null || request.equals(exitRequest)) {
				System.out.println(this.conectionName + " Disconnected");
				writeLineToClient(clientWriter, "Bye!", true);
				try {
					this.client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.stopServer();
				break;
			}
			String response = request;
			response = executeSql(request);			
//			System.out.println(response);
			writeLineToClient(clientWriter, response, true);
		}
	}


}
