// Generated from D:\CodeWork\Mini-DBMS\MySql\src\DBMS\parser\sql.g4 by ANTLR 4.1
package DBMS.parser;

import java.util.*;
import DBMS.execute.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqlLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"KEY_ALTER", "KEY_AND", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE", 
		"KEY_DOUBLE", "KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", "KEY_IF", 
		"KEY_IN", "KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", "KEY_NULL", 
		"KEY_ON", "KEY_OR", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", "KEY_SET", 
		"KEY_STRING", "KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE", 
		"IDENTIFIER", "INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "';'", "'.'", "'('", "')'", "','", "'*'", 
		"'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", 
		"'<'", "'<='", "'>'", "'>='", "'='", "'<>'"
	};
	public static final String[] ruleNames = {
		"KEY_ALTER", "KEY_AND", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE", 
		"KEY_DOUBLE", "KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", "KEY_IF", 
		"KEY_IN", "KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", "KEY_NULL", 
		"KEY_ON", "KEY_OR", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", "KEY_SET", 
		"KEY_STRING", "KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE", 
		"IDENTIFIER", "INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES", "DIGIT", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", 
		"GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ"
	};


	public sqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35: SINGLE_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 36: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 37: SPACES_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void SINGLE_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void SPACES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2>\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\7"+
		"!\u0164\n!\f!\16!\u0167\13!\3\"\6\"\u016a\n\"\r\"\16\"\u016b\3#\6#\u016f"+
		"\n#\r#\16#\u0170\3#\3#\7#\u0175\n#\f#\16#\u0178\13#\5#\u017a\n#\3#\7#"+
		"\u017d\n#\f#\16#\u0180\13#\3#\3#\6#\u0184\n#\r#\16#\u0185\5#\u0188\n#"+
		"\3$\3$\7$\u018c\n$\f$\16$\u018f\13$\3$\3$\3%\3%\3%\3%\7%\u0197\n%\f%\16"+
		"%\u019a\13%\3%\3%\3&\3&\3&\3&\7&\u01a2\n&\f&\16&\u01a5\13&\3&\3&\3&\5"+
		"&\u01aa\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3"+
		"U\3U\3V\3V\3V\3W\3W\3X\3X\3X\3\u01a3Y\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\2K\'\3M(\4O\2\1Q"+
		"\2\1S\2\1U\2\1W\2\1Y\2\1[\2\1]\2\1_\2\1a\2\1c\2\1e\2\1g\2\1i\2\1k\2\1"+
		"m\2\1o\2\1q\2\1s\2\1u\2\1w\2\1y\2\1{\2\1}\2\1\177\2\1\u0081\2\1\u0083"+
		"\2\1\u0085)\1\u0087*\1\u0089+\1\u008b,\1\u008d-\1\u008f.\1\u0091/\1\u0093"+
		"\60\1\u0095\61\1\u0097\62\1\u0099\63\1\u009b\64\1\u009d\65\1\u009f\66"+
		"\1\u00a1\67\1\u00a38\1\u00a59\1\u00a7:\1\u00a9;\1\u00ab<\1\u00ad=\1\u00af"+
		">\1\3\2#\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\2\b\2%.\60>@\\``b|\u0080"+
		"\u0080\4\2\f\f\17\17\5\2\13\r\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FF"+
		"ff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u0209\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2"+
		"\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\3\u00b1\3\2\2\2\5\u00b7\3\2\2\2\7\u00bb\3\2\2\2\t\u00be\3\2\2"+
		"\2\13\u00c5\3\2\2\2\r\u00ce\3\2\2\2\17\u00d5\3\2\2\2\21\u00dc\3\2\2\2"+
		"\23\u00e1\3\2\2\2\25\u00e8\3\2\2\2\27\u00f0\3\2\2\2\31\u00f5\3\2\2\2\33"+
		"\u00f8\3\2\2\2\35\u00fb\3\2\2\2\37\u0102\3\2\2\2!\u0106\3\2\2\2#\u010b"+
		"\3\2\2\2%\u010f\3\2\2\2\'\u0113\3\2\2\2)\u0118\3\2\2\2+\u011b\3\2\2\2"+
		"-\u011e\3\2\2\2/\u0126\3\2\2\2\61\u0131\3\2\2\2\63\u0138\3\2\2\2\65\u013c"+
		"\3\2\2\2\67\u0143\3\2\2\29\u0149\3\2\2\2;\u0150\3\2\2\2=\u0154\3\2\2\2"+
		"?\u015b\3\2\2\2A\u0161\3\2\2\2C\u0169\3\2\2\2E\u0187\3\2\2\2G\u0189\3"+
		"\2\2\2I\u0192\3\2\2\2K\u019d\3\2\2\2M\u01ad\3\2\2\2O\u01b1\3\2\2\2Q\u01b3"+
		"\3\2\2\2S\u01b5\3\2\2\2U\u01b7\3\2\2\2W\u01b9\3\2\2\2Y\u01bb\3\2\2\2["+
		"\u01bd\3\2\2\2]\u01bf\3\2\2\2_\u01c1\3\2\2\2a\u01c3\3\2\2\2c\u01c5\3\2"+
		"\2\2e\u01c7\3\2\2\2g\u01c9\3\2\2\2i\u01cb\3\2\2\2k\u01cd\3\2\2\2m\u01cf"+
		"\3\2\2\2o\u01d1\3\2\2\2q\u01d3\3\2\2\2s\u01d5\3\2\2\2u\u01d7\3\2\2\2w"+
		"\u01d9\3\2\2\2y\u01db\3\2\2\2{\u01dd\3\2\2\2}\u01df\3\2\2\2\177\u01e1"+
		"\3\2\2\2\u0081\u01e3\3\2\2\2\u0083\u01e5\3\2\2\2\u0085\u01e7\3\2\2\2\u0087"+
		"\u01e9\3\2\2\2\u0089\u01eb\3\2\2\2\u008b\u01ed\3\2\2\2\u008d\u01ef\3\2"+
		"\2\2\u008f\u01f1\3\2\2\2\u0091\u01f3\3\2\2\2\u0093\u01f5\3\2\2\2\u0095"+
		"\u01f7\3\2\2\2\u0097\u01f9\3\2\2\2\u0099\u01fc\3\2\2\2\u009b\u01fe\3\2"+
		"\2\2\u009d\u0200\3\2\2\2\u009f\u0203\3\2\2\2\u00a1\u0206\3\2\2\2\u00a3"+
		"\u0208\3\2\2\2\u00a5\u020a\3\2\2\2\u00a7\u020c\3\2\2\2\u00a9\u020f\3\2"+
		"\2\2\u00ab\u0211\3\2\2\2\u00ad\u0214\3\2\2\2\u00af\u0216\3\2\2\2\u00b1"+
		"\u00b2\5Q)\2\u00b2\u00b3\5g\64\2\u00b3\u00b4\5w<\2\u00b4\u00b5\5Y-\2\u00b5"+
		"\u00b6\5s:\2\u00b6\4\3\2\2\2\u00b7\u00b8\5Q)\2\u00b8\u00b9\5k\66\2\u00b9"+
		"\u00ba\5W,\2\u00ba\6\3\2\2\2\u00bb\u00bc\5Q)\2\u00bc\u00bd\5u;\2\u00bd"+
		"\b\3\2\2\2\u00be\u00bf\5U+\2\u00bf\u00c0\5s:\2\u00c0\u00c1\5Y-\2\u00c1"+
		"\u00c2\5Q)\2\u00c2\u00c3\5w<\2\u00c3\u00c4\5Y-\2\u00c4\n\3\2\2\2\u00c5"+
		"\u00c6\5W,\2\u00c6\u00c7\5Q)\2\u00c7\u00c8\5w<\2\u00c8\u00c9\5Q)\2\u00c9"+
		"\u00ca\5S*\2\u00ca\u00cb\5Q)\2\u00cb\u00cc\5u;\2\u00cc\u00cd\5Y-\2\u00cd"+
		"\f\3\2\2\2\u00ce\u00cf\5W,\2\u00cf\u00d0\5Y-\2\u00d0\u00d1\5g\64\2\u00d1"+
		"\u00d2\5Y-\2\u00d2\u00d3\5w<\2\u00d3\u00d4\5Y-\2\u00d4\16\3\2\2\2\u00d5"+
		"\u00d6\5W,\2\u00d6\u00d7\5m\67\2\u00d7\u00d8\5y=\2\u00d8\u00d9\5S*\2\u00d9"+
		"\u00da\5g\64\2\u00da\u00db\5Y-\2\u00db\20\3\2\2\2\u00dc\u00dd\5W,\2\u00dd"+
		"\u00de\5s:\2\u00de\u00df\5m\67\2\u00df\u00e0\5o8\2\u00e0\22\3\2\2\2\u00e1"+
		"\u00e2\5Y-\2\u00e2\u00e3\5\177@\2\u00e3\u00e4\5a\61\2\u00e4\u00e5\5u;"+
		"\2\u00e5\u00e6\5w<\2\u00e6\u00e7\5u;\2\u00e7\24\3\2\2\2\u00e8\u00e9\5"+
		"[.\2\u00e9\u00ea\5m\67\2\u00ea\u00eb\5s:\2\u00eb\u00ec\5Y-\2\u00ec\u00ed"+
		"\5a\61\2\u00ed\u00ee\5]/\2\u00ee\u00ef\5k\66\2\u00ef\26\3\2\2\2\u00f0"+
		"\u00f1\5[.\2\u00f1\u00f2\5s:\2\u00f2\u00f3\5m\67\2\u00f3\u00f4\5i\65\2"+
		"\u00f4\30\3\2\2\2\u00f5\u00f6\5a\61\2\u00f6\u00f7\5[.\2\u00f7\32\3\2\2"+
		"\2\u00f8\u00f9\5a\61\2\u00f9\u00fa\5k\66\2\u00fa\34\3\2\2\2\u00fb\u00fc"+
		"\5a\61\2\u00fc\u00fd\5k\66\2\u00fd\u00fe\5u;\2\u00fe\u00ff\5Y-\2\u00ff"+
		"\u0100\5s:\2\u0100\u0101\5w<\2\u0101\36\3\2\2\2\u0102\u0103\5a\61\2\u0103"+
		"\u0104\5k\66\2\u0104\u0105\5w<\2\u0105 \3\2\2\2\u0106\u0107\5a\61\2\u0107"+
		"\u0108\5k\66\2\u0108\u0109\5w<\2\u0109\u010a\5m\67\2\u010a\"\3\2\2\2\u010b"+
		"\u010c\5e\63\2\u010c\u010d\5Y-\2\u010d\u010e\5\u0081A\2\u010e$\3\2\2\2"+
		"\u010f\u0110\5k\66\2\u0110\u0111\5m\67\2\u0111\u0112\5w<\2\u0112&\3\2"+
		"\2\2\u0113\u0114\5k\66\2\u0114\u0115\5y=\2\u0115\u0116\5g\64\2\u0116\u0117"+
		"\5g\64\2\u0117(\3\2\2\2\u0118\u0119\5m\67\2\u0119\u011a\5k\66\2\u011a"+
		"*\3\2\2\2\u011b\u011c\5m\67\2\u011c\u011d\5s:\2\u011d,\3\2\2\2\u011e\u011f"+
		"\5o8\2\u011f\u0120\5s:\2\u0120\u0121\5a\61\2\u0121\u0122\5i\65\2\u0122"+
		"\u0123\5Q)\2\u0123\u0124\5s:\2\u0124\u0125\5\u0081A\2\u0125.\3\2\2\2\u0126"+
		"\u0127\5s:\2\u0127\u0128\5Y-\2\u0128\u0129\5[.\2\u0129\u012a\5Y-\2\u012a"+
		"\u012b\5s:\2\u012b\u012c\5Y-\2\u012c\u012d\5k\66\2\u012d\u012e\5U+\2\u012e"+
		"\u012f\5Y-\2\u012f\u0130\5u;\2\u0130\60\3\2\2\2\u0131\u0132\5u;\2\u0132"+
		"\u0133\5Y-\2\u0133\u0134\5g\64\2\u0134\u0135\5Y-\2\u0135\u0136\5U+\2\u0136"+
		"\u0137\5w<\2\u0137\62\3\2\2\2\u0138\u0139\5u;\2\u0139\u013a\5Y-\2\u013a"+
		"\u013b\5w<\2\u013b\64\3\2\2\2\u013c\u013d\5u;\2\u013d\u013e\5w<\2\u013e"+
		"\u013f\5s:\2\u013f\u0140\5a\61\2\u0140\u0141\5k\66\2\u0141\u0142\5]/\2"+
		"\u0142\66\3\2\2\2\u0143\u0144\5w<\2\u0144\u0145\5Q)\2\u0145\u0146\5S*"+
		"\2\u0146\u0147\5g\64\2\u0147\u0148\5Y-\2\u01488\3\2\2\2\u0149\u014a\5"+
		"y=\2\u014a\u014b\5o8\2\u014b\u014c\5W,\2\u014c\u014d\5Q)\2\u014d\u014e"+
		"\5w<\2\u014e\u014f\5Y-\2\u014f:\3\2\2\2\u0150\u0151\5y=\2\u0151\u0152"+
		"\5u;\2\u0152\u0153\5Y-\2\u0153<\3\2\2\2\u0154\u0155\5{>\2\u0155\u0156"+
		"\5Q)\2\u0156\u0157\5g\64\2\u0157\u0158\5y=\2\u0158\u0159\5Y-\2\u0159\u015a"+
		"\5u;\2\u015a>\3\2\2\2\u015b\u015c\5}?\2\u015c\u015d\5_\60\2\u015d\u015e"+
		"\5Y-\2\u015e\u015f\5s:\2\u015f\u0160\5Y-\2\u0160@\3\2\2\2\u0161\u0165"+
		"\t\2\2\2\u0162\u0164\t\3\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166B\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0168\u016a\t\4\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016cD\3\2\2\2\u016d\u016f\t\5\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0179\3\2\2\2\u0172\u0176\7\60\2\2\u0173\u0175\t\4\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u0172\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u0188\3\2\2\2\u017b\u017d\t\4\2\2\u017c\u017b\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\7\60\2\2\u0182\u0184\t"+
		"\4\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u016e\3\2\2\2\u0187\u017e\3\2"+
		"\2\2\u0188F\3\2\2\2\u0189\u018d\7$\2\2\u018a\u018c\t\6\2\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7$\2\2\u0191H\3\2\2\2\u0192"+
		"\u0193\7/\2\2\u0193\u0194\7/\2\2\u0194\u0198\3\2\2\2\u0195\u0197\n\7\2"+
		"\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b%\2\2\u019c"+
		"J\3\2\2\2\u019d\u019e\7\61\2\2\u019e\u019f\7,\2\2\u019f\u01a3\3\2\2\2"+
		"\u01a0\u01a2\13\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a9\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a7\7,\2\2\u01a7\u01aa\7\61\2\2\u01a8\u01aa\7\2\2\3\u01a9\u01a6\3\2"+
		"\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b&\3\2\u01ac"+
		"L\3\2\2\2\u01ad\u01ae\t\b\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\b\'\4\2"+
		"\u01b0N\3\2\2\2\u01b1\u01b2\t\4\2\2\u01b2P\3\2\2\2\u01b3\u01b4\t\t\2\2"+
		"\u01b4R\3\2\2\2\u01b5\u01b6\t\n\2\2\u01b6T\3\2\2\2\u01b7\u01b8\t\13\2"+
		"\2\u01b8V\3\2\2\2\u01b9\u01ba\t\f\2\2\u01baX\3\2\2\2\u01bb\u01bc\t\r\2"+
		"\2\u01bcZ\3\2\2\2\u01bd\u01be\t\16\2\2\u01be\\\3\2\2\2\u01bf\u01c0\t\17"+
		"\2\2\u01c0^\3\2\2\2\u01c1\u01c2\t\20\2\2\u01c2`\3\2\2\2\u01c3\u01c4\t"+
		"\21\2\2\u01c4b\3\2\2\2\u01c5\u01c6\t\22\2\2\u01c6d\3\2\2\2\u01c7\u01c8"+
		"\t\23\2\2\u01c8f\3\2\2\2\u01c9\u01ca\t\24\2\2\u01cah\3\2\2\2\u01cb\u01cc"+
		"\t\25\2\2\u01ccj\3\2\2\2\u01cd\u01ce\t\26\2\2\u01cel\3\2\2\2\u01cf\u01d0"+
		"\t\27\2\2\u01d0n\3\2\2\2\u01d1\u01d2\t\30\2\2\u01d2p\3\2\2\2\u01d3\u01d4"+
		"\t\31\2\2\u01d4r\3\2\2\2\u01d5\u01d6\t\32\2\2\u01d6t\3\2\2\2\u01d7\u01d8"+
		"\t\33\2\2\u01d8v\3\2\2\2\u01d9\u01da\t\34\2\2\u01dax\3\2\2\2\u01db\u01dc"+
		"\t\35\2\2\u01dcz\3\2\2\2\u01dd\u01de\t\36\2\2\u01de|\3\2\2\2\u01df\u01e0"+
		"\t\37\2\2\u01e0~\3\2\2\2\u01e1\u01e2\t \2\2\u01e2\u0080\3\2\2\2\u01e3"+
		"\u01e4\t!\2\2\u01e4\u0082\3\2\2\2\u01e5\u01e6\t\"\2\2\u01e6\u0084\3\2"+
		"\2\2\u01e7\u01e8\7=\2\2\u01e8\u0086\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea"+
		"\u0088\3\2\2\2\u01eb\u01ec\7*\2\2\u01ec\u008a\3\2\2\2\u01ed\u01ee\7+\2"+
		"\2\u01ee\u008c\3\2\2\2\u01ef\u01f0\7.\2\2\u01f0\u008e\3\2\2\2\u01f1\u01f2"+
		"\7,\2\2\u01f2\u0090\3\2\2\2\u01f3\u01f4\7-\2\2\u01f4\u0092\3\2\2\2\u01f5"+
		"\u01f6\7/\2\2\u01f6\u0094\3\2\2\2\u01f7\u01f8\7\u0080\2\2\u01f8\u0096"+
		"\3\2\2\2\u01f9\u01fa\7~\2\2\u01fa\u01fb\7~\2\2\u01fb\u0098\3\2\2\2\u01fc"+
		"\u01fd\7\61\2\2\u01fd\u009a\3\2\2\2\u01fe\u01ff\7\'\2\2\u01ff\u009c\3"+
		"\2\2\2\u0200\u0201\7>\2\2\u0201\u0202\7>\2\2\u0202\u009e\3\2\2\2\u0203"+
		"\u0204\7@\2\2\u0204\u0205\7@\2\2\u0205\u00a0\3\2\2\2\u0206\u0207\7(\2"+
		"\2\u0207\u00a2\3\2\2\2\u0208\u0209\7~\2\2\u0209\u00a4\3\2\2\2\u020a\u020b"+
		"\7>\2\2\u020b\u00a6\3\2\2\2\u020c\u020d\7>\2\2\u020d\u020e\7?\2\2\u020e"+
		"\u00a8\3\2\2\2\u020f\u0210\7@\2\2\u0210\u00aa\3\2\2\2\u0211\u0212\7@\2"+
		"\2\u0212\u0213\7?\2\2\u0213\u00ac\3\2\2\2\u0214\u0215\7?\2\2\u0215\u00ae"+
		"\3\2\2\2\u0216\u0217\7>\2\2\u0217\u0218\7@\2\2\u0218\u00b0\3\2\2\2\17"+
		"\2\u0165\u016b\u0170\u0176\u0179\u017e\u0185\u0187\u018d\u0198\u01a3\u01a9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}