// Generated from D:\CodeWork\DBMS\sql.g4 by ANTLR 4.1
package DBMS.parser;
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
		KEY_ALTER=1, KEY_AS=2, KEY_CREATE=3, KEY_DATABASE=4, KEY_DELETE=5, KEY_DOUBLE=6, 
		KEY_DROP=7, KEY_EXISTS=8, KEY_FOREIGN=9, KEY_FROM=10, KEY_IF=11, KEY_IN=12, 
		KEY_INSERT=13, KEY_INT=14, KEY_INTO=15, KEY_KEY=16, KEY_NOT=17, KEY_NULL=18, 
		KEY_ON=19, KEY_PRIMARY=20, KEY_REFERENCES=21, KEY_SELECT=22, KEY_SET=23, 
		KEY_STRING=24, KEY_TABLE=25, KEY_UPDATE=26, KEY_USE=27, KEY_VALUES=28, 
		KEY_WHERE=29, IDENTIFIER=30, INTIDENTI=31, DOUBLEIDENTI=32, STRINGIDENTI=33, 
		SINGLE_LINE_COMMENT=34, MULTILINE_COMMENT=35, SPACES=36, SCOL=37, DOT=38, 
		OPEN_PAR=39, CLOSE_PAR=40, COMMA=41, STAR=42, PLUS=43, MINUS=44, TILDE=45, 
		PIPE2=46, DIV=47, MOD=48, LT2=49, GT2=50, AMP=51, PIPE=52, LT=53, LT_EQ=54, 
		GT=55, GT_EQ=56, EQ=57, NOT_EQ=58;
	public static final String[] tokenNames = {
		"<INVALID>", "KEY_ALTER", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE", 
		"KEY_DOUBLE", "KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", "KEY_IF", 
		"KEY_IN", "KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", "KEY_NULL", 
		"KEY_ON", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", "KEY_SET", "KEY_STRING", 
		"KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE", "IDENTIFIER", 
		"INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES", "';'", "'.'", "'('", "')'", "','", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'='", "'<>'"
	};
	public static final int
		RULE_start = 0, RULE_sqls = 1, RULE_sql_use = 2, RULE_sql_drop_table = 3, 
		RULE_sql_drop_database = 4, RULE_sql_create_database = 5, RULE_sql_create_table = 6, 
		RULE_sql_select = 7, RULE_sql_insert = 8, RULE_sql_update = 9, RULE_sql_delete = 10, 
		RULE_tables = 11, RULE_colomns = 12, RULE_consts = 13, RULE_types = 14, 
		RULE_compare = 15, RULE_bool_op = 16, RULE_op = 17, RULE_select_or_set = 18, 
		RULE_subval = 19, RULE_val = 20, RULE_sub_bool_val = 21, RULE_bool_val = 22, 
		RULE_expr = 23, RULE_colomn_name = 24, RULE_colomn_alias_name = 25, RULE_table_name = 26, 
		RULE_table_alias_name = 27, RULE_database_name = 28, RULE_type_int = 29, 
		RULE_type_double = 30, RULE_type_string = 31;
	public static final String[] ruleNames = {
		"start", "sqls", "sql_use", "sql_drop_table", "sql_drop_database", "sql_create_database", 
		"sql_create_table", "sql_select", "sql_insert", "sql_update", "sql_delete", 
		"tables", "colomns", "consts", "types", "compare", "bool_op", "op", "select_or_set", 
		"subval", "val", "sub_bool_val", "bool_val", "expr", "colomn_name", "colomn_alias_name", 
		"table_name", "table_alias_name", "database_name", "type_int", "type_double", 
		"type_string"
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); sqls();
				setState(65); match(SCOL);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_CREATE) | (1L << KEY_DELETE) | (1L << KEY_DROP) | (1L << KEY_INSERT) | (1L << KEY_SELECT) | (1L << KEY_USE))) != 0) );
			setState(71); match(EOF);
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); sql_use();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); sql_drop_table();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75); sql_drop_database();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76); sql_create_database();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77); sql_create_table();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78); sql_select();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79); sql_insert();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80); sql_update();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81); sql_delete();
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

	public static class Sql_useContext extends ParserRuleContext {
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
			setState(84); match(KEY_USE);
			setState(85); database_name();
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

	public static class Sql_drop_tableContext extends ParserRuleContext {
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
			setState(87); match(KEY_DROP);
			setState(88); match(KEY_TABLE);
			setState(89); table_name();
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

	public static class Sql_drop_databaseContext extends ParserRuleContext {
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
			setState(91); match(KEY_DROP);
			setState(92); database_name();
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

	public static class Sql_create_databaseContext extends ParserRuleContext {
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
			setState(94); match(KEY_CREATE);
			setState(95); database_name();
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

	public static class Sql_create_tableContext extends ParserRuleContext {
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
			setState(97); match(KEY_CREATE);
			setState(98); match(KEY_TABLE);
			setState(99); table_name();
			setState(100); match(OPEN_PAR);
			setState(101); colomn_name();
			setState(102); types();
			setState(107);
			_la = _input.LA(1);
			if (_la==KEY_NOT || _la==KEY_NULL) {
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(103); match(KEY_NOT);
					}
				}

				setState(106); match(KEY_NULL);
				}
			}

			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(109); match(COMMA);
					setState(110); colomn_name();
					setState(111); types();
					setState(116);
					_la = _input.LA(1);
					if (_la==KEY_NOT || _la==KEY_NULL) {
						{
						setState(113);
						_la = _input.LA(1);
						if (_la==KEY_NOT) {
							{
							setState(112); match(KEY_NOT);
							}
						}

						setState(115); match(KEY_NULL);
						}
					}

					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123); match(COMMA);
				setState(124); match(KEY_PRIMARY);
				setState(125); match(KEY_KEY);
				{
				setState(126); match(OPEN_PAR);
				setState(127); colomn_name();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128); match(COMMA);
					setState(129); colomn_name();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); match(CLOSE_PAR);
				}
				}
				break;
			}
			setState(147);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(139); match(COMMA);
				setState(140); match(KEY_FOREIGN);
				setState(141); match(KEY_KEY);
				setState(142); colomn_name();
				setState(143); match(KEY_REFERENCES);
				setState(144); database_name();
				setState(145); colomn_name();
				}
			}

			setState(149); match(CLOSE_PAR);
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
		public TablesContext tables(int i) {
			return getRuleContext(TablesContext.class,i);
		}
		public TerminalNode KEY_WHERE() { return getToken(sqlParser.KEY_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode KEY_SELECT() { return getToken(sqlParser.KEY_SELECT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ColomnsContext colomns(int i) {
			return getRuleContext(ColomnsContext.class,i);
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
			setState(151); match(KEY_SELECT);
			setState(152); colomns();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153); match(COMMA);
				setState(154); colomns();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); match(KEY_FROM);
			setState(161); tables();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162); match(COMMA);
				setState(163); tables();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(169); match(KEY_WHERE);
				setState(170); expr();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171); match(COMMA);
					setState(172); expr();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Sql_insertContext extends ParserRuleContext {
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

	public static class Sql_updateContext extends ParserRuleContext {
		public TerminalNode KEY_WHERE() { return getToken(sqlParser.KEY_WHERE, 0); }
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
			setState(195); match(KEY_INSERT);
			setState(196); match(KEY_SET);
			setState(197); colomns();
			setState(198); match(EQ);
			setState(199); expr();
			{
			setState(200); match(COMMA);
			setState(201); colomns();
			setState(202); match(EQ);
			setState(203); expr();
			}
			setState(214);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(205); match(KEY_WHERE);
				setState(206); expr();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207); match(COMMA);
					setState(208); expr();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Sql_deleteContext extends ParserRuleContext {
		public TerminalNode KEY_WHERE() { return getToken(sqlParser.KEY_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(216); match(KEY_DELETE);
			setState(217); match(KEY_FROM);
			setState(218); tables();
			setState(228);
			_la = _input.LA(1);
			if (_la==KEY_WHERE) {
				{
				setState(219); match(KEY_WHERE);
				setState(220); expr();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221); match(COMMA);
					setState(222); expr();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		enterRule(_localctx, 22, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); table_name();
			setState(233);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(231); match(KEY_AS);
				setState(232); table_alias_name();
				}
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

	public static class ColomnsContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_colomns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); colomn_name();
			setState(238);
			_la = _input.LA(1);
			if (_la==KEY_AS) {
				{
				setState(236); match(KEY_AS);
				setState(237); colomn_alias_name();
				}
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

	public static class ConstsContext extends ParserRuleContext {
		public Object value;
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
		enterRule(_localctx, 26, RULE_consts);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case INTIDENTI:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); ((ConstsContext)_localctx).x = type_int();
				((ConstsContext)_localctx).value =  ((ConstsContext)_localctx).x.value; 
				}
				break;
			case DOUBLEIDENTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((ConstsContext)_localctx).y = type_double();
				((ConstsContext)_localctx).value =  ((ConstsContext)_localctx).y.value;
				}
				break;
			case STRINGIDENTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); ((ConstsContext)_localctx).z = type_string();
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
		enterRule(_localctx, 28, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_DOUBLE) | (1L << KEY_INT) | (1L << KEY_STRING))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		public TerminalNode PIPE() { return getToken(sqlParser.PIPE, 0); }
		public TerminalNode AMP() { return getToken(sqlParser.AMP, 0); }
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
		enterRule(_localctx, 32, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==AMP || _la==PIPE) ) {
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
		enterRule(_localctx, 34, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 36, RULE_select_or_set);
		int _la;
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); match(OPEN_PAR);
				setState(260); sql_select();
				setState(261); match(CLOSE_PAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(263); match(OPEN_PAR);
				setState(267);
				switch (_input.LA(1)) {
				case INTIDENTI:
					{
					setState(264); type_int();
					}
					break;
				case DOUBLEIDENTI:
					{
					setState(265); type_double();
					}
					break;
				case STRINGIDENTI:
					{
					setState(266); type_string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(269); match(COMMA);
					setState(273);
					switch (_input.LA(1)) {
					case INTIDENTI:
						{
						setState(270); type_int();
						}
						break;
					case DOUBLEIDENTI:
						{
						setState(271); type_double();
						}
						break;
					case STRINGIDENTI:
						{
						setState(272); type_string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280); match(CLOSE_PAR);
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

	public static class SubvalContext extends ParserRuleContext {
		public List<Colomn_alias_nameContext> colomn_alias_name() {
			return getRuleContexts(Colomn_alias_nameContext.class);
		}
		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}
		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class,i);
		}
		public Colomn_alias_nameContext colomn_alias_name(int i) {
			return getRuleContext(Colomn_alias_nameContext.class,i);
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
		enterRule(_localctx, 38, RULE_subval);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(289);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(286);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(284); colomn_name();
						}
						break;

					case 2:
						{
						setState(285); colomn_alias_name();
						}
						break;
					}
					}
					break;
				case INTIDENTI:
				case DOUBLEIDENTI:
				case STRINGIDENTI:
					{
					{
					setState(288); consts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); op();
				setState(297);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(294);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(292); colomn_name();
						}
						break;

					case 2:
						{
						setState(293); colomn_alias_name();
						}
						break;
					}
					}
					break;
				case INTIDENTI:
				case DOUBLEIDENTI:
				case STRINGIDENTI:
					{
					{
					setState(296); consts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(299); colomn_name();
					}
					break;

				case 2:
					{
					setState(300); colomn_alias_name();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(303); consts();
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

	public static class ValContext extends ParserRuleContext {
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
		enterRule(_localctx, 40, RULE_val);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
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

	public static class Sub_bool_valContext extends ParserRuleContext {
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
		enterRule(_localctx, 42, RULE_sub_bool_val);
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

	public static class Bool_valContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Sub_bool_valContext sub_bool_val() {
			return getRuleContext(Sub_bool_valContext.class,0);
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
		enterRule(_localctx, 44, RULE_bool_val);
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
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
				setState(320); val();
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

	public static class ExprContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public TerminalNode KEY_NOT() { return getToken(sqlParser.KEY_NOT, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode KEY_EXISTS() { return getToken(sqlParser.KEY_EXISTS, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode KEY_IN() { return getToken(sqlParser.KEY_IN, 0); }
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public Select_or_setContext select_or_set() {
			return getRuleContext(Select_or_setContext.class,0);
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
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			setState(349);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(325);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(324); match(KEY_NOT);
					}
				}

				setState(327); match(KEY_EXISTS);
				setState(328); select_or_set();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(329); val();
				setState(331);
				_la = _input.LA(1);
				if (_la==KEY_NOT) {
					{
					setState(330); match(KEY_NOT);
					}
				}

				setState(333); match(KEY_IN);
				setState(334); select_or_set();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); val();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(337); val();
				setState(338); op();
				setState(339); val();
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(341); val();
				setState(342); compare();
				setState(343); val();
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(345); val();
				setState(346); bool_op();
				setState(347); val();
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

	public static class Colomn_nameContext extends ParserRuleContext {
		public String value;
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
		enterRule(_localctx, 48, RULE_colomn_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); ((Colomn_nameContext)_localctx).x = match(IDENTIFIER);
			((Colomn_nameContext)_localctx).value =  new String((((Colomn_nameContext)_localctx).x!=null?((Colomn_nameContext)_localctx).x.getText():null));
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

	public static class Colomn_alias_nameContext extends ParserRuleContext {
		public String value;
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
		enterRule(_localctx, 50, RULE_colomn_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((Colomn_alias_nameContext)_localctx).x = match(IDENTIFIER);
			((Colomn_alias_nameContext)_localctx).value =  new String((((Colomn_alias_nameContext)_localctx).x!=null?((Colomn_alias_nameContext)_localctx).x.getText():null));
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
		enterRule(_localctx, 52, RULE_table_name);
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
		enterRule(_localctx, 54, RULE_table_alias_name);
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
		enterRule(_localctx, 56, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); ((Database_nameContext)_localctx).x = match(IDENTIFIER);
			((Database_nameContext)_localctx).value =  new String((((Database_nameContext)_localctx).x!=null?((Database_nameContext)_localctx).x.getText():null));
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
		public Integer value;
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
		enterRule(_localctx, 58, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); ((Type_intContext)_localctx).x = match(INTIDENTI);
			((Type_intContext)_localctx).value =  new Integer((((Type_intContext)_localctx).x!=null?((Type_intContext)_localctx).x.getText():null));
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
		public Double value;
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
		enterRule(_localctx, 60, RULE_type_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); ((Type_doubleContext)_localctx).x = match(DOUBLEIDENTI);
			((Type_doubleContext)_localctx).value = new Double((((Type_doubleContext)_localctx).x!=null?((Type_doubleContext)_localctx).x.getText():null));
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
		public String value;
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
		enterRule(_localctx, 62, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); ((Type_stringContext)_localctx).x = match(STRINGIDENTI);
			((Type_stringContext)_localctx).value =  new String((((Type_stringContext)_localctx).x!=null?((Type_stringContext)_localctx).x.getText():null));
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3<\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\6\2F\n\2\r\2\16\2G\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\5\b"+
		"t\n\b\3\b\5\bw\n\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u009e\n\t"+
		"\f\t\16\t\u00a1\13\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\5\t\u00b5\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00d4\n\13\f\13\16\13\u00d7\13\13\5\13\u00d9\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f\u00e5\13\f\5\f\u00e7\n\f\3\r\3\r\3"+
		"\r\5\r\u00ec\n\r\3\16\3\16\3\16\5\16\u00f1\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00fc\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0114\n\24\7\24\u0116\n\24\f\24\16\24\u0119\13\24"+
		"\3\24\3\24\5\24\u011d\n\24\3\25\3\25\5\25\u0121\n\25\3\25\5\25\u0124\n"+
		"\25\3\25\3\25\3\25\5\25\u0129\n\25\3\25\5\25\u012c\n\25\3\25\3\25\5\25"+
		"\u0130\n\25\3\25\5\25\u0133\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u013a\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0145\n\30\3\31"+
		"\5\31\u0148\n\31\3\31\3\31\3\31\3\31\5\31\u014e\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0160"+
		"\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\2\"\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\5\2\b\b\20\20\32\32\3"+
		"\2\67<\3\2\65\66\4\2,.\61\61\u018d\2E\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\b"+
		"Y\3\2\2\2\n]\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20\u0099\3\2\2\2\22\u00b6"+
		"\3\2\2\2\24\u00c5\3\2\2\2\26\u00da\3\2\2\2\30\u00e8\3\2\2\2\32\u00ed\3"+
		"\2\2\2\34\u00fb\3\2\2\2\36\u00fd\3\2\2\2 \u00ff\3\2\2\2\"\u0101\3\2\2"+
		"\2$\u0103\3\2\2\2&\u011c\3\2\2\2(\u0132\3\2\2\2*\u0139\3\2\2\2,\u013b"+
		"\3\2\2\2.\u0144\3\2\2\2\60\u015f\3\2\2\2\62\u0161\3\2\2\2\64\u0164\3\2"+
		"\2\2\66\u0167\3\2\2\28\u016a\3\2\2\2:\u016d\3\2\2\2<\u0170\3\2\2\2>\u0173"+
		"\3\2\2\2@\u0176\3\2\2\2BC\5\4\3\2CD\7\'\2\2DF\3\2\2\2EB\3\2\2\2FG\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\2\2\3J\3\3\2\2\2KU\5\6\4\2LU\5"+
		"\b\5\2MU\5\n\6\2NU\5\f\7\2OU\5\16\b\2PU\5\20\t\2QU\5\22\n\2RU\5\24\13"+
		"\2SU\5\26\f\2TK\3\2\2\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3\2\2\2TP\3\2"+
		"\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\7\35\2\2WX\5:\36\2X\7"+
		"\3\2\2\2YZ\7\t\2\2Z[\7\33\2\2[\\\5\66\34\2\\\t\3\2\2\2]^\7\t\2\2^_\5:"+
		"\36\2_\13\3\2\2\2`a\7\5\2\2ab\5:\36\2b\r\3\2\2\2cd\7\5\2\2de\7\33\2\2"+
		"ef\5\66\34\2fg\7)\2\2gh\5\62\32\2hm\5\36\20\2ik\7\23\2\2ji\3\2\2\2jk\3"+
		"\2\2\2kl\3\2\2\2ln\7\24\2\2mj\3\2\2\2mn\3\2\2\2nz\3\2\2\2op\7+\2\2pq\5"+
		"\62\32\2qv\5\36\20\2rt\7\23\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\24\2"+
		"\2vs\3\2\2\2vw\3\2\2\2wy\3\2\2\2xo\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\u008b\3\2\2\2|z\3\2\2\2}~\7+\2\2~\177\7\26\2\2\177\u0080\7\22\2\2"+
		"\u0080\u0081\7)\2\2\u0081\u0086\5\62\32\2\u0082\u0083\7+\2\2\u0083\u0085"+
		"\5\62\32\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\u008c\3\2\2\2\u008b}\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0095"+
		"\3\2\2\2\u008d\u008e\7+\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\22\2\2"+
		"\u0090\u0091\5\62\32\2\u0091\u0092\7\27\2\2\u0092\u0093\5:\36\2\u0093"+
		"\u0094\5\62\32\2\u0094\u0096\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7*\2\2\u0098\17\3\2\2\2\u0099\u009a"+
		"\7\30\2\2\u009a\u009f\5\32\16\2\u009b\u009c\7+\2\2\u009c\u009e\5\32\16"+
		"\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3"+
		"\u00a8\5\30\r\2\u00a4\u00a5\7+\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a4\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00b4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00b1\5"+
		"\60\31\2\u00ad\u00ae\7+\2\2\u00ae\u00b0\5\60\31\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\5\30"+
		"\r\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7)\2\2\u00bb\u00c0\5\34\17\2\u00bc"+
		"\u00bd\7+\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\17\2"+
		"\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7;\2\2\u00c9"+
		"\u00ca\5\60\31\2\u00ca\u00cb\7+\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd"+
		"\7;\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0\7\37\2\2"+
		"\u00d0\u00d5\5\60\31\2\u00d1\u00d2\7+\2\2\u00d2\u00d4\5\60\31\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\7\f\2"+
		"\2\u00dc\u00e6\5\30\r\2\u00dd\u00de\7\37\2\2\u00de\u00e3\5\60\31\2\u00df"+
		"\u00e0\7+\2\2\u00e0\u00e2\5\60\31\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\27\3\2\2"+
		"\2\u00e8\u00eb\5\66\34\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\58\35\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00f0\5\62\32"+
		"\2\u00ee\u00ef\7\4\2\2\u00ef\u00f1\5\64\33\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f3\5<\37\2\u00f3\u00f4\b\17\1"+
		"\2\u00f4\u00fc\3\2\2\2\u00f5\u00f6\5> \2\u00f6\u00f7\b\17\1\2\u00f7\u00fc"+
		"\3\2\2\2\u00f8\u00f9\5@!\2\u00f9\u00fa\b\17\1\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f2\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\35\3\2\2"+
		"\2\u00fd\u00fe\t\2\2\2\u00fe\37\3\2\2\2\u00ff\u0100\t\3\2\2\u0100!\3\2"+
		"\2\2\u0101\u0102\t\4\2\2\u0102#\3\2\2\2\u0103\u0104\t\5\2\2\u0104%\3\2"+
		"\2\2\u0105\u0106\7)\2\2\u0106\u0107\5\20\t\2\u0107\u0108\7*\2\2\u0108"+
		"\u011d\3\2\2\2\u0109\u010d\7)\2\2\u010a\u010e\5<\37\2\u010b\u010e\5> "+
		"\2\u010c\u010e\5@!\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0117\3\2\2\2\u010f\u0113\7+\2\2\u0110\u0114\5<\37\2\u0111"+
		"\u0114\5> \2\u0112\u0114\5@!\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u010f\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7*\2\2\u011b\u011d\3\2\2\2\u011c\u0105\3\2"+
		"\2\2\u011c\u0109\3\2\2\2\u011d\'\3\2\2\2\u011e\u0121\5\62\32\2\u011f\u0121"+
		"\5\64\33\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0124\5\34\17\2\u0123\u0120\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u012b\5$\23\2\u0126\u0129\5\62\32\2\u0127\u0129\5\64\33"+
		"\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012c"+
		"\5\34\17\2\u012b\u0128\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u0133\3\2\2\2"+
		"\u012d\u0130\5\62\32\2\u012e\u0130\5\64\33\2\u012f\u012d\3\2\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0133\5\34\17\2\u0132\u0123\3"+
		"\2\2\2\u0132\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133)\3\2\2\2\u0134\u013a"+
		"\5(\25\2\u0135\u0136\5(\25\2\u0136\u0137\5$\23\2\u0137\u0138\5(\25\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u013a+\3\2\2\2"+
		"\u013b\u013c\5*\26\2\u013c\u013d\5 \21\2\u013d\u013e\5*\26\2\u013e-\3"+
		"\2\2\2\u013f\u0145\5,\27\2\u0140\u0141\5,\27\2\u0141\u0142\5\"\22\2\u0142"+
		"\u0143\5*\26\2\u0143\u0145\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2"+
		"\2\2\u0145/\3\2\2\2\u0146\u0148\7\23\2\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\n\2\2\u014a\u0160\5&\24\2\u014b"+
		"\u014d\5*\26\2\u014c\u014e\7\23\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\16\2\2\u0150\u0151\5&\24\2\u0151"+
		"\u0160\3\2\2\2\u0152\u0160\5*\26\2\u0153\u0154\5*\26\2\u0154\u0155\5$"+
		"\23\2\u0155\u0156\5*\26\2\u0156\u0160\3\2\2\2\u0157\u0158\5*\26\2\u0158"+
		"\u0159\5 \21\2\u0159\u015a\5*\26\2\u015a\u0160\3\2\2\2\u015b\u015c\5*"+
		"\26\2\u015c\u015d\5\"\22\2\u015d\u015e\5*\26\2\u015e\u0160\3\2\2\2\u015f"+
		"\u0147\3\2\2\2\u015f\u014b\3\2\2\2\u015f\u0152\3\2\2\2\u015f\u0153\3\2"+
		"\2\2\u015f\u0157\3\2\2\2\u015f\u015b\3\2\2\2\u0160\61\3\2\2\2\u0161\u0162"+
		"\7 \2\2\u0162\u0163\b\32\1\2\u0163\63\3\2\2\2\u0164\u0165\7 \2\2\u0165"+
		"\u0166\b\33\1\2\u0166\65\3\2\2\2\u0167\u0168\7 \2\2\u0168\u0169\b\34\1"+
		"\2\u0169\67\3\2\2\2\u016a\u016b\7 \2\2\u016b\u016c\b\35\1\2\u016c9\3\2"+
		"\2\2\u016d\u016e\7 \2\2\u016e\u016f\b\36\1\2\u016f;\3\2\2\2\u0170\u0171"+
		"\7!\2\2\u0171\u0172\b\37\1\2\u0172=\3\2\2\2\u0173\u0174\7\"\2\2\u0174"+
		"\u0175\b \1\2\u0175?\3\2\2\2\u0176\u0177\7#\2\2\u0177\u0178\b!\1\2\u0178"+
		"A\3\2\2\2\'GTjmsvz\u0086\u008b\u0095\u009f\u00a8\u00b1\u00b4\u00c0\u00d5"+
		"\u00d8\u00e3\u00e6\u00eb\u00f0\u00fb\u010d\u0113\u0117\u011c\u0120\u0123"+
		"\u0128\u012b\u012f\u0132\u0139\u0144\u0147\u014d\u015f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}