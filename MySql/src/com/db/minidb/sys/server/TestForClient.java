package com.db.minidb.sys.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestForClient {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		Session session = new Session();
		Socket socket = new Socket("localhost", 6789);
		session.setCurrentClient(socket);
		/*
		 * Scanner scan = new Scanner (System.in); OutputStream os =
		 * socket.getOutputStream();
		 * 
		 * os.write("  ".getBytes()); os.flush();
		 * 
		 * while (scan.hasNextLine()){ String cmd = scan.nextLine();
		 * System.out.println("send: { " + cmd + " }");
		 * os.write(cmd.getBytes()); os.flush(); }
		 */
		ClientServer s = new ClientServer(session);
		s.startServer();
	}
}
