package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class VarDecl1 extends Node{
	private String id;
	private String asignacion;
	private Node expr1;
	private Node expr2;
	
	public VarDecl1(String j, String i, Node p, Node l){
		id = j;
		asignacion = i;
		expr1 = p;
		expr2 = l;
	}
	public void print(String padding){
		System.out.println(padding + "Asignacion");
		System.out.println(padding + "\t" + id);
		expr1.print(padding + "\t");
		System.out.println(padding + "\t" + asignacion);
		expr2.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + "Asignacion");
		System.out.println(padding + "\t" + id);
		expr1.printAlt(padding + "\t");
		System.out.println(padding + "\t" + asignacion);
		expr2.printAlt(padding + "\t");
	}
	public String retId(){
		return id;
	}
	public String retAsignacion(){
		return asignacion;
	}	
	public Node retExpr1(){
		return expr1;
	}
	public Node retExpr2(){
		return expr2;
	}
} 