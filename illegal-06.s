Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

field_decl	: type (field2)(COLON field2)* SEMICOLON

int_literal	: NUMBER

id		: IDENTIFIER

type		: INT
