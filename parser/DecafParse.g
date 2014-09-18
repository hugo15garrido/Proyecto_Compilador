parser grammar DecafParse;

options{
	tokenVocab=Decaf;
}

@parser::header
{package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;

}

tokens{
	EXPR;
}

@parser::members{

	public Stack<String> stack1 = new Stack<String>();
	public Stack<String> stack2 = new Stack<String>();

	public void Error(String msg, int line){
		ErrorHandler e = new ErrorHandler();
		e.parserError(msg,line);
	}
}

program		: CLASS PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE 
{ stack1.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");}
{ stack2.push("program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE");} #root
			  |~CLASS PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE {Error("Expecting \"CLASS\" ", ((TokenStream) this).LT(-1).getLine() );} #root1 
			  |CLASS ~PROGRAM OPENBRACE field_decl* method_decl* CLOSEDBRACE {Error("Expecting \"Program\" ", ((TokenStream) this).LT(-1).getLine());}#root2;
			  
field_decl	: type (field2)(COLON field2)* SEMICOLON 
{ stack1.push("field_decl	: type (field2)(COLON field2)* SEMICOLON");}
{ stack2.push("field_decl	: type (field2)(COLON field2)* SEMICOLON");} #fielddecl;
			
field2:	id  { stack1.push("field2: id");}{ stack2.push("field2: id");} #fielddecl1
		|id  OPENTHING int_literal CLOSEDTHING { stack1.push("field2: id OPENTHING int_literal CLOSEDTHING");}{ stack2.push("field2: id OPENTHING int_literal CLOSEDTHING");} #fielddecl2;

method_decl	:metodo2 id OPENPAREN method_param? CLOSEDPAREN block 
{ stack1.push("metodo2 id OPENPAREN method_param? CLOSEDPAREN block");}
{ stack2.push("metodo2 id OPENPAREN method_param? CLOSEDPAREN block");}#methodDecl;

method_param : type id (COLON type id)* 
{ stack1.push("type id (COLON type id)* ");}
{ stack2.push("type id (COLON type id)* ");} #methodParameter;

metodo2: type 
{ stack1.push("metodo2: type;");}
{ stack2.push("metodo2: type;");} #methodDeclType
	|VOID 
{ stack1.push("metodo2: VOID;");}
{ stack2.push("metodo2: VOID;");} #methodDeclVoid;
				 
block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement* 
{ stack1.push("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");}
{ stack2.push("block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*");} #blockdefinition;
			
var_decl	: type id (COLON id)* SEMICOLON 
{ stack1.push("var_decl	: type id (COLON id)* SEMICOLON");}
{ stack2.push("var_decl	: type id (COLON id)* SEMICOLON");} #vardeclaration| 
id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON 
{ stack1.push("var_decl	: id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON");}
{ stack2.push("var_decl	: id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON");} #vardeclaration1;

type		: INT 
{ stack1.push("type		: INT");}
{ stack2.push("type		: INT");} #intType
|BOOLEANN 
{ stack1.push("type		: BOOLEANN");}
{ stack2.push("type		: BOOLEANN");} #BooleannType;

statement	: location assign_op expr SEMICOLON  { stack1.push("statement	: location assign_op expr SEMICOLON");} { stack2.push("statement	: location assign_op expr SEMICOLON");} #statement1
		| method_call SEMICOLON  { stack1.push("statement	: method_call SEMICOLON ");} { stack2.push("statement	: method_call SEMICOLON ");} #statement2 | method_call{ stack1.push("statement	: method_call");} { stack2.push("statement	: method_call");} #callMethod
		| IF OPENPAREN expr CLOSEDPAREN block elseop* { stack1.push("statement	: IF OPENPAREN expr CLOSEDPAREN block (ELSE (block))");}{ stack2.push("statement	: IF OPENPAREN expr CLOSEDPAREN block (ELSE (block))");} #BlockExpr
		| FOR id ASSIGNATION expr COLON expr block { stack1.push("statement	: FOR id ASSIGNATION expr COLON expr block");}{ stack2.push("statement	: FOR id ASSIGNATION expr COLON expr block");} #ForAssignation
		| RETURN expr SEMICOLON  { stack1.push("statement	: RETURN expr SEMICOLON");}{ stack2.push("statement	: RETURN expr SEMICOLON");} #AsignationColon
		| BREAK SEMICOLON { stack1.push("statement	: BREAK SEMICOLON");}{ stack2.push("statement	: BREAK SEMICOLON");} #BreakSemi
		| CONTINUE SEMICOLON  { stack1.push("statement	: CONTINUE SEMICOLON");}{ stack2.push("statement	: CONTINUE SEMICOLON");} #ContinueSemi
		| block { stack1.push("statement	: block");}{ stack2.push("statement	: block");} #BlockStatement;

elseop : ELSE block { stack1.push("elseop : ELSE block");}{ stack2.push("elseop : ELSE block");} #statement111;
		
assign_op	: ASSIGNATION { stack1.push("assign_op	: ASSIGNATION");}{ stack2.push("assign_op	: ASSIGNATION");} #AssignOp1 | PLUSEQUAL { stack1.push("assign_op	: PLUSEQUAL");}{ stack2.push("assign_op	: PLUSEQUAL");} #AssignOp2;

method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN)) { stack1.push("method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN))");}{ stack2.push("method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN))");}  #MethodCall1
				| CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN { stack1.push("method_call	: CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN");}{ stack2.push("method_call	: CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN");} #MethodCall2;	

