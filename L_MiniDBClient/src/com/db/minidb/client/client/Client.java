package com.db.minidb.client.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.db.minidb.client.setting.PropertiesFileManager;

public class Client {
	private static Object lockObj = new Object();
	private static PropertiesFileManager propertiesFlag = null;
	private static void showWelcome() {
		synchronized (lockObj) {
			System.out.println("================================================================================");
			System.out.println("****                      Welcome to L_MiniDBMS                             ****");
			System.out.println("================================================================================");
		}
	}
	private void loadSettings() {
		synchronized (lockObj) {
			if(propertiesFlag == null) {
				propertiesFlag = PropertiesFileManager.getInstance();
				PropertiesFileManager.loadClientProperties();
			}
		}
	}
	private Socket createLinkToServer() {
		synchronized (lockObj) {
			Socket client = null;
			try {
				client = new Socket(InetAddress.getByName(PropertiesFileManager.getProperty("ServerAddress")), 
						Integer.parseInt(PropertiesFileManager.getProperty("ServerPort")));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return client;
		}
	}
	private String readLine(BufferedReader reader) {
		synchronized (lockObj) {
			String ret = null;
			try {
				ret = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ret;
		}
	}
	private void writeString(PrintWriter writer, String msg) {
		synchronized (lockObj) {
			writer.print(msg);
			writer.flush();
		}
	}
	private void writeLine(PrintWriter writer, String msg) {
		synchronized (lockObj) {
			writer.println(msg);
			writer.flush();
		}
	}
	private String readResponse(BufferedReader reader) {
		String response = "";
		int lineNum = Integer.parseInt(readLine(reader));
		while(lineNum-- > 0) {
			String line = readLine(reader);
			response = response + "\r\n" + line;
		}
		return response;
	}
	private void works(Socket client) {
		BufferedReader cmdReader;
		PrintWriter cmdWriter;
		BufferedReader clientReader = null;
		PrintWriter clientWriter = null;
		synchronized (lockObj) {
			cmdReader = new BufferedReader(new InputStreamReader(System.in));
			cmdWriter = new PrintWriter(new OutputStreamWriter(System.out));
			try {
				clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				clientWriter = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		writeLine(cmdWriter, readResponse(clientReader));
		writeString(cmdWriter, ">>");
		String exitRequest = PropertiesFileManager.getProperty("ExitRequest");
		while( true ){
			String request = null;
			request = readLine(cmdReader);
			if(request.equals(exitRequest)) {
				writeLine(clientWriter, request);
				writeLine(cmdWriter, readResponse(clientReader));
				break;
			}
			writeLine(clientWriter, request);
			String response = readResponse(clientReader);
			writeLine(cmdWriter, response);
			writeString(cmdWriter, ">>");
		}
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		writeLine(cmdWriter, "Press enter to continue ...");
		readLine(cmdReader);
	}
	public void startClient() {
		showWelcome();
		this.loadSettings();
		Socket client = this.createLinkToServer();
		if(client != null) {
			this.works(client);
		}
		else {
			System.out.println("Failed to connect the server!!!\r\n" 
		+ "Please to check the server status and the setting.properties file");
		}
	}
}
