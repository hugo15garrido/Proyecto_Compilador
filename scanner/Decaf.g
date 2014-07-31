lexer grammar Decaf;

@header{
	package compiler.scanner;
	import compiler.lib.*;
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
					System.err.println("ERROR  Overflow.....");
					}}; 
						        
SEMICOLON	: ';';
WHITESPACE 	: 	( '\t' | '\n' | ' ' | '\r')+ {skip();};
fragment DIGIT	: '0'..'9' ;
COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {skip();}; 
HEXADECIMAL	: '0' ('x'|'X') ('A'..'F' | 'a'..'f'| DIGIT)+{try{
																Integer.parseInt(getText());
															}catch(NumberFormatException nfe){
																System.err.println("ERROR Overflow.....");
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
RETURN		: 'return';
VOID		: 'void';
SINGLECHAR 	: '\''('\\'('!'..'~')|('!'..'~')|' '|)'\''; 
STRING		: '"' (('!'..'~')|'\t'|' ')+  '"' ;
IDENTIFIER	:  ('a'..'z'|'A'..'Z'|'_'|DIGIT)+;