expresion_met :	expr (COLON expr)* #ExpresionMetodo;

method_name	: id { stack1.push("method_name	: id");}{ stack2.push("method_name	: id");} #MethodName;

callout_arg	: expr { stack1.push("callout_arg	: expr");}{ stack2.push("callout_arg	: expr");} #CalloutArg1| string_literal{ stack1.push("callout_arg	: string_literal");}{ stack2.push("callout_arg	: string_literal");} #CalloutArg2;

expr		:op_or { stack1.push("expr		:op_or");}{ stack2.push("expr		:op_or");} #Expr1| id OPENPAREN CLOSEDPAREN { stack1.push("expr		:id OPENPAREN CLOSEDPAREN");}{ stack2.push("expr		:id OPENPAREN CLOSEDPAREN");}  #ExprAst2| literal{ stack1.push("expr		:literal");}{ stack2.push("expr		:literal");}#Expr3;

op_or		:op_and(OR op_and)*{ stack1.push("op_or		:op_and(OR op_and)*");}{ stack2.push("op_or		:op_and(OR op_and)*");} #OpOr; 

op_and		:eq_op(AND eq_op )*{ stack1.push("op_and		:eq_op(AND eq_op )*");}{ stack2.push("op_and		:eq_op(AND eq_op )*");} #OpAnd;

eq_op		:op_rel(operador_eq op_rel)* { stack1.push("eq_op		:op_rel(operador_eq op_rel)*");}{ stack2.push("eq_op		:op_rel(operador_eq op_rel)*");} #OpEqual;

operador_eq : (EQUALS| NOTEQUAL) { stack1.push("operador_eq : (EQUALS| NOTEQUAL)");} { stack2.push("operador_eq : (EQUALS| NOTEQUAL)");} #operadoreq;

op_rel		:op_shift(operador_rel op_shift)*{ stack1.push("op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*");}{ stack2.push("op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*");} #OpShifft;

operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO) { stack1.push("operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)");} { stack2.push("operador_rel : (LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)");} #operadorel;

op_shift	:op_msm (operador_shifft op_msm)* { stack1.push("op_shift	:op_msm ((SLL|SRL)op_msm)*");}{ stack2.push("op_shift	:op_msm ((SLL|SRL)op_msm)*");} #OpShifft1;

operador_shifft: (SLL|SRL) { stack1.push("operador_shifft: (SLL|SRL)");} { stack2.push("operador_shifft: (SLL|SRL)");} #operadorShifft;

op_msm		:op_muldiv (operador_suma op_muldiv)* { stack1.push("op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*");}{ stack2.push("op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*");} #OpMsm;

operador_suma: (MINUS|PLUS) { stack1.push("operador_suma: (MINUS|PLUS)");} { stack2.push("operador_suma: (MINUS|PLUS)");} #operadorSuma;

op_muldiv	:not(operador_division not)* { stack1.push("op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*");}{ stack2.push("op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*");} #OpMuldDiv;

operador_division: (MULTIPLICATION|DIVISION|MOD) { stack1.push("operador_division: (MULTIPLICATION|DIVISION|MOD)");} { stack2.push("operador_division: (MULTIPLICATION|DIVISION|MOD)");}   #OpDivision;

not		: (NOT)? minus { stack1.push("not		: (NOT)? minus");}{ stack2.push("not		: (NOT)? minus");} #OpNot;

minus		: (MINUS)? expr2 { stack1.push("minus		: (MINUS)? expr2");}{ stack2.push("minus		: (MINUS)? expr2");}#OpMinus;

expr2	: location { stack1.push("expr2	: location");}{ stack2.push("expr2	: location");} #LocationOp
		| method_call { stack1.push("expr2	: method_call");}{ stack2.push("expr2	: method_call");} #MethodCall 
		| literal { stack1.push("expr2	: literal");}{ stack2.push("expr2	: literal");} #LiteralExpr2
		| OPENPAREN expr CLOSEDPAREN { stack1.push("expr2	: OPENPAREN expr CLOSEDPAREN");}{ stack2.push("expr2	: OPENPAREN expr CLOSEDPAREN");} #ExpreParen;

literal		: int_literal { stack1.push("literal		: int_literal");}{ stack2.push("literal		: int_literal");} #LiteralInt|SINGLECHAR { stack1.push("literal		: SINGLECHAR");}{ stack2.push("literal		: SINGLECHAR");} #LiteralChar|BOOLEAN { stack1.push("literal		: BOOLEAN");}{ stack2.push("literal		: BOOLEAN");} #LiteralBoolean;

string_literal	: STRING { stack1.push("string_literal	: STRING");}{ stack2.push("string_literal	: STRING");} #LiteralString;

location	: (id (OPENTHING expr CLOSEDTHING)?) { stack1.push("location	: id (OPENTHING expr CLOSEDTHING)?)");}{ stack2.push("location	: (id (OPENTHING expr CLOSEDTHING)?)");} #Location1;

id		: IDENTIFIER { stack1.push("id		: IDENTIFIER");}{ stack2.push("id		: IDENTIFIER");} #Identifier;

int_literal	: NUMBER { stack1.push("int_literal	: NUMBER");}{ stack2.push("int_literal	: NUMBER");} #IntLiteralNumber|HEXADECIMAL { stack1.push("int_literal	: HEXADECIMAL");}{ stack2.push("int_literal	: HEXADECIMAL");}#IntLiteralHex;