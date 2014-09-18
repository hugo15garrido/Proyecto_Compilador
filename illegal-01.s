Stage: parsing

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

id		: IDENTIFIER

metodo2: VOID;
