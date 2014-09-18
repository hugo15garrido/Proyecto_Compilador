Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

var_decl	: type id (COLON id)* SEMICOLON

id		: IDENTIFIER

id		: IDENTIFIER

type		: BOOLEANN

id		: IDENTIFIER

metodo2: VOID;
