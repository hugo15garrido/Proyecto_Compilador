// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;


import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DecafParseListener extends ParseTreeListener {
	void enterBreakSemi(DecafParse.BreakSemiContext ctx);
	void exitBreakSemi(DecafParse.BreakSemiContext ctx);

	void enterBlockExpr(DecafParse.BlockExprContext ctx);
	void exitBlockExpr(DecafParse.BlockExprContext ctx);

	void enterRoot(DecafParse.RootContext ctx);
	void exitRoot(DecafParse.RootContext ctx);

	void enterIntType(DecafParse.IntTypeContext ctx);
	void exitIntType(DecafParse.IntTypeContext ctx);

	void enterLocationOp(DecafParse.LocationOpContext ctx);
	void exitLocationOp(DecafParse.LocationOpContext ctx);

	void enterAsignationColon(DecafParse.AsignationColonContext ctx);
	void exitAsignationColon(DecafParse.AsignationColonContext ctx);

	void enterOpAnd(DecafParse.OpAndContext ctx);
	void exitOpAnd(DecafParse.OpAndContext ctx);

	void enterStatement2(DecafParse.Statement2Context ctx);
	void exitStatement2(DecafParse.Statement2Context ctx);

	void enterStatement1(DecafParse.Statement1Context ctx);
	void exitStatement1(DecafParse.Statement1Context ctx);

	void enterMethodDecl(DecafParse.MethodDeclContext ctx);
	void exitMethodDecl(DecafParse.MethodDeclContext ctx);

	void enterIdentifier(DecafParse.IdentifierContext ctx);
	void exitIdentifier(DecafParse.IdentifierContext ctx);

	void enterLiteralBoolean(DecafParse.LiteralBooleanContext ctx);
	void exitLiteralBoolean(DecafParse.LiteralBooleanContext ctx);

	void enterIntLiteralHex(DecafParse.IntLiteralHexContext ctx);
	void exitIntLiteralHex(DecafParse.IntLiteralHexContext ctx);

	void enterAssignOp1(DecafParse.AssignOp1Context ctx);
	void exitAssignOp1(DecafParse.AssignOp1Context ctx);

	void enterOpMinus(DecafParse.OpMinusContext ctx);
	void exitOpMinus(DecafParse.OpMinusContext ctx);

	void enterAssignOp2(DecafParse.AssignOp2Context ctx);
	void exitAssignOp2(DecafParse.AssignOp2Context ctx);

	void enterFielddecl1(DecafParse.Fielddecl1Context ctx);
	void exitFielddecl1(DecafParse.Fielddecl1Context ctx);

	void enterMethodParameter(DecafParse.MethodParameterContext ctx);
	void exitMethodParameter(DecafParse.MethodParameterContext ctx);

	void enterFielddecl2(DecafParse.Fielddecl2Context ctx);
	void exitFielddecl2(DecafParse.Fielddecl2Context ctx);

	void enterLiteralChar(DecafParse.LiteralCharContext ctx);
	void exitLiteralChar(DecafParse.LiteralCharContext ctx);

	void enterVardeclaration(DecafParse.VardeclarationContext ctx);
	void exitVardeclaration(DecafParse.VardeclarationContext ctx);

	void enterLiteralExpr2(DecafParse.LiteralExpr2Context ctx);
	void exitLiteralExpr2(DecafParse.LiteralExpr2Context ctx);

	void enterLiteralInt(DecafParse.LiteralIntContext ctx);
	void exitLiteralInt(DecafParse.LiteralIntContext ctx);

	void enterOpDivision(DecafParse.OpDivisionContext ctx);
	void exitOpDivision(DecafParse.OpDivisionContext ctx);

	void enterForAssignation(DecafParse.ForAssignationContext ctx);
	void exitForAssignation(DecafParse.ForAssignationContext ctx);

	void enterBooleannType(DecafParse.BooleannTypeContext ctx);
	void exitBooleannType(DecafParse.BooleannTypeContext ctx);

	void enterStatement111(DecafParse.Statement111Context ctx);
	void exitStatement111(DecafParse.Statement111Context ctx);

	void enterOpEqual(DecafParse.OpEqualContext ctx);
	void exitOpEqual(DecafParse.OpEqualContext ctx);

	void enterExprAst2(DecafParse.ExprAst2Context ctx);
	void exitExprAst2(DecafParse.ExprAst2Context ctx);

	void enterBlockStatement(DecafParse.BlockStatementContext ctx);
	void exitBlockStatement(DecafParse.BlockStatementContext ctx);

	void enterMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx);
	void exitMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx);

	void enterOperadorel(DecafParse.OperadorelContext ctx);
	void exitOperadorel(DecafParse.OperadorelContext ctx);

	void enterLocation1(DecafParse.Location1Context ctx);
	void exitLocation1(DecafParse.Location1Context ctx);

	void enterLiteralString(DecafParse.LiteralStringContext ctx);
	void exitLiteralString(DecafParse.LiteralStringContext ctx);

	void enterExpreParen(DecafParse.ExpreParenContext ctx);
	void exitExpreParen(DecafParse.ExpreParenContext ctx);

	void enterOperadoreq(DecafParse.OperadoreqContext ctx);
	void exitOperadoreq(DecafParse.OperadoreqContext ctx);

	void enterOpShifft1(DecafParse.OpShifft1Context ctx);
	void exitOpShifft1(DecafParse.OpShifft1Context ctx);

	void enterOpMuldDiv(DecafParse.OpMuldDivContext ctx);
	void exitOpMuldDiv(DecafParse.OpMuldDivContext ctx);

	void enterCalloutArg2(DecafParse.CalloutArg2Context ctx);
	void exitCalloutArg2(DecafParse.CalloutArg2Context ctx);

	void enterExpresionMetodo(DecafParse.ExpresionMetodoContext ctx);
	void exitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx);

	void enterMethodCall(DecafParse.MethodCallContext ctx);
	void exitMethodCall(DecafParse.MethodCallContext ctx);

	void enterOperadorSuma(DecafParse.OperadorSumaContext ctx);
	void exitOperadorSuma(DecafParse.OperadorSumaContext ctx);

	void enterCalloutArg1(DecafParse.CalloutArg1Context ctx);
	void exitCalloutArg1(DecafParse.CalloutArg1Context ctx);

	void enterOperadorShifft(DecafParse.OperadorShifftContext ctx);
	void exitOperadorShifft(DecafParse.OperadorShifftContext ctx);

	void enterMethodName(DecafParse.MethodNameContext ctx);
	void exitMethodName(DecafParse.MethodNameContext ctx);

	void enterExpr3(DecafParse.Expr3Context ctx);
	void exitExpr3(DecafParse.Expr3Context ctx);

	void enterContinueSemi(DecafParse.ContinueSemiContext ctx);
	void exitContinueSemi(DecafParse.ContinueSemiContext ctx);

	void enterExpr1(DecafParse.Expr1Context ctx);
	void exitExpr1(DecafParse.Expr1Context ctx);

	void enterCallMethod(DecafParse.CallMethodContext ctx);
	void exitCallMethod(DecafParse.CallMethodContext ctx);

	void enterMethodCall1(DecafParse.MethodCall1Context ctx);
	void exitMethodCall1(DecafParse.MethodCall1Context ctx);

	void enterMethodCall2(DecafParse.MethodCall2Context ctx);
	void exitMethodCall2(DecafParse.MethodCall2Context ctx);

	void enterIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx);
	void exitIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx);

	void enterRoot2(DecafParse.Root2Context ctx);
	void exitRoot2(DecafParse.Root2Context ctx);

	void enterMethodDeclType(DecafParse.MethodDeclTypeContext ctx);
	void exitMethodDeclType(DecafParse.MethodDeclTypeContext ctx);

	void enterOpShifft(DecafParse.OpShifftContext ctx);
	void exitOpShifft(DecafParse.OpShifftContext ctx);

	void enterOpMsm(DecafParse.OpMsmContext ctx);
	void exitOpMsm(DecafParse.OpMsmContext ctx);

	void enterFielddecl(DecafParse.FielddeclContext ctx);
	void exitFielddecl(DecafParse.FielddeclContext ctx);

	void enterOpOr(DecafParse.OpOrContext ctx);
	void exitOpOr(DecafParse.OpOrContext ctx);

	void enterBlockdefinition(DecafParse.BlockdefinitionContext ctx);
	void exitBlockdefinition(DecafParse.BlockdefinitionContext ctx);

	void enterOpNot(DecafParse.OpNotContext ctx);
	void exitOpNot(DecafParse.OpNotContext ctx);

	void enterRoot1(DecafParse.Root1Context ctx);
	void exitRoot1(DecafParse.Root1Context ctx);

	void enterVardeclaration1(DecafParse.Vardeclaration1Context ctx);
	void exitVardeclaration1(DecafParse.Vardeclaration1Context ctx);
}