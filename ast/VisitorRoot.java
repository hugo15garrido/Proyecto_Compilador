package compiler.ast;
import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
public class VisitorRoot extends Node{
	private TerminalNode program;
	private Node field;
	private Node method;

	public VisitorRoot(TerminalNode pgr, Node fie, Node met){
		program = pgr;
		field = fie;
		method = met;
	}
	
	public void print(String padding){
		//StrOperator = StrOperator + program.getText();
		System.out.println(program.getText());
		field.print("\t");
		method.print("\t");
	}
	
	public void printAlt(String padding){
		//StrOperator = StrOperator + program.getText();
		field.print("\t");
		method.print("\t");
	}
	public Node retFiel(){
		return field;
	}
	
	public Node retMethod(){
		return method;
	}
} 
