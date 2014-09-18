package compiler.ast;
import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class SimpleNode extends Node{

	private String simple;

	public SimpleNode(String t){
		simple = t;
	}
	
	public void print(String padding){
			System.out.println(padding + simple);
	}
	
	public void printAlt(String padding){
			System.out.println(padding + simple);
	}

	public String retName(){
		return simple;
	}
	
} 
