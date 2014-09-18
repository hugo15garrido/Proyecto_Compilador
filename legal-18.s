Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

id		: IDENTIFIER

metodo2: VOID;

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: method_call SEMICOLON 

method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN))

method_name	: id

id		: IDENTIFIER

id		: IDENTIFIER

metodo2: VOID;
