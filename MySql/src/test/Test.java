package test;

import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;

import DBMS.parser.*;

public class Test {
	public static void main (String[] args){
		File __file = new File ("/home/greatstone/workspace/MySql/test.txt");
		try {
			Scanner scan = new Scanner(__file);
			String sqls = "";
			while (scan.hasNextLine())
			{
				sqls += scan.nextLine() + " \n";
			}
			System.out.println("Prepare to parser :{\n" + sqls + "}");
			sqlLexer lexer = new sqlLexer(new ANTLRInputStream(sqls));
			sqlParser parser = new sqlParser(new CommonTokenStream(lexer));
			test(parser.sqls());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void test (ParseTree parseTree){
		sqlBaseVisitor vis = new sqlBaseVisitor();
		//vis.visit(parseTree);
		System.out.print(parseTree.getText());
		System.out.println("\t\t\t"+parseTree.getClass().getName().toString());
		int len = parseTree.getChildCount();
		for (int i = 0; i < len; i++){
			test(parseTree.getChild(i));
		}
	}
}
