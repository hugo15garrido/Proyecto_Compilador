package compiler.ast;

import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

 
public class AstVisitor extends DecafParseBaseVisitor <Node>{
	@Override public Node visitRoot(DecafParse.RootContext ctx) {
		Root root = new Root();
		Root rootfieldDecl = new Root();
		Root rootmethodDecl = new Root();
		List<DecafParse.Field_declContext> fieldDecl = ctx.field_decl();
		List<DecafParse.Method_declContext> methodDecl = ctx.method_decl();
		
		for(DecafParse.Field_declContext e : fieldDecl){
			rootfieldDecl.add(visit(e));
		}
		
		for(DecafParse.Method_declContext e : methodDecl){
			rootmethodDecl.add(visit(e));
		}
		root.add(new VisitorRoot(ctx.PROGRAM(), rootfieldDecl, rootmethodDecl));
		//root.print("");
		return root;
	}
	
	@Override public Node visitFielddecl(DecafParse.FielddeclContext ctx) { 
		Root variables = new Root();
		int Variables = ctx.field2().size();
		for (int i = 0; i<Variables; i++){
			variables.add(new Variable(ctx.type().getText(), ctx.field2(i).getText(), "var"));
		}	
		return variables;
	}
	
	@Override public Node visitMethodDecl(DecafParse.MethodDeclContext ctx) {

		Node parametros = ctx.method_param() == null? (new Root()) : visit(ctx.method_param());
		Node bloque = visit(ctx.block());
		//bloque.print("");
		Node tipo =  visit(ctx.metodo2());
		
		return new Metodo(tipo, ctx.id().getText(), parametros, bloque, ctx.metodo2().getText());
		
	}
	
	@Override public Node visitMethodParameter(DecafParse.MethodParameterContext ctx) {
		int i1 = ctx.type().size();
		Root parametros = new Root();
		for (int i=0;i<i1; i++){
			parametros.add(new Variable(ctx.type(i).getText(), ctx.id(i).getText(), "param"));
		}
		return parametros;
	}
	
	@Override public Node visitMethodDeclType(DecafParse.MethodDeclTypeContext ctx) { 
		return new SimpleNode(ctx.type().getText()); 
	}
	
