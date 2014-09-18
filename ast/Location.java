package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Location extends Node{
	private String id;
	private Node expr1;
	
	public Location(String j,  Node l){
		id = j;
		expr1 = l;
	}
	public void print(String padding){
		System.out.println(padding + "\t" + id);
		expr1.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + "\t" + id);
		expr1.printAlt(padding + "\t");
	}
	public String retId(){
		return id;
	}

	public Node retExpr1(){
		return expr1;
	}
} 