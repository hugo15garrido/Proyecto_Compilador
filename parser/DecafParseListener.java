// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;


import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParseListener extends ParseTreeListener {
	void enterLocation(DecafParse.LocationContext ctx);
	void exitLocation(DecafParse.LocationContext ctx);

	void enterExpr2(DecafParse.Expr2Context ctx);
	void exitExpr2(DecafParse.Expr2Context ctx);

	void enterBlock(DecafParse.BlockContext ctx);
	void exitBlock(DecafParse.BlockContext ctx);

	void enterExpresionMetodo(DecafParse.ExpresionMetodoContext ctx);
	void exitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx);

	void enterExpr(DecafParse.ExprContext ctx);
	void exitExpr(DecafParse.ExprContext ctx);

	void enterType(DecafParse.TypeContext ctx);
	void exitType(DecafParse.TypeContext ctx);

	void enterId(DecafParse.IdContext ctx);
	void exitId(DecafParse.IdContext ctx);

	void enterField2(DecafParse.Field2Context ctx);
	void exitField2(DecafParse.Field2Context ctx);

	void enterOperador_suma(DecafParse.Operador_sumaContext ctx);
	void exitOperador_suma(DecafParse.Operador_sumaContext ctx);

	void enterCallout_arg(DecafParse.Callout_argContext ctx);
	void exitCallout_arg(DecafParse.Callout_argContext ctx);

	void enterMethod_call(DecafParse.Method_callContext ctx);
	void exitMethod_call(DecafParse.Method_callContext ctx);

	void enterOp_rel(DecafParse.Op_relContext ctx);
	void exitOp_rel(DecafParse.Op_relContext ctx);

	void enterOp_shift(DecafParse.Op_shiftContext ctx);
	void exitOp_shift(DecafParse.Op_shiftContext ctx);

	void enterOperador_division(DecafParse.Operador_divisionContext ctx);
	void exitOperador_division(DecafParse.Operador_divisionContext ctx);

	void enterMethod_param(DecafParse.Method_paramContext ctx);
	void exitMethod_param(DecafParse.Method_paramContext ctx);

	void enterMinus(DecafParse.MinusContext ctx);
	void exitMinus(DecafParse.MinusContext ctx);

	void enterOp_muldiv(DecafParse.Op_muldivContext ctx);
	void exitOp_muldiv(DecafParse.Op_muldivContext ctx);

	void enterInt_literal(DecafParse.Int_literalContext ctx);
	void exitInt_literal(DecafParse.Int_literalContext ctx);

	void enterMethod_name(DecafParse.Method_nameContext ctx);
	void exitMethod_name(DecafParse.Method_nameContext ctx);

	void enterVar_decl(DecafParse.Var_declContext ctx);
	void exitVar_decl(DecafParse.Var_declContext ctx);

	void enterOperador_rel(DecafParse.Operador_relContext ctx);
	void exitOperador_rel(DecafParse.Operador_relContext ctx);

	void enterNot(DecafParse.NotContext ctx);
	void exitNot(DecafParse.NotContext ctx);

	void enterStatement(DecafParse.StatementContext ctx);
	void exitStatement(DecafParse.StatementContext ctx);

	void enterOp_and(DecafParse.Op_andContext ctx);
	void exitOp_and(DecafParse.Op_andContext ctx);

	void enterOperador_shifft(DecafParse.Operador_shifftContext ctx);
	void exitOperador_shifft(DecafParse.Operador_shifftContext ctx);

	void enterProgram(DecafParse.ProgramContext ctx);
	void exitProgram(DecafParse.ProgramContext ctx);

	void enterElseop(DecafParse.ElseopContext ctx);
	void exitElseop(DecafParse.ElseopContext ctx);

	void enterEq_op(DecafParse.Eq_opContext ctx);
	void exitEq_op(DecafParse.Eq_opContext ctx);

	void enterField_decl(DecafParse.Field_declContext ctx);
	void exitField_decl(DecafParse.Field_declContext ctx);

	void enterOp_or(DecafParse.Op_orContext ctx);
	void exitOp_or(DecafParse.Op_orContext ctx);

	void enterString_literal(DecafParse.String_literalContext ctx);
	void exitString_literal(DecafParse.String_literalContext ctx);

	void enterOp_msm(DecafParse.Op_msmContext ctx);
	void exitOp_msm(DecafParse.Op_msmContext ctx);

	void enterMetodo2(DecafParse.Metodo2Context ctx);
	void exitMetodo2(DecafParse.Metodo2Context ctx);

	void enterOperador_eq(DecafParse.Operador_eqContext ctx);
	void exitOperador_eq(DecafParse.Operador_eqContext ctx);

	void enterLiteral(DecafParse.LiteralContext ctx);
	void exitLiteral(DecafParse.LiteralContext ctx);

	void enterAssign_op(DecafParse.Assign_opContext ctx);
	void exitAssign_op(DecafParse.Assign_opContext ctx);

	void enterMethod_decl(DecafParse.Method_declContext ctx);
	void exitMethod_decl(DecafParse.Method_declContext ctx);
}