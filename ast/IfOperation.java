package compiler.ast;
 
public class IfOperation extends Node{
	private String operator;
	private String operator1;
	private Node blockif;
	private Node blockelse;
	private Node expresion;
	
	public IfOperation(String op, String op1, Node if1, Node else1, Node expr){
		operator = op;
		operator1 = op1;
		blockif = if1;
		blockelse = else1;
		expresion = expr;
	}
	
	public void print(String padding){
		System.out.println(padding + operator);
		expresion.print(padding + "\t");
		blockif.print(padding + "\t");
		System.out.println(padding + operator1);
		blockelse.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + operator);
		expresion.print(padding + "\t");
		blockif.print(padding + "\t");
		System.out.println(padding + operator1);
		blockelse.print(padding + "\t");
	}
} 
