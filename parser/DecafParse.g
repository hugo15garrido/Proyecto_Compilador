parser grammar DecafParse;

options{
	tokenVocab=Decaf;
}

@parser::header
{package compiler.parser;
	import compiler.lib.*;

}

tokens{
	EXPR
}

@parser::members{
	public void Error(String msg, int line){
		ErrorHandler e = new ErrorHandler();
		e.parserError(msg,line);
	}
}

program		: CLASS PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE 
			  |~CLASS PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE  
			  |CLASS ~PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE;
			  
field_decl	: type (field2)(COLON field2)* SEMICOLON;
			
field2:	id |id  OPENTHING int_literal CLOSEDTHING;

method_decl	:metodo2 id OPENPAREN method_param? CLOSEDPAREN block;

method_param : type id (COLON type id)*;

metodo2: type|VOID;
				 
block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*;
			
var_decl	: type id (COLON id)* SEMICOLON | id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON;

type		: INT|BOOLEANN;

statement	: location assign_op expr SEMICOLON 
		| method_call SEMICOLON   | method_call
		| IF OPENPAREN expr CLOSEDPAREN block elseop* 
		| FOR id ASSIGNATION expr COLON expr block 
		| RETURN expr SEMICOLON 
		| BREAK SEMICOLON 
		| CONTINUE SEMICOLON 
		| block ;

elseop : ELSE block ;
		
assign_op	: ASSIGNATION  | PLUSEQUAL ;

method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN))
				| CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN;	
				
expresion_met :	expr (COLON expr)* #ExpresionMetodo;
method_name	: id ;
callout_arg	: expr | string_literal;
expr		:op_or | id OPENPAREN CLOSEDPAREN | literal;
op_or		:op_and(OR op_and)*; 
op_and		:eq_op(AND eq_op )*;
eq_op		:op_rel(operador_eq op_rel)*;
operador_eq : (EQUALS| NOTEQUAL);
op_rel		:op_shift(operador_rel op_shift)*;
operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO);
op_shift	:op_msm (operador_shifft op_msm)*;
operador_shifft: (SLL|SRL);
op_msm		:op_muldiv (operador_suma op_muldiv)*;
operador_suma: (MINUS|PLUS);
op_muldiv	:not(operador_division not)*;
operador_division: (MULTIPLICATION|DIVISION|MOD);
not		: (NOT)? minus;
minus		: (MINUS)? expr2;
expr2	: location| method_call | literal | OPENPAREN expr CLOSEDPAREN ;
literal		: int_literal |SINGLECHAR |BOOLEAN;
string_literal	: STRING;
location	: (id (OPENTHING expr CLOSEDTHING)?);
id		: IDENTIFIER;
int_literal	: NUMBER |HEXADECIMAL ;