// Generated from DecafParse.g by ANTLR 4.0
package compiler.parser;
	import compiler.lib.*;
	import java.util.Stack;


import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class DecafParseBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DecafParseVisitor<T> {
	@Override public T visitBreakSemi(DecafParse.BreakSemiContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlockExpr(DecafParse.BlockExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitRoot(DecafParse.RootContext ctx) { return visitChildren(ctx); }

	@Override public T visitIntType(DecafParse.IntTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitLocationOp(DecafParse.LocationOpContext ctx) { return visitChildren(ctx); }

	@Override public T visitAsignationColon(DecafParse.AsignationColonContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpAnd(DecafParse.OpAndContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatement2(DecafParse.Statement2Context ctx) { return visitChildren(ctx); }

	@Override public T visitStatement1(DecafParse.Statement1Context ctx) { return visitChildren(ctx); }

	@Override public T visitMethodDecl(DecafParse.MethodDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdentifier(DecafParse.IdentifierContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteralBoolean(DecafParse.LiteralBooleanContext ctx) { return visitChildren(ctx); }

	@Override public T visitIntLiteralHex(DecafParse.IntLiteralHexContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignOp1(DecafParse.AssignOp1Context ctx) { return visitChildren(ctx); }

	@Override public T visitOpMinus(DecafParse.OpMinusContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignOp2(DecafParse.AssignOp2Context ctx) { return visitChildren(ctx); }

	@Override public T visitFielddecl1(DecafParse.Fielddecl1Context ctx) { return visitChildren(ctx); }

	@Override public T visitMethodParameter(DecafParse.MethodParameterContext ctx) { return visitChildren(ctx); }

	@Override public T visitFielddecl2(DecafParse.Fielddecl2Context ctx) { return visitChildren(ctx); }

	@Override public T visitLiteralChar(DecafParse.LiteralCharContext ctx) { return visitChildren(ctx); }

	@Override public T visitVardeclaration(DecafParse.VardeclarationContext ctx) { return visitChildren(ctx); }

	@Override public T visitLiteralExpr2(DecafParse.LiteralExpr2Context ctx) { return visitChildren(ctx); }

	@Override public T visitLiteralInt(DecafParse.LiteralIntContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpDivision(DecafParse.OpDivisionContext ctx) { return visitChildren(ctx); }

	@Override public T visitForAssignation(DecafParse.ForAssignationContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleannType(DecafParse.BooleannTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatement111(DecafParse.Statement111Context ctx) { return visitChildren(ctx); }

	@Override public T visitOpEqual(DecafParse.OpEqualContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprAst2(DecafParse.ExprAst2Context ctx) { return visitChildren(ctx); }

	@Override public T visitBlockStatement(DecafParse.BlockStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodDeclVoid(DecafParse.MethodDeclVoidContext ctx) { return visitChildren(ctx); }

	@Override public T visitOperadorel(DecafParse.OperadorelContext ctx) { return visitChildren(ctx); }

	@Override public T visitLocation1(DecafParse.Location1Context ctx) { return visitChildren(ctx); }

	@Override public T visitLiteralString(DecafParse.LiteralStringContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpreParen(DecafParse.ExpreParenContext ctx) { return visitChildren(ctx); }

	@Override public T visitOperadoreq(DecafParse.OperadoreqContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpShifft1(DecafParse.OpShifft1Context ctx) { return visitChildren(ctx); }

	@Override public T visitOpMuldDiv(DecafParse.OpMuldDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitCalloutArg2(DecafParse.CalloutArg2Context ctx) { return visitChildren(ctx); }

	@Override public T visitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodCall(DecafParse.MethodCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitOperadorSuma(DecafParse.OperadorSumaContext ctx) { return visitChildren(ctx); }

	@Override public T visitCalloutArg1(DecafParse.CalloutArg1Context ctx) { return visitChildren(ctx); }

	@Override public T visitOperadorShifft(DecafParse.OperadorShifftContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodName(DecafParse.MethodNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr3(DecafParse.Expr3Context ctx) { return visitChildren(ctx); }

	@Override public T visitContinueSemi(DecafParse.ContinueSemiContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr1(DecafParse.Expr1Context ctx) { return visitChildren(ctx); }

	@Override public T visitCallMethod(DecafParse.CallMethodContext ctx) { return visitChildren(ctx); }

	@Override public T visitMethodCall1(DecafParse.MethodCall1Context ctx) { return visitChildren(ctx); }

	@Override public T visitMethodCall2(DecafParse.MethodCall2Context ctx) { return visitChildren(ctx); }

	@Override public T visitIntLiteralNumber(DecafParse.IntLiteralNumberContext ctx) { return visitChildren(ctx); }

	@Override public T visitRoot2(DecafParse.Root2Context ctx) { return visitChildren(ctx); }

	@Override public T visitMethodDeclType(DecafParse.MethodDeclTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpShifft(DecafParse.OpShifftContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpMsm(DecafParse.OpMsmContext ctx) { return visitChildren(ctx); }

	@Override public T visitFielddecl(DecafParse.FielddeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpOr(DecafParse.OpOrContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlockdefinition(DecafParse.BlockdefinitionContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpNot(DecafParse.OpNotContext ctx) { return visitChildren(ctx); }

	@Override public T visitRoot1(DecafParse.Root1Context ctx) { return visitChildren(ctx); }

	@Override public T visitMethodParameter1(DecafParse.MethodParameter1Context ctx) { return visitChildren(ctx); }

	@Override public T visitVardeclaration1(DecafParse.Vardeclaration1Context ctx) { return visitChildren(ctx); }
}