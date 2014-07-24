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
		ELSE=40, FOR=41, SLL=42, SRL=43, IF=44, INT=45;
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
		"'>>'", "'<<'", "'if'", "'int'"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "NUMBER", "SEMICOLON", 
		"WHITESPACE", "DIGIT", "COMMENT", "HEXADECIMAL", "EQUALS", "ASSIGNATION", 
		"OPENPAREN", "CLOSEDPAREN", "OPENBRACE", "OR", "OPENTHING", "CLOSEDTHING", 
		"COLON", "MOD", "CLOSEDBRACE", "GREATERTHAN", "GREATEROREQUALTO", "PLUSEQUAL", 
		"NOTEQUAL", "AND", "NOT", "LESSTHAN", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "BOOLEANN", "BREAK", 
		"CALLOUT", "CLASS", "PROGRAM", "CONTINUE", "ELSE", "FOR", "SLL", "SRL", 
		"IF", "INT"
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
		"\2\4/\u0117\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\6\6i\n\6\r\6\16\6j\3\6\3\6\3\7\3\7\3\b\6\br\n\b\r\b\16\b"+
		"s\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\3\n\5\n"+
		"\u0084\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13\u008d\n\13\r\13\16\13"+
		"\u008e\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\5#\u00d3\n#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\2\60\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2\r"+
		"\b\1\17\t\3\21\2\1\23\n\4\25\13\5\27\f\1\31\r\1\33\16\1\35\17\1\37\20"+
		"\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65"+
		"\33\1\67\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1"+
		"Q)\1S*\1U+\1W,\1Y-\1[.\1]/\1\3\2\6\5\13\f\17\17\"\"\4\f\f\17\17\4ZZzz"+
		"\4CHch\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2"+
		"\2\2\7c\3\2\2\2\te\3\2\2\2\13h\3\2\2\2\rn\3\2\2\2\17q\3\2\2\2\21w\3\2"+
		"\2\2\23y\3\2\2\2\25\u0088\3\2\2\2\27\u0092\3\2\2\2\31\u0095\3\2\2\2\33"+
		"\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u00a0"+
		"\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2"+
		"-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2\2\65\u00b5"+
		"\3\2\2\2\67\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00bf\3\2\2\2"+
		"?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c6\3\2\2\2E\u00d2\3\2\2\2G\u00d4\3"+
		"\2\2\2I\u00dc\3\2\2\2K\u00e2\3\2\2\2M\u00ea\3\2\2\2O\u00f0\3\2\2\2Q\u00f8"+
		"\3\2\2\2S\u0101\3\2\2\2U\u0106\3\2\2\2W\u010a\3\2\2\2Y\u010d\3\2\2\2["+
		"\u0110\3\2\2\2]\u0113\3\2\2\2_`\7-\2\2`\4\3\2\2\2ab\7/\2\2b\6\3\2\2\2"+
		"cd\7,\2\2d\b\3\2\2\2ef\7\61\2\2f\n\3\2\2\2gi\5\21\t\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\6\2\2m\f\3\2\2\2no\7=\2\2o\16\3"+
		"\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b"+
		"\b\3\2v\20\3\2\2\2wx\4\62;\2x\22\3\2\2\2yz\7\61\2\2z{\7\61\2\2{\177\3"+
		"\2\2\2|~\n\3\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7\17\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\f\2\2\u0086"+
		"\u0087\b\n\4\2\u0087\24\3\2\2\2\u0088\u0089\7\62\2\2\u0089\u008c\t\4\2"+
		"\2\u008a\u008d\t\5\2\2\u008b\u008d\5\21\t\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\13\5\2\u0091\26\3\2\2\2\u0092\u0093"+
		"\7?\2\2\u0093\u0094\7?\2\2\u0094\30\3\2\2\2\u0095\u0096\7?\2\2\u0096\32"+
		"\3\2\2\2\u0097\u0098\7*\2\2\u0098\34\3\2\2\2\u0099\u009a\7+\2\2\u009a"+
		"\36\3\2\2\2\u009b\u009c\7}\2\2\u009c \3\2\2\2\u009d\u009e\7~\2\2\u009e"+
		"\u009f\7~\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1$\3\2\2\2\u00a2"+
		"\u00a3\7_\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5(\3\2\2\2\u00a6\u00a7"+
		"\7\'\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9,\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae\60"+
		"\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\u00b1\7?\2\2\u00b1\62\3\2\2\2\u00b2"+
		"\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6"+
		"\u00b7\7(\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7#\2\2\u00b98\3\2\2\2\u00ba"+
		"\u00bb\7@\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be"+
		"<\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7_\2\2\u00c2@"+
		"\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5B\3\2\2\2\u00c6\u00c7"+
		"\7@\2\2\u00c7\u00c8\7?\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7w\2\2\u00cc\u00d3\7g\2\2\u00cd\u00ce\7h\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d3\7g\2\2"+
		"\u00d2\u00c9\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3F\3\2\2\2\u00d4\u00d5\7"+
		"d\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7p\2\2\u00dbH\3\2\2\2\u00dc\u00dd"+
		"\7d\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7m\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7n\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7w\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e9L\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7n\2"+
		"\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7u\2\2\u00efN\3\2"+
		"\2\2\u00f0\u00f1\7R\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7i\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7o\2\2\u00f7"+
		"P\3\2\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7w\2\2"+
		"\u00ff\u0100\7g\2\2\u0100R\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103\7n\2"+
		"\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105T\3\2\2\2\u0106\u0107\7"+
		"h\2\2\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109V\3\2\2\2\u010a\u010b"+
		"\7@\2\2\u010b\u010c\7@\2\2\u010cX\3\2\2\2\u010d\u010e\7>\2\2\u010e\u010f"+
		"\7>\2\2\u010fZ\3\2\2\2\u0110\u0111\7k\2\2\u0111\u0112\7h\2\2\u0112\\\3"+
		"\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116"+
		"^\3\2\2\2\n\2js\177\u0083\u008c\u008e\u00d2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}