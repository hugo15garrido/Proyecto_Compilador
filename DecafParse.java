// Generated from parser/DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParse extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLOSEDBRACE=20, ASSIGNATION=11, INVALIDNEWLINE=51, CLASS=37, MOD=19, INVALIDDOUBLEQUOTE=49, 
		FOR=41, EQUALS=10, CLOSEDBRACKET=30, SLL=42, NOT=26, AND=25, BREAK=35, 
		CLOSEDPAREN=13, PLUSEQUAL=23, IF=44, NOTEQUAL=24, GREATEROREQUALTO=22, 
		GREATERTHANOREQUALTO=31, BOOLEAN=33, LESSOREQUAL=28, CONTINUE=39, INVALIDSINGLEQUOTE=46, 
		IDENTIFIER=54, ASSIGN_ERROR=56, RETURN=47, DIVISION=4, PLUS=1, VOID=48, 
		CLOSEDTHING=17, COMMENT=8, GREATERTHAN=21, CALLOUT=36, OPENBRACE=14, LESSTHAN=27, 
		INVALIDSYMBOL=50, SRL=43, ELSE=40, NUMBER=5, OPENBRACKET=29, ONE_CHAR=55, 
		WHITESPACE=7, HEXADECIMAL=9, SEMICOLON=6, INT=45, MINUS=2, COLON=18, SINGLECHAR=52, 
		OR=15, BOOLEANN=34, OPENTHING=16, MULTIPLICATION=3, PROGRAM=38, LESSTHANOREQUALTO=32, 
		OPENPAREN=12, STRING=53, EXPR=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "NUMBER", "';'", "WHITESPACE", 
		"COMMENT", "HEXADECIMAL", "'=='", "'='", "'('", "')'", "'{'", "'||'", 
		"OPENTHING", "CLOSEDTHING", "','", "'%'", "'}'", "'<'", "GREATEROREQUALTO", 
		"'+='", "'!='", "'&&'", "'!'", "'>'", "LESSOREQUAL", "OPENBRACKET", "CLOSEDBRACKET", 
		"GREATERTHANOREQUALTO", "LESSTHANOREQUALTO", "BOOLEAN", "'boolean'", "'break'", 
		"'callout'", "'class'", "'Program'", "'continue'", "'else'", "'for'", 
		"'>>'", "'<<'", "'if'", "'int'", "INVALIDSINGLEQUOTE", "'return'", "'void'", 
		"INVALIDDOUBLEQUOTE", "INVALIDSYMBOL", "INVALIDNEWLINE", "SINGLECHAR", 
		"STRING", "IDENTIFIER", "ONE_CHAR", "ASSIGN_ERROR", "EXPR"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_field2 = 2, RULE_method_decl = 3, 
		RULE_metodo2 = 4, RULE_block = 5, RULE_var_decl = 6, RULE_type = 7, RULE_statement = 8, 
		RULE_assign_op = 9, RULE_method_call = 10, RULE_method_name = 11, RULE_callout_arg = 12, 
		RULE_expr = 13, RULE_op_or = 14, RULE_op_and = 15, RULE_eq_op = 16, RULE_op_rel = 17, 
		RULE_op_shift = 18, RULE_op_msm = 19, RULE_op_muldiv = 20, RULE_not = 21, 
		RULE_minus = 22, RULE_expr2 = 23, RULE_literal = 24, RULE_string_literal = 25, 
		RULE_location = 26, RULE_id = 27, RULE_int_literal = 28;
	public static final String[] ruleNames = {
		"program", "field_decl", "field2", "method_decl", "metodo2", "block", 
		"var_decl", "type", "statement", "assign_op", "method_call", "method_name", 
		"callout_arg", "expr", "op_or", "op_and", "eq_op", "op_rel", "op_shift", 
		"op_msm", "op_muldiv", "not", "minus", "expr2", "literal", "string_literal", 
		"location", "id", "int_literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParse.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


		Stack stack1;
		Stack stack2;
		public void Error(String msg, int line){
			ErrorHandler e = new ErrorHandler();
			e.parserError(msg,line);
		}
		public void PushStack(String msg1){
			this.stack1.push(msg1);
			this.stack2.push(msg1);
		}

	public DecafParse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(DecafParse.PROGRAM, 0); }
		public TerminalNode CLASS() { return getToken(DecafParse.CLASS, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(CLASS);
				setState(59); match(PROGRAM);
				setState(60); match(OPENBRACE);
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(61); field_decl();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(67); method_decl();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73); match(CLOSEDBRACE);
				 PushStack("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				 PushStack("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLASS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(77); match(PROGRAM);
				setState(78); match(OPENBRACE);
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(79); field_decl();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(85); method_decl();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91); match(CLOSEDBRACE);
				Error("Expecting \"CLASS\" ", ((TokenStream) this).LT(-1).getLine() );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); match(CLASS);
				setState(94);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(95); match(OPENBRACE);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(96); field_decl();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(102); method_decl();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); match(CLOSEDBRACE);
				Error("Expecting \"Program\" ", ((TokenStream) this).LT(-1).getLine());
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

	public static class Field_declContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<Field2Context> field2() {
			return getRuleContexts(Field2Context.class);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public Field2Context field2(int i) {
			return getRuleContext(Field2Context.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); type();
			{
			setState(113); field2();
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(114); match(COLON);
				setState(115); field2();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(SEMICOLON);
			 PushStack("field_decl	: type (field2)(COLON field2)* SEMICOLON");
			 PushStack("field_decl	: type (field2)(COLON field2)* SEMICOLON");
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

	public static class Field2Context extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(DecafParse.OPENBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CLOSEDBRACKET() { return getToken(DecafParse.CLOSEDBRACKET, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Field2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterField2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitField2(this);
		}
	}

	public final Field2Context field2() throws RecognitionException {
		Field2Context _localctx = new Field2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_field2);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); id();
				setState(127); match(OPENBRACKET);
				setState(128); int_literal();
				setState(129); match(CLOSEDBRACKET);
				 PushStack("field2:	id|id OPENBRACKET int_literal CLOSEDBRACKET");
				 PushStack("field2:	id|id OPENBRACKET int_literal CLOSEDBRACKET");
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

	public static class Method_declContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public Metodo2Context metodo2() {
			return getRuleContext(Metodo2Context.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); metodo2();
			setState(136); id();
			setState(137); match(OPENPAREN);
			{
			setState(138); type();
			setState(139); id();
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				{
				setState(140); match(COLON);
				}
				{
				setState(141); type();
				setState(142); id();
				}
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149); match(CLOSEDPAREN);
			setState(150); block();
			 PushStack("method_decl	:metodo2 id OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN block");
			 PushStack("method_decl	:metodo2 id OPENPAREN ( type id)((COLON) (type id))* CLOSEDPAREN block");
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

	public static class Metodo2Context extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(DecafParse.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Metodo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMetodo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMetodo2(this);
		}
	}

	public final Metodo2Context metodo2() throws RecognitionException {
		Metodo2Context _localctx = new Metodo2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo2);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(VOID);
				 PushStack("metodo2: type|VOID;");
				 PushStack("metodo2: type|VOID;");
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CLOSEDBRACE() { return getToken(DecafParse.CLOSEDBRACE, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode OPENBRACE() { return getToken(DecafParse.OPENBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(OPENBRACE);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEANN || _la==INT) {
				{
				{
				setState(161); var_decl();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(167); statement();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); match(CLOSEDBRACE);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(174); var_decl();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(180); statement();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			 PushStack("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");
			 PushStack("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); type();
			setState(190); id();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(191); match(COLON);
				setState(192); id();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(SEMICOLON);
			 PushStack("var_decl	: type id (COLON id)* SEMICOLON");
			 PushStack("var_decl	: type id (COLON id)* SEMICOLON");
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParse.INT, 0); }
		public TerminalNode BOOLEANN() { return getToken(DecafParse.BOOLEANN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(INT);
				}
				break;
			case BOOLEANN:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); match(BOOLEANN);
				 PushStack("type		: INT|BOOLEANN");
				 PushStack("type		: INT|BOOLEANN");
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DecafParse.COLON, 0); }
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(DecafParse.CONTINUE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(DecafParse.ELSE, 0); }
		public TerminalNode RETURN() { return getToken(DecafParse.RETURN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DecafParse.FOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(DecafParse.BREAK, 0); }
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public TerminalNode IF() { return getToken(DecafParse.IF, 0); }
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); location();
				setState(209); assign_op();
				setState(210); expr();
				setState(211); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); method_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); match(IF);
				setState(215); match(OPENPAREN);
				setState(216); expr();
				setState(217); match(CLOSEDPAREN);
				setState(218); block();
				{
				setState(219); match(ELSE);
				{
				setState(220); block();
				}
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222); match(FOR);
				setState(223); id();
				setState(224); match(ASSIGNATION);
				setState(225); expr();
				setState(226); match(COLON);
				setState(227); expr();
				setState(228); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230); match(RETURN);
				setState(231); expr();
				setState(232); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234); match(BREAK);
				setState(235); match(SEMICOLON);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236); match(CONTINUE);
				setState(237); match(SEMICOLON);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238); block();
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(DecafParse.PLUSEQUAL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==ASSIGNATION || _la==PLUSEQUAL) ) {
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

	public static class Method_callContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParse.CALLOUT, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_call);
		int _la;
		try {
			setState(267);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); method_name();
				setState(244); match(OPENPAREN);
				setState(245); expr();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(246); match(COLON);
					setState(247); expr();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253); match(CLOSEDPAREN);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); match(CALLOUT);
				setState(256); match(OPENPAREN);
				setState(257); string_literal();
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(258); match(COLON);
					setState(259); callout_arg();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(265); match(CLOSEDPAREN);
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

	public static class Method_nameContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); id();
			setState(270); id();
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callout_arg);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
			case HEXADECIMAL:
			case OPENPAREN:
			case NOT:
			case BOOLEAN:
			case CALLOUT:
			case SINGLECHAR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); expr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); string_literal();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EXPR() { return getToken(DecafParse.EXPR, 0); }
		public List<Op_orContext> op_or() {
			return getRuleContexts(Op_orContext.class);
		}
		public Op_orContext op_or(int i) {
			return getRuleContext(Op_orContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); op_or();
			{
			setState(277); match(EXPR);
			setState(278); op_or();
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

	public static class Op_orContext extends ParserRuleContext {
		public List<Op_andContext> op_and() {
			return getRuleContexts(Op_andContext.class);
		}
		public TerminalNode OR(int i) {
			return getToken(DecafParse.OR, i);
		}
		public Op_andContext op_and(int i) {
			return getRuleContext(Op_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(DecafParse.OR); }
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_or(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280); op_and();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(281); match(OR);
					setState(282); op_and();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Op_andContext extends ParserRuleContext {
		public Eq_opContext eq_op(int i) {
			return getRuleContext(Eq_opContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DecafParse.AND); }
		public List<Eq_opContext> eq_op() {
			return getRuleContexts(Eq_opContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(DecafParse.AND, i);
		}
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_and(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288); eq_op();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(289); match(AND);
					setState(290); eq_op();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Eq_opContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(DecafParse.EQUALS); }
		public Op_relContext op_rel(int i) {
			return getRuleContext(Op_relContext.class,i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(DecafParse.EQUALS, i);
		}
		public TerminalNode NOTEQUAL(int i) {
			return getToken(DecafParse.NOTEQUAL, i);
		}
		public List<Op_relContext> op_rel() {
			return getRuleContexts(Op_relContext.class);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(DecafParse.NOTEQUAL); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eq_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296); op_rel();
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					_la = _input.LA(1);
					if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(298); op_rel();
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode LESSTHAN(int i) {
			return getToken(DecafParse.LESSTHAN, i);
		}
		public List<TerminalNode> GREATERTHANOREQUALTO() { return getTokens(DecafParse.GREATERTHANOREQUALTO); }
		public List<TerminalNode> LESSTHAN() { return getTokens(DecafParse.LESSTHAN); }
		public Op_shiftContext op_shift(int i) {
			return getRuleContext(Op_shiftContext.class,i);
		}
		public List<TerminalNode> LESSTHANOREQUALTO() { return getTokens(DecafParse.LESSTHANOREQUALTO); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(DecafParse.GREATERTHAN, i);
		}
		public TerminalNode LESSTHANOREQUALTO(int i) {
			return getToken(DecafParse.LESSTHANOREQUALTO, i);
		}
		public TerminalNode GREATERTHANOREQUALTO(int i) {
			return getToken(DecafParse.GREATERTHANOREQUALTO, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(DecafParse.GREATERTHAN); }
		public List<Op_shiftContext> op_shift() {
			return getRuleContexts(Op_shiftContext.class);
		}
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_rel(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_rel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304); op_shift();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(306); op_shift();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Op_shiftContext extends ParserRuleContext {
		public List<TerminalNode> SLL() { return getTokens(DecafParse.SLL); }
		public Op_msmContext op_msm(int i) {
			return getRuleContext(Op_msmContext.class,i);
		}
		public List<TerminalNode> SRL() { return getTokens(DecafParse.SRL); }
		public TerminalNode SRL(int i) {
			return getToken(DecafParse.SRL, i);
		}
		public List<Op_msmContext> op_msm() {
			return getRuleContexts(Op_msmContext.class);
		}
		public TerminalNode SLL(int i) {
			return getToken(DecafParse.SLL, i);
		}
		public Op_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_shift(this);
		}
	}

	public final Op_shiftContext op_shift() throws RecognitionException {
		Op_shiftContext _localctx = new Op_shiftContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_shift);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312); op_msm();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					_la = _input.LA(1);
					if ( !(_la==SLL || _la==SRL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(314); op_msm();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Op_msmContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(DecafParse.PLUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DecafParse.MINUS, i);
		}
		public List<Op_muldivContext> op_muldiv() {
			return getRuleContexts(Op_muldivContext.class);
		}
		public List<TerminalNode> MINUS() { return getTokens(DecafParse.MINUS); }
		public Op_muldivContext op_muldiv(int i) {
			return getRuleContext(Op_muldivContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(DecafParse.PLUS, i);
		}
		public Op_msmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_msm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_msm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_msm(this);
		}
	}

	public final Op_msmContext op_msm() throws RecognitionException {
		Op_msmContext _localctx = new Op_msmContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_msm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320); op_muldiv();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(322); op_muldiv();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Op_muldivContext extends ParserRuleContext {
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public List<TerminalNode> DIVISION() { return getTokens(DecafParse.DIVISION); }
		public List<TerminalNode> MULTIPLICATION() { return getTokens(DecafParse.MULTIPLICATION); }
		public TerminalNode MOD(int i) {
			return getToken(DecafParse.MOD, i);
		}
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(DecafParse.MULTIPLICATION, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DecafParse.MOD); }
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public TerminalNode DIVISION(int i) {
			return getToken(DecafParse.DIVISION, i);
		}
		public Op_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_muldiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOp_muldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOp_muldiv(this);
		}
	}

	public final Op_muldivContext op_muldiv() throws RecognitionException {
		Op_muldivContext _localctx = new Op_muldivContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_muldiv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328); not();
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(330); not();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class NotContext extends ParserRuleContext {
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DecafParse.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(336); match(NOT);
				}
			}

			setState(339); minus();
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(DecafParse.MINUS, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(341); match(MINUS);
				}
			}

			setState(344); expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public TerminalNode EXPR() { return getToken(DecafParse.EXPR, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpr2(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr2);
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346); location();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); method_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348); literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349); match(OPENPAREN);
				setState(350); expr();
				setState(351); match(CLOSEDPAREN);
				{
				setState(352); match(EXPR);
				setState(353); expr();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DecafParse.BOOLEAN, 0); }
		public TerminalNode SINGLECHAR() { return getToken(DecafParse.SINGLECHAR, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); int_literal();
				}
				break;
			case SINGLECHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); match(SINGLECHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(359); match(BOOLEAN);
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DecafParse.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); match(STRING);
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

	public static class LocationContext extends ParserRuleContext {
		public List<TerminalNode> OPENBRACKET() { return getTokens(DecafParse.OPENBRACKET); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TerminalNode> CLOSEDBRACKET() { return getTokens(DecafParse.CLOSEDBRACKET); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPENBRACKET(int i) {
			return getToken(DecafParse.OPENBRACKET, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CLOSEDBRACKET(int i) {
			return getToken(DecafParse.CLOSEDBRACKET, i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); id();
			setState(369);
			_la = _input.LA(1);
			if (_la==OPENBRACKET) {
				{
				setState(365); match(OPENBRACKET);
				setState(366); expr();
				setState(367); match(CLOSEDBRACKET);
				}
			}

			setState(371); id();
			setState(376);
			_la = _input.LA(1);
			if (_la==OPENBRACKET) {
				{
				setState(372); match(OPENBRACKET);
				setState(373); expr();
				setState(374); match(CLOSEDBRACKET);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParse.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(IDENTIFIER);
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL() { return getToken(DecafParse.HEXADECIMAL, 0); }
		public TerminalNode NUMBER() { return getToken(DecafParse.NUMBER, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==HEXADECIMAL) ) {
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

	public static final String _serializedATN =
		"\2\3;\u0181\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\3\2\3\2\3\2\7\2A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\7\2Y\n\2\f\2\16"+
		"\2\\\13\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\7\2j\n\2"+
		"\f\2\16\2m\13\2\3\2\3\2\5\2q\n\2\3\3\3\3\3\3\3\3\7\3w\n\3\f\3\16\3z\13"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\7\3\7\7\7\u00a5\n\7\f\7"+
		"\16\7\u00a8\13\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\7\3\7\7\7\u00b2"+
		"\n\7\f\7\16\7\u00b5\13\7\3\7\7\7\u00b8\n\7\f\7\16\7\u00bb\13\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7\13\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00fb\n"+
		"\f\f\f\16\f\u00fe\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0107\n\f\f\f\16"+
		"\f\u010a\13\f\3\f\3\f\5\f\u010e\n\f\3\r\3\r\3\r\3\16\3\16\5\16\u0115\n"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u011e\n\20\f\20\16\20\u0121"+
		"\13\20\3\21\3\21\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\3\22\3\22"+
		"\3\22\7\22\u012e\n\22\f\22\16\22\u0131\13\22\3\23\3\23\3\23\7\23\u0136"+
		"\n\23\f\23\16\23\u0139\13\23\3\24\3\24\3\24\7\24\u013e\n\24\f\24\16\24"+
		"\u0141\13\24\3\25\3\25\3\25\7\25\u0146\n\25\f\25\16\25\u0149\13\25\3\26"+
		"\3\26\3\26\7\26\u014e\n\26\f\26\16\26\u0151\13\26\3\27\5\27\u0154\n\27"+
		"\3\27\3\27\3\30\5\30\u0159\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0166\n\31\3\32\3\32\3\32\5\32\u016b\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\5\34\u0174\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u017b\n\34\3\35\3\35\3\36\3\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\13\3\'\'\3((\4\r\r\31\31\4\f"+
		"\f\32\32\5\27\27\35\35!\"\3,-\3\3\4\4\5\6\25\25\4\7\7\13\13\u0190\2p\3"+
		"\2\2\2\4r\3\2\2\2\6\u0087\3\2\2\2\b\u0089\3\2\2\2\n\u00a0\3\2\2\2\f\u00a2"+
		"\3\2\2\2\16\u00bf\3\2\2\2\20\u00d0\3\2\2\2\22\u00f1\3\2\2\2\24\u00f3\3"+
		"\2\2\2\26\u010d\3\2\2\2\30\u010f\3\2\2\2\32\u0114\3\2\2\2\34\u0116\3\2"+
		"\2\2\36\u011a\3\2\2\2 \u0122\3\2\2\2\"\u012a\3\2\2\2$\u0132\3\2\2\2&\u013a"+
		"\3\2\2\2(\u0142\3\2\2\2*\u014a\3\2\2\2,\u0153\3\2\2\2.\u0158\3\2\2\2\60"+
		"\u0165\3\2\2\2\62\u016a\3\2\2\2\64\u016c\3\2\2\2\66\u016e\3\2\2\28\u017c"+
		"\3\2\2\2:\u017e\3\2\2\2<=\7\'\2\2=>\7(\2\2>B\7\20\2\2?A\5\4\3\2@?\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\b\5\2FE\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\26\2\2LM\b"+
		"\2\1\2Mq\b\2\1\2NO\n\2\2\2OP\7(\2\2PT\7\20\2\2QS\5\4\3\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\b\5\2XW\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\26\2\2^q\b\2\1\2"+
		"_`\7\'\2\2`a\n\3\2\2ae\7\20\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\26\2\2oq\b\2\1\2p<\3\2\2\2pN\3\2"+
		"\2\2p_\3\2\2\2q\3\3\2\2\2rs\5\20\t\2sx\5\6\4\2tu\7\24\2\2uw\5\6\4\2vt"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\b\2\2|"+
		"}\b\3\1\2}~\b\3\1\2~\5\3\2\2\2\177\u0088\58\35\2\u0080\u0081\58\35\2\u0081"+
		"\u0082\7\37\2\2\u0082\u0083\5:\36\2\u0083\u0084\7 \2\2\u0084\u0085\b\4"+
		"\1\2\u0085\u0086\b\4\1\2\u0086\u0088\3\2\2\2\u0087\177\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0088\7\3\2\2\2\u0089\u008a\5\n\6\2\u008a\u008b\58\35\2\u008b"+
		"\u008c\7\16\2\2\u008c\u0094\5\20\t\2\u008d\u00b4\58\35\2\u008e\u008f\7"+
		"\24\2\2\u008f\u0090\5\20\t\2\u0090\u0091\58\35\2\u0091\u0093\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\17\2\2\u0098"+
		"\u0099\5\f\7\2\u0099\u009a\b\5\1\2\u009a\u009b\b\5\1\2\u009b\t\3\2\2\2"+
		"\u009c\u00a1\5\20\t\2\u009d\u009e\7\62\2\2\u009e\u009f\b\6\1\2\u009f\u00a1"+
		"\b\6\1\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\13\3\2\2\2\u00a2"+
		"\u00a6\7\20\2\2\u00a3\u00a5\5\16\b\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b3\7\26\2\2\u00b0\u00b2\5\16\b\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b9\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5\22\n\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\7\1\2\u00bd\u00be\b\7"+
		"\1\2\u00be\r\3\2\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c5\58\35\2\u00c1\u00c2"+
		"\7\24\2\2\u00c2\u00c4\58\35\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\b\b\1\2\u00ca\u00cb\b\b\1\2\u00cb"+
		"\17\3\2\2\2\u00cc\u00d1\7/\2\2\u00cd\u00ce\7$\2\2\u00ce\u00cf\b\t\1\2"+
		"\u00cf\u00d1\b\t\1\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\5\34"+
		"\17\2\u00d5\u00d6\7\b\2\2\u00d6\u00f2\3\2\2\2\u00d7\u00f2\5\26\f\2\u00d8"+
		"\u00d9\7.\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7"+
		"\17\2\2\u00dc\u00dd\5\f\7\2\u00dd\u00de\7*\2\2\u00de\u00df\5\f\7\2\u00df"+
		"\u00f2\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1\u00e2\58\35\2\u00e2\u00e3\7\r"+
		"\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\7\24\2\2\u00e5\u00e6\5\34\17\2"+
		"\u00e6\u00e7\5\f\7\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea"+
		"\5\34\17\2\u00ea\u00eb\7\b\2\2\u00eb\u00f2\3\2\2\2\u00ec\u00ed\7%\2\2"+
		"\u00ed\u00f2\7\b\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f2\7\b\2\2\u00f0\u00f2"+
		"\5\f\7\2\u00f1\u00d2\3\2\2\2\u00f1\u00d7\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1"+
		"\u00e0\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\t\4\2\2\u00f4\25"+
		"\3\2\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7\16\2\2\u00f7\u00fc\5\34\17"+
		"\2\u00f8\u00f9\7\24\2\2\u00f9\u00fb\5\34\17\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\17\2\2\u0100\u010e\3\2\2\2\u0101"+
		"\u0102\7&\2\2\u0102\u0103\7\16\2\2\u0103\u0108\5\64\33\2\u0104\u0105\7"+
		"\24\2\2\u0105\u0107\5\32\16\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\7\17\2\2\u010c\u010e\3\2\2\2\u010d\u00f5\3\2\2\2"+
		"\u010d\u0101\3\2\2\2\u010e\27\3\2\2\2\u010f\u0110\58\35\2\u0110\u0111"+
		"\58\35\2\u0111\31\3\2\2\2\u0112\u0115\5\34\17\2\u0113\u0115\5\64\33\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\33\3\2\2\2\u0116\u0117"+
		"\5\36\20\2\u0117\u0118\7;\2\2\u0118\u0119\5\36\20\2\u0119\35\3\2\2\2\u011a"+
		"\u011f\5 \21\2\u011b\u011c\7\21\2\2\u011c\u011e\5 \21\2\u011d\u011b\3"+
		"\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\37\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5\"\22\2\u0123\u0124\7\33"+
		"\2\2\u0124\u0126\5\"\22\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128!\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012f\5$\23\2\u012b\u012c\t\5\2\2\u012c\u012e\5$\23\2\u012d\u012b"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"#\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0137\5&\24\2\u0133\u0134\t\6\2\2"+
		"\u0134\u0136\5&\24\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138%\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013f\5(\25\2\u013b\u013c\t\7\2\2\u013c\u013e\5(\25\2\u013d\u013b\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\'\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0147\5*\26\2\u0143\u0144\t\b\2\2"+
		"\u0144\u0146\5*\26\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014f\5,\27\2\u014b\u014c\t\t\2\2\u014c\u014e\5,\27\2\u014d\u014b\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"+\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7\34\2\2\u0153\u0152\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5.\30\2\u0156-\3"+
		"\2\2\2\u0157\u0159\7\4\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\5\60\31\2\u015b/\3\2\2\2\u015c\u0166\5\66\34"+
		"\2\u015d\u0166\5\26\f\2\u015e\u0166\5\62\32\2\u015f\u0160\7\16\2\2\u0160"+
		"\u0161\5\34\17\2\u0161\u0162\7\17\2\2\u0162\u0163\7;\2\2\u0163\u0164\5"+
		"\34\17\2\u0164\u0166\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2\2\u0165"+
		"\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0166\61\3\2\2\2\u0167\u016b\5:\36"+
		"\2\u0168\u016b\7\66\2\2\u0169\u016b\7#\2\2\u016a\u0167\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016b\63\3\2\2\2\u016c\u016d\7\67\2\2\u016d"+
		"\65\3\2\2\2\u016e\u0173\58\35\2\u016f\u0170\7\37\2\2\u0170\u0171\5\34"+
		"\17\2\u0171\u0172\7 \2\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017a\58\35\2\u0176\u0177\7\37"+
		"\2\2\u0177\u0178\5\34\17\2\u0178\u0179\7 \2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0176\3\2\2\2\u017a\u017b\3\2\2\2\u017b\67\3\2\2\2\u017c\u017d\78\2\2"+
		"\u017d9\3\2\2\2\u017e\u017f\t\n\2\2\u017f;\3\2\2\2%BHTZekpx\u0087\u0094"+
		"\u00a0\u00a6\u00ac\u00b3\u00b9\u00c5\u00d0\u00f1\u00fc\u0108\u010d\u0114"+
		"\u011f\u0127\u012f\u0137\u013f\u0147\u014f\u0153\u0158\u0165\u016a\u0173"+
		"\u017a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}