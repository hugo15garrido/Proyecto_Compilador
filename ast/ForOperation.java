package compiler.ast;
 
public class ForOperation extends Node{
	private String strFor;
	private String strID;
	private String strAsig;
	private Node expre1;
	private Node expre2;
	private Node bloque;
	
	public ForOperation(String op, String op1, String op3, Node if1, Node else1, Node expr){
		strFor = op;
		strID = op1;
		strAsig = op3;
		expre1 = if1;
		expre2 = else1;
		bloque = expr;
	}
	
	public void print(String padding){
		System.out.println(padding + strFor + "\t");
		System.out.println(padding + strID);
		System.out.println(padding + strAsig);
		expre1.print(padding + "\t");
		expre2.print(padding + "\t");
		bloque.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + strFor + "\t");
		System.out.println(padding + strID);
		System.out.println(padding + strAsig);
		expre1.print(padding + "\t");
		expre2.print(padding + "\t");
		bloque.print(padding + "\t");
	}
} 
