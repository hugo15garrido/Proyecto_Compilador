Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

metodo2 id OPENPAREN method_param? CLOSEDPAREN block

block		: OPENBRACE var_decl* statement* CLOSEDBRACE var_decl* statement*

statement	: method_call SEMICOLON 

method_call	: CALLOUT OPENPAREN string_literal ((COLON callout_arg )*) CLOSEDPAREN

callout_arg	: expr

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

string_literal	: STRING

statement	: location assign_op expr SEMICOLON

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

literal		: SINGLECHAR

assign_op	: ASSIGNATION

location	: id (OPENTHING expr CLOSEDTHING)?)

id		: IDENTIFIER

var_decl	: type id (COLON id)* SEMICOLON

id		: IDENTIFIER

type		: INT

id		: IDENTIFIER

metodo2: VOID;
