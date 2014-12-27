package test;

import java.util.*;

import DBMS.execute.SqlConsole;

import com.db.minidb.sys.server.Server;

public class Test {
	public static void main (String[] args){
		/*File __file = new File ("/home/greatstone/workspace/MySql/test.txt");
		try {
			Scanner scan = new Scanner(__file);
			String sqls = "select t as a, b as ali from atable where t+2 not in (select x as xli from btable) and c < 2;";
			while (scan.hasNextLine())
			{
				sqls += scan.nextLine() + " \n";
			}
			System.out.println("Prepare to parser :{\n" + sqls + "}");
			sqlLexer lexer = new sqlLexer(new ANTLRInputStream(sqls));
			sqlParser parser = new sqlParser(new CommonTokenStream(lexer));
			test(parser.sqls());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		Server server = new Server();
		server.startServer();
		test("use L_MiniDB;");
		test("select userid+5 as x from user where username = \"root\";");
		test("select * from user where username <> \"root\" or userid = 1;");
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
