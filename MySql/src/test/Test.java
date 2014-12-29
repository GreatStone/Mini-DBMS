package test;

import java.util.*;

import javax.security.auth.x500.X500Principal;

import DBMS.execute.SqlConsole;
import com.db.minidb.sys.server.Server;

public class Test {
	public static void main (String[] args){
		Server server = new Server();
		server.startServer();
		
		String sqlString = "";
		Scanner scan = new Scanner(System.in);
		
		Queue<String> sqlWait = new LinkedList<String>();
		
		try{
			while (true){
				while (sqlString.indexOf(";") == -1){
					sqlString += scan.nextLine() + " ";
				}
				sqlString = sqlString.trim();
				String[] __tmp = sqlString.split(";");
				int len = __tmp.length;
				if (sqlString.charAt(sqlString.length()-1) != ';'){
					len--;
					sqlString = __tmp[len];
				} else{
					sqlString = "";
				}
				for (int i = 0; i < len; i++){
					sqlWait.offer(__tmp[i]);
				}
				while (!sqlWait.isEmpty()){
					String e = sqlWait.poll();
					test(e + ";");
				}
			}
		} catch (Exception e) {
		}
		
		server.stopServer();
	}
	public static void test (String sql){
		/*Scanner scan = new Scanner(System.in);
		String sql = "";
		String in = "";
		while (in.indexOf(";") == -1){
			in = scan.nextLine();
			sql+=in;
		}*/
		SqlConsole console = new SqlConsole();
		System.out.println(sql);
		console.setSqls(sql);
		console.execute();
	}
}
