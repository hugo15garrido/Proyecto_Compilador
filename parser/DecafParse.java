// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;


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
		RULE_method_param = 4, RULE_metodo2 = 5, RULE_block = 6, RULE_var_decl = 7, 
		RULE_type = 8, RULE_statement = 9, RULE_elseop = 10, RULE_assign_op = 11, 
		RULE_method_call = 12, RULE_expresion_met = 13, RULE_method_name = 14, 
		RULE_callout_arg = 15, RULE_expr = 16, RULE_op_or = 17, RULE_op_and = 18, 
		RULE_eq_op = 19, RULE_operador_eq = 20, RULE_op_rel = 21, RULE_operador_rel = 22, 
		RULE_op_shift = 23, RULE_operador_shifft = 24, RULE_op_msm = 25, RULE_operador_suma = 26, 
		RULE_op_muldiv = 27, RULE_operador_division = 28, RULE_not = 29, RULE_minus = 30, 
		RULE_expr2 = 31, RULE_literal = 32, RULE_string_literal = 33, RULE_location = 34, 
		RULE_id = 35, RULE_int_literal = 36;
	public static final String[] ruleNames = {
		"program", "field_decl", "field2", "method_decl", "method_param", "metodo2", 
		"block", "var_decl", "type", "statement", "elseop", "assign_op", "method_call", 
		"expresion_met", "method_name", "callout_arg", "expr", "op_or", "op_and", 
		"eq_op", "operador_eq", "op_rel", "operador_rel", "op_shift", "operador_shifft", 
		"op_msm", "operador_suma", "op_muldiv", "operador_division", "not", "minus", 
		"expr2", "literal", "string_literal", "location", "id", "int_literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParse.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


		public void Error(String msg, int line){
			ErrorHandler e = new ErrorHandler();
			e.parserError(msg,line);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(CLASS);
				setState(75); match(PROGRAM);
				setState(76); match(OPENBRACE);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(77); field_decl();
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(83); method_decl();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89); match(CLOSEDBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLASS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(91); match(PROGRAM);
				setState(92); match(OPENBRACE);
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(93); field_decl();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(99); method_decl();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105); match(CLOSEDBRACE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(CLASS);
				setState(107);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(108); match(OPENBRACE);
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(109); field_decl();
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANN) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(115); method_decl();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121); match(CLOSEDBRACE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); type();
			{
			setState(125); field2();
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(126); match(COLON);
				setState(127); field2();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(SEMICOLON);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitField2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field2Context field2() throws RecognitionException {
		Field2Context _localctx = new Field2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_field2);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); id();
				setState(137); match(OPENTHING);
				setState(138); int_literal();
				setState(139); match(CLOSEDTHING);
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
		public Method_paramContext method_param() {
			return getRuleContext(Method_paramContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); metodo2();
			setState(144); id();
			setState(145); match(OPENPAREN);
			setState(147);
			_la = _input.LA(1);
			if (_la==BOOLEANN || _la==INT) {
				{
				setState(146); method_param();
				}
			}

			setState(149); match(CLOSEDPAREN);
			setState(150); block();
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

	public static class Method_paramContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Method_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterMethod_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitMethod_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethod_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_paramContext method_param() throws RecognitionException {
		Method_paramContext _localctx = new Method_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); type();
			setState(153); id();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(154); match(COLON);
				setState(155); type();
				setState(156); id();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMetodo2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metodo2Context metodo2() throws RecognitionException {
		Metodo2Context _localctx = new Metodo2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodo2);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(VOID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(OPENBRACE);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(168); var_decl();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(174); statement();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); match(CLOSEDBRACE);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(181); var_decl();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(187); statement();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParse.SEMICOLON, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		int _la;
		try {
			setState(212);
			switch (_input.LA(1)) {
			case BOOLEANN:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); type();
				setState(194); id();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(195); match(COLON);
					setState(196); id();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202); match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); id();
				setState(205); match(OPENTHING);
				setState(206); expr();
				setState(207); match(CLOSEDTHING);
				setState(208); match(ASSIGNATION);
				setState(209); expr();
				setState(210); match(SEMICOLON);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANN || _la==INT) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DecafParse.COLON, 0); }
		public TerminalNode ASSIGNATION() { return getToken(DecafParse.ASSIGNATION, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ElseopContext elseop(int i) {
			return getRuleContext(ElseopContext.class,i);
		}
		public TerminalNode CONTINUE() { return getToken(DecafParse.CONTINUE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
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
		public List<ElseopContext> elseop() {
			return getRuleContexts(ElseopContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			int _alt;
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); location();
				setState(217); assign_op();
				setState(218); expr();
				setState(219); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); method_call();
				setState(222); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224); method_call();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225); match(IF);
				setState(226); match(OPENPAREN);
				setState(227); expr();
				setState(228); match(CLOSEDPAREN);
				setState(229); block();
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(230); elseop();
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236); match(FOR);
				setState(237); id();
				setState(238); match(ASSIGNATION);
				setState(239); expr();
				setState(240); match(COLON);
				setState(241); expr();
				setState(242); block();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244); match(RETURN);
				setState(245); expr();
				setState(246); match(SEMICOLON);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248); match(BREAK);
				setState(249); match(SEMICOLON);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(250); match(CONTINUE);
				setState(251); match(SEMICOLON);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252); block();
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

	public static class ElseopContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(DecafParse.ELSE, 0); }
		public ElseopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterElseop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitElseop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitElseop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseopContext elseop() throws RecognitionException {
		ElseopContext _localctx = new ElseopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(ELSE);
			setState(256); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Expresion_metContext expresion_met() {
			return getRuleContext(Expresion_metContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_call);
		int _la;
		try {
			setState(281);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); method_name();
				setState(267);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					{
					setState(261); match(OPENPAREN);
					setState(262); expresion_met();
					setState(263); match(CLOSEDPAREN);
					}
					}
					break;

				case 2:
					{
					{
					setState(265); match(OPENPAREN);
					setState(266); match(CLOSEDPAREN);
					}
					}
					break;
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(CALLOUT);
				setState(270); match(OPENPAREN);
				setState(271); string_literal();
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(272); match(COLON);
					setState(273); callout_arg();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(279); match(CLOSEDPAREN);
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

	public static class Expresion_metContext extends ParserRuleContext {
		public Expresion_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_met; }
	 
		public Expresion_metContext() { }
		public void copyFrom(Expresion_metContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpresionMetodoContext extends Expresion_metContext {
		public List<TerminalNode> COLON() { return getTokens(DecafParse.COLON); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(DecafParse.COLON, i);
		}
		public ExpresionMetodoContext(Expresion_metContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterExpresionMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitExpresionMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpresionMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_metContext expresion_met() throws RecognitionException {
		Expresion_metContext _localctx = new Expresion_metContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_met);
		int _la;
		try {
			_localctx = new ExpresionMetodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283); expr();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(284); match(COLON);
				setState(285); expr();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Method_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); id();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitCallout_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callout_arg);
		try {
			setState(295);
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
				setState(293); expr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); string_literal();
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public TerminalNode CLOSEDPAREN() { return getToken(DecafParse.CLOSEDPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); op_or();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); id();
				setState(299); match(OPENPAREN);
				setState(300); match(CLOSEDPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302); literal();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); op_and();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(306); match(OR);
				setState(307); op_and();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); eq_op();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(314); match(AND);
				setState(315); eq_op();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public Operador_eqContext operador_eq(int i) {
			return getRuleContext(Operador_eqContext.class,i);
		}
		public Op_relContext op_rel(int i) {
			return getRuleContext(Op_relContext.class,i);
		}
		public List<Op_relContext> op_rel() {
			return getRuleContexts(Op_relContext.class);
		}
		public List<Operador_eqContext> operador_eq() {
			return getRuleContexts(Operador_eqContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); op_rel();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOTEQUAL) {
				{
				{
				setState(322); operador_eq();
				setState(323); op_rel();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Operador_eqContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DecafParse.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DecafParse.NOTEQUAL, 0); }
		public Operador_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperador_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperador_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperador_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_eqContext operador_eq() throws RecognitionException {
		Operador_eqContext _localctx = new Operador_eqContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operador_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOTEQUAL) ) {
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

	public static class Op_relContext extends ParserRuleContext {
		public Operador_relContext operador_rel(int i) {
			return getRuleContext(Operador_relContext.class,i);
		}
		public Op_shiftContext op_shift(int i) {
			return getRuleContext(Op_shiftContext.class,i);
		}
		public List<Operador_relContext> operador_rel() {
			return getRuleContexts(Operador_relContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); op_shift();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) {
				{
				{
				setState(333); operador_rel();
				setState(334); op_shift();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Operador_relContext extends ParserRuleContext {
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(DecafParse.GREATERTHANOREQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(DecafParse.LESSTHAN, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(DecafParse.LESSTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(DecafParse.GREATERTHAN, 0); }
		public Operador_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperador_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperador_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperador_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relContext operador_rel() throws RecognitionException {
		Operador_relContext _localctx = new Operador_relContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operador_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << LESSTHANOREQUALTO))) != 0)) ) {
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

	public static class Op_shiftContext extends ParserRuleContext {
		public Operador_shifftContext operador_shifft(int i) {
			return getRuleContext(Operador_shifftContext.class,i);
		}
		public List<Operador_shifftContext> operador_shifft() {
			return getRuleContexts(Operador_shifftContext.class);
		}
		public Op_msmContext op_msm(int i) {
			return getRuleContext(Op_msmContext.class,i);
		}
		public List<Op_msmContext> op_msm() {
			return getRuleContexts(Op_msmContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_shiftContext op_shift() throws RecognitionException {
		Op_shiftContext _localctx = new Op_shiftContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_shift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); op_msm();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLL || _la==SRL) {
				{
				{
				setState(344); operador_shifft();
				setState(345); op_msm();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Operador_shifftContext extends ParserRuleContext {
		public TerminalNode SLL() { return getToken(DecafParse.SLL, 0); }
		public TerminalNode SRL() { return getToken(DecafParse.SRL, 0); }
		public Operador_shifftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_shifft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperador_shifft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperador_shifft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperador_shifft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_shifftContext operador_shifft() throws RecognitionException {
		Operador_shifftContext _localctx = new Operador_shifftContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operador_shifft);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==SLL || _la==SRL) ) {
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

	public static class Op_msmContext extends ParserRuleContext {
		public List<Operador_sumaContext> operador_suma() {
			return getRuleContexts(Operador_sumaContext.class);
		}
		public List<Op_muldivContext> op_muldiv() {
			return getRuleContexts(Op_muldivContext.class);
		}
		public Operador_sumaContext operador_suma(int i) {
			return getRuleContext(Operador_sumaContext.class,i);
		}
		public Op_muldivContext op_muldiv(int i) {
			return getRuleContext(Op_muldivContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_msm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_msmContext op_msm() throws RecognitionException {
		Op_msmContext _localctx = new Op_msmContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_msm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); op_muldiv();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(355); operador_suma();
				setState(356); op_muldiv();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Operador_sumaContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DecafParse.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DecafParse.MINUS, 0); }
		public Operador_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperador_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperador_suma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperador_suma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_sumaContext operador_suma() throws RecognitionException {
		Operador_sumaContext _localctx = new Operador_sumaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operador_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Op_muldivContext extends ParserRuleContext {
		public List<Operador_divisionContext> operador_division() {
			return getRuleContexts(Operador_divisionContext.class);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public Operador_divisionContext operador_division(int i) {
			return getRuleContext(Operador_divisionContext.class,i);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOp_muldiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_muldivContext op_muldiv() throws RecognitionException {
		Op_muldivContext _localctx = new Op_muldivContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_muldiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); not();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) {
				{
				{
				setState(366); operador_division();
				setState(367); not();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Operador_divisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(DecafParse.DIVISION, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(DecafParse.MULTIPLICATION, 0); }
		public TerminalNode MOD() { return getToken(DecafParse.MOD, 0); }
		public Operador_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).enterOperador_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParseListener ) ((DecafParseListener)listener).exitOperador_division(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitOperador_division(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_divisionContext operador_division() throws RecognitionException {
		Operador_divisionContext _localctx = new Operador_divisionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operador_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(376); match(NOT);
				}
			}

			setState(379); minus();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(381); match(MINUS);
				}
			}

			setState(384); expr2();
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
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(DecafParse.OPENPAREN, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr2);
		try {
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); location();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); method_call();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388); literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389); match(OPENPAREN);
				setState(390); expr();
				setState(391); match(CLOSEDPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		try {
			setState(398);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); int_literal();
				}
				break;
			case SINGLECHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); match(SINGLECHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(397); match(BOOLEAN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(STRING);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPENTHING() { return getToken(DecafParse.OPENTHING, 0); }
		public TerminalNode CLOSEDTHING() { return getToken(DecafParse.CLOSEDTHING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(402); id();
			setState(407);
			_la = _input.LA(1);
			if (_la==OPENTHING) {
				{
				setState(403); match(OPENTHING);
				setState(404); expr();
				setState(405); match(CLOSEDTHING);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(IDENTIFIER);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParseVisitor ) return ((DecafParseVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		"\2\3;\u01a0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2"+
		"\7\2Q\n\2\f\2\16\2T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2a\n\2\f\2\16\2d\13\2\3\2\7\2g\n\2\f\2\16\2j\13\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\7\2w\n\2\f\2\16\2z\13\2\3\2\5\2}\n\2"+
		"\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3\7\5\7\u00a8"+
		"\n\7\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\b\7\b\u00b2\n\b\f\b\16"+
		"\b\u00b5\13\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\b\7\b\u00bf"+
		"\n\b\f\b\16\b\u00c2\13\b\3\t\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d7\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00ea\n\13\f\13\16\13\u00ed\13\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0100"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010e"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0115\n\16\f\16\16\16\u0118\13\16"+
		"\3\16\3\16\5\16\u011c\n\16\3\17\3\17\3\17\7\17\u0121\n\17\f\17\16\17\u0124"+
		"\13\17\3\20\3\20\3\21\3\21\5\21\u012a\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0132\n\22\3\23\3\23\3\23\7\23\u0137\n\23\f\23\16\23\u013a\13"+
		"\23\3\24\3\24\3\24\7\24\u013f\n\24\f\24\16\24\u0142\13\24\3\25\3\25\3"+
		"\25\3\25\7\25\u0148\n\25\f\25\16\25\u014b\13\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\7\27\u0153\n\27\f\27\16\27\u0156\13\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\7\31\u015e\n\31\f\31\16\31\u0161\13\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\7\33\u0169\n\33\f\33\16\33\u016c\13\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\7\35\u0174\n\35\f\35\16\35\u0177\13\35\3\36\3\36\3\37\5\37\u017c"+
		"\n\37\3\37\3\37\3 \5 \u0181\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u018c\n!"+
		"\3\"\3\"\3\"\5\"\u0191\n\"\3#\3#\3$\3$\3$\3$\3$\5$\u019a\n$\3%\3%\3&\3"+
		"&\3&\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJ\2\f\3\'\'\3((\4$$//\4\r\r\31\31\4\f\f\32\32\5\27\27\35\35!\""+
		"\3,-\3\3\4\4\5\6\25\25\4\7\7\13\13\u01ac\2|\3\2\2\2\4~\3\2\2\2\6\u008f"+
		"\3\2\2\2\b\u0091\3\2\2\2\n\u009a\3\2\2\2\f\u00a7\3\2\2\2\16\u00a9\3\2"+
		"\2\2\20\u00d6\3\2\2\2\22\u00d8\3\2\2\2\24\u00ff\3\2\2\2\26\u0101\3\2\2"+
		"\2\30\u0104\3\2\2\2\32\u011b\3\2\2\2\34\u011d\3\2\2\2\36\u0125\3\2\2\2"+
		" \u0129\3\2\2\2\"\u0131\3\2\2\2$\u0133\3\2\2\2&\u013b\3\2\2\2(\u0143\3"+
		"\2\2\2*\u014c\3\2\2\2,\u014e\3\2\2\2.\u0157\3\2\2\2\60\u0159\3\2\2\2\62"+
		"\u0162\3\2\2\2\64\u0164\3\2\2\2\66\u016d\3\2\2\28\u016f\3\2\2\2:\u0178"+
		"\3\2\2\2<\u017b\3\2\2\2>\u0180\3\2\2\2@\u018b\3\2\2\2B\u0190\3\2\2\2D"+
		"\u0192\3\2\2\2F\u0194\3\2\2\2H\u019b\3\2\2\2J\u019d\3\2\2\2LM\7\'\2\2"+
		"MN\7(\2\2NR\7\20\2\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"SX\3\2\2\2TR\3\2\2\2UW\5\b\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[}\7\26\2\2\\]\n\2\2\2]^\7(\2\2^b\7\20\2\2_a\5\4\3"+
		"\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db\3\2\2\2eg\5\b\5"+
		"\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2k}\7\26"+
		"\2\2lm\7\'\2\2mn\n\3\2\2nr\7\20\2\2oq\5\4\3\2po\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\5\b\5\2vu\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\26\2\2|L\3\2\2\2|\\\3\2\2\2|"+
		"l\3\2\2\2}\3\3\2\2\2~\177\5\22\n\2\177\u0084\5\6\4\2\u0080\u0081\7\24"+
		"\2\2\u0081\u0083\5\6\4\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\b\2\2\u0088\5\3\2\2\2\u0089\u0090\5H%\2\u008a\u008b"+
		"\5H%\2\u008b\u008c\7\22\2\2\u008c\u008d\5J&\2\u008d\u008e\7\23\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u0090\7\3\2\2\2"+
		"\u0091\u0092\5\f\7\2\u0092\u0093\5H%\2\u0093\u0095\7\16\2\2\u0094\u0096"+
		"\5\n\6\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\17\2\2\u0098\u0099\5\16\b\2\u0099\t\3\2\2\2\u009a\u009b\5\22"+
		"\n\2\u009b\u00a2\5H%\2\u009c\u009d\7\24\2\2\u009d\u009e\5\22\n\2\u009e"+
		"\u009f\5H%\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a4\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a8\5\22\n\2\u00a6\u00a8\7\62\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\r\3\2\2\2\u00a9\u00ad\7\20\2\2\u00aa\u00ac"+
		"\5\20\t\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2"+
		"\5\24\13\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba"+
		"\7\26\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c9\5H%\2\u00c5\u00c6\7\24\2\2\u00c6"+
		"\u00c8\5H%\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7\b\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00cf\5H%\2\u00cf\u00d0\7\22\2\2\u00d0"+
		"\u00d1\5\"\22\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\5"+
		"\"\22\2\u00d4\u00d5\7\b\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c3\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9\23\3\2\2\2\u00da"+
		"\u00db\5F$\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\b"+
		"\2\2\u00de\u0100\3\2\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\u0100\3\2\2\2\u00e2\u0100\5\32\16\2\u00e3\u00e4\7.\2\2\u00e4\u00e5\7"+
		"\16\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7\17\2\2\u00e7\u00eb\5\16\b\2"+
		"\u00e8\u00ea\5\26\f\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u0100\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7+\2\2\u00ef\u00f0\5H%\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2\5\"\22"+
		"\2\u00f2\u00f3\7\24\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\5\16\b\2\u00f5"+
		"\u0100\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\7"+
		"\b\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\7%\2\2\u00fb\u0100\7\b\2\2\u00fc"+
		"\u00fd\7)\2\2\u00fd\u0100\7\b\2\2\u00fe\u0100\5\16\b\2\u00ff\u00da\3\2"+
		"\2\2\u00ff\u00df\3\2\2\2\u00ff\u00e2\3\2\2\2\u00ff\u00e3\3\2\2\2\u00ff"+
		"\u00ee\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fc\3\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\25\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103"+
		"\5\16\b\2\u0103\27\3\2\2\2\u0104\u0105\t\5\2\2\u0105\31\3\2\2\2\u0106"+
		"\u010d\5\36\20\2\u0107\u0108\7\16\2\2\u0108\u0109\5\34\17\2\u0109\u010a"+
		"\7\17\2\2\u010a\u010e\3\2\2\2\u010b\u010c\7\16\2\2\u010c\u010e\7\17\2"+
		"\2\u010d\u0107\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u011c\3\2\2\2\u010f\u0110"+
		"\7&\2\2\u0110\u0111\7\16\2\2\u0111\u0116\5D#\2\u0112\u0113\7\24\2\2\u0113"+
		"\u0115\5 \21\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\17\2\2\u011a\u011c\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u010f\3"+
		"\2\2\2\u011c\33\3\2\2\2\u011d\u0122\5\"\22\2\u011e\u011f\7\24\2\2\u011f"+
		"\u0121\5\"\22\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\35\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\5H%\2\u0126\37\3\2\2\2\u0127\u012a\5\"\22\2\u0128\u012a\5D#\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a!\3\2\2\2\u012b\u0132\5$\23\2"+
		"\u012c\u012d\5H%\2\u012d\u012e\7\16\2\2\u012e\u012f\7\17\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u0132\5B\"\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132#\3\2\2\2\u0133\u0138\5&\24\2\u0134\u0135\7\21\2\2"+
		"\u0135\u0137\5&\24\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139%\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u0140\5(\25\2\u013c\u013d\7\33\2\2\u013d\u013f\5(\25\2\u013e\u013c\3"+
		"\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\'\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0149\5,\27\2\u0144\u0145\5*\26\2"+
		"\u0145\u0146\5,\27\2\u0146\u0148\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a)\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\t\6\2\2\u014d+\3\2\2\2\u014e\u0154\5\60\31"+
		"\2\u014f\u0150\5.\30\2\u0150\u0151\5\60\31\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155-\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\t\7\2\2\u0158/\3\2"+
		"\2\2\u0159\u015f\5\64\33\2\u015a\u015b\5\62\32\2\u015b\u015c\5\64\33\2"+
		"\u015c\u015e\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\61\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\t\b\2\2\u0163\63\3\2\2\2\u0164\u016a\58\35\2\u0165\u0166\5\66\34"+
		"\2\u0166\u0167\58\35\2\u0167\u0169\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\65\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\t\t\2\2\u016e\67\3\2\2\2\u016f\u0175\5<\37"+
		"\2\u0170\u0171\5:\36\2\u0171\u0172\5<\37\2\u0172\u0174\3\2\2\2\u0173\u0170"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"9\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\t\n\2\2\u0179;\3\2\2\2\u017a"+
		"\u017c\7\34\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\u017e\5> \2\u017e=\3\2\2\2\u017f\u0181\7\4\2\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5@!\2\u0183"+
		"?\3\2\2\2\u0184\u018c\5F$\2\u0185\u018c\5\32\16\2\u0186\u018c\5B\"\2\u0187"+
		"\u0188\7\16\2\2\u0188\u0189\5\"\22\2\u0189\u018a\7\17\2\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018cA\3\2\2\2\u018d\u0191\5J&\2\u018e\u0191\7\66\2\2\u018f"+
		"\u0191\7#\2\2\u0190\u018d\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2"+
		"\2\2\u0191C\3\2\2\2\u0192\u0193\7\67\2\2\u0193E\3\2\2\2\u0194\u0199\5"+
		"H%\2\u0195\u0196\7\22\2\2\u0196\u0197\5\"\22\2\u0197\u0198\7\23\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u019a\3\2\2\2\u019aG\3\2\2\2"+
		"\u019b\u019c\78\2\2\u019cI\3\2\2\2\u019d\u019e\t\13\2\2\u019eK\3\2\2\2"+
		"(RXbhrx|\u0084\u008f\u0095\u00a2\u00a7\u00ad\u00b3\u00ba\u00c0\u00c9\u00d6"+
		"\u00eb\u00ff\u010d\u0116\u011b\u0122\u0129\u0131\u0138\u0140\u0149\u0154"+
		"\u015f\u016a\u0175\u017b\u0180\u018b\u0190\u0199";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}