	@Override 
	public Node visitBlockdefinition(DecafParse.BlockdefinitionContext ctx) { 
		List<DecafParse.Var_declContext> var_decl_list = ctx.var_decl();
		List<DecafParse.StatementContext> statement_list = ctx.statement();
		Root variables1 = new Root();
		Root sentencias1 = new Root();
		for(DecafParse.Var_declContext e : var_decl_list){
			variables1.add(visit(e)); 
		}
		for(DecafParse.StatementContext e : statement_list){
			sentencias1.add(visit(e)); 
		}
		Block bloque = new Block(variables1, sentencias1);
		//bloque.print("");
		return new Block(variables1, sentencias1);
	}
	@Override 
	public Node visitVardeclaration(DecafParse.VardeclarationContext ctx) { 
		//System.out.println ("entro aqui");
		int cantVar = ctx.id().size();
		String vars;
		vars = ctx.id(0).getText();
		for (int i = 1; i<cantVar; i++){
			vars = vars + ", " + ctx.id(i).getText();
		}
		return new Variable(ctx.type().getText(), vars, "var"); 
	}
	@Override 
	public Node visitVardeclaration1(DecafParse.Vardeclaration1Context ctx) {
		//System.out.println ("entro aqui1");
		//System.out.println (ctx.id().getText());
		//System.out.println (ctx.ASSIGNATION().getText());
		//System.out.println (ctx.id().getText());
		int cantExpr = ctx.expr().size();
		//System.out.println (ctx.expr(0).getText());
		//System.out.println (ctx.expr(1).getText());
		return new VarDecl1(ctx.id().getText(), ctx.ASSIGNATION().getText(), visit(ctx.expr(0)), visit(ctx.expr(1))); 
	}
	@Override 
	public Node visitStatement1(DecafParse.Statement1Context ctx) { 
	//System.out.println ("entro aqui2");
	//System.out.println (ctx.location().getText());
	//System.out.println (ctx.expr().getText());
	Assign_op operacion = new Assign_op(visit(ctx.location()), ctx.assign_op().getText(), visit(ctx.expr()));
	//operacion.print("");
		return new Assign_op(visit(ctx.location()), ctx.assign_op().getText(), visit(ctx.expr())); 
	}	
	@Override 
	public Node	visitLocation1(DecafParse.Location1Context ctx){
			Node expresion = ctx.expr() == null? (new Root()) : visit(ctx.expr());
			return new Location (ctx.id().getText(), expresion);
	}
	@Override 
	public Node visitExpr1(DecafParse.Expr1Context ctx) { 
		return visit(ctx.op_or());
	}
	@Override 
	public Node	visitExprAst2(DecafParse.ExprAst2Context ctx){
		return new SimpleNode(ctx.id().getText());
	}
	@Override 
	public Node	visitExpr3(DecafParse.Expr3Context ctx){
		return new SimpleNode(ctx.literal().getText());
	}
	@Override 
	public Node	visitOpOr(DecafParse.OpOrContext ctx){
		
		//System.out.println("entro OPOR1");
			int i1 = ctx.op_and().size();
			Root opAnd = new Root();
			for (int i=0;i+1<i1; i++){
				opAnd.add(new BinOp(ctx.OR(i).getText(), visit(ctx.op_and(i)), visit(ctx.op_and(i+1))));
			}
			return opAnd;
		}
	}
	@Override 
	public Node	visitOpAnd(DecafParse.OpAndContext ctx){
		if (ctx.AND().size() == 0){
			return visit(ctx.eq_op(0));
		}else{
			int i1 = ctx.eq_op().size();
			Root opAnd = new Root();
			for (int i=0;i+1<i1; i++){
				opAnd.add(new BinOp(ctx.AND(i).getText(), visit(ctx.eq_op(i)), visit(ctx.eq_op(i+1))));
			}
			return opAnd;
		}
	}
	@Override 
	public Node	visitOpEqual(DecafParse.OpEqualContext ctx){
		if (ctx.operador_eq().size() == 0){
			return visit(ctx.op_rel(0));
		}else{
			int i1 = ctx.op_rel().size();
			Root opEq = new Root();
			for (int i=0;i+1<i1; i++){
				opEq.add(new BinOp(ctx.operador_eq(i).getText(), visit(ctx.op_rel(i)), visit(ctx.op_rel(i+1))));
			}
			return opEq;
		}
	}
	@Override 
	public Node	visitOpShifft(DecafParse.OpShifftContext ctx) { 
		if (ctx.operador_rel().size() == 0){
			return visit(ctx.op_shift(0));
		}else{
			int i1 = ctx.op_shift().size();
			Root opShifft = new Root();
			for (int i=0;i+1<i1; i++){
				opShifft.add(new BinOp(ctx.operador_rel(i).getText(), visit(ctx.op_shift(i)), visit(ctx.op_shift(i+1))));
			}
			return opShifft;
		}		
	}
	@Override 
	public Node	visitOpShifft1(DecafParse.OpShifft1Context ctx) { 
		if (ctx.operador_shifft().size() == 0){
			return visit(ctx.op_msm(0));
		}else{
			int i1 = ctx.op_msm().size();
			Root opMsm1 = new Root();
			for (int i=0;i+1<i1; i++){
				opMsm1.add(new BinOp(ctx.operador_shifft(i).getText(), visit(ctx.op_msm(i)), visit(ctx.op_msm(i+1))));
			}
			return opMsm1;
		}		
	}
	@Override 
	public Node	visitOpMsm(DecafParse.OpMsmContext ctx){
		if (ctx.operador_suma().size() == 0){
			return visit(ctx.op_muldiv(0));
		}else{
			//System.out.println(ctx.operador_suma().size());
			//System.out.println(ctx.op_muldiv().size());
			int i1 = ctx.op_muldiv().size();
			Root opMsm = new Root();
			for (int i=0;i+1<i1; i++){
			//System.out.println(ctx.operador_suma(i).getText());
			//System.out.println(ctx.op_muldiv(i).getText());
			//System.out.println(ctx.op_muldiv(i+1).getText());
				opMsm.add(new BinOp(ctx.operador_suma(i).getText(), visit(ctx.op_muldiv(i)), visit(ctx.op_muldiv(i+1))));
			}
			//opMsm.print();
			return opMsm;
		}		
	}
	@Override 
	public Node	visitOpMuldDiv(DecafParse.OpMuldDivContext ctx) {
		if (ctx.operador_division().size() == 0){
			return visit(ctx.not(0));
		}else{
			int i1 = ctx.not().size();
			Root opNot = new Root();
			for (int i=0;i+1<i1; i++){
				opNot.add(new BinOp(ctx.operador_division(i).getText(), visit(ctx.not(i)), visit(ctx.not(i+1))));
			}
			return opNot;
		}		
	}	
	@Override 
	public Node	visitOpNot(DecafParse.OpNotContext ctx) {
		if (ctx.NOT() == null){
		//System.out.println("null");
			return visit(ctx.minus());
		}else{
		//System.out.println("notnull");
			return new Location (ctx.NOT().getText(), visit(ctx.minus()));
		}
	}
	@Override 
	public Node	visitOpMinus(DecafParse.OpMinusContext ctx) {
		if (ctx.MINUS() == null){
		//System.out.println("null");
			return visit(ctx.expr2());
		}else{
		//System.out.println("notnull");
			return new Location (ctx.MINUS().getText(), visit(ctx.expr2()));
		}
	}
	@Override 
	public Node	visitLocationOp(DecafParse.LocationOpContext ctx){
			return visit(ctx.location());
	}
	@Override 
	public Node	visitMethodCall(DecafParse.MethodCallContext ctx){
		return visit(ctx.method_call());
	}
	@Override 
	public Node	visitMethodCall1(DecafParse.MethodCall1Context ctx){
		return new Location (ctx.method_name().getText(), ctx.expresion_met() == null? (new Root()) : visit(ctx.expresion_met()));
	}	
	@Override 
	public Node	visitExpresionMetodo(DecafParse.ExpresionMetodoContext ctx) {
		List<DecafParse.ExprContext> expr_context = ctx.expr();
		Root expresiones = new Root();
		for(DecafParse.ExprContext e : expr_context){
			expresiones.add(visit(e));
		}
		return expresiones;
	}
	@Override 
	public Node	visitMethodCall2(DecafParse.MethodCall2Context ctx){
		List<DecafParse.Callout_argContext> call_list = ctx.callout_arg();
		Root callout1 = new Root();
		for(DecafParse.Callout_argContext e : call_list){
			callout1.add(visit(e));
		}
		return new Callout(ctx.CALLOUT().getText(), ctx.string_literal().getText(), callout1);
	}
	@Override 
	public Node	visitLiteralExpr2(DecafParse.LiteralExpr2Context ctx) { 
		return new SimpleNode(ctx.literal().getText());
	}
	@Override 
	public Node	visitExpreParen(DecafParse.ExpreParenContext ctx) {
		return visit(ctx.expr());
	}
	@Override 
	public Node visitStatement2(DecafParse.Statement2Context ctx) {
		return visit(ctx.method_call());
	}
	@Override 
	public Node	visitCallMethod(DecafParse.CallMethodContext ctx) {
		return visit(ctx.method_call());
	}
	@Override 
	public Node	visitBlockExpr(DecafParse.BlockExprContext ctx) {
		return new IfOperation(ctx.IF().getText(), ctx.elseop().size() == 0? "" : "else", visit(ctx.expr()), visit(ctx.block()),ctx.elseop().size() == 0? new Root() : visit(ctx.elseop(0)));
	}
	@Override 
	public Node	visitStatement111(DecafParse.Statement111Context ctx) { 
		return new Location (ctx.ELSE().getText(), visit(ctx.block()));
	}
	@Override 
	public Node	visitForAssignation(DecafParse.ForAssignationContext ctx) {
		return new ForOperation(ctx.FOR().getText(), ctx.id().getText(), ctx.ASSIGNATION().getText(), visit(ctx.expr(0)), visit(ctx.expr(1)), visit(ctx.block()));
	}
	@Override 
	public Node	visitAsignationColon(DecafParse.AsignationColonContext ctx) {
		return new Location (ctx.RETURN().getText(), visit(ctx.expr()));
	}
	@Override 
	public Node	visitBreakSemi(DecafParse.BreakSemiContext ctx) {
		return new SimpleNode(ctx.BREAK().getText());
	}
	@Override 
	public Node visitContinueSemi(DecafParse.ContinueSemiContext ctx) {
		return new SimpleNode(ctx.CONTINUE().getText());
	}
	@Override 
	public Node	visitBlockStatement(DecafParse.BlockStatementContext ctx) {
		return visit(ctx.block());
	}
}
