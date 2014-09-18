Stage: parsing

program:  CLASS PROGRAM LBRACE (field_decl)*  	(method_decl)* RBRACE

field_decl	: type (field2)(COLON field2)* SEMICOLON

field2: id OPENTHING int_literal CLOSEDTHING

id		: IDENTIFIER

type		: INT
