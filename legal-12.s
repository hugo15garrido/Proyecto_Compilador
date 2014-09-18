Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: method_call SEMICOLON 

method_call	: method_name ((OPENPAREN expresion_met  CLOSEDPAREN) |(OPENPAREN CLOSEDPAREN))

method_name	: id

id		: IDENTIFIER

id		: IDENTIFIER

metodo2: VOID;

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: FOR id ASSIGNATION expr COLON expr block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

var_decl	: id OPENTHING expr CLOSEDTHING ASSIGNATION expr SEMICOLON

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel(operador_eq op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: location

location	: id (OPENTHING expr CLOSEDTHING)?)

id		: IDENTIFIER

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel(operador_eq op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: location

location	: id (OPENTHING expr CLOSEDTHING)?)

id		: IDENTIFIER

id		: IDENTIFIER

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel(operador_eq op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: literal

literal		: int_literal

int_literal	: HEXADECIMAL

expr		:op_or

op_or		:op_and(OR op_and)*

op_and		:eq_op(AND eq_op )*

eq_op		:op_rel(operador_eq op_rel)*

op_rel		:op_shift((LESSTHAN|GREATERTHAN|GREATERTHANOREQUALTO|LESSTHANOREQUALTO)op_shift)*

op_shift	:op_msm ((SLL|SRL)op_msm)*

op_msm		:op_muldiv ((MINUS|PLUS)op_muldiv)*

op_muldiv	:not((MULTIPLICATION|DIVISION|MOD) not)*

not		: (NOT)? minus

minus		: (MINUS)? expr2

expr2	: literal

literal		: int_literal

int_literal	: NUMBER

id		: IDENTIFIER

id		: IDENTIFIER

metodo2: VOID;

field_decl	: type (field2)(COLON field2)* SEMICOLON

field2: id OPENTHING int_literal CLOSEDTHING

int_literal	: HEXADECIMAL

id		: IDENTIFIER

type		: INT
