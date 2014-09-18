package compiler.ast;

public class Assign_op extends Node{
	private Node location;
	private String operator;
	private Node expr;
	
	public Assign_op(Node l, String o, Node e){
		location = l;
		operator = o;
		expr = e;
	}
	
	public void print(String padding){
		System.out.println(padding + operator);
		location.print(padding + "\t");
		expr.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + operator);
		location.printAlt(padding + "\t");
		expr.printAlt(padding + "\t");
	}


	public Node retLocation(){
		return location;
	}
	
	public String retOperator(){
		return operator;
	}

	public Node retExpr(){
		return expr;
	}	
} 
