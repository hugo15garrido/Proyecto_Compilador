// Generated from Decaf.g by ANTLR 4.0

	package compiler.scanner;
	import compiler.lib.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLICATION=3, DIVISION=4, NUMBER=5, SEMICOLON=6, 
		WHITESPACE=7, COMMENT=8, HEXADECIMAL=9, EQUALS=10, ASSIGNATION=11, OPENPAREN=12, 
		CLOSEDPAREN=13, OPENBRACE=14, OR=15, OPENTHING=16, CLOSEDTHING=17, COLON=18, 
		MOD=19, CLOSEDBRACE=20, GREATERTHAN=21, GREATEROREQUALTO=22, PLUSEQUAL=23, 
		NOTEQUAL=24, AND=25, NOT=26, LESSTHAN=27, LESSOREQUAL=28, OPENBRACKET=29, 
		CLOSEDBRACKET=30, GREATERTHANOREQUALTO=31, LESSTHANOREQUALTO=32, BOOLEAN=33, 
		BOOLEANN=34, BREAK=35, CALLOUT=36, CLASS=37, PROGRAM=38, CONTINUE=39, 
		ELSE=40, FOR=41, SLL=42, SRL=43, IF=44, INT=45, RETURN=46, VOID=47, SINGLECHAR=48, 
		STRING=49, IDENTIFIER=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "'-'", "'*'", "'/'", "NUMBER", "';'", "WHITESPACE", "COMMENT", 
		"HEXADECIMAL", "'=='", "'='", "'('", "')'", "'{'", "'||'", "OPENTHING", 
		"CLOSEDTHING", "','", "'%'", "'}'", "'<'", "GREATEROREQUALTO", "'+='", 
		"'!='", "'&&'", "'!'", "'>'", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "'boolean'", "'break'", 
		"'callout'", "'class'", "'Program'", "'continue'", "'else'", "'for'", 
		"'>>'", "'<<'", "'if'", "'int'", "'return'", "'void'", "SINGLECHAR", "STRING", 
		"IDENTIFIER"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "NUMBER", "SEMICOLON", 
		"WHITESPACE", "DIGIT", "COMMENT", "HEXADECIMAL", "EQUALS", "ASSIGNATION", 
		"OPENPAREN", "CLOSEDPAREN", "OPENBRACE", "OR", "OPENTHING", "CLOSEDTHING", 
		"COLON", "MOD", "CLOSEDBRACE", "GREATERTHAN", "GREATEROREQUALTO", "PLUSEQUAL", 
		"NOTEQUAL", "AND", "NOT", "LESSTHAN", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "BOOLEANN", "BREAK", 
		"CALLOUT", "CLASS", "PROGRAM", "CONTINUE", "ELSE", "FOR", "SLL", "SRL", 
		"IF", "INT", "RETURN", "VOID", "SINGLECHAR", "STRING", "IDENTIFIER"
	};


	public Decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

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
		case 4: NUMBER_action((RuleContext)_localctx, actionIndex); break;

		case 6: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 8: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 9: HEXADECIMAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void HEXADECIMAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: try{
																		Integer.parseInt(getText());
																	}catch(NumberFormatException nfe){
																		System.err.println("ERROR Overflow.....");
																	} break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip(); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: try{
								Integer.parseInt(getText());
							}catch(NumberFormatException nfe){
							System.err.println("ERROR  Overflow.....");
							} break;
		}
	}

	public static final String _serializedATN =
		"\2\4\64\u0144\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6s\n\6"+
		"\r\6\16\6t\3\6\3\6\3\7\3\7\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\5\n\u008e\n\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\6\13\u0097\n\13\r\13\16\13\u0098\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u00dd\n#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0133\n\62\3\62\3\62\3\63\3\63\6\63"+
		"\u0139\n\63\r\63\16\63\u013a\3\63\3\63\3\64\3\64\6\64\u0141\n\64\r\64"+
		"\16\64\u0142\2\65\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\3\21\2\1\23"+
		"\n\4\25\13\5\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'"+
		"\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36"+
		"\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1Q)\1S*\1U+\1W,\1Y-\1[.\1"+
		"]/\1_\60\1a\61\1c\62\1e\63\1g\64\1\3\2\b\5\13\f\17\17\"\"\4\f\f\17\17"+
		"\4ZZzz\4CHch\4\13\13\"\u0080\5C\\aac|\u014e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13r\3\2\2\2\rx\3\2\2\2\17"+
		"{\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0092\3\2\2\2\27\u009c"+
		"\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3"+
		"\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b0"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61\u00b9\3\2\2\2"+
		"\63\u00bc\3\2\2\2\65\u00bf\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00c9\3\2\2\2?\u00cb\3\2\2\2A\u00cd\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e6\3\2\2\2K\u00ec\3\2\2\2M\u00f4\3\2"+
		"\2\2O\u00fa\3\2\2\2Q\u0102\3\2\2\2S\u010b\3\2\2\2U\u0110\3\2\2\2W\u0114"+
		"\3\2\2\2Y\u0117\3\2\2\2[\u011a\3\2\2\2]\u011d\3\2\2\2_\u0121\3\2\2\2a"+
		"\u0128\3\2\2\2c\u012d\3\2\2\2e\u0136\3\2\2\2g\u0140\3\2\2\2ij\7-\2\2j"+
		"\4\3\2\2\2kl\7/\2\2l\6\3\2\2\2mn\7,\2\2n\b\3\2\2\2op\7\61\2\2p\n\3\2\2"+
		"\2qs\5\21\t\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\6"+
		"\2\2w\f\3\2\2\2xy\7=\2\2y\16\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\b\3\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\4\62;\2\u0082\22\3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085\7\61"+
		"\2\2\u0085\u0089\3\2\2\2\u0086\u0088\n\3\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\b\n"+
		"\4\2\u0091\24\3\2\2\2\u0092\u0093\7\62\2\2\u0093\u0096\t\4\2\2\u0094\u0097"+
		"\t\5\2\2\u0095\u0097\5\21\t\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\b\13\5\2\u009b\26\3\2\2\2\u009c\u009d\7?\2\2\u009d"+
		"\u009e\7?\2\2\u009e\30\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\32\3\2\2\2\u00a1"+
		"\u00a2\7*\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4\36\3\2\2\2\u00a5"+
		"\u00a6\7}\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7~\2\2\u00a8\u00a9\7~\2\2\u00a9"+
		"\"\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7_\2\2\u00ad"+
		"&\3\2\2\2\u00ae\u00af\7.\2\2\u00af(\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5"+
		".\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7?\2\2\u00b8\60\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba\u00bb\7?\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\u00be\7?\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\7(\2\2\u00c1"+
		"\66\3\2\2\2\u00c2\u00c3\7#\2\2\u00c38\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5"+
		":\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8\7?\2\2\u00c8<\3\2\2\2\u00c9\u00ca"+
		"\7]\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7_\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7"+
		">\2\2\u00ce\u00cf\7?\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00dd\7g\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2\u00dc\u00d3\3\2\2"+
		"\2\u00dc\u00d7\3\2\2\2\u00ddF\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7"+
		"q\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7p\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7m\2\2\u00eb"+
		"J\3\2\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7n\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7v\2\2"+
		"\u00f3L\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7c\2"+
		"\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7u\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7"+
		"R\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7o\2\2\u0101P\3\2\2\2\u0102\u0103"+
		"\7e\2\2\u0103\u0104\7q\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7w\2\2\u0109\u010a\7g\2\2"+
		"\u010aR\3\2\2\2\u010b\u010c\7g\2\2\u010c\u010d\7n\2\2\u010d\u010e\7u\2"+
		"\2\u010e\u010f\7g\2\2\u010fT\3\2\2\2\u0110\u0111\7h\2\2\u0111\u0112\7"+
		"q\2\2\u0112\u0113\7t\2\2\u0113V\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116"+
		"\7@\2\2\u0116X\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\7>\2\2\u0119Z\3"+
		"\2\2\2\u011a\u011b\7k\2\2\u011b\u011c\7h\2\2\u011c\\\3\2\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120^\3\2\2\2\u0121\u0122"+
		"\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7v\2\2\u0124\u0125\7w\2\2\u0125"+
		"\u0126\7t\2\2\u0126\u0127\7p\2\2\u0127`\3\2\2\2\u0128\u0129\7x\2\2\u0129"+
		"\u012a\7q\2\2\u012a\u012b\7k\2\2\u012b\u012c\7f\2\2\u012cb\3\2\2\2\u012d"+
		"\u0132\7)\2\2\u012e\u012f\7^\2\2\u012f\u0133\4#\u0080\2\u0130\u0133\4"+
		"\"\u0080\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7)\2\2\u0135d\3\2"+
		"\2\2\u0136\u0138\7$\2\2\u0137\u0139\t\6\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\7$\2\2\u013df\3\2\2\2\u013e\u0141\t\7\2\2\u013f\u0141"+
		"\5\21\t\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143h\3\2\2\2\17\2t}\u0089\u008d"+
		"\u0096\u0098\u00dc\u0132\u0138\u013a\u0140\u0142";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}