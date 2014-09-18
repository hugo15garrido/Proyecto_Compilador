// Generated from parser/DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;



import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class DecafParseBaseListener implements DecafParseListener {
	@Override public void enterLocation(DecafParse.LocationContext ctx) { }
	@Override public void exitLocation(DecafParse.LocationContext ctx) { }

	@Override public void enterExpr2(DecafParse.Expr2Context ctx) { }
	@Override public void exitExpr2(DecafParse.Expr2Context ctx) { }

	@Override public void enterBlock(DecafParse.BlockContext ctx) { }
	@Override public void exitBlock(DecafParse.BlockContext ctx) { }

	@Override public void enterExpr(DecafParse.ExprContext ctx) { }
	@Override public void exitExpr(DecafParse.ExprContext ctx) { }

	@Override public void enterType(DecafParse.TypeContext ctx) { }
	@Override public void exitType(DecafParse.TypeContext ctx) { }

	@Override public void enterId(DecafParse.IdContext ctx) { }
	@Override public void exitId(DecafParse.IdContext ctx) { }

	@Override public void enterField2(DecafParse.Field2Context ctx) { }
	@Override public void exitField2(DecafParse.Field2Context ctx) { }

	@Override public void enterCallout_arg(DecafParse.Callout_argContext ctx) { }
	@Override public void exitCallout_arg(DecafParse.Callout_argContext ctx) { }

	@Override public void enterMethod_call(DecafParse.Method_callContext ctx) { }
	@Override public void exitMethod_call(DecafParse.Method_callContext ctx) { }

	@Override public void enterOp_rel(DecafParse.Op_relContext ctx) { }
	@Override public void exitOp_rel(DecafParse.Op_relContext ctx) { }

	@Override public void enterOp_shift(DecafParse.Op_shiftContext ctx) { }
	@Override public void exitOp_shift(DecafParse.Op_shiftContext ctx) { }

	@Override public void enterMinus(DecafParse.MinusContext ctx) { }
	@Override public void exitMinus(DecafParse.MinusContext ctx) { }

	@Override public void enterOp_muldiv(DecafParse.Op_muldivContext ctx) { }
	@Override public void exitOp_muldiv(DecafParse.Op_muldivContext ctx) { }

	@Override public void enterInt_literal(DecafParse.Int_literalContext ctx) { }
	@Override public void exitInt_literal(DecafParse.Int_literalContext ctx) { }

	@Override public void enterMethod_name(DecafParse.Method_nameContext ctx) { }
	@Override public void exitMethod_name(DecafParse.Method_nameContext ctx) { }

	@Override public void enterVar_decl(DecafParse.Var_declContext ctx) { }
	@Override public void exitVar_decl(DecafParse.Var_declContext ctx) { }

	@Override public void enterStatement(DecafParse.StatementContext ctx) { }
	@Override public void exitStatement(DecafParse.StatementContext ctx) { }

	@Override public void enterOp_and(DecafParse.Op_andContext ctx) { }
	@Override public void exitOp_and(DecafParse.Op_andContext ctx) { }

	@Override public void enterNot(DecafParse.NotContext ctx) { }
	@Override public void exitNot(DecafParse.NotContext ctx) { }

	@Override public void enterProgram(DecafParse.ProgramContext ctx) { }
	@Override public void exitProgram(DecafParse.ProgramContext ctx) { }

	@Override public void enterEq_op(DecafParse.Eq_opContext ctx) { }
	@Override public void exitEq_op(DecafParse.Eq_opContext ctx) { }

	@Override public void enterField_decl(DecafParse.Field_declContext ctx) { }
	@Override public void exitField_decl(DecafParse.Field_declContext ctx) { }

	@Override public void enterOp_or(DecafParse.Op_orContext ctx) { }
	@Override public void exitOp_or(DecafParse.Op_orContext ctx) { }

	@Override public void enterString_literal(DecafParse.String_literalContext ctx) { }
	@Override public void exitString_literal(DecafParse.String_literalContext ctx) { }

	@Override public void enterMetodo2(DecafParse.Metodo2Context ctx) { }
	@Override public void exitMetodo2(DecafParse.Metodo2Context ctx) { }

	@Override public void enterOp_msm(DecafParse.Op_msmContext ctx) { }
	@Override public void exitOp_msm(DecafParse.Op_msmContext ctx) { }

	@Override public void enterLiteral(DecafParse.LiteralContext ctx) { }
	@Override public void exitLiteral(DecafParse.LiteralContext ctx) { }

	@Override public void enterAssign_op(DecafParse.Assign_opContext ctx) { }
	@Override public void exitAssign_op(DecafParse.Assign_opContext ctx) { }

	@Override public void enterMethod_decl(DecafParse.Method_declContext ctx) { }
	@Override public void exitMethod_decl(DecafParse.Method_declContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}