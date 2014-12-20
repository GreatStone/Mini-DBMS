package com.db.minidb.sys.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.db.minidb.info.loginfo.LogFailure;
import com.db.minidb.info.loginfo.LogInfoManager;
import com.db.minidb.info.loginfo.LogSuccess;
import com.db.minidb.sys.setting.PropertiesFileManager;
import com.db.minidb.sys.user.User;
import com.db.minidb.sys.user.UserManager;

public class LoginServer extends Thread{
	private Object lockInputObj = new Object();
	private Object lockOutputObj = new Object();
	private Object lockObj = new Object();
	private boolean runFlag = false;
	private Socket client = null;
	private String conectionName = null;
	private User loginUser = null;
	public LoginServer(Socket client) {
		this.client = client;
		this.conectionName = this.client.getInetAddress() + ":" + this.client.getPort()+"["+this.client.hashCode()+"]";
	}
	public void startServer() {
		this.runFlag = true;
		this.start();
	}
	public void stopServer() {
		this.runFlag = false;
	}
	private Session successLogin() {
		synchronized (lockObj) {
			Session session = new Session();
			session.setCurrentUser(this.loginUser);
			session.setCurrentClient(this.client);
			session.setCurrentDatabase(null);
			return session;
		}
	}
	private void createClientServer() {
		synchronized (lockObj) {
			Session session = successLogin();
			ClientServer clientServer = new ClientServer(session);
			clientServer.startServer();
		}
	}
	private String checkLoginRequest(String request) {
		synchronized (lockObj) {
			String[] values = request.split(" ");
			if(values.length != 2) {
				LogInfoManager.appendLogInfo(new LogFailure(this.conectionName + " login failed"));
				return "invalid username or passwd!";
			}
			String username = values[0];
			User user = UserManager.findUserWithUsername(username);
			if(user == null) {
				LogInfoManager.appendLogInfo(new LogFailure(this.conectionName + " login failed"));
				return "user " + username + " doesn't exist!";
			}
			String passwd = values[1];
			if(!passwd.equals(user.getPasswd())) {
				LogInfoManager.appendLogInfo(new LogFailure(this.conectionName + " login failed"));
				return "invalid password!";
			}
			LogInfoManager.appendLogInfo(new LogSuccess(this.conectionName + " login successful"));
			this.loginUser = user;
			return null;
		}
	}
	private String readLine(BufferedReader reader) {
		synchronized (lockInputObj) {
			String ret = null;
			try {
				ret = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ret;
		}
	}
	private void writeLine(PrintWriter writer, String msg, boolean isFlush) {
		synchronized (lockOutputObj) {
			writer.println(msg);
			if(isFlush) {
				writer.flush();
			}
		}
	}
	public void run() {
		BufferedReader clientReader = null;
		PrintWriter clientWriter = null;
		synchronized (lockObj) {
			try {
				clientReader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
				clientWriter = new PrintWriter(this.client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		writeLine(clientWriter, "please input the username and password to login", true);
		String exitRequest = PropertiesFileManager.getProperty("Sys_ExitRequest");
		while(this.runFlag && !this.client.isClosed()) {
			String request = readLine(clientReader);
			System.out.println(this.conectionName + ": " + request);
			if(request == null || request.equals(exitRequest)) {	
				writeLine(clientWriter, "Bye!", true);
				try {
					this.client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.stopServer();
				break;
			}
			String response = checkLoginRequest(request);
			if(response == null) {
				writeLine(clientWriter, "login successful!", false);
				this.stopServer();
				createClientServer();
				break;
			}
			writeLine(clientWriter, response, true);
		}
			
	}
}
