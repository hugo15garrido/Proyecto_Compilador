package compiler.ast;

public class Block extends Node{
	//campos
	private Node var_decl;
	private Node statement;
	
	// constructor
	public Block(Node i, Node j){
		var_decl = i;
		statement = j;
	}
	
	// metodos
	public void print(String padding){
		System.out.println(padding + "block");
		var_decl.print(padding + "\t");
		statement.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + "block");
		var_decl.print(padding + "\t");
		statement.print(padding + "\t");
	}
	
	public Node retVar_decl(){
		return var_decl;
	}

	public Node retStatement(){
		return statement;
	}
	
} 
