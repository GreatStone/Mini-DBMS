package com.db.minidb.sys.server;

import java.io.*;
import java.net.Socket;

import com.db.minidb.dict.database.DictDatabaseInfo;
import com.db.minidb.sys.user.User;

public class Session {
	private User currentUser;
	private DictDatabaseInfo currentDatabase;
	private Socket currentClient;
	private PrintWriter streamToClient;
	private BufferedReader streamFromClient;
	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	public DictDatabaseInfo getCurrentDatabase() {
		return currentDatabase;
	}
	public void setCurrentDatabase(DictDatabaseInfo currentDatabase) {
		this.currentDatabase = currentDatabase;
	}
	public Socket getCurrentClient() {
		return currentClient;
	}
	private void updateStreams() {
		InputStream inStream = null;
		OutputStream outStream = null;
		BufferedReader bfReader = null;
		PrintWriter ptWriter = null;
		try {
			inStream = this.currentClient.getInputStream();
			outStream = this.currentClient.getOutputStream();
			bfReader = new BufferedReader(new InputStreamReader(inStream));
			ptWriter = new PrintWriter(outStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.streamFromClient = bfReader;
			this.streamToClient = ptWriter;
		}
	}
	public void setCurrentClient(Socket currentClient) {
		this.currentClient = currentClient;
		this.updateStreams();
	}
	public PrintWriter getStreamToClient() {
		return streamToClient;
	}
	public BufferedReader getStreamFromClient() {
		return streamFromClient;
	}
	
}
