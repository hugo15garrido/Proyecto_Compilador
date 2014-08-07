// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;


import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParseVisitor<T> extends ParseTreeVisitor<T> {
	T visitLocation(DecafParse.LocationContext ctx);

	T visitExpr2(DecafParse.Expr2Context ctx);

	T visitBlock(DecafParse.BlockContext ctx);

	T visitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx);

	T visitExpr(DecafParse.ExprContext ctx);

	T visitType(DecafParse.TypeContext ctx);

	T visitId(DecafParse.IdContext ctx);

	T visitField2(DecafParse.Field2Context ctx);

	T visitOperador_suma(DecafParse.Operador_sumaContext ctx);

	T visitCallout_arg(DecafParse.Callout_argContext ctx);

	T visitMethod_call(DecafParse.Method_callContext ctx);

	T visitOp_rel(DecafParse.Op_relContext ctx);

	T visitOp_shift(DecafParse.Op_shiftContext ctx);

	T visitOperador_division(DecafParse.Operador_divisionContext ctx);

	T visitMethod_param(DecafParse.Method_paramContext ctx);

	T visitMinus(DecafParse.MinusContext ctx);

	T visitOp_muldiv(DecafParse.Op_muldivContext ctx);

	T visitInt_literal(DecafParse.Int_literalContext ctx);

	T visitMethod_name(DecafParse.Method_nameContext ctx);

	T visitVar_decl(DecafParse.Var_declContext ctx);

	T visitOperador_rel(DecafParse.Operador_relContext ctx);

	T visitNot(DecafParse.NotContext ctx);

	T visitStatement(DecafParse.StatementContext ctx);

	T visitOp_and(DecafParse.Op_andContext ctx);

	T visitOperador_shifft(DecafParse.Operador_shifftContext ctx);

	T visitProgram(DecafParse.ProgramContext ctx);

	T visitElseop(DecafParse.ElseopContext ctx);

	T visitEq_op(DecafParse.Eq_opContext ctx);

	T visitField_decl(DecafParse.Field_declContext ctx);

	T visitOp_or(DecafParse.Op_orContext ctx);

	T visitString_literal(DecafParse.String_literalContext ctx);

	T visitOp_msm(DecafParse.Op_msmContext ctx);

	T visitMetodo2(DecafParse.Metodo2Context ctx);

	T visitOperador_eq(DecafParse.Operador_eqContext ctx);

	T visitLiteral(DecafParse.LiteralContext ctx);

	T visitAssign_op(DecafParse.Assign_opContext ctx);

	T visitMethod_decl(DecafParse.Method_declContext ctx);
}