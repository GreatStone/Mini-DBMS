// Generated from D:\CodeWork\Mini-DBMS\MySql\src\DBMS\parser\sql.g4 by ANTLR 4.1
package DBMS.parser;

import java.util.*;
import com.db.minidb.data.value.*;
import com.db.minidb.dict.type.*;
import DBMS.execute.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEY_ALTER=1, KEY_AND=2, KEY_AS=3, KEY_CREATE=4, KEY_DATABASE=5, KEY_DELETE=6, 
		KEY_DOUBLE=7, KEY_DROP=8, KEY_EXISTS=9, KEY_FOREIGN=10, KEY_FROM=11, KEY_IF=12, 
		KEY_IN=13, KEY_INSERT=14, KEY_INT=15, KEY_INTO=16, KEY_KEY=17, KEY_NOT=18, 
		KEY_NULL=19, KEY_ON=20, KEY_OR=21, KEY_PRIMARY=22, KEY_REFERENCES=23, 
		KEY_SELECT=24, KEY_SET=25, KEY_STRING=26, KEY_TABLE=27, KEY_UPDATE=28, 
		KEY_USE=29, KEY_VALUES=30, KEY_WHERE=31, IDENTIFIER=32, INTIDENTI=33, 
		DOUBLEIDENTI=34, STRINGIDENTI=35, SINGLE_LINE_COMMENT=36, MULTILINE_COMMENT=37, 
		SPACES=38, SCOL=39, DOT=40, OPEN_PAR=41, CLOSE_PAR=42, COMMA=43, STAR=44, 
		PLUS=45, MINUS=46, TILDE=47, PIPE2=48, DIV=49, MOD=50, LT2=51, GT2=52, 
		AMP=53, PIPE=54, LT=55, LT_EQ=56, GT=57, GT_EQ=58, EQ=59, NOT_EQ=60;
	public static final String[] tokenNames = {
		"<INVALID>", "KEY_ALTER", "KEY_AND", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", 
		"KEY_DELETE", "KEY_DOUBLE", "KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", 
		"KEY_IF", "KEY_IN", "KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", 
		"KEY_NULL", "KEY_ON", "KEY_OR", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", 
		"KEY_SET", "KEY_STRING", "KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", 
		"KEY_WHERE", "IDENTIFIER", "INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "';'", "'.'", "'('", 
		"')'", "','", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", 
		"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'"
	};
	public static final int
		RULE_start = 0, RULE_sqls = 1, RULE_sql_use = 2, RULE_sql_drop_table = 3, 
		RULE_sql_drop_database = 4, RULE_sql_create_database = 5, RULE_sql_create_table = 6, 
		RULE_sql_select = 7, RULE_sql_insert = 8, RULE_sql_update = 9, RULE_sql_delete = 10, 
		RULE_sql_where = 11, RULE_tables = 12, RULE_colomns = 13, RULE_consts = 14, 
		RULE_types = 15, RULE_compare = 16, RULE_bool_op = 17, RULE_op = 18, RULE_select_or_set = 19, 
		RULE_subval = 20, RULE_val = 21, RULE_sub_bool_val = 22, RULE_bool_val = 23, 
		RULE_expr = 24, RULE_colomn_name = 25, RULE_colomn_alias_name = 26, RULE_table_name = 27, 
		RULE_table_alias_name = 28, RULE_database_name = 29, RULE_type_int = 30, 
		RULE_type_double = 31, RULE_type_string = 32;
	public static final String[] ruleNames = {
		"start", "sqls", "sql_use", "sql_drop_table", "sql_drop_database", "sql_create_database", 
		"sql_create_table", "sql_select", "sql_insert", "sql_update", "sql_delete", 
		"sql_where", "tables", "colomns", "consts", "types", "compare", "bool_op", 
		"op", "select_or_set", "subval", "val", "sub_bool_val", "bool_val", "expr", 
		"colomn_name", "colomn_alias_name", "table_name", "table_alias_name", 
		"database_name", "type_int", "type_double", "type_string"
	};

	@Override
	public String getGrammarFileName() { return "sql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public SqlsContext sqls(int i) {
			return getRuleContext(SqlsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(sqlParser.EOF, 0); }
		public List<SqlsContext> sqls() {
			return getRuleContexts(SqlsContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); sqls();
				setState(67); match(SCOL);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_CREATE) | (1L << KEY_DELETE) | (1L << KEY_DROP) | (1L << KEY_INSERT) | (1L << KEY_SELECT) | (1L << KEY_USE))) != 0) );
			setState(73); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlsContext extends ParserRuleContext {
		public Sql_deleteContext sql_delete() {
			return getRuleContext(Sql_deleteContext.class,0);
		}
		public Sql_drop_tableContext sql_drop_table() {
			return getRuleContext(Sql_drop_tableContext.class,0);
		}
		public Sql_selectContext sql_select() {
			return getRuleContext(Sql_selectContext.class,0);
		}
		public Sql_updateContext sql_update() {
			return getRuleContext(Sql_updateContext.class,0);
		}
		public Sql_create_tableContext sql_create_table() {
			return getRuleContext(Sql_create_tableContext.class,0);
		}
		public Sql_insertContext sql_insert() {
			return getRuleContext(Sql_insertContext.class,0);
		}
		public Sql_create_databaseContext sql_create_database() {
			return getRuleContext(Sql_create_databaseContext.class,0);
		}
		public Sql_useContext sql_use() {
			return getRuleContext(Sql_useContext.class,0);
		}
		public Sql_drop_databaseContext sql_drop_database() {
			return getRuleContext(Sql_drop_databaseContext.class,0);
		}
		public SqlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSqls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlsContext sqls() throws RecognitionException {
		SqlsContext _localctx = new SqlsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqls);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); sql_use();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); sql_drop_table();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); sql_drop_database();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); sql_create_database();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); sql_create_table();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80); sql_select();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81); sql_insert();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82); sql_update();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83); sql_delete();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_useContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode KEY_USE() { return getToken(sqlParser.KEY_USE, 0); }
		public Sql_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_use; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_use(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_useContext sql_use() throws RecognitionException {
		Sql_useContext _localctx = new Sql_useContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(KEY_USE);
			setState(87); database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_drop_tableContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public TerminalNode KEY_DROP() { return getToken(sqlParser.KEY_DROP, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode KEY_TABLE() { return getToken(sqlParser.KEY_TABLE, 0); }
		public Sql_drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_drop_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_drop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_drop_tableContext sql_drop_table() throws RecognitionException {
		Sql_drop_tableContext _localctx = new Sql_drop_tableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(KEY_DROP);
			setState(90); match(KEY_TABLE);
			setState(91); table_name();
			//System.out.println("sql_drop_table");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_drop_databaseContext extends ParserRuleContext implements ValueTree{
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public ValueBase value;
		public TerminalNode KEY_DROP() { return getToken(sqlParser.KEY_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Sql_drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_drop_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_drop_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_drop_databaseContext sql_drop_database() throws RecognitionException {
		Sql_drop_databaseContext _localctx = new Sql_drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(KEY_DROP);
			setState(95); database_name();
			//System.out.println("sql_drop_database");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_create_databaseContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode KEY_CREATE() { return getToken(sqlParser.KEY_CREATE, 0); }
		public Sql_create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_create_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_create_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_create_databaseContext sql_create_database() throws RecognitionException {
		Sql_create_databaseContext _localctx = new Sql_create_databaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sql_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(KEY_CREATE);
			setState(99); database_name();
			//System.out.println("SQLCREATEDATABASE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_create_tableContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public TerminalNode KEY_REFERENCES() { return getToken(sqlParser.KEY_REFERENCES, 0); }
		public TerminalNode KEY_NULL(int i) {
			return getToken(sqlParser.KEY_NULL, i);
		}
		public List<TerminalNode> KEY_NOT() { return getTokens(sqlParser.KEY_NOT); }
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}
		public TerminalNode KEY_FOREIGN() { return getToken(sqlParser.KEY_FOREIGN, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TerminalNode KEY_CREATE() { return getToken(sqlParser.KEY_CREATE, 0); }
		public TerminalNode KEY_NOT(int i) {
			return getToken(sqlParser.KEY_NOT, i);
		}
		public Colomn_nameContext colomn_name(int i) {
			return getRuleContext(Colomn_nameContext.class,i);
		}
		public TerminalNode KEY_KEY(int i) {
			return getToken(sqlParser.KEY_KEY, i);
		}
		public TerminalNode KEY_TABLE() { return getToken(sqlParser.KEY_TABLE, 0); }
		public TerminalNode KEY_PRIMARY() { return getToken(sqlParser.KEY_PRIMARY, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> KEY_NULL() { return getTokens(sqlParser.KEY_NULL); }
		public List<TerminalNode> KEY_KEY() { return getTokens(sqlParser.KEY_KEY); }
		public Sql_create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_create_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_create_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_create_tableContext sql_create_table() throws RecognitionException {
		Sql_create_tableContext _localctx = new Sql_create_tableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sql_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(KEY_CREATE);
			setState(103); match(KEY_TABLE);
			setState(104); table_name();
			setState(105); match(OPEN_PAR);
			setState(106); colomn_name();
			setState(107); types();
			setState(112);
			_la = _input.LA(1);
			if (_la==KEY_NOT || _la==KEY_NULL) {
				{
				setState(109);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(108); match(KEY_NOT);
					}
				}

				setState(111); match(KEY_NULL);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(114); match(COMMA);
					setState(115); colomn_name();
					setState(116); types();
					setState(121);
					_la = _input.LA(1);
					if (_la==KEY_NOT || _la==KEY_NULL) {
						{
						setState(118);
						_la = _input.LA(1);
						if (_la==KEY_NOT) {
							{
							setState(117); match(KEY_NOT);
							}
						}

						setState(120); match(KEY_NULL);
						}
					}

					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(128); match(COMMA);
				setState(129); match(KEY_PRIMARY);
				setState(130); match(KEY_KEY);
				{
				setState(131); match(OPEN_PAR);
				setState(132); colomn_name();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133); match(COMMA);
					setState(134); colomn_name();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140); match(CLOSE_PAR);
				}
				}
				break;
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(144); match(COMMA);
				setState(145); match(KEY_FOREIGN);
				setState(146); match(KEY_KEY);
				setState(147); colomn_name();
				setState(148); match(KEY_REFERENCES);
				setState(149); database_name();
				setState(150); colomn_name();
				}
			}

			setState(154); match(CLOSE_PAR);
			//System.out.println("SQL_CREATE_TABLE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_selectContext extends ParserRuleContext {
		public SelectSet value;
		public TablesContext tables(int i) {
			return getRuleContext(TablesContext.class,i);
		}
		public TerminalNode KEY_SELECT() { return getToken(sqlParser.KEY_SELECT, 0); }
		public ColomnsContext colomns(int i) {
			return getRuleContext(ColomnsContext.class,i);
		}
		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class,0);
		}
		public List<TablesContext> tables() {
			return getRuleContexts(TablesContext.class);
		}
		public TerminalNode KEY_FROM() { return getToken(sqlParser.KEY_FROM, 0); }
		public List<ColomnsContext> colomns() {
			return getRuleContexts(ColomnsContext.class);
		}
		public Sql_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_selectContext sql_select() throws RecognitionException {
		Sql_selectContext _localctx = new Sql_selectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sql_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(KEY_SELECT);
			setState(158); colomns();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159); match(COMMA);
				setState(160); colomns();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); match(KEY_FROM);
			setState(167); tables();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168); match(COMMA);
				setState(169); tables();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(175); sql_where();
				}
			}

			//System.out.println("SQL_SELECT");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_insertContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}
		public TerminalNode KEY_INTO() { return getToken(sqlParser.KEY_INTO, 0); }
		public TerminalNode KEY_INSERT() { return getToken(sqlParser.KEY_INSERT, 0); }
		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class,i);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode KEY_VALUES() { return getToken(sqlParser.KEY_VALUES, 0); }
		public Sql_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_insert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_insertContext sql_insert() throws RecognitionException {
		Sql_insertContext _localctx = new Sql_insertContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sql_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(KEY_INSERT);
			setState(181); match(KEY_INTO);
			setState(182); tables();
			setState(183); match(KEY_VALUES);
			setState(184); match(OPEN_PAR);
			setState(185); consts();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186); match(COMMA);
				setState(187); consts();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193); match(CLOSE_PAR);
			//System.out.println("SQL_INSERT");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_updateContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ColomnsContext colomns(int i) {
			return getRuleContext(ColomnsContext.class,i);
		}
		public TerminalNode KEY_SET() { return getToken(sqlParser.KEY_SET, 0); }
		public TerminalNode KEY_INSERT() { return getToken(sqlParser.KEY_INSERT, 0); }
		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class,0);
		}
		public List<ColomnsContext> colomns() {
			return getRuleContexts(ColomnsContext.class);
		}
		public Sql_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_updateContext sql_update() throws RecognitionException {
		Sql_updateContext _localctx = new Sql_updateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sql_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(KEY_INSERT);
			setState(197); match(KEY_SET);
			setState(198); colomns();
			setState(199); match(EQ);
			setState(200); expr();
			{
			setState(201); match(COMMA);
			setState(202); colomns();
			setState(203); match(EQ);
			setState(204); expr();
			}
			setState(207);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(206); sql_where();
				}
			}

			//System.out.println("SQL_UPDATE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_deleteContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class,0);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode KEY_DELETE() { return getToken(sqlParser.KEY_DELETE, 0); }
		public TerminalNode KEY_FROM() { return getToken(sqlParser.KEY_FROM, 0); }
		public Sql_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_delete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_delete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_deleteContext sql_delete() throws RecognitionException {
		Sql_deleteContext _localctx = new Sql_deleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sql_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(KEY_DELETE);
			setState(212); match(KEY_FROM);
			setState(213); tables();
			setState(215);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(214); sql_where();
				}
			}

			//System.out.println("SQL_DELETE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_whereContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public TerminalNode KEY_WHERE() { return getToken(sqlParser.KEY_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sql_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_where; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSql_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_whereContext sql_where() throws RecognitionException {
		Sql_whereContext _localctx = new Sql_whereContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sql_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219); match(KEY_WHERE);
			setState(220); expr();
			}
			//System.out.println("SQL_WHERE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablesContext extends ParserRuleContext {
		public TerminalNode KEY_AS() { return getToken(sqlParser.KEY_AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_alias_nameContext table_alias_name() {
			return getRuleContext(Table_alias_nameContext.class,0);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); table_name();
			setState(227);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(225); match(KEY_AS);
				setState(226); table_alias_name();
				}
			}

			//System.out.println("TABLES");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColomnsContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Colomn_alias_nameContext colomn_alias_name() {
			return getRuleContext(Colomn_alias_nameContext.class,0);
		}
		public Colomn_nameContext colomn_name() {
			return getRuleContext(Colomn_nameContext.class,0);
		}
		public TerminalNode KEY_AS() { return getToken(sqlParser.KEY_AS, 0); }
		public ColomnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colomns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitColomns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColomnsContext colomns() throws RecognitionException {
		ColomnsContext _localctx = new ColomnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_colomns);
		int _la;
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(231); colomn_name();
				setState(234);
				_la = _input.LA(1);
				if (_la==KEY_AS) {
					{
					setState(232); match(KEY_AS);
					setState(233); colomn_alias_name();
					}
				}

				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(236); val();
				setState(237); match(KEY_AS);
				setState(238); colomn_alias_name();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(STAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstsContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Type_intContext x;
		public Type_doubleContext y;
		public Type_stringContext z;
		public Type_stringContext type_string() {
			return getRuleContext(Type_stringContext.class,0);
		}
		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class,0);
		}
		public Type_doubleContext type_double() {
			return getRuleContext(Type_doubleContext.class,0);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_consts);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case INTIDENTI:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); ((ConstsContext)_localctx).x = type_int();
				((ConstsContext)_localctx).value =  ((ConstsContext)_localctx).x.value; 
				}
				break;
			case DOUBLEIDENTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); ((ConstsContext)_localctx).y = type_double();
				((ConstsContext)_localctx).value =  ((ConstsContext)_localctx).y.value;
				}
				break;
			case STRINGIDENTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); ((ConstsContext)_localctx).z = type_string();
				((ConstsContext)_localctx).value =  ((ConstsContext)_localctx).z.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TypeDataEnum value;
		public TerminalNode KEY_STRING() { return getToken(sqlParser.KEY_STRING, 0); }
		public TerminalNode KEY_DOUBLE() { return getToken(sqlParser.KEY_DOUBLE, 0); }
		public TerminalNode KEY_INT() { return getToken(sqlParser.KEY_INT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_types);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case KEY_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(KEY_INT);
				((TypesContext)_localctx).value =  TypeDataEnum.INT;
				}
				break;
			case KEY_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(KEY_DOUBLE);
				((TypesContext)_localctx).value = TypeDataEnum.DOUBLE;
				}
				break;
			case KEY_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); match(KEY_STRING);
				((TypesContext)_localctx).value = TypeDataEnum.STRING;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(sqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(sqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(sqlParser.GT, 0); }
		public TerminalNode NOT_EQ() { return getToken(sqlParser.NOT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(sqlParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(sqlParser.EQ, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode KEY_OR() { return getToken(sqlParser.KEY_OR, 0); }
		public TerminalNode KEY_AND() { return getToken(sqlParser.KEY_AND, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==KEY_AND || _la==KEY_OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(sqlParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(sqlParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(sqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(sqlParser.PLUS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_setContext extends ParserRuleContext {
		public SelectSet value;
		public List<Type_stringContext> type_string() {
			return getRuleContexts(Type_stringContext.class);
		}
		public Type_doubleContext type_double(int i) {
			return getRuleContext(Type_doubleContext.class,i);
		}
		public Type_intContext type_int(int i) {
			return getRuleContext(Type_intContext.class,i);
		}
		public Sql_selectContext sql_select() {
			return getRuleContext(Sql_selectContext.class,0);
		}
		public Type_stringContext type_string(int i) {
			return getRuleContext(Type_stringContext.class,i);
		}
		public List<Type_intContext> type_int() {
			return getRuleContexts(Type_intContext.class);
		}
		public List<Type_doubleContext> type_double() {
			return getRuleContexts(Type_doubleContext.class);
		}
		public Select_or_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSelect_or_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_setContext select_or_set() throws RecognitionException {
		Select_or_setContext _localctx = new Select_or_setContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select_or_set);
		int _la;
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(OPEN_PAR);
				setState(269); sql_select();
				setState(270); match(CLOSE_PAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(272); match(OPEN_PAR);
				setState(276);
				switch (_input.LA(1)) {
				case INTIDENTI:
					{
					setState(273); type_int();
					}
					break;
				case DOUBLEIDENTI:
					{
					setState(274); type_double();
					}
					break;
				case STRINGIDENTI:
					{
					setState(275); type_string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(278); match(COMMA);
					setState(282);
					switch (_input.LA(1)) {
					case INTIDENTI:
						{
						setState(279); type_int();
						}
						break;
					case DOUBLEIDENTI:
						{
						setState(280); type_double();
						}
						break;
					case STRINGIDENTI:
						{
						setState(281); type_string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); match(CLOSE_PAR);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubvalContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}
		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}
		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class,i);
		}
		public Colomn_nameContext colomn_name(int i) {
			return getRuleContext(Colomn_nameContext.class,i);
		}
		public SubvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSubval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubvalContext subval() throws RecognitionException {
		SubvalContext _localctx = new SubvalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subval);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(293); colomn_name();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(294); consts();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(297);
				switch (_input.LA(1)) {
				case INTIDENTI:
				case DOUBLEIDENTI:
				case STRINGIDENTI:
					{
					setState(295); consts();
					}
					break;
				case IDENTIFIER:
					{
					setState(296); colomn_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299); op();
				setState(302);
				switch (_input.LA(1)) {
				case INTIDENTI:
				case DOUBLEIDENTI:
				case STRINGIDENTI:
					{
					setState(300); consts();
					}
					break;
				case IDENTIFIER:
					{
					setState(301); colomn_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public SubvalContext subval(int i) {
			return getRuleContext(SubvalContext.class,i);
		}
		public List<SubvalContext> subval() {
			return getRuleContexts(SubvalContext.class);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_val);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(306); subval();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(307); subval();
				setState(308); op();
				setState(309); subval();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_bool_valContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public Sub_bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_bool_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitSub_bool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_bool_valContext sub_bool_val() throws RecognitionException {
		Sub_bool_valContext _localctx = new Sub_bool_valContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sub_bool_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313); val();
			setState(314); compare();
			setState(315); val();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_valContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode KEY_NOT() { return getToken(sqlParser.KEY_NOT, 0); }
		public TerminalNode KEY_EXISTS() { return getToken(sqlParser.KEY_EXISTS, 0); }
		public List<Sub_bool_valContext> sub_bool_val() {
			return getRuleContexts(Sub_bool_valContext.class);
		}
		public TerminalNode KEY_IN() { return getToken(sqlParser.KEY_IN, 0); }
		public Sub_bool_valContext sub_bool_val(int i) {
			return getRuleContext(Sub_bool_valContext.class,i);
		}
		public Select_or_setContext select_or_set() {
			return getRuleContext(Select_or_setContext.class,0);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool_val);
		int _la;
		try {
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(317); sub_bool_val();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(318); sub_bool_val();
				setState(319); bool_op();
				setState(320); sub_bool_val();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(323);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(322); match(KEY_NOT);
					}
				}

				setState(325); match(KEY_EXISTS);
				setState(326); select_or_set();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(327); val();
				setState(329);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(328); match(KEY_NOT);
					}
				}

				setState(331); match(KEY_IN);
				setState(332); select_or_set();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public Bool_valContext bool_val(int i) {
			return getRuleContext(Bool_valContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<Bool_valContext> bool_val() {
			return getRuleContexts(Bool_valContext.class);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			setState(349);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); val();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(337); val();
				setState(338); op();
				setState(339); val();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(341); val();
				setState(342); compare();
				setState(343); val();
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(345); bool_val();
				setState(346); bool_op();
				setState(347); bool_val();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colomn_nameContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public Colomn_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colomn_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitColomn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colomn_nameContext colomn_name() throws RecognitionException {
		Colomn_nameContext _localctx = new Colomn_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_colomn_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); ((Colomn_nameContext)_localctx).x = match(IDENTIFIER);
			//System.out.println("COLOMN_NAME");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colomn_alias_nameContext extends ParserRuleContext implements ValueTree{
		public ValueBase value;
		public ValueBase getValue() {
			return value;
		}
		public void setValue(ValueBase value) {
			this.value = value;
		}
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public Colomn_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colomn_alias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitColomn_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colomn_alias_nameContext colomn_alias_name() throws RecognitionException {
		Colomn_alias_nameContext _localctx = new Colomn_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_colomn_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((Colomn_alias_nameContext)_localctx).x = match(IDENTIFIER);
			//System.out.println("COLOMN_ALIAS_NAME");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public String value;
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); ((Table_nameContext)_localctx).x = match(IDENTIFIER);
			((Table_nameContext)_localctx).value =  new String ((((Table_nameContext)_localctx).x!=null?((Table_nameContext)_localctx).x.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_alias_nameContext extends ParserRuleContext {
		public String value;
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public Table_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitTable_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_alias_nameContext table_alias_name() throws RecognitionException {
		Table_alias_nameContext _localctx = new Table_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_table_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); ((Table_alias_nameContext)_localctx).x = match(IDENTIFIER);
			((Table_alias_nameContext)_localctx).value =  new String((((Table_alias_nameContext)_localctx).x!=null?((Table_alias_nameContext)_localctx).x.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public String value;
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(sqlParser.IDENTIFIER, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); ((Database_nameContext)_localctx).x = match(IDENTIFIER);
			((Database_nameContext)_localctx).value =   new String((((Database_nameContext)_localctx).x!=null?((Database_nameContext)_localctx).x.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_intContext extends ParserRuleContext {
		public ValueInt value;
		public Token x;
		public TerminalNode INTIDENTI() { return getToken(sqlParser.INTIDENTI, 0); }
		public Type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitType_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_intContext type_int() throws RecognitionException {
		Type_intContext _localctx = new Type_intContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); ((Type_intContext)_localctx).x = match(INTIDENTI);
			((Type_intContext)_localctx).value =  new ValueInt(TypeDataEnum.INT,new Integer((((Type_intContext)_localctx).x!=null?((Type_intContext)_localctx).x.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_doubleContext extends ParserRuleContext {
		public ValueDouble value;
		public Token x;
		public TerminalNode DOUBLEIDENTI() { return getToken(sqlParser.DOUBLEIDENTI, 0); }
		public Type_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitType_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_doubleContext type_double() throws RecognitionException {
		Type_doubleContext _localctx = new Type_doubleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); ((Type_doubleContext)_localctx).x = match(DOUBLEIDENTI);
			((Type_doubleContext)_localctx).value =  new ValueDouble(TypeDataEnum.DOUBLE,new Double((((Type_doubleContext)_localctx).x!=null?((Type_doubleContext)_localctx).x.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_stringContext extends ParserRuleContext {
		public ValueString value;
		public Token x;
		public TerminalNode STRINGIDENTI() { return getToken(sqlParser.STRINGIDENTI, 0); }
		public Type_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqlVisitor ) return ((sqlVisitor<? extends T>)visitor).visitType_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_stringContext type_string() throws RecognitionException {
		Type_stringContext _localctx = new Type_stringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); ((Type_stringContext)_localctx).x = match(STRINGIDENTI);
			((Type_stringContext)_localctx).value =  new ValueString(TypeDataEnum.STRING,new String((((Type_stringContext)_localctx).x!=null?((Type_stringContext)_localctx).x.getText().substring(1, ((Type_stringContext)_localctx).x.getText().length()-1):null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3>\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b\5\bs\n\b"+
		"\3\b\3\b\3\b\3\b\5\by\n\b\3\b\5\b|\n\b\7\b~\n\b\f\b\16\b\u0081\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\3\b\5"+
		"\b\u0091\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00ad\n\t\f\t\16\t\u00b0\13\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\f\u00da\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\5\16\u00e6\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00ed\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107\n"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0117\n\25\3\25\3\25\3\25\3\25\5\25\u011d\n\25\7\25\u011f\n\25"+
		"\f\25\16\25\u0122\13\25\3\25\3\25\5\25\u0126\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u012c\n\26\3\26\3\26\3\26\5\26\u0131\n\26\5\26\u0133\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u013a\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0146\n\31\3\31\3\31\3\31\3\31\5\31\u014c\n\31\3"+
		"\31\3\31\3\31\5\31\u0151\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0160\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\5\3\29>\4\2\4\4\27\27\4\2.\60\63\63\u018a\2G\3\2\2\2\4V\3"+
		"\2\2\2\6X\3\2\2\2\b[\3\2\2\2\n`\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20\u009f"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00c6\3\2\2\2\26\u00d5\3\2\2\2\30\u00dd\3"+
		"\2\2\2\32\u00e2\3\2\2\2\34\u00f3\3\2\2\2\36\u00fe\3\2\2\2 \u0106\3\2\2"+
		"\2\"\u0108\3\2\2\2$\u010a\3\2\2\2&\u010c\3\2\2\2(\u0125\3\2\2\2*\u0132"+
		"\3\2\2\2,\u0139\3\2\2\2.\u013b\3\2\2\2\60\u0150\3\2\2\2\62\u015f\3\2\2"+
		"\2\64\u0161\3\2\2\2\66\u0164\3\2\2\28\u0167\3\2\2\2:\u016a\3\2\2\2<\u016d"+
		"\3\2\2\2>\u0170\3\2\2\2@\u0173\3\2\2\2B\u0176\3\2\2\2DE\5\4\3\2EF\7)\2"+
		"\2FH\3\2\2\2GD\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\2\2"+
		"\3L\3\3\2\2\2MW\5\6\4\2NW\5\b\5\2OW\5\n\6\2PW\5\f\7\2QW\5\16\b\2RW\5\20"+
		"\t\2SW\5\22\n\2TW\5\24\13\2UW\5\26\f\2VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2V"+
		"P\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\5\3\2\2\2"+
		"XY\7\37\2\2YZ\5<\37\2Z\7\3\2\2\2[\\\7\n\2\2\\]\7\35\2\2]^\58\35\2^_\b"+
		"\5\1\2_\t\3\2\2\2`a\7\n\2\2ab\5<\37\2bc\b\6\1\2c\13\3\2\2\2de\7\6\2\2"+
		"ef\5<\37\2fg\b\7\1\2g\r\3\2\2\2hi\7\6\2\2ij\7\35\2\2jk\58\35\2kl\7+\2"+
		"\2lm\5\64\33\2mr\5 \21\2np\7\24\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7"+
		"\25\2\2ro\3\2\2\2rs\3\2\2\2s\177\3\2\2\2tu\7-\2\2uv\5\64\33\2v{\5 \21"+
		"\2wy\7\24\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\25\2\2{x\3\2\2\2{|\3\2"+
		"\2\2|~\3\2\2\2}t\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0090\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7-\2\2\u0083\u0084"+
		"\7\30\2\2\u0084\u0085\7\23\2\2\u0085\u0086\7+\2\2\u0086\u008b\5\64\33"+
		"\2\u0087\u0088\7-\2\2\u0088\u008a\5\64\33\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7,\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0082\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a\3\2\2\2\u0092\u0093\7-"+
		"\2\2\u0093\u0094\7\f\2\2\u0094\u0095\7\23\2\2\u0095\u0096\5\64\33\2\u0096"+
		"\u0097\7\31\2\2\u0097\u0098\5<\37\2\u0098\u0099\5\64\33\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7,\2\2\u009d\u009e\b\b\1\2\u009e\17\3\2\2\2\u009f\u00a0\7\32\2"+
		"\2\u00a0\u00a5\5\34\17\2\u00a1\u00a2\7-\2\2\u00a2\u00a4\5\34\17\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\r\2\2\u00a9"+
		"\u00ae\5\32\16\2\u00aa\u00ab\7-\2\2\u00ab\u00ad\5\32\16\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5\30\r\2\u00b2\u00b1\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\t\1\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\5\32"+
		"\16\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\7+\2\2\u00bb\u00c0\5\36\20\2\u00bc"+
		"\u00bd\7-\2\2\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\b\n\1\2\u00c5\23\3\2\2\2"+
		"\u00c6\u00c7\7\20\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\5\34\17\2\u00c9"+
		"\u00ca\7=\2\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\5\34"+
		"\17\2\u00cd\u00ce\7=\2\2\u00ce\u00cf\5\62\32\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00d2\5\30\r\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d4\b\13\1\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6"+
		"\u00d7\7\r\2\2\u00d7\u00d9\5\32\16\2\u00d8\u00da\5\30\r\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\f\1\2\u00dc"+
		"\27\3\2\2\2\u00dd\u00de\7!\2\2\u00de\u00df\5\62\32\2\u00df\u00e0\3\2\2"+
		"\2\u00e0\u00e1\b\r\1\2\u00e1\31\3\2\2\2\u00e2\u00e5\58\35\2\u00e3\u00e4"+
		"\7\5\2\2\u00e4\u00e6\5:\36\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\b\16\1\2\u00e8\33\3\2\2\2\u00e9\u00ec\5\64"+
		"\33\2\u00ea\u00eb\7\5\2\2\u00eb\u00ed\5\66\34\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\7\5"+
		"\2\2\u00f0\u00f1\5\66\34\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\7.\2\2\u00f3"+
		"\u00e9\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\35\3\2\2"+
		"\2\u00f5\u00f6\5> \2\u00f6\u00f7\b\20\1\2\u00f7\u00ff\3\2\2\2\u00f8\u00f9"+
		"\5@!\2\u00f9\u00fa\b\20\1\2\u00fa\u00ff\3\2\2\2\u00fb\u00fc\5B\"\2\u00fc"+
		"\u00fd\b\20\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3"+
		"\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\37\3\2\2\2\u0100\u0101\7\21\2\2\u0101"+
		"\u0107\b\21\1\2\u0102\u0103\7\t\2\2\u0103\u0107\b\21\1\2\u0104\u0105\7"+
		"\34\2\2\u0105\u0107\b\21\1\2\u0106\u0100\3\2\2\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107!\3\2\2\2\u0108\u0109\t\2\2\2\u0109#\3\2\2\2\u010a"+
		"\u010b\t\3\2\2\u010b%\3\2\2\2\u010c\u010d\t\4\2\2\u010d\'\3\2\2\2\u010e"+
		"\u010f\7+\2\2\u010f\u0110\5\20\t\2\u0110\u0111\7,\2\2\u0111\u0126\3\2"+
		"\2\2\u0112\u0116\7+\2\2\u0113\u0117\5> \2\u0114\u0117\5@!\2\u0115\u0117"+
		"\5B\"\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0120\3\2\2\2\u0118\u011c\7-\2\2\u0119\u011d\5> \2\u011a\u011d\5@!\2"+
		"\u011b\u011d\5B\"\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0118\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\7,\2\2\u0124\u0126\3\2\2\2\u0125\u010e\3\2\2\2\u0125"+
		"\u0112\3\2\2\2\u0126)\3\2\2\2\u0127\u0133\5\64\33\2\u0128\u0133\5\36\20"+
		"\2\u0129\u012c\5\36\20\2\u012a\u012c\5\64\33\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\5&\24\2\u012e\u0131\5\36"+
		"\20\2\u012f\u0131\5\64\33\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0127\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012b\3\2"+
		"\2\2\u0133+\3\2\2\2\u0134\u013a\5*\26\2\u0135\u0136\5*\26\2\u0136\u0137"+
		"\5&\24\2\u0137\u0138\5*\26\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u0139"+
		"\u0135\3\2\2\2\u013a-\3\2\2\2\u013b\u013c\5,\27\2\u013c\u013d\5\"\22\2"+
		"\u013d\u013e\5,\27\2\u013e/\3\2\2\2\u013f\u0151\5.\30\2\u0140\u0141\5"+
		".\30\2\u0141\u0142\5$\23\2\u0142\u0143\5.\30\2\u0143\u0151\3\2\2\2\u0144"+
		"\u0146\7\24\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\7\13\2\2\u0148\u0151\5(\25\2\u0149\u014b\5,\27\2\u014a"+
		"\u014c\7\24\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d\u014e\7\17\2\2\u014e\u014f\5(\25\2\u014f\u0151\3\2\2\2\u0150"+
		"\u013f\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0145\3\2\2\2\u0150\u0149\3\2"+
		"\2\2\u0151\61\3\2\2\2\u0152\u0160\5,\27\2\u0153\u0154\5,\27\2\u0154\u0155"+
		"\5&\24\2\u0155\u0156\5,\27\2\u0156\u0160\3\2\2\2\u0157\u0158\5,\27\2\u0158"+
		"\u0159\5\"\22\2\u0159\u015a\5,\27\2\u015a\u0160\3\2\2\2\u015b\u015c\5"+
		"\60\31\2\u015c\u015d\5$\23\2\u015d\u015e\5\60\31\2\u015e\u0160\3\2\2\2"+
		"\u015f\u0152\3\2\2\2\u015f\u0153\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u015b"+
		"\3\2\2\2\u0160\63\3\2\2\2\u0161\u0162\7\"\2\2\u0162\u0163\b\33\1\2\u0163"+
		"\65\3\2\2\2\u0164\u0165\7\"\2\2\u0165\u0166\b\34\1\2\u0166\67\3\2\2\2"+
		"\u0167\u0168\7\"\2\2\u0168\u0169\b\35\1\2\u01699\3\2\2\2\u016a\u016b\7"+
		"\"\2\2\u016b\u016c\b\36\1\2\u016c;\3\2\2\2\u016d\u016e\7\"\2\2\u016e\u016f"+
		"\b\37\1\2\u016f=\3\2\2\2\u0170\u0171\7#\2\2\u0171\u0172\b \1\2\u0172?"+
		"\3\2\2\2\u0173\u0174\7$\2\2\u0174\u0175\b!\1\2\u0175A\3\2\2\2\u0176\u0177"+
		"\7%\2\2\u0177\u0178\b\"\1\2\u0178C\3\2\2\2#IVorx{\177\u008b\u0090\u009a"+
		"\u00a5\u00ae\u00b2\u00c0\u00d1\u00d9\u00e5\u00ec\u00f3\u00fe\u0106\u0116"+
		"\u011c\u0120\u0125\u012b\u0130\u0132\u0139\u0145\u014b\u0150\u015f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}