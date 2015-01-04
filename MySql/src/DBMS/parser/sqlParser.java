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

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class sqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int KEY_ALTER = 1, KEY_AND = 2, KEY_AS = 3,
			KEY_CREATE = 4, KEY_DATABASE = 5, KEY_DELETE = 6, KEY_DOUBLE = 7,
			KEY_DROP = 8, KEY_EXISTS = 9, KEY_FOREIGN = 10, KEY_FROM = 11,
			KEY_IF = 12, KEY_IN = 13, KEY_INSERT = 14, KEY_INT = 15,
			KEY_INTO = 16, KEY_KEY = 17, KEY_NOT = 18, KEY_NULL = 19,
			KEY_ON = 20, KEY_OR = 21, KEY_PRIMARY = 22, KEY_REFERENCES = 23,
			KEY_SELECT = 24, KEY_SET = 25, KEY_STRING = 26, KEY_TABLE = 27,
			KEY_UPDATE = 28, KEY_USE = 29, KEY_VALUES = 30, KEY_WHERE = 31,
			IDENTIFIER = 32, INTIDENTI = 33, DOUBLEIDENTI = 34,
			STRINGIDENTI = 35, SINGLE_LINE_COMMENT = 36,
			MULTILINE_COMMENT = 37, SPACES = 38, SCOL = 39, DOT = 40,
			OPEN_PAR = 41, CLOSE_PAR = 42, COMMA = 43, STAR = 44, PLUS = 45,
			MINUS = 46, TILDE = 47, PIPE2 = 48, DIV = 49, MOD = 50, LT2 = 51,
			GT2 = 52, AMP = 53, PIPE = 54, LT = 55, LT_EQ = 56, GT = 57,
			GT_EQ = 58, EQ = 59, NOT_EQ = 60;
	public static final String[] tokenNames = { "<INVALID>", "KEY_ALTER",
			"KEY_AND", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE",
			"KEY_DOUBLE", "KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM",
			"KEY_IF", "KEY_IN", "KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY",
			"KEY_NOT", "KEY_NULL", "KEY_ON", "KEY_OR", "KEY_PRIMARY",
			"KEY_REFERENCES", "KEY_SELECT", "KEY_SET", "KEY_STRING",
			"KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE",
			"IDENTIFIER", "INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI",
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "';'", "'.'",
			"'('", "')'", "','", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'",
			"'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='",
			"'='", "'<>'" };
	public static final int RULE_start = 0, RULE_sqls = 1, RULE_sql_use = 2,
			RULE_sql_drop_table = 3, RULE_sql_drop_database = 4,
			RULE_sql_create_database = 5, RULE_sql_create_table = 6,
			RULE_col_type = 7, RULE_primary_col = 8, RULE_foreign_col = 9,
			RULE_sql_select = 10, RULE_sql_insert = 11, RULE_sql_update = 12,
			RULE_col_exp = 13, RULE_sql_delete = 14, RULE_sql_where = 15,
			RULE_tables = 16, RULE_colomns = 17, RULE_consts = 18,
			RULE_types = 19, RULE_compare = 20, RULE_bool_op = 21,
			RULE_op = 22, RULE_select_or_set = 23, RULE_subval = 24,
			RULE_val = 25, RULE_sub_bool_val = 26, RULE_bool_val = 27,
			RULE_expr = 28, RULE_colomn_name = 29, RULE_colomn_alias_name = 30,
			RULE_table_name = 31, RULE_table_alias_name = 32,
			RULE_database_name = 33, RULE_type_int = 34, RULE_type_double = 35,
			RULE_type_string = 36;
	public static final String[] ruleNames = { "start", "sqls", "sql_use",
			"sql_drop_table", "sql_drop_database", "sql_create_database",
			"sql_create_table", "col_type", "primary_col", "foreign_col",
			"sql_select", "sql_insert", "sql_update", "col_exp", "sql_delete",
			"sql_where", "tables", "colomns", "consts", "types", "compare",
			"bool_op", "op", "select_or_set", "subval", "val", "sub_bool_val",
			"bool_val", "expr", "colomn_name", "colomn_alias_name",
			"table_name", "table_alias_name", "database_name", "type_int",
			"type_double", "type_string" };

	@Override
	public String getGrammarFileName() {
		return "sql.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public sqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public SqlsContext sqls(int i) {
			return getRuleContext(SqlsContext.class, i);
		}

		public TerminalNode EOF() {
			return getToken(sqlParser.EOF, 0);
		}

		public List<SqlsContext> sqls() {
			return getRuleContexts(SqlsContext.class);
		}

		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitStart(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY_CREATE)
						| (1L << KEY_DELETE)
						| (1L << KEY_DROP)
						| (1L << KEY_INSERT)
						| (1L << KEY_SELECT)
						| (1L << KEY_UPDATE) | (1L << KEY_USE))) != 0)) {
					{
						{
							setState(74);
							sqls();
							setState(75);
							match(SCOL);
						}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlsContext extends ParserRuleContext {
		public Sql_deleteContext sql_delete() {
			return getRuleContext(Sql_deleteContext.class, 0);
		}

		public Sql_drop_tableContext sql_drop_table() {
			return getRuleContext(Sql_drop_tableContext.class, 0);
		}

		public Sql_selectContext sql_select() {
			return getRuleContext(Sql_selectContext.class, 0);
		}

		public Sql_updateContext sql_update() {
			return getRuleContext(Sql_updateContext.class, 0);
		}

		public Sql_create_tableContext sql_create_table() {
			return getRuleContext(Sql_create_tableContext.class, 0);
		}

		public Sql_insertContext sql_insert() {
			return getRuleContext(Sql_insertContext.class, 0);
		}

		public Sql_create_databaseContext sql_create_database() {
			return getRuleContext(Sql_create_databaseContext.class, 0);
		}

		public Sql_useContext sql_use() {
			return getRuleContext(Sql_useContext.class, 0);
		}

		public Sql_drop_databaseContext sql_drop_database() {
			return getRuleContext(Sql_drop_databaseContext.class, 0);
		}

		public SqlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sqls;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSqls(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SqlsContext sqls() throws RecognitionException {
		SqlsContext _localctx = new SqlsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqls);
		try {
			setState(93);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(84);
					sql_use();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(85);
					sql_drop_table();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(86);
					sql_drop_database();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(87);
					sql_create_database();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(88);
					sql_create_table();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(89);
					sql_select();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(90);
					sql_insert();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(91);
					sql_update();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(92);
					sql_delete();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_useContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode KEY_USE() {
			return getToken(sqlParser.KEY_USE, 0);
		}

		public Sql_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_use;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSql_use(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_useContext sql_use() throws RecognitionException {
		Sql_useContext _localctx = new Sql_useContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(95);
				match(KEY_USE);
				setState(96);
				database_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_drop_tableContext extends ParserRuleContext
			implements ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public TerminalNode KEY_DROP() {
			return getToken(sqlParser.KEY_DROP, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode KEY_TABLE() {
			return getToken(sqlParser.KEY_TABLE, 0);
		}

		public Sql_drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_drop_table;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_drop_table(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_drop_tableContext sql_drop_table()
			throws RecognitionException {
		Sql_drop_tableContext _localctx = new Sql_drop_tableContext(_ctx,
				getState());
		enterRule(_localctx, 6, RULE_sql_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(98);
				match(KEY_DROP);
				setState(99);
				match(KEY_TABLE);
				setState(100);
				table_name();
				// System.out.println("sql_drop_table");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_drop_databaseContext extends ParserRuleContext
			implements ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public TerminalNode KEY_DROP() {
			return getToken(sqlParser.KEY_DROP, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Sql_drop_databaseContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_drop_database;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_drop_database(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_drop_databaseContext sql_drop_database()
			throws RecognitionException {
		Sql_drop_databaseContext _localctx = new Sql_drop_databaseContext(_ctx,
				getState());
		enterRule(_localctx, 8, RULE_sql_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(103);
				match(KEY_DROP);
				setState(104);
				database_name();
				// System.out.println("sql_drop_database");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_create_databaseContext extends ParserRuleContext
			implements ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode KEY_CREATE() {
			return getToken(sqlParser.KEY_CREATE, 0);
		}

		public Sql_create_databaseContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_create_database;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_create_database(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_create_databaseContext sql_create_database()
			throws RecognitionException {
		Sql_create_databaseContext _localctx = new Sql_create_databaseContext(
				_ctx, getState());
		enterRule(_localctx, 10, RULE_sql_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(107);
				match(KEY_CREATE);
				setState(108);
				database_name();
				// System.out.println("SQLCREATEDATABASE");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_create_tableContext extends ParserRuleContext
			implements ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public List<Foreign_colContext> foreign_col() {
			return getRuleContexts(Foreign_colContext.class);
		}

		public Foreign_colContext foreign_col(int i) {
			return getRuleContext(Foreign_colContext.class, i);
		}

		public List<Col_typeContext> col_type() {
			return getRuleContexts(Col_typeContext.class);
		}

		public Primary_colContext primary_col() {
			return getRuleContext(Primary_colContext.class, 0);
		}

		public Col_typeContext col_type(int i) {
			return getRuleContext(Col_typeContext.class, i);
		}

		public TerminalNode KEY_CREATE() {
			return getToken(sqlParser.KEY_CREATE, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode KEY_TABLE() {
			return getToken(sqlParser.KEY_TABLE, 0);
		}

		public Sql_create_tableContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_create_table;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_create_table(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_create_tableContext sql_create_table()
			throws RecognitionException {
		Sql_create_tableContext _localctx = new Sql_create_tableContext(_ctx,
				getState());
		enterRule(_localctx, 12, RULE_sql_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				match(KEY_CREATE);
				setState(112);
				match(KEY_TABLE);
				setState(113);
				table_name();
				setState(114);
				match(OPEN_PAR);
				setState(115);
				col_type();
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				while (_alt != 2 && _alt != -1) {
					if (_alt == 1) {
						{
							{
								setState(116);
								match(COMMA);
								setState(117);
								col_type();
							}
						}
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				}
				setState(125);
				switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
				case 1: {
					setState(123);
					match(COMMA);
					setState(124);
					primary_col();
				}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(127);
							match(COMMA);
							setState(128);
							foreign_col();
						}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(CLOSE_PAR);
				// System.out.println("SQL_CREATE_TABLE");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_typeContext extends ParserRuleContext {
		public TerminalNode KEY_NOT() {
			return getToken(sqlParser.KEY_NOT, 0);
		}

		public Colomn_nameContext colomn_name() {
			return getRuleContext(Colomn_nameContext.class, 0);
		}

		public TypesContext types() {
			return getRuleContext(TypesContext.class, 0);
		}

		public TerminalNode KEY_NULL() {
			return getToken(sqlParser.KEY_NULL, 0);
		}

		public Col_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_col_type;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitCol_type(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Col_typeContext col_type() throws RecognitionException {
		Col_typeContext _localctx = new Col_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_col_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(137);
				colomn_name();
				setState(138);
				types();
				setState(143);
				_la = _input.LA(1);
				if (_la == KEY_NOT || _la == KEY_NULL) {
					{
						setState(140);
						_la = _input.LA(1);
						if (_la == KEY_NOT) {
							{
								setState(139);
								match(KEY_NOT);
							}
						}

						setState(142);
						match(KEY_NULL);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_colContext extends ParserRuleContext {
		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}

		public TerminalNode KEY_PRIMARY() {
			return getToken(sqlParser.KEY_PRIMARY, 0);
		}

		public Colomn_nameContext colomn_name(int i) {
			return getRuleContext(Colomn_nameContext.class, i);
		}

		public TerminalNode KEY_KEY() {
			return getToken(sqlParser.KEY_KEY, 0);
		}

		public Primary_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary_col;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitPrimary_col(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Primary_colContext primary_col() throws RecognitionException {
		Primary_colContext _localctx = new Primary_colContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				match(KEY_PRIMARY);
				setState(146);
				match(KEY_KEY);
				{
					setState(147);
					match(OPEN_PAR);
					setState(148);
					colomn_name();
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(149);
								match(COMMA);
								setState(150);
								colomn_name();
							}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(156);
					match(CLOSE_PAR);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_colContext extends ParserRuleContext {
		public TerminalNode KEY_REFERENCES() {
			return getToken(sqlParser.KEY_REFERENCES, 0);
		}

		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}

		public TerminalNode KEY_FOREIGN() {
			return getToken(sqlParser.KEY_FOREIGN, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Colomn_nameContext colomn_name(int i) {
			return getRuleContext(Colomn_nameContext.class, i);
		}

		public TerminalNode KEY_KEY() {
			return getToken(sqlParser.KEY_KEY, 0);
		}

		public Foreign_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_foreign_col;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitForeign_col(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Foreign_colContext foreign_col() throws RecognitionException {
		Foreign_colContext _localctx = new Foreign_colContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_foreign_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				match(KEY_FOREIGN);
				setState(159);
				match(KEY_KEY);
				setState(160);
				colomn_name();
				setState(161);
				match(KEY_REFERENCES);
				setState(162);
				table_name();
				setState(163);
				colomn_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_selectContext extends ParserRuleContext {
		public SelectSet value;

		public TablesContext tables(int i) {
			return getRuleContext(TablesContext.class, i);
		}

		public TerminalNode KEY_SELECT() {
			return getToken(sqlParser.KEY_SELECT, 0);
		}

		public ColomnsContext colomns(int i) {
			return getRuleContext(ColomnsContext.class, i);
		}

		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class, 0);
		}

		public List<TablesContext> tables() {
			return getRuleContexts(TablesContext.class);
		}

		public TerminalNode KEY_FROM() {
			return getToken(sqlParser.KEY_FROM, 0);
		}

		public List<ColomnsContext> colomns() {
			return getRuleContexts(ColomnsContext.class);
		}

		public Sql_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_select;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_select(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_selectContext sql_select() throws RecognitionException {
		Sql_selectContext _localctx = new Sql_selectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sql_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(165);
				match(KEY_SELECT);
				setState(166);
				colomns();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(167);
							match(COMMA);
							setState(168);
							colomns();
						}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(KEY_FROM);
				setState(175);
				tables();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(176);
							match(COMMA);
							setState(177);
							tables();
						}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				_la = _input.LA(1);
				if (_la == KEY_WHERE) {
					{
						setState(183);
						sql_where();
					}
				}

				// System.out.println("SQL_SELECT");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_insertContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}

		public TerminalNode KEY_INTO() {
			return getToken(sqlParser.KEY_INTO, 0);
		}

		public TerminalNode KEY_INSERT() {
			return getToken(sqlParser.KEY_INSERT, 0);
		}

		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class, i);
		}

		public TablesContext tables() {
			return getRuleContext(TablesContext.class, 0);
		}

		public TerminalNode KEY_VALUES() {
			return getToken(sqlParser.KEY_VALUES, 0);
		}

		public Sql_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_insert;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_insert(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_insertContext sql_insert() throws RecognitionException {
		Sql_insertContext _localctx = new Sql_insertContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sql_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(188);
				match(KEY_INSERT);
				setState(189);
				match(KEY_INTO);
				setState(190);
				tables();
				setState(191);
				match(KEY_VALUES);
				setState(192);
				match(OPEN_PAR);
				setState(193);
				consts();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(194);
							match(COMMA);
							setState(195);
							consts();
						}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(CLOSE_PAR);
				// System.out.println("SQL_INSERT");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_updateContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public List<Col_expContext> col_exp() {
			return getRuleContexts(Col_expContext.class);
		}

		public TerminalNode KEY_SET() {
			return getToken(sqlParser.KEY_SET, 0);
		}

		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class, 0);
		}

		public Col_expContext col_exp(int i) {
			return getRuleContext(Col_expContext.class, i);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode KEY_UPDATE() {
			return getToken(sqlParser.KEY_UPDATE, 0);
		}

		public Sql_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_update;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_update(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_updateContext sql_update() throws RecognitionException {
		Sql_updateContext _localctx = new Sql_updateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sql_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(204);
				match(KEY_UPDATE);
				setState(205);
				table_name();
				setState(206);
				match(KEY_SET);
				setState(207);
				col_exp();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(208);
							match(COMMA);
							setState(209);
							col_exp();
						}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				_la = _input.LA(1);
				if (_la == KEY_WHERE) {
					{
						setState(215);
						sql_where();
					}
				}

				// System.out.println("SQL_UPDATE");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_expContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ColomnsContext colomns() {
			return getRuleContext(ColomnsContext.class, 0);
		}

		public TerminalNode EQ() {
			return getToken(sqlParser.EQ, 0);
		}

		public Col_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_col_exp;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitCol_exp(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Col_expContext col_exp() throws RecognitionException {
		Col_expContext _localctx = new Col_expContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_col_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(220);
				colomns();
				setState(221);
				match(EQ);
				setState(222);
				expr();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_deleteContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Sql_whereContext sql_where() {
			return getRuleContext(Sql_whereContext.class, 0);
		}

		public TablesContext tables() {
			return getRuleContext(TablesContext.class, 0);
		}

		public TerminalNode KEY_DELETE() {
			return getToken(sqlParser.KEY_DELETE, 0);
		}

		public TerminalNode KEY_FROM() {
			return getToken(sqlParser.KEY_FROM, 0);
		}

		public Sql_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_delete;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSql_delete(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_deleteContext sql_delete() throws RecognitionException {
		Sql_deleteContext _localctx = new Sql_deleteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sql_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(224);
				match(KEY_DELETE);
				setState(225);
				match(KEY_FROM);
				setState(226);
				tables();
				setState(228);
				_la = _input.LA(1);
				if (_la == KEY_WHERE) {
					{
						setState(227);
						sql_where();
					}
				}

				// System.out.println("SQL_DELETE");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_whereContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public TerminalNode KEY_WHERE() {
			return getToken(sqlParser.KEY_WHERE, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Sql_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_where;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSql_where(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_whereContext sql_where() throws RecognitionException {
		Sql_whereContext _localctx = new Sql_whereContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sql_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(232);
					match(KEY_WHERE);
					setState(233);
					expr();
				}
				// System.out.println("SQL_WHERE");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablesContext extends ParserRuleContext {
		public TerminalNode KEY_AS() {
			return getToken(sqlParser.KEY_AS, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Table_alias_nameContext table_alias_name() {
			return getRuleContext(Table_alias_nameContext.class, 0);
		}

		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tables;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitTables(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(237);
				table_name();
				setState(240);
				_la = _input.LA(1);
				if (_la == KEY_AS) {
					{
						setState(238);
						match(KEY_AS);
						setState(239);
						table_alias_name();
					}
				}

				// System.out.println("TABLES");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColomnsContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class, 0);
		}

		public Colomn_alias_nameContext colomn_alias_name() {
			return getRuleContext(Colomn_alias_nameContext.class, 0);
		}

		public Colomn_nameContext colomn_name() {
			return getRuleContext(Colomn_nameContext.class, 0);
		}

		public TerminalNode KEY_AS() {
			return getToken(sqlParser.KEY_AS, 0);
		}

		public ColomnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_colomns;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitColomns(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ColomnsContext colomns() throws RecognitionException {
		ColomnsContext _localctx = new ColomnsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_colomns);
		int _la;
		try {
			setState(254);
			switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					{
						setState(244);
						colomn_name();
						setState(247);
						_la = _input.LA(1);
						if (_la == KEY_AS) {
							{
								setState(245);
								match(KEY_AS);
								setState(246);
								colomn_alias_name();
							}
						}

					}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(249);
						val();
						setState(250);
						match(KEY_AS);
						setState(251);
						colomn_alias_name();
					}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(253);
					match(STAR);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstsContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Type_intContext x;
		public Type_doubleContext y;
		public Type_stringContext z;

		public Type_stringContext type_string() {
			return getRuleContext(Type_stringContext.class, 0);
		}

		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class, 0);
		}

		public Type_doubleContext type_double() {
			return getRuleContext(Type_doubleContext.class, 0);
		}

		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_consts;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitConsts(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_consts);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case INTIDENTI:
				enterOuterAlt(_localctx, 1);
				{
					setState(256);
					((ConstsContext) _localctx).x = type_int();
					((ConstsContext) _localctx).value = ((ConstsContext) _localctx).x.value;
				}
				break;
			case DOUBLEIDENTI:
				enterOuterAlt(_localctx, 2);
				{
					setState(259);
					((ConstsContext) _localctx).y = type_double();
					((ConstsContext) _localctx).value = ((ConstsContext) _localctx).y.value;
				}
				break;
			case STRINGIDENTI:
				enterOuterAlt(_localctx, 3);
				{
					setState(262);
					((ConstsContext) _localctx).z = type_string();
					((ConstsContext) _localctx).value = ((ConstsContext) _localctx).z.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TypeDataEnum value;

		public TerminalNode KEY_STRING() {
			return getToken(sqlParser.KEY_STRING, 0);
		}

		public TerminalNode KEY_DOUBLE() {
			return getToken(sqlParser.KEY_DOUBLE, 0);
		}

		public TerminalNode KEY_INT() {
			return getToken(sqlParser.KEY_INT, 0);
		}

		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_types;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitTypes(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_types);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case KEY_INT:
				enterOuterAlt(_localctx, 1);
				{
					setState(267);
					match(KEY_INT);
					((TypesContext) _localctx).value = TypeDataEnum.INT;
				}
				break;
			case KEY_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
					setState(269);
					match(KEY_DOUBLE);
					((TypesContext) _localctx).value = TypeDataEnum.DOUBLE;
				}
				break;
			case KEY_STRING:
				enterOuterAlt(_localctx, 3);
				{
					setState(271);
					match(KEY_STRING);
					((TypesContext) _localctx).value = TypeDataEnum.STRING;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode LT() {
			return getToken(sqlParser.LT, 0);
		}

		public TerminalNode LT_EQ() {
			return getToken(sqlParser.LT_EQ, 0);
		}

		public TerminalNode GT() {
			return getToken(sqlParser.GT, 0);
		}

		public TerminalNode NOT_EQ() {
			return getToken(sqlParser.NOT_EQ, 0);
		}

		public TerminalNode GT_EQ() {
			return getToken(sqlParser.GT_EQ, 0);
		}

		public TerminalNode EQ() {
			return getToken(sqlParser.EQ, 0);
		}

		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compare;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitCompare(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(275);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT)
						| (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ)
						| (1L << EQ) | (1L << NOT_EQ))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode KEY_OR() {
			return getToken(sqlParser.KEY_OR, 0);
		}

		public TerminalNode KEY_AND() {
			return getToken(sqlParser.KEY_AND, 0);
		}

		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool_op;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitBool_op(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(277);
				_la = _input.LA(1);
				if (!(_la == KEY_AND || _la == KEY_OR)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode DIV() {
			return getToken(sqlParser.DIV, 0);
		}

		public TerminalNode MINUS() {
			return getToken(sqlParser.MINUS, 0);
		}

		public TerminalNode STAR() {
			return getToken(sqlParser.STAR, 0);
		}

		public TerminalNode PLUS() {
			return getToken(sqlParser.PLUS, 0);
		}

		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_op;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitOp(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(279);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR)
						| (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
			return getRuleContext(Type_doubleContext.class, i);
		}

		public Type_intContext type_int(int i) {
			return getRuleContext(Type_intContext.class, i);
		}

		public Sql_selectContext sql_select() {
			return getRuleContext(Sql_selectContext.class, 0);
		}

		public Type_stringContext type_string(int i) {
			return getRuleContext(Type_stringContext.class, i);
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

		@Override
		public int getRuleIndex() {
			return RULE_select_or_set;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSelect_or_set(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Select_or_setContext select_or_set()
			throws RecognitionException {
		Select_or_setContext _localctx = new Select_or_setContext(_ctx,
				getState());
		enterRule(_localctx, 46, RULE_select_or_set);
		int _la;
		try {
			setState(304);
			switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(281);
					match(OPEN_PAR);
					setState(282);
					sql_select();
					setState(283);
					match(CLOSE_PAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(285);
						match(OPEN_PAR);
						setState(289);
						switch (_input.LA(1)) {
						case INTIDENTI: {
							setState(286);
							type_int();
						}
							break;
						case DOUBLEIDENTI: {
							setState(287);
							type_double();
						}
							break;
						case STRINGIDENTI: {
							setState(288);
							type_string();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(291);
									match(COMMA);
									setState(295);
									switch (_input.LA(1)) {
									case INTIDENTI: {
										setState(292);
										type_int();
									}
										break;
									case DOUBLEIDENTI: {
										setState(293);
										type_double();
									}
										break;
									case STRINGIDENTI: {
										setState(294);
										type_string();
									}
										break;
									default:
										throw new NoViableAltException(this);
									}
								}
							}
							setState(301);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(302);
						match(CLOSE_PAR);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubvalContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public OpContext op() {
			return getRuleContext(OpContext.class, 0);
		}

		public List<ConstsContext> consts() {
			return getRuleContexts(ConstsContext.class);
		}

		public List<Colomn_nameContext> colomn_name() {
			return getRuleContexts(Colomn_nameContext.class);
		}

		public ConstsContext consts(int i) {
			return getRuleContext(ConstsContext.class, i);
		}

		public Colomn_nameContext colomn_name(int i) {
			return getRuleContext(Colomn_nameContext.class, i);
		}

		public SubvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_subval;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitSubval(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final SubvalContext subval() throws RecognitionException {
		SubvalContext _localctx = new SubvalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subval);
		try {
			setState(317);
			switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					{
						setState(306);
						colomn_name();
					}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(307);
						consts();
					}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					{
						setState(310);
						switch (_input.LA(1)) {
						case INTIDENTI:
						case DOUBLEIDENTI:
						case STRINGIDENTI: {
							setState(308);
							consts();
						}
							break;
						case IDENTIFIER: {
							setState(309);
							colomn_name();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(312);
						op();
						setState(315);
						switch (_input.LA(1)) {
						case INTIDENTI:
						case DOUBLEIDENTI:
						case STRINGIDENTI: {
							setState(313);
							consts();
						}
							break;
						case IDENTIFIER: {
							setState(314);
							colomn_name();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public OpContext op() {
			return getRuleContext(OpContext.class, 0);
		}

		public SubvalContext subval(int i) {
			return getRuleContext(SubvalContext.class, i);
		}

		public List<SubvalContext> subval() {
			return getRuleContexts(SubvalContext.class);
		}

		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_val;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitVal(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_val);
		try {
			setState(324);
			switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					{
						setState(319);
						subval();
					}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(320);
						subval();
						setState(321);
						op();
						setState(322);
						subval();
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_bool_valContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public CompareContext compare() {
			return getRuleContext(CompareContext.class, 0);
		}

		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}

		public ValContext val(int i) {
			return getRuleContext(ValContext.class, i);
		}

		public Sub_bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sub_bool_val;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitSub_bool_val(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sub_bool_valContext sub_bool_val() throws RecognitionException {
		Sub_bool_valContext _localctx = new Sub_bool_valContext(_ctx,
				getState());
		enterRule(_localctx, 52, RULE_sub_bool_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(326);
					val();
					setState(327);
					compare();
					setState(328);
					val();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_valContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public List<Sub_bool_valContext> sub_bool_val() {
			return getRuleContexts(Sub_bool_valContext.class);
		}

		public Sub_bool_valContext sub_bool_val(int i) {
			return getRuleContext(Sub_bool_valContext.class, i);
		}

		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class, 0);
		}

		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool_val;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitBool_val(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool_val);
		try {
			setState(335);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					{
						setState(330);
						sub_bool_val();
					}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(331);
						sub_bool_val();
						setState(332);
						bool_op();
						setState(333);
						sub_bool_val();
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public CompareContext compare() {
			return getRuleContext(CompareContext.class, 0);
		}

		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}

		public TerminalNode KEY_NOT() {
			return getToken(sqlParser.KEY_NOT, 0);
		}

		public Bool_valContext bool_val(int i) {
			return getRuleContext(Bool_valContext.class, i);
		}

		public TerminalNode KEY_EXISTS() {
			return getToken(sqlParser.KEY_EXISTS, 0);
		}

		public OpContext op() {
			return getRuleContext(OpContext.class, 0);
		}

		public ValContext val(int i) {
			return getRuleContext(ValContext.class, i);
		}

		public TerminalNode KEY_IN() {
			return getToken(sqlParser.KEY_IN, 0);
		}

		public List<Bool_valContext> bool_val() {
			return getRuleContexts(Bool_valContext.class);
		}

		public Select_or_setContext select_or_set() {
			return getRuleContext(Select_or_setContext.class, 0);
		}

		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class, 0);
		}

		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitExpr(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			setState(362);
			switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(337);
					val();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(338);
						val();
						setState(339);
						op();
						setState(340);
						val();
					}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
					{
						setState(342);
						val();
						setState(343);
						compare();
						setState(344);
						val();
					}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
					{
						setState(346);
						bool_val();
						setState(347);
						bool_op();
						setState(348);
						bool_val();
					}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
					{
						setState(351);
						_la = _input.LA(1);
						if (_la == KEY_NOT) {
							{
								setState(350);
								match(KEY_NOT);
							}
						}

						setState(353);
						match(KEY_EXISTS);
						setState(354);
						select_or_set();
					}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
					{
						setState(355);
						val();
						setState(357);
						_la = _input.LA(1);
						if (_la == KEY_NOT) {
							{
								setState(356);
								match(KEY_NOT);
							}
						}

						setState(359);
						match(KEY_IN);
						setState(360);
						select_or_set();
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colomn_nameContext extends ParserRuleContext implements
			ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Token x;

		public TerminalNode DOT() {
			return getToken(sqlParser.DOT, 0);
		}

		public TerminalNode IDENTIFIER(int i) {
			return getToken(sqlParser.IDENTIFIER, i);
		}

		public List<TerminalNode> IDENTIFIER() {
			return getTokens(sqlParser.IDENTIFIER);
		}

		public Colomn_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_colomn_name;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitColomn_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Colomn_nameContext colomn_name() throws RecognitionException {
		Colomn_nameContext _localctx = new Colomn_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colomn_name);
		try {
			setState(369);
			switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(364);
					((Colomn_nameContext) _localctx).x = match(IDENTIFIER);
					// System.out.println("COLOMN_NAME");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
					{
						setState(366);
						match(IDENTIFIER);
						setState(367);
						match(DOT);
						setState(368);
						match(IDENTIFIER);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Colomn_alias_nameContext extends ParserRuleContext
			implements ValueTree {
		public ValueBase value;

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		@Override
		public void setValue(ValueBase value) {
			this.value = value;
		}

		public Token x;

		public TerminalNode IDENTIFIER() {
			return getToken(sqlParser.IDENTIFIER, 0);
		}

		public Colomn_alias_nameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_colomn_alias_name;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitColomn_alias_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Colomn_alias_nameContext colomn_alias_name()
			throws RecognitionException {
		Colomn_alias_nameContext _localctx = new Colomn_alias_nameContext(_ctx,
				getState());
		enterRule(_localctx, 60, RULE_colomn_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(371);
				((Colomn_alias_nameContext) _localctx).x = match(IDENTIFIER);
				// System.out.println("COLOMN_ALIAS_NAME");
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public String value;
		public Token x;

		public TerminalNode IDENTIFIER() {
			return getToken(sqlParser.IDENTIFIER, 0);
		}

		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_name;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitTable_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(374);
				((Table_nameContext) _localctx).x = match(IDENTIFIER);
				((Table_nameContext) _localctx).value = new String(
						(((Table_nameContext) _localctx).x != null ? ((Table_nameContext) _localctx).x
								.getText() : null));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_alias_nameContext extends ParserRuleContext {
		public String value;
		public Token x;

		public TerminalNode IDENTIFIER() {
			return getToken(sqlParser.IDENTIFIER, 0);
		}

		public Table_alias_nameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_alias_name;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitTable_alias_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_alias_nameContext table_alias_name()
			throws RecognitionException {
		Table_alias_nameContext _localctx = new Table_alias_nameContext(_ctx,
				getState());
		enterRule(_localctx, 64, RULE_table_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(377);
				((Table_alias_nameContext) _localctx).x = match(IDENTIFIER);
				((Table_alias_nameContext) _localctx).value = new String(
						(((Table_alias_nameContext) _localctx).x != null ? ((Table_alias_nameContext) _localctx).x
								.getText() : null));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public String value;
		public Token x;

		public TerminalNode IDENTIFIER() {
			return getToken(sqlParser.IDENTIFIER, 0);
		}

		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_database_name;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitDatabase_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name()
			throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx,
				getState());
		enterRule(_localctx, 66, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(380);
				((Database_nameContext) _localctx).x = match(IDENTIFIER);
				((Database_nameContext) _localctx).value = new String(
						(((Database_nameContext) _localctx).x != null ? ((Database_nameContext) _localctx).x
								.getText() : null));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_intContext extends ParserRuleContext implements
			ValueTree {
		public ValueInt value;

		@Override
		public void setValue(ValueBase value) {
			this.value = (ValueInt) value;
		}

		public ValueBase getValue() {
			return this.value;
		}

		public Token x;

		public TerminalNode INTIDENTI() {
			return getToken(sqlParser.INTIDENTI, 0);
		}

		public Type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_int;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor).visitType_int(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Type_intContext type_int() throws RecognitionException {
		Type_intContext _localctx = new Type_intContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(383);
				((Type_intContext) _localctx).x = match(INTIDENTI);
				((Type_intContext) _localctx).value = new ValueInt(
						TypeDataEnum.INT,
						new Integer(
								(((Type_intContext) _localctx).x != null ? ((Type_intContext) _localctx).x
										.getText() : null)));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_doubleContext extends ParserRuleContext implements
			ValueTree {
		public ValueDouble value;

		@Override
		public void setValue(ValueBase value) {
			this.value = (ValueDouble) value;
		}

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		public Token x;

		public TerminalNode DOUBLEIDENTI() {
			return getToken(sqlParser.DOUBLEIDENTI, 0);
		}

		public Type_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_double;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitType_double(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Type_doubleContext type_double() throws RecognitionException {
		Type_doubleContext _localctx = new Type_doubleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(386);
				((Type_doubleContext) _localctx).x = match(DOUBLEIDENTI);
				((Type_doubleContext) _localctx).value = new ValueDouble(
						TypeDataEnum.DOUBLE,
						new Double(
								(((Type_doubleContext) _localctx).x != null ? ((Type_doubleContext) _localctx).x
										.getText() : null)));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_stringContext extends ParserRuleContext implements
			ValueTree {
		public ValueString value;

		@Override
		public void setValue(ValueBase value) {
			this.value = (ValueString) value;
		}

		@Override
		public ValueBase getValue() {
			return this.value;
		}

		public Token x;

		public TerminalNode STRINGIDENTI() {
			return getToken(sqlParser.STRINGIDENTI, 0);
		}

		public Type_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_string;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof sqlVisitor)
				return ((sqlVisitor<? extends T>) visitor)
						.visitType_string(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Type_stringContext type_string() throws RecognitionException {
		Type_stringContext _localctx = new Type_stringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(389);
				((Type_stringContext) _localctx).x = match(STRINGIDENTI);
				String __ = (((Type_stringContext) _localctx).x != null ? ((Type_stringContext) _localctx).x
						.getText() : null);
				((Type_stringContext) _localctx).value = new ValueString(
						TypeDataEnum.STRING, __.substring(1, __.length() - 1));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3>\u018b\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"
			+ "\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3"
			+ "\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"
			+ "\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\5\b\u0080\n\b\3\b\3\b\7\b\u0084"
			+ "\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u008f\n\t\3\t\5\t"
			+ "\u0092\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3"
			+ "\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00ac\n"
			+ "\f\f\f\16\f\u00af\13\f\3\f\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13"
			+ "\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c7"
			+ "\n\r\f\r\16\r\u00ca\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16"
			+ "\u00d5\n\16\f\16\16\16\u00d8\13\16\3\16\5\16\u00db\n\16\3\16\3\16\3\17"
			+ "\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\20\3\20\3\21\3\21"
			+ "\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00f3\n\22\3\22\3\22\3\23\3\23\3\23"
			+ "\5\23\u00fa\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0101\n\23\3\24\3\24\3"
			+ "\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010c\n\24\3\25\3\25\3\25\3\25"
			+ "\3\25\3\25\5\25\u0114\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"
			+ "\3\31\3\31\3\31\3\31\3\31\5\31\u0124\n\31\3\31\3\31\3\31\3\31\5\31\u012a"
			+ "\n\31\7\31\u012c\n\31\f\31\16\31\u012f\13\31\3\31\3\31\5\31\u0133\n\31"
			+ "\3\32\3\32\3\32\3\32\5\32\u0139\n\32\3\32\3\32\3\32\5\32\u013e\n\32\5"
			+ "\32\u0140\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0147\n\33\3\34\3\34\3\34"
			+ "\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0152\n\35\3\36\3\36\3\36\3\36\3\36"
			+ "\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0162\n\36\3\36\3\36"
			+ "\3\36\3\36\5\36\u0168\n\36\3\36\3\36\3\36\5\36\u016d\n\36\3\37\3\37\3"
			+ "\37\3\37\3\37\5\37\u0174\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"
			+ "$\3$\3$\3%\3%\3%\3&\3&\3&\3&\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"
			+ " \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\29>\4\2\4\4\27\27\4\2.\60\63\63"
			+ "\u0197\2Q\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bd\3\2\2\2\ni\3\2\2\2\fm\3\2\2"
			+ "\2\16q\3\2\2\2\20\u008b\3\2\2\2\22\u0093\3\2\2\2\24\u00a0\3\2\2\2\26\u00a7"
			+ "\3\2\2\2\30\u00be\3\2\2\2\32\u00ce\3\2\2\2\34\u00de\3\2\2\2\36\u00e2\3"
			+ "\2\2\2 \u00ea\3\2\2\2\"\u00ef\3\2\2\2$\u0100\3\2\2\2&\u010b\3\2\2\2(\u0113"
			+ "\3\2\2\2*\u0115\3\2\2\2,\u0117\3\2\2\2.\u0119\3\2\2\2\60\u0132\3\2\2\2"
			+ "\62\u013f\3\2\2\2\64\u0146\3\2\2\2\66\u0148\3\2\2\28\u0151\3\2\2\2:\u016c"
			+ "\3\2\2\2<\u0173\3\2\2\2>\u0175\3\2\2\2@\u0178\3\2\2\2B\u017b\3\2\2\2D"
			+ "\u017e\3\2\2\2F\u0181\3\2\2\2H\u0184\3\2\2\2J\u0187\3\2\2\2LM\5\4\3\2"
			+ "MN\7)\2\2NP\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2"
			+ "SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2V`\5\6\4\2W`\5\b\5\2X`\5\n\6\2Y`\5\f\7"
			+ "\2Z`\5\16\b\2[`\5\26\f\2\\`\5\30\r\2]`\5\32\16\2^`\5\36\20\2_V\3\2\2\2"
			+ "_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2"
			+ "\2_^\3\2\2\2`\5\3\2\2\2ab\7\37\2\2bc\5D#\2c\7\3\2\2\2de\7\n\2\2ef\7\35"
			+ "\2\2fg\5@!\2gh\b\5\1\2h\t\3\2\2\2ij\7\n\2\2jk\5D#\2kl\b\6\1\2l\13\3\2"
			+ "\2\2mn\7\6\2\2no\5D#\2op\b\7\1\2p\r\3\2\2\2qr\7\6\2\2rs\7\35\2\2st\5@"
			+ "!\2tu\7+\2\2uz\5\20\t\2vw\7-\2\2wy\5\20\t\2xv\3\2\2\2y|\3\2\2\2zx\3\2"
			+ "\2\2z{\3\2\2\2{\177\3\2\2\2|z\3\2\2\2}~\7-\2\2~\u0080\5\22\n\2\177}\3"
			+ "\2\2\2\177\u0080\3\2\2\2\u0080\u0085\3\2\2\2\u0081\u0082\7-\2\2\u0082"
			+ "\u0084\5\24\13\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"
			+ "\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"
			+ "\u0089\7,\2\2\u0089\u008a\b\b\1\2\u008a\17\3\2\2\2\u008b\u008c\5<\37\2"
			+ "\u008c\u0091\5(\25\2\u008d\u008f\7\24\2\2\u008e\u008d\3\2\2\2\u008e\u008f"
			+ "\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\25\2\2\u0091\u008e\3\2\2\2"
			+ "\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7\30\2\2\u0094\u0095"
			+ "\7\23\2\2\u0095\u0096\7+\2\2\u0096\u009b\5<\37\2\u0097\u0098\7-\2\2\u0098"
			+ "\u009a\5<\37\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"
			+ "\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"
			+ "\u009f\7,\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7\23\2"
			+ "\2\u00a2\u00a3\5<\37\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\5@!\2\u00a5\u00a6"
			+ "\5<\37\2\u00a6\25\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00ad\5$\23\2\u00a9"
			+ "\u00aa\7-\2\2\u00aa\u00ac\5$\23\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2"
			+ "\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"
			+ "\u00ad\3\2\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b6\5\"\22\2\u00b2\u00b3\7"
			+ "-\2\2\u00b3\u00b5\5\"\22\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"
			+ "\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"
			+ "\2\2\u00b9\u00bb\5 \21\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"
			+ "\u00bc\3\2\2\2\u00bc\u00bd\b\f\1\2\u00bd\27\3\2\2\2\u00be\u00bf\7\20\2"
			+ "\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7 \2\2\u00c2"
			+ "\u00c3\7+\2\2\u00c3\u00c8\5&\24\2\u00c4\u00c5\7-\2\2\u00c5\u00c7\5&\24"
			+ "\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"
			+ "\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7,\2\2\u00cc"
			+ "\u00cd\b\r\1\2\u00cd\31\3\2\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\5@!\2"
			+ "\u00d0\u00d1\7\33\2\2\u00d1\u00d6\5\34\17\2\u00d2\u00d3\7-\2\2\u00d3\u00d5"
			+ "\5\34\17\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2"
			+ "\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db"
			+ "\5 \21\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"
			+ "\u00dd\b\16\1\2\u00dd\33\3\2\2\2\u00de\u00df\5$\23\2\u00df\u00e0\7=\2"
			+ "\2\u00e0\u00e1\5:\36\2\u00e1\35\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4"
			+ "\7\r\2\2\u00e4\u00e6\5\"\22\2\u00e5\u00e7\5 \21\2\u00e6\u00e5\3\2\2\2"
			+ "\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\20\1\2\u00e9\37"
			+ "\3\2\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ec\5:\36\2\u00ec\u00ed\3\2\2\2\u00ed"
			+ "\u00ee\b\21\1\2\u00ee!\3\2\2\2\u00ef\u00f2\5@!\2\u00f0\u00f1\7\5\2\2\u00f1"
			+ "\u00f3\5B\"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"
			+ "\2\2\u00f4\u00f5\b\22\1\2\u00f5#\3\2\2\2\u00f6\u00f9\5<\37\2\u00f7\u00f8"
			+ "\7\5\2\2\u00f8\u00fa\5> \2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"
			+ "\u0101\3\2\2\2\u00fb\u00fc\5\64\33\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe\5"
			+ "> \2\u00fe\u0101\3\2\2\2\u00ff\u0101\7.\2\2\u0100\u00f6\3\2\2\2\u0100"
			+ "\u00fb\3\2\2\2\u0100\u00ff\3\2\2\2\u0101%\3\2\2\2\u0102\u0103\5F$\2\u0103"
			+ "\u0104\b\24\1\2\u0104\u010c\3\2\2\2\u0105\u0106\5H%\2\u0106\u0107\b\24"
			+ "\1\2\u0107\u010c\3\2\2\2\u0108\u0109\5J&\2\u0109\u010a\b\24\1\2\u010a"
			+ "\u010c\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3\2"
			+ "\2\2\u010c\'\3\2\2\2\u010d\u010e\7\21\2\2\u010e\u0114\b\25\1\2\u010f\u0110"
			+ "\7\t\2\2\u0110\u0114\b\25\1\2\u0111\u0112\7\34\2\2\u0112\u0114\b\25\1"
			+ "\2\u0113\u010d\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114)"
			+ "\3\2\2\2\u0115\u0116\t\2\2\2\u0116+\3\2\2\2\u0117\u0118\t\3\2\2\u0118"
			+ "-\3\2\2\2\u0119\u011a\t\4\2\2\u011a/\3\2\2\2\u011b\u011c\7+\2\2\u011c"
			+ "\u011d\5\26\f\2\u011d\u011e\7,\2\2\u011e\u0133\3\2\2\2\u011f\u0123\7+"
			+ "\2\2\u0120\u0124\5F$\2\u0121\u0124\5H%\2\u0122\u0124\5J&\2\u0123\u0120"
			+ "\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u012d\3\2\2\2\u0125"
			+ "\u0129\7-\2\2\u0126\u012a\5F$\2\u0127\u012a\5H%\2\u0128\u012a\5J&\2\u0129"
			+ "\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012c\3\2"
			+ "\2\2\u012b\u0125\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"
			+ "\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,"
			+ "\2\2\u0131\u0133\3\2\2\2\u0132\u011b\3\2\2\2\u0132\u011f\3\2\2\2\u0133"
			+ "\61\3\2\2\2\u0134\u0140\5<\37\2\u0135\u0140\5&\24\2\u0136\u0139\5&\24"
			+ "\2\u0137\u0139\5<\37\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a"
			+ "\3\2\2\2\u013a\u013d\5.\30\2\u013b\u013e\5&\24\2\u013c\u013e\5<\37\2\u013d"
			+ "\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0134\3\2"
			+ "\2\2\u013f\u0135\3\2\2\2\u013f\u0138\3\2\2\2\u0140\63\3\2\2\2\u0141\u0147"
			+ "\5\62\32\2\u0142\u0143\5\62\32\2\u0143\u0144\5.\30\2\u0144\u0145\5\62"
			+ "\32\2\u0145\u0147\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0147"
			+ "\65\3\2\2\2\u0148\u0149\5\64\33\2\u0149\u014a\5*\26\2\u014a\u014b\5\64"
			+ "\33\2\u014b\67\3\2\2\2\u014c\u0152\5\66\34\2\u014d\u014e\5\66\34\2\u014e"
			+ "\u014f\5,\27\2\u014f\u0150\5\66\34\2\u0150\u0152\3\2\2\2\u0151\u014c\3"
			+ "\2\2\2\u0151\u014d\3\2\2\2\u01529\3\2\2\2\u0153\u016d\5\64\33\2\u0154"
			+ "\u0155\5\64\33\2\u0155\u0156\5.\30\2\u0156\u0157\5\64\33\2\u0157\u016d"
			+ "\3\2\2\2\u0158\u0159\5\64\33\2\u0159\u015a\5*\26\2\u015a\u015b\5\64\33"
			+ "\2\u015b\u016d\3\2\2\2\u015c\u015d\58\35\2\u015d\u015e\5,\27\2\u015e\u015f"
			+ "\58\35\2\u015f\u016d\3\2\2\2\u0160\u0162\7\24\2\2\u0161\u0160\3\2\2\2"
			+ "\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\13\2\2\u0164\u016d"
			+ "\5\60\31\2\u0165\u0167\5\64\33\2\u0166\u0168\7\24\2\2\u0167\u0166\3\2"
			+ "\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\17\2\2\u016a"
			+ "\u016b\5\60\31\2\u016b\u016d\3\2\2\2\u016c\u0153\3\2\2\2\u016c\u0154\3"
			+ "\2\2\2\u016c\u0158\3\2\2\2\u016c\u015c\3\2\2\2\u016c\u0161\3\2\2\2\u016c"
			+ "\u0165\3\2\2\2\u016d;\3\2\2\2\u016e\u016f\7\"\2\2\u016f\u0174\b\37\1\2"
			+ "\u0170\u0171\7\"\2\2\u0171\u0172\7*\2\2\u0172\u0174\7\"\2\2\u0173\u016e"
			+ "\3\2\2\2\u0173\u0170\3\2\2\2\u0174=\3\2\2\2\u0175\u0176\7\"\2\2\u0176"
			+ "\u0177\b \1\2\u0177?\3\2\2\2\u0178\u0179\7\"\2\2\u0179\u017a\b!\1\2\u017a"
			+ "A\3\2\2\2\u017b\u017c\7\"\2\2\u017c\u017d\b\"\1\2\u017dC\3\2\2\2\u017e"
			+ "\u017f\7\"\2\2\u017f\u0180\b#\1\2\u0180E\3\2\2\2\u0181\u0182\7#\2\2\u0182"
			+ "\u0183\b$\1\2\u0183G\3\2\2\2\u0184\u0185\7$\2\2\u0185\u0186\b%\1\2\u0186"
			+ "I\3\2\2\2\u0187\u0188\7%\2\2\u0188\u0189\b&\1\2\u0189K\3\2\2\2#Q_z\177"
			+ "\u0085\u008e\u0091\u009b\u00ad\u00b6\u00ba\u00c8\u00d6\u00da\u00e6\u00f2"
			+ "\u00f9\u0100\u010b\u0113\u0123\u0129\u012d\u0132\u0138\u013d\u013f\u0146"
			+ "\u0151\u0161\u0167\u016c\u0173";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}