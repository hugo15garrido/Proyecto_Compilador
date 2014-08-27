// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;



import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class DecafParseBaseListener implements DecafParseListener {
	@Override public void enterBreakSemi(DecafParse.BreakSemiContext ctx) { }
	@Override public void exitBreakSemi(DecafParse.BreakSemiContext ctx) { }

	@Override public void enterBlockExpr(DecafParse.BlockExprContext ctx) { }
	@Override public void exitBlockExpr(DecafParse.BlockExprContext ctx) { }

	@Override public void enterRoot(DecafParse.RootContext ctx) { }
	@Override public void exitRoot(DecafParse.RootContext ctx) { }

	@Override public void enterIntType(DecafParse.IntTypeContext ctx) { }
	@Override public void exitIntType(DecafParse.IntTypeContext ctx) { }

	@Override public void enterLocationOp(DecafParse.LocationOpContext ctx) { }
	@Override public void exitLocationOp(DecafParse.LocationOpContext ctx) { }

	@Override public void enterAsignationColon(DecafParse.AsignationColonContext ctx) { }
	@Override public void exitAsignationColon(DecafParse.AsignationColonContext ctx) { }

	@Override public void enterOpAnd(DecafParse.OpAndContext ctx) { }
	@Override public void exitOpAnd(DecafParse.OpAndContext ctx) { }

	@Override public void enterStatement2(DecafParse.Statement2Context ctx) { }
	@Override public void exitStatement2(DecafParse.Statement2Context ctx) { }

	@Override public void enterStatement1(DecafParse.Statement1Context ctx) { }
	@Override public void exitStatement1(DecafParse.Statement1Context ctx) { }

	@Override public void enterMethodDecl(DecafParse.MethodDeclContext ctx) { }
	@Override public void exitMethodDecl(DecafParse.MethodDeclContext ctx) { }

	@Override public void enterIdentifier(DecafParse.IdentifierContext ctx) { }
	@Override public void exitIdentifier(DecafParse.IdentifierContext ctx) { }

	@Override public void enterLiteralBoolean(DecafParse.LiteralBooleanContext ctx) { }
	@Override public void exitLiteralBoolean(DecafParse.LiteralBooleanContext ctx) { }

	@Override public void enterIntLiteralHex(DecafParse.IntLiteralHexContext ctx) { }
	@Override public void exitIntLiteralHex(DecafParse.IntLiteralHexContext ctx) { }

	@Override public void enterAssignOp1(DecafParse.AssignOp1Context ctx) { }
	@Override public void exitAssignOp1(DecafParse.AssignOp1Context ctx) { }

	@Override public void enterOpMinus(DecafParse.OpMinusContext ctx) { }
	@Override public void exitOpMinus(DecafParse.OpMinusContext ctx) { }

	@Override public void enterAssignOp2(DecafParse.AssignOp2Context ctx) { }
	@Override public void exitAssignOp2(DecafParse.AssignOp2Context ctx) { }

	@Override public void enterFielddecl1(DecafParse.Fielddecl1Context ctx) { }
	@Override public void exitFielddecl1(DecafParse.Fielddecl1Context ctx) { }

	@Override public void enterMethodParameter(DecafParse.MethodParameterContext ctx) { }
	@Override public void exitMethodParameter(DecafParse.MethodParameterContext ctx) { }

	@Override public void enterFielddecl2(DecafParse.Fielddecl2Context ctx) { }
	@Override public void exitFielddecl2(DecafParse.Fielddecl2Context ctx) { }

	@Override public void enterLiteralChar(DecafParse.LiteralCharContext ctx) { }
	@Override public void exitLiteralChar(DecafParse.LiteralCharContext ctx) { }

	@Override public void enterVardeclaration(DecafParse.VardeclarationContext ctx) { }
	@Override public void exitVardeclaration(DecafParse.VardeclarationContext ctx) { }

	@Override public void enterLiteralExpr2(DecafParse.LiteralExpr2Context ctx) { }
	@Override public void exitLiteralExpr2(DecafParse.LiteralExpr2Context ctx) { }

	@Override public void enterLiteralInt(DecafParse.LiteralIntContext ctx) { }
	@Override public void exitLiteralInt(DecafParse.LiteralIntContext ctx) { }

	@Override public void enterOpDivision(DecafParse.OpDivisionContext ctx) { }
	@Override public void exitOpDivision(DecafParse.OpDivisionContext ctx) { }

	@Override public void enterForAssignation(DecafParse.ForAssignationContext ctx) { }
	@Override public void exitForAssignation(DecafParse.ForAssignationContext ctx) { }

	@Override public void enterBooleannType(DecafParse.BooleannTypeContext ctx) { }
	@Override public void exitBooleannType(DecafParse.BooleannTypeContext ctx) { }

	@Override public void enterStatement111(DecafParse.Statement111Context ctx) { }
	@Override public void exitStatement111(DecafParse.Statement111Context ctx) { }

	@Override public void enterOpEqual(DecafParse.OpEqualContext ctx) { }
	@Override public void exitOpEqual(DecafParse.OpEqualContext ctx) { }

	@Override public void enterExprAst2(DecafParse.ExprAst2Context ctx) { }
	@Override public void exitExprAst2(DecafParse.ExprAst2Context ctx) { }

	@Override public void enterBlockStatement(DecafParse.BlockStatementContext ctx) { }
	@Override public void exitBlockStatement(DecafParse.BlockStatementContext ctx) { }

	@Override public void enterMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx) { }
	@Override public void exitMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx) { }

	@Override public void enterOperadorel(DecafParse.OperadorelContext ctx) { }
	@Override public void exitOperadorel(DecafParse.OperadorelContext ctx) { }

	@Override public void enterLocation1(DecafParse.Location1Context ctx) { }
	@Override public void exitLocation1(DecafParse.Location1Context ctx) { }

	@Override public void enterLiteralString(DecafParse.LiteralStringContext ctx) { }
	@Override public void exitLiteralString(DecafParse.LiteralStringContext ctx) { }

	@Override public void enterExpreParen(DecafParse.ExpreParenContext ctx) { }
	@Override public void exitExpreParen(DecafParse.ExpreParenContext ctx) { }

	@Override public void enterOperadoreq(DecafParse.OperadoreqContext ctx) { }
	@Override public void exitOperadoreq(DecafParse.OperadoreqContext ctx) { }

	@Override public void enterOpShifft1(DecafParse.OpShifft1Context ctx) { }
	@Override public void exitOpShifft1(DecafParse.OpShifft1Context ctx) { }

	@Override public void enterOpMuldDiv(DecafParse.OpMuldDivContext ctx) { }
	@Override public void exitOpMuldDiv(DecafParse.OpMuldDivContext ctx) { }

	@Override public void enterCalloutArg2(DecafParse.CalloutArg2Context ctx) { }
	@Override public void exitCalloutArg2(DecafParse.CalloutArg2Context ctx) { }

	@Override public void enterExpresionMetodo(DecafParse.ExpresionMetodoContext ctx) { }
	@Override public void exitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx) { }

	@Override public void enterMethodCall(DecafParse.MethodCallContext ctx) { }
	@Override public void exitMethodCall(DecafParse.MethodCallContext ctx) { }

	@Override public void enterOperadorSuma(DecafParse.OperadorSumaContext ctx) { }
	@Override public void exitOperadorSuma(DecafParse.OperadorSumaContext ctx) { }

	@Override public void enterCalloutArg1(DecafParse.CalloutArg1Context ctx) { }
	@Override public void exitCalloutArg1(DecafParse.CalloutArg1Context ctx) { }

	@Override public void enterOperadorShifft(DecafParse.OperadorShifftContext ctx) { }
	@Override public void exitOperadorShifft(DecafParse.OperadorShifftContext ctx) { }

	@Override public void enterMethodName(DecafParse.MethodNameContext ctx) { }
	@Override public void exitMethodName(DecafParse.MethodNameContext ctx) { }

	@Override public void enterExpr3(DecafParse.Expr3Context ctx) { }
	@Override public void exitExpr3(DecafParse.Expr3Context ctx) { }

	@Override public void enterContinueSemi(DecafParse.ContinueSemiContext ctx) { }
	@Override public void exitContinueSemi(DecafParse.ContinueSemiContext ctx) { }

	@Override public void enterExpr1(DecafParse.Expr1Context ctx) { }
	@Override public void exitExpr1(DecafParse.Expr1Context ctx) { }

	@Override public void enterCallMethod(DecafParse.CallMethodContext ctx) { }
	@Override public void exitCallMethod(DecafParse.CallMethodContext ctx) { }

	@Override public void enterMethodCall1(DecafParse.MethodCall1Context ctx) { }
	@Override public void exitMethodCall1(DecafParse.MethodCall1Context ctx) { }

	@Override public void enterMethodCall2(DecafParse.MethodCall2Context ctx) { }
	@Override public void exitMethodCall2(DecafParse.MethodCall2Context ctx) { }

	@Override public void enterIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx) { }
	@Override public void exitIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx) { }

	@Override public void enterRoot2(DecafParse.Root2Context ctx) { }
	@Override public void exitRoot2(DecafParse.Root2Context ctx) { }

	@Override public void enterMethodDeclType(DecafParse.MethodDeclTypeContext ctx) { }
	@Override public void exitMethodDeclType(DecafParse.MethodDeclTypeContext ctx) { }

	@Override public void enterOpShifft(DecafParse.OpShifftContext ctx) { }
	@Override public void exitOpShifft(DecafParse.OpShifftContext ctx) { }

	@Override public void enterOpMsm(DecafParse.OpMsmContext ctx) { }
	@Override public void exitOpMsm(DecafParse.OpMsmContext ctx) { }

	@Override public void enterFielddecl(DecafParse.FielddeclContext ctx) { }
	@Override public void exitFielddecl(DecafParse.FielddeclContext ctx) { }

	@Override public void enterMethodDecl2(DecafParse.MethodDecl2Context ctx) { }
	@Override public void exitMethodDecl2(DecafParse.MethodDecl2Context ctx) { }

	@Override public void enterOpOr(DecafParse.OpOrContext ctx) { }
	@Override public void exitOpOr(DecafParse.OpOrContext ctx) { }

	@Override public void enterBlockdefinition(DecafParse.BlockdefinitionContext ctx) { }
	@Override public void exitBlockdefinition(DecafParse.BlockdefinitionContext ctx) { }

	@Override public void enterOpNot(DecafParse.OpNotContext ctx) { }
	@Override public void exitOpNot(DecafParse.OpNotContext ctx) { }

	@Override public void enterRoot1(DecafParse.Root1Context ctx) { }
	@Override public void exitRoot1(DecafParse.Root1Context ctx) { }

	@Override public void enterMethodParameter1(DecafParse.MethodParameter1Context ctx) { }
	@Override public void exitMethodParameter1(DecafParse.MethodParameter1Context ctx) { }

	@Override public void enterVardeclaration1(DecafParse.Vardeclaration1Context ctx) { }
	@Override public void exitVardeclaration1(DecafParse.Vardeclaration1Context ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}