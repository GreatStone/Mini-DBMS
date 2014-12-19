// Generated from D:\CodeWork\DBMS\sql.g4 by ANTLR 4.1
package DBMS.parser;
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"KEY_ALTER", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE", "KEY_DOUBLE", 
		"KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", "KEY_IF", "KEY_IN", 
		"KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", "KEY_NULL", 
		"KEY_ON", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", "KEY_SET", "KEY_STRING", 
		"KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE", "IDENTIFIER", 
		"INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES", "';'", "'.'", "'('", "')'", "','", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'='", "'<>'"
	};
	public static final String[] ruleNames = {
		"KEY_ALTER", "KEY_AS", "KEY_CREATE", "KEY_DATABASE", "KEY_DELETE", "KEY_DOUBLE", 
		"KEY_DROP", "KEY_EXISTS", "KEY_FOREIGN", "KEY_FROM", "KEY_IF", "KEY_IN", 
		"KEY_INSERT", "KEY_INT", "KEY_INTO", "KEY_KEY", "KEY_NOT", "KEY_NULL", 
		"KEY_ON", "KEY_PRIMARY", "KEY_REFERENCES", "KEY_SELECT", "KEY_SET", "KEY_STRING", 
		"KEY_TABLE", "KEY_UPDATE", "KEY_USE", "KEY_VALUES", "KEY_WHERE", "IDENTIFIER", 
		"INTIDENTI", "DOUBLEIDENTI", "STRINGIDENTI", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "STAR", "PLUS", 
		"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
		"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ"
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
		case 33: SINGLE_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 34: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 35: SPACES_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2<\u0205\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0159\n\37\f\37\16\37\u015c\13"+
		"\37\3 \6 \u015f\n \r \16 \u0160\3!\6!\u0164\n!\r!\16!\u0165\3!\3!\5!\u016a"+
		"\n!\3!\7!\u016d\n!\f!\16!\u0170\13!\3!\3!\5!\u0174\n!\3\"\3\"\7\"\u0178"+
		"\n\"\f\"\16\"\u017b\13\"\3\"\3\"\3#\3#\3#\3#\7#\u0183\n#\f#\16#\u0186"+
		"\13#\3#\3#\3$\3$\3$\3$\7$\u018e\n$\f$\16$\u0191\13$\3$\3$\3$\5$\u0196"+
		"\n$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3"+
		"J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3T\3"+
		"T\3T\3U\3U\3V\3V\3V\3\u018fW\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\2G%\3I&\4K\2\1M\2\1O\2\1Q\2\1S\2"+
		"\1U\2\1W\2\1Y\2\1[\2\1]\2\1_\2\1a\2\1c\2\1e\2\1g\2\1i\2\1k\2\1m\2\1o\2"+
		"\1q\2\1s\2\1u\2\1w\2\1y\2\1{\2\1}\2\1\177\2\1\u0081\'\1\u0083(\1\u0085"+
		")\1\u0087*\1\u0089+\1\u008b,\1\u008d-\1\u008f.\1\u0091/\1\u0093\60\1\u0095"+
		"\61\1\u0097\62\1\u0099\63\1\u009b\64\1\u009d\65\1\u009f\66\1\u00a1\67"+
		"\1\u00a38\1\u00a59\1\u00a7:\1\u00a9;\1\u00ab<\1\3\2#\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\2\2\4\2))``\4\2\f\f\17\17\5\2\13\r\17\17\"\"\4\2CCcc"+
		"\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2L"+
		"Lll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u01f3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\3\u00ad\3\2\2\2\5\u00b3\3\2\2\2\7\u00b6\3\2\2\2\t\u00bd\3\2\2"+
		"\2\13\u00c6\3\2\2\2\r\u00cd\3\2\2\2\17\u00d4\3\2\2\2\21\u00d9\3\2\2\2"+
		"\23\u00e0\3\2\2\2\25\u00e8\3\2\2\2\27\u00ed\3\2\2\2\31\u00f0\3\2\2\2\33"+
		"\u00f3\3\2\2\2\35\u00fa\3\2\2\2\37\u00fe\3\2\2\2!\u0103\3\2\2\2#\u0107"+
		"\3\2\2\2%\u010b\3\2\2\2\'\u0110\3\2\2\2)\u0113\3\2\2\2+\u011b\3\2\2\2"+
		"-\u0126\3\2\2\2/\u012d\3\2\2\2\61\u0131\3\2\2\2\63\u0138\3\2\2\2\65\u013e"+
		"\3\2\2\2\67\u0145\3\2\2\29\u0149\3\2\2\2;\u0150\3\2\2\2=\u0156\3\2\2\2"+
		"?\u015e\3\2\2\2A\u0173\3\2\2\2C\u0175\3\2\2\2E\u017e\3\2\2\2G\u0189\3"+
		"\2\2\2I\u0199\3\2\2\2K\u019d\3\2\2\2M\u019f\3\2\2\2O\u01a1\3\2\2\2Q\u01a3"+
		"\3\2\2\2S\u01a5\3\2\2\2U\u01a7\3\2\2\2W\u01a9\3\2\2\2Y\u01ab\3\2\2\2["+
		"\u01ad\3\2\2\2]\u01af\3\2\2\2_\u01b1\3\2\2\2a\u01b3\3\2\2\2c\u01b5\3\2"+
		"\2\2e\u01b7\3\2\2\2g\u01b9\3\2\2\2i\u01bb\3\2\2\2k\u01bd\3\2\2\2m\u01bf"+
		"\3\2\2\2o\u01c1\3\2\2\2q\u01c3\3\2\2\2s\u01c5\3\2\2\2u\u01c7\3\2\2\2w"+
		"\u01c9\3\2\2\2y\u01cb\3\2\2\2{\u01cd\3\2\2\2}\u01cf\3\2\2\2\177\u01d1"+
		"\3\2\2\2\u0081\u01d3\3\2\2\2\u0083\u01d5\3\2\2\2\u0085\u01d7\3\2\2\2\u0087"+
		"\u01d9\3\2\2\2\u0089\u01db\3\2\2\2\u008b\u01dd\3\2\2\2\u008d\u01df\3\2"+
		"\2\2\u008f\u01e1\3\2\2\2\u0091\u01e3\3\2\2\2\u0093\u01e5\3\2\2\2\u0095"+
		"\u01e8\3\2\2\2\u0097\u01ea\3\2\2\2\u0099\u01ec\3\2\2\2\u009b\u01ef\3\2"+
		"\2\2\u009d\u01f2\3\2\2\2\u009f\u01f4\3\2\2\2\u00a1\u01f6\3\2\2\2\u00a3"+
		"\u01f8\3\2\2\2\u00a5\u01fb\3\2\2\2\u00a7\u01fd\3\2\2\2\u00a9\u0200\3\2"+
		"\2\2\u00ab\u0202\3\2\2\2\u00ad\u00ae\5M\'\2\u00ae\u00af\5c\62\2\u00af"+
		"\u00b0\5s:\2\u00b0\u00b1\5U+\2\u00b1\u00b2\5o8\2\u00b2\4\3\2\2\2\u00b3"+
		"\u00b4\5M\'\2\u00b4\u00b5\5q9\2\u00b5\6\3\2\2\2\u00b6\u00b7\5Q)\2\u00b7"+
		"\u00b8\5o8\2\u00b8\u00b9\5U+\2\u00b9\u00ba\5M\'\2\u00ba\u00bb\5s:\2\u00bb"+
		"\u00bc\5U+\2\u00bc\b\3\2\2\2\u00bd\u00be\5S*\2\u00be\u00bf\5M\'\2\u00bf"+
		"\u00c0\5s:\2\u00c0\u00c1\5M\'\2\u00c1\u00c2\5O(\2\u00c2\u00c3\5M\'\2\u00c3"+
		"\u00c4\5q9\2\u00c4\u00c5\5U+\2\u00c5\n\3\2\2\2\u00c6\u00c7\5S*\2\u00c7"+
		"\u00c8\5U+\2\u00c8\u00c9\5c\62\2\u00c9\u00ca\5U+\2\u00ca\u00cb\5s:\2\u00cb"+
		"\u00cc\5U+\2\u00cc\f\3\2\2\2\u00cd\u00ce\5S*\2\u00ce\u00cf\5i\65\2\u00cf"+
		"\u00d0\5u;\2\u00d0\u00d1\5O(\2\u00d1\u00d2\5c\62\2\u00d2\u00d3\5U+\2\u00d3"+
		"\16\3\2\2\2\u00d4\u00d5\5S*\2\u00d5\u00d6\5o8\2\u00d6\u00d7\5i\65\2\u00d7"+
		"\u00d8\5k\66\2\u00d8\20\3\2\2\2\u00d9\u00da\5U+\2\u00da\u00db\5{>\2\u00db"+
		"\u00dc\5]/\2\u00dc\u00dd\5q9\2\u00dd\u00de\5s:\2\u00de\u00df\5q9\2\u00df"+
		"\22\3\2\2\2\u00e0\u00e1\5W,\2\u00e1\u00e2\5i\65\2\u00e2\u00e3\5o8\2\u00e3"+
		"\u00e4\5U+\2\u00e4\u00e5\5]/\2\u00e5\u00e6\5Y-\2\u00e6\u00e7\5g\64\2\u00e7"+
		"\24\3\2\2\2\u00e8\u00e9\5W,\2\u00e9\u00ea\5o8\2\u00ea\u00eb\5i\65\2\u00eb"+
		"\u00ec\5e\63\2\u00ec\26\3\2\2\2\u00ed\u00ee\5]/\2\u00ee\u00ef\5W,\2\u00ef"+
		"\30\3\2\2\2\u00f0\u00f1\5]/\2\u00f1\u00f2\5g\64\2\u00f2\32\3\2\2\2\u00f3"+
		"\u00f4\5]/\2\u00f4\u00f5\5g\64\2\u00f5\u00f6\5q9\2\u00f6\u00f7\5U+\2\u00f7"+
		"\u00f8\5o8\2\u00f8\u00f9\5s:\2\u00f9\34\3\2\2\2\u00fa\u00fb\5]/\2\u00fb"+
		"\u00fc\5g\64\2\u00fc\u00fd\5s:\2\u00fd\36\3\2\2\2\u00fe\u00ff\5]/\2\u00ff"+
		"\u0100\5g\64\2\u0100\u0101\5s:\2\u0101\u0102\5i\65\2\u0102 \3\2\2\2\u0103"+
		"\u0104\5a\61\2\u0104\u0105\5U+\2\u0105\u0106\5}?\2\u0106\"\3\2\2\2\u0107"+
		"\u0108\5g\64\2\u0108\u0109\5i\65\2\u0109\u010a\5s:\2\u010a$\3\2\2\2\u010b"+
		"\u010c\5g\64\2\u010c\u010d\5u;\2\u010d\u010e\5c\62\2\u010e\u010f\5c\62"+
		"\2\u010f&\3\2\2\2\u0110\u0111\5i\65\2\u0111\u0112\5g\64\2\u0112(\3\2\2"+
		"\2\u0113\u0114\5k\66\2\u0114\u0115\5o8\2\u0115\u0116\5]/\2\u0116\u0117"+
		"\5e\63\2\u0117\u0118\5M\'\2\u0118\u0119\5o8\2\u0119\u011a\5}?\2\u011a"+
		"*\3\2\2\2\u011b\u011c\5o8\2\u011c\u011d\5U+\2\u011d\u011e\5W,\2\u011e"+
		"\u011f\5U+\2\u011f\u0120\5o8\2\u0120\u0121\5U+\2\u0121\u0122\5g\64\2\u0122"+
		"\u0123\5Q)\2\u0123\u0124\5U+\2\u0124\u0125\5q9\2\u0125,\3\2\2\2\u0126"+
		"\u0127\5q9\2\u0127\u0128\5U+\2\u0128\u0129\5c\62\2\u0129\u012a\5U+\2\u012a"+
		"\u012b\5Q)\2\u012b\u012c\5s:\2\u012c.\3\2\2\2\u012d\u012e\5q9\2\u012e"+
		"\u012f\5U+\2\u012f\u0130\5s:\2\u0130\60\3\2\2\2\u0131\u0132\5q9\2\u0132"+
		"\u0133\5s:\2\u0133\u0134\5o8\2\u0134\u0135\5]/\2\u0135\u0136\5g\64\2\u0136"+
		"\u0137\5Y-\2\u0137\62\3\2\2\2\u0138\u0139\5s:\2\u0139\u013a\5M\'\2\u013a"+
		"\u013b\5O(\2\u013b\u013c\5c\62\2\u013c\u013d\5U+\2\u013d\64\3\2\2\2\u013e"+
		"\u013f\5u;\2\u013f\u0140\5k\66\2\u0140\u0141\5S*\2\u0141\u0142\5M\'\2"+
		"\u0142\u0143\5s:\2\u0143\u0144\5U+\2\u0144\66\3\2\2\2\u0145\u0146\5u;"+
		"\2\u0146\u0147\5q9\2\u0147\u0148\5U+\2\u01488\3\2\2\2\u0149\u014a\5w<"+
		"\2\u014a\u014b\5M\'\2\u014b\u014c\5c\62\2\u014c\u014d\5u;\2\u014d\u014e"+
		"\5U+\2\u014e\u014f\5q9\2\u014f:\3\2\2\2\u0150\u0151\5y=\2\u0151\u0152"+
		"\5[.\2\u0152\u0153\5U+\2\u0153\u0154\5o8\2\u0154\u0155\5U+\2\u0155<\3"+
		"\2\2\2\u0156\u015a\t\2\2\2\u0157\u0159\t\3\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b>\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015d\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161@\3\2\2\2\u0162"+
		"\u0164\t\5\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0168\7\60\2\2\u0168"+
		"\u016a\t\4\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0174\3\2"+
		"\2\2\u016b\u016d\t\4\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\7\60\2\2\u0172\u0174\t\4\2\2\u0173\u0163\3\2\2\2\u0173"+
		"\u016e\3\2\2\2\u0174B\3\2\2\2\u0175\u0179\7)\2\2\u0176\u0178\t\6\2\2\u0177"+
		"\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7)\2\2\u017d"+
		"D\3\2\2\2\u017e\u017f\7/\2\2\u017f\u0180\7/\2\2\u0180\u0184\3\2\2\2\u0181"+
		"\u0183\n\7\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\b#\2\2\u0188F\3\2\2\2\u0189\u018a\7\61\2\2\u018a\u018b\7,\2\2\u018b"+
		"\u018f\3\2\2\2\u018c\u018e\13\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0195\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0193\7,\2\2\u0193\u0196\7\61\2\2\u0194\u0196\7\2"+
		"\2\3\u0195\u0192\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\b$\3\2\u0198H\3\2\2\2\u0199\u019a\t\b\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\b%\4\2\u019cJ\3\2\2\2\u019d\u019e\t\4\2\2\u019eL\3\2\2\2\u019f"+
		"\u01a0\t\t\2\2\u01a0N\3\2\2\2\u01a1\u01a2\t\n\2\2\u01a2P\3\2\2\2\u01a3"+
		"\u01a4\t\13\2\2\u01a4R\3\2\2\2\u01a5\u01a6\t\f\2\2\u01a6T\3\2\2\2\u01a7"+
		"\u01a8\t\r\2\2\u01a8V\3\2\2\2\u01a9\u01aa\t\16\2\2\u01aaX\3\2\2\2\u01ab"+
		"\u01ac\t\17\2\2\u01acZ\3\2\2\2\u01ad\u01ae\t\20\2\2\u01ae\\\3\2\2\2\u01af"+
		"\u01b0\t\21\2\2\u01b0^\3\2\2\2\u01b1\u01b2\t\22\2\2\u01b2`\3\2\2\2\u01b3"+
		"\u01b4\t\23\2\2\u01b4b\3\2\2\2\u01b5\u01b6\t\24\2\2\u01b6d\3\2\2\2\u01b7"+
		"\u01b8\t\25\2\2\u01b8f\3\2\2\2\u01b9\u01ba\t\26\2\2\u01bah\3\2\2\2\u01bb"+
		"\u01bc\t\27\2\2\u01bcj\3\2\2\2\u01bd\u01be\t\30\2\2\u01bel\3\2\2\2\u01bf"+
		"\u01c0\t\31\2\2\u01c0n\3\2\2\2\u01c1\u01c2\t\32\2\2\u01c2p\3\2\2\2\u01c3"+
		"\u01c4\t\33\2\2\u01c4r\3\2\2\2\u01c5\u01c6\t\34\2\2\u01c6t\3\2\2\2\u01c7"+
		"\u01c8\t\35\2\2\u01c8v\3\2\2\2\u01c9\u01ca\t\36\2\2\u01cax\3\2\2\2\u01cb"+
		"\u01cc\t\37\2\2\u01ccz\3\2\2\2\u01cd\u01ce\t \2\2\u01ce|\3\2\2\2\u01cf"+
		"\u01d0\t!\2\2\u01d0~\3\2\2\2\u01d1\u01d2\t\"\2\2\u01d2\u0080\3\2\2\2\u01d3"+
		"\u01d4\7=\2\2\u01d4\u0082\3\2\2\2\u01d5\u01d6\7\60\2\2\u01d6\u0084\3\2"+
		"\2\2\u01d7\u01d8\7*\2\2\u01d8\u0086\3\2\2\2\u01d9\u01da\7+\2\2\u01da\u0088"+
		"\3\2\2\2\u01db\u01dc\7.\2\2\u01dc\u008a\3\2\2\2\u01dd\u01de\7,\2\2\u01de"+
		"\u008c\3\2\2\2\u01df\u01e0\7-\2\2\u01e0\u008e\3\2\2\2\u01e1\u01e2\7/\2"+
		"\2\u01e2\u0090\3\2\2\2\u01e3\u01e4\7\u0080\2\2\u01e4\u0092\3\2\2\2\u01e5"+
		"\u01e6\7~\2\2\u01e6\u01e7\7~\2\2\u01e7\u0094\3\2\2\2\u01e8\u01e9\7\61"+
		"\2\2\u01e9\u0096\3\2\2\2\u01ea\u01eb\7\'\2\2\u01eb\u0098\3\2\2\2\u01ec"+
		"\u01ed\7>\2\2\u01ed\u01ee\7>\2\2\u01ee\u009a\3\2\2\2\u01ef\u01f0\7@\2"+
		"\2\u01f0\u01f1\7@\2\2\u01f1\u009c\3\2\2\2\u01f2\u01f3\7(\2\2\u01f3\u009e"+
		"\3\2\2\2\u01f4\u01f5\7~\2\2\u01f5\u00a0\3\2\2\2\u01f6\u01f7\7>\2\2\u01f7"+
		"\u00a2\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9\u01fa\7?\2\2\u01fa\u00a4\3\2\2"+
		"\2\u01fb\u01fc\7@\2\2\u01fc\u00a6\3\2\2\2\u01fd\u01fe\7@\2\2\u01fe\u01ff"+
		"\7?\2\2\u01ff\u00a8\3\2\2\2\u0200\u0201\7?\2\2\u0201\u00aa\3\2\2\2\u0202"+
		"\u0203\7>\2\2\u0203\u0204\7@\2\2\u0204\u00ac\3\2\2\2\r\2\u015a\u0160\u0165"+
		"\u0169\u016e\u0173\u0179\u0184\u018f\u0195";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}