package com.db.minidb.sys.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.db.minidb.info.loginfo.LogInfo;
import com.db.minidb.info.loginfo.LogInfoManager;

public class PortListener implements Runnable {
	private boolean runFlag = false;
	private int port=5678;
	private ServerSocket server = null;
	public PortListener(int port) {
		this.port = port;
		try {
			this.server = new ServerSocket(this.port);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void startListener() {
		this.runFlag = true;
	}
	public void stopListener() {
		this.runFlag = false;
	}
	public void run() {
		while(this.runFlag) {
			Socket client = null;
			try {
				client = this.server.accept();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			//�յ���������
			if(client != null) {
				//�������������������̴߳����µ��û�����
				LoginServer clientServer = new LoginServer(client);
				LogInfoManager.appendLogInfo(new LogInfo("Access the cenection " + client.getInetAddress() + ":" +client.getPort()+"["+client.hashCode()+"]"));
				clientServer.startServer();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
} 