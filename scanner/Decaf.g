lexer grammar Decaf;

@header{
	package compiler.scanner;
	import compiler.lib.*;
}
@members{
	public void Error(String msg, int line){
		ErrorHandler e = new ErrorHandler();
		e.scannerError(msg,line);
	}
}

/*-----------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

PLUS		:	'+' ;
MINUS		: 	'-';
MULTIPLICATION	: 	'*';
DIVISION	: 	'/';
NUMBER		 :  (DIGIT)+{try{
						Integer.parseInt(getText());
					}catch(NumberFormatException nfe){
					//System.err.println("ERROR  Overflow.....     Line:" +getLine());
						Error("Overflow... " +"\"" + getText() + "\"", getLine()); 
						
					}}; 
						        
SEMICOLON	: ';';
WHITESPACE 	: 	( '\t' | '\n' | ' ' | '\r')+ {skip();};
fragment DIGIT	: '0'..'9' ;
COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {skip();}; 
HEXADECIMAL	: '0' ('x'|'X') ('A'..'F' | 'a'..'f'| DIGIT)+{try{
																Integer.parseInt(getText());
															}catch(NumberFormatException nfe){
																//Error("Overflow... " +"\"" +getText()+ "\"",getLine());
																//System.err.println("ERROR Overflow.....     Line:" +getLine());
															}}; 
EQUALS		: '==';
ASSIGNATION	: '=';
OPENPAREN	: '(';
CLOSEDPAREN	: ')';
OPENBRACE	: '{';
OR		: '||';
OPENTHING	: '[';
CLOSEDTHING	: ']';
COLON		: ',';
MOD		: '%';
CLOSEDBRACE	: '}';
GREATERTHAN	: '<';
GREATEROREQUALTO: '<=';
PLUSEQUAL	: '+='; 
NOTEQUAL	: '!=';
AND		: '&&';
NOT		: '!';
LESSTHAN	: '>';
LESSOREQUAL	: '>=';
OPENBRACKET	: '[';
CLOSEDBRACKET	: ']';
GREATERTHANOREQUALTO: '<=';
LESSTHANOREQUALTO	: '>=';
BOOLEAN	: ('true'|'false');
BOOLEANN		: 'boolean';
BREAK		: 'break';
CALLOUT		: 'callout';
CLASS		: 'class';
PROGRAM		: 'Program';
CONTINUE	: 'continue';
ELSE		: 'else';				
FOR		: 'for';			
SLL		:'>>';
SRL		:'<<';
IF		: 'if';
INT		: 'int' ;
INVALIDSINGLEQUOTE : '\'' '\'' '\''{Error("ERROR: INVALID SINGLE QUOTE" +"\"" +getText()+ "\"", getLine());};
RETURN		: 'return';
VOID		: 'void';
INVALIDDOUBLEQUOTE : '\'' '"' '\''{Error("ERROR: INVALID DOUBLE QUOTE" +"\"" +getText()+ "\"",getLine());};
INVALIDSYMBOL: ('$'|'#'|'.'|':'|'~'|'?'|'^'|'@'|'&'|'|'|'´'|'`'|'\\') {Error("ERROR: INVALID SYMBOL" +"\"" +getText()+ "\"", getLine());};
INVALIDNEWLINE: '\'' '\n' '\''{Error("ERROR: INVALID NEWLINE" +"\"" +getText()+ "\"", getLine());};
SINGLECHAR 	: '\''('\\'('!'..'~')|('!'..'~')|' '|)'\''; 
STRING		: '"' (('!'..'~')|'\t'|' ')+  '"' ;
IDENTIFIER	:  ('a'..'z'|'A'..'Z'|'_'|DIGIT)+;
ONE_CHAR 	: '\'' (SINGLECHAR)(SINGLECHAR)+ '\'' {Error("ERROR: TWO CHAR IS NOT VALID" +"\"" +getText()+ "\"", getLine());};
ASSIGN_ERROR 		: ('*'|'/'|'-')'='{Error("ERROR: INVALID ASIGN" +"\"" +getText()+ "\"", getLine());};