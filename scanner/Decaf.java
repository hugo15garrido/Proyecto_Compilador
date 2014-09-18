// Generated from scanner\Decaf.g by ANTLR 4.0

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
		ELSE=40, FOR=41, SLL=42, SRL=43, IF=44, INT=45, INVALIDSINGLEQUOTE=46, 
		RETURN=47, VOID=48, INVALIDDOUBLEQUOTE=49, INVALIDSYMBOL=50, INVALIDNEWLINE=51, 
		SINGLECHAR=52, STRING=53, IDENTIFIER=54, ONE_CHAR=55, ASSIGN_ERROR=56;
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
		"'>>'", "'<<'", "'if'", "'int'", "INVALIDSINGLEQUOTE", "'return'", "'void'", 
		"INVALIDDOUBLEQUOTE", "INVALIDSYMBOL", "INVALIDNEWLINE", "SINGLECHAR", 
		"STRING", "IDENTIFIER", "ONE_CHAR", "ASSIGN_ERROR"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "NUMBER", "SEMICOLON", 
		"WHITESPACE", "DIGIT", "COMMENT", "HEXADECIMAL", "EQUALS", "ASSIGNATION", 
		"OPENPAREN", "CLOSEDPAREN", "OPENBRACE", "OR", "OPENTHING", "CLOSEDTHING", 
		"COLON", "MOD", "CLOSEDBRACE", "GREATERTHAN", "GREATEROREQUALTO", "PLUSEQUAL", 
		"NOTEQUAL", "AND", "NOT", "LESSTHAN", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "BOOLEANN", "BREAK", 
		"CALLOUT", "CLASS", "PROGRAM", "CONTINUE", "ELSE", "FOR", "SLL", "SRL", 
		"IF", "INT", "INVALIDSINGLEQUOTE", "RETURN", "VOID", "INVALIDDOUBLEQUOTE", 
		"INVALIDSYMBOL", "INVALIDNEWLINE", "SINGLECHAR", "STRING", "IDENTIFIER", 
		"ONE_CHAR", "ASSIGN_ERROR"
	};


		public void Error(String msg, int line){
			ErrorHandler e = new ErrorHandler();
			e.scannerError(msg,line);
		}


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

		case 46: INVALIDSINGLEQUOTE_action((RuleContext)_localctx, actionIndex); break;

		case 49: INVALIDDOUBLEQUOTE_action((RuleContext)_localctx, actionIndex); break;

		case 50: INVALIDSYMBOL_action((RuleContext)_localctx, actionIndex); break;

		case 51: INVALIDNEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 55: ONE_CHAR_action((RuleContext)_localctx, actionIndex); break;

		case 56: ASSIGN_ERROR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ONE_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: Error("ERROR: TWO CHAR IS NOT VALID" +"\"" +getText()+ "\"", getLine()); break;
		}
	}
	private void INVALIDNEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: Error("ERROR: INVALID NEWLINE" +"\"" +getText()+ "\"", getLine()); break;
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
																		//Error("Overflow... " +"\"" +getText()+ "\"",getLine());
																		//System.err.println("ERROR Overflow.....     Line:" +getLine());
																	} break;
		}
	}
	private void INVALIDSYMBOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: Error("ERROR: INVALID SYMBOL" +"\"" +getText()+ "\"", getLine()); break;
		}
	}
	private void INVALIDSINGLEQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: Error("ERROR: INVALID SINGLE QUOTE" +"\"" +getText()+ "\"", getLine()); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip(); break;
		}
	}
	private void ASSIGN_ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: Error("ERROR: INVALID ASIGN" +"\"" +getText()+ "\"", getLine()); break;
		}
	}
	private void INVALIDDOUBLEQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: Error("ERROR: INVALID DOUBLE QUOTE" +"\"" +getText()+ "\"",getLine()); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: try{
								Integer.parseInt(getText());
							}catch(NumberFormatException nfe){
							//System.err.println("ERROR  Overflow.....     Line:" +getLine());
								Error("Overflow... " +"\"" + getText() + "\"", getLine()); 
								
							} break;
		}
	}

	public static final String _serializedATN =
		"\2\4:\u0175\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6\177\n\6\r\6\16\6\u0080\3"+
		"\6\3\6\3\7\3\7\3\b\6\b\u0088\n\b\r\b\16\b\u0089\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\5\n\u009a\n\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\6\13\u00a3\n\13\r\13\16\13\u00a4\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\5#\u00e9\n#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\5\64\u0148\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0156\n\66\3\66\3\66\3\67\3\67\6\67\u015c\n\67\r\67\16"+
		"\67\u015d\3\67\3\67\38\38\68\u0164\n8\r8\168\u0165\39\39\39\69\u016b\n"+
		"9\r9\169\u016c\39\39\39\3:\3:\3:\3:\2;\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2"+
		"\r\b\1\17\t\3\21\2\1\23\n\4\25\13\5\27\f\1\31\r\1\33\16\1\35\17\1\37\20"+
		"\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65"+
		"\33\1\67\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\1I%\1K&\1M\'\1O(\1"+
		"Q)\1S*\1U+\1W,\1Y-\1[.\1]/\1_\60\6a\61\1c\62\1e\63\7g\64\bi\65\tk\66\1"+
		"m\67\1o8\1q9\ns:\13\3\2\13\5\13\f\17\17\"\"\4\f\f\17\17\4ZZzz\4CHch\n"+
		"%&((\60\60<<AB``~~\u0080\u0080\4^^bb\4\13\13\"\u0080\5C\\aac|\5,,//\61"+
		"\61\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3"+
		"\2\2\2\13~\3\2\2\2\r\u0084\3\2\2\2\17\u0087\3\2\2\2\21\u008d\3\2\2\2\23"+
		"\u008f\3\2\2\2\25\u009e\3\2\2\2\27\u00a8\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad"+
		"\3\2\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0"+
		"\3\2\2\2/\u00c2\3\2\2\2\61\u00c5\3\2\2\2\63\u00c8\3\2\2\2\65\u00cb\3\2"+
		"\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d5\3\2\2\2?\u00d7"+
		"\3\2\2\2A\u00d9\3\2\2\2C\u00dc\3\2\2\2E\u00e8\3\2\2\2G\u00ea\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00f8\3\2\2\2M\u0100\3\2\2\2O\u0106\3\2\2\2Q\u010e\3\2"+
		"\2\2S\u0117\3\2\2\2U\u011c\3\2\2\2W\u0120\3\2\2\2Y\u0123\3\2\2\2[\u0126"+
		"\3\2\2\2]\u0129\3\2\2\2_\u012d\3\2\2\2a\u0132\3\2\2\2c\u0139\3\2\2\2e"+
		"\u013e\3\2\2\2g\u0147\3\2\2\2i\u014b\3\2\2\2k\u0150\3\2\2\2m\u0159\3\2"+
		"\2\2o\u0163\3\2\2\2q\u0167\3\2\2\2s\u0171\3\2\2\2uv\7-\2\2v\4\3\2\2\2"+
		"wx\7/\2\2x\6\3\2\2\2yz\7,\2\2z\b\3\2\2\2{|\7\61\2\2|\n\3\2\2\2}\177\5"+
		"\21\t\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\b\6\2\2\u0083\f\3\2\2\2\u0084\u0085\7"+
		"=\2\2\u0085\16\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\b\3\2\u008c\20\3\2\2\2\u008d\u008e\4\62;\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n"+
		"\3\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\17"+
		"\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7\f\2\2\u009c\u009d\b\n\4\2\u009d\24\3\2\2\2\u009e\u009f\7\62\2"+
		"\2\u009f\u00a2\t\4\2\2\u00a0\u00a3\t\5\2\2\u00a1\u00a3\5\21\t\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\13\5\2\u00a7"+
		"\26\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\30\3\2\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\7+\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2 \3\2\2\2\u00b3"+
		"\u00b4\7~\2\2\u00b4\u00b5\7~\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7"+
		"$\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb("+
		"\3\2\2\2\u00bc\u00bd\7\'\2\2\u00bd*\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c7\7?\2\2\u00c7\62"+
		"\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca\64\3\2\2\2\u00cb"+
		"\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7"+
		"_\2\2\u00d8@\3\2\2\2\u00d9\u00da\7>\2\2\u00da\u00db\7?\2\2\u00dbB\3\2"+
		"\2\2\u00dc\u00dd\7@\2\2\u00dd\u00de\7?\2\2\u00deD\3\2\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e9\7g\2\2\u00e3"+
		"\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2"+
		"\u00e7\u00e9\7g\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9F\3\2"+
		"\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee"+
		"\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"H\3\2\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7m\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7e\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u00fe\7w\2\2\u00fe\u00ff\7v\2\2\u00ffL\3\2\2\2\u0100\u0101\7e\2"+
		"\2\u0101\u0102\7n\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\u0105"+
		"\7u\2\2\u0105N\3\2\2\2\u0106\u0107\7R\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7q\2\2\u0109\u010a\7i\2\2\u010a\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7o\2\2\u010dP\3\2\2\2\u010e\u010f\7e\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2"+
		"\u0114\u0115\7w\2\2\u0115\u0116\7g\2\2\u0116R\3\2\2\2\u0117\u0118\7g\2"+
		"\2\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011bT\3\2"+
		"\2\2\u011c\u011d\7h\2\2\u011d\u011e\7q\2\2\u011e\u011f\7t\2\2\u011fV\3"+
		"\2\2\2\u0120\u0121\7@\2\2\u0121\u0122\7@\2\2\u0122X\3\2\2\2\u0123\u0124"+
		"\7>\2\2\u0124\u0125\7>\2\2\u0125Z\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7h\2\2\u0128\\\3\2\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b\u012c"+
		"\7v\2\2\u012c^\3\2\2\2\u012d\u012e\7)\2\2\u012e\u012f\7)\2\2\u012f\u0130"+
		"\7)\2\2\u0130\u0131\b\60\6\2\u0131`\3\2\2\2\u0132\u0133\7t\2\2\u0133\u0134"+
		"\7g\2\2\u0134\u0135\7v\2\2\u0135\u0136\7w\2\2\u0136\u0137\7t\2\2\u0137"+
		"\u0138\7p\2\2\u0138b\3\2\2\2\u0139\u013a\7x\2\2\u013a\u013b\7q\2\2\u013b"+
		"\u013c\7k\2\2\u013c\u013d\7f\2\2\u013dd\3\2\2\2\u013e\u013f\7)\2\2\u013f"+
		"\u0140\7$\2\2\u0140\u0141\7)\2\2\u0141\u0142\b\63\7\2\u0142f\3\2\2\2\u0143"+
		"\u0148\t\6\2\2\u0144\u0145\7\u00c4\2\2\u0145\u0148\7\u00b6\2\2\u0146\u0148"+
		"\t\7\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\b\64\b\2\u014ah\3\2\2\2\u014b\u014c\7)\2\2"+
		"\u014c\u014d\7\f\2\2\u014d\u014e\7)\2\2\u014e\u014f\b\65\t\2\u014fj\3"+
		"\2\2\2\u0150\u0155\7)\2\2\u0151\u0152\7^\2\2\u0152\u0156\4#\u0080\2\u0153"+
		"\u0156\4\"\u0080\2\u0154\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7)\2\2\u0158"+
		"l\3\2\2\2\u0159\u015b\7$\2\2\u015a\u015c\t\b\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\7$\2\2\u0160n\3\2\2\2\u0161\u0164\t\t\2\2\u0162\u0164"+
		"\5\21\t\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166p\3\2\2\2\u0167\u0168\7"+
		")\2\2\u0168\u016a\5k\66\2\u0169\u016b\5k\66\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\7)\2\2\u016f\u0170\b9\n\2\u0170r\3\2\2\2\u0171\u0172"+
		"\t\n\2\2\u0172\u0173\7?\2\2\u0173\u0174\b:\13\2\u0174t\3\2\2\2\21\2\u0080"+
		"\u0089\u0095\u0099\u00a2\u00a4\u00e8\u0147\u0155\u015b\u015d\u0163\u0165"+
		"\u016c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}