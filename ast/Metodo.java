package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Metodo extends Node{
	private Node type;
	private String id;
	private Node parametros;
	private Node blq;
	private String tipo;
	
	public Metodo(Node t, String i, Node p, Node b, String k){
		type = t;
		id = i;
		parametros = p;
		blq = b;
		tipo=k;
	}
// Metodos	
	public void print(String padding){
		System.out.println(padding + "metodo");
		System.out.println(padding + "\t" + tipo);
		System.out.println(padding + "\t" + id);
		parametros.print(padding + "\t");
		//type.print (padding + "\t");
		blq.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + "metodo");
		System.out.println(padding + "\t" + tipo);
		System.out.println(padding + "\t" + id);
		parametros.print(padding + "\t");
		//type.print (padding + "\t");
		blq.print(padding + "\t");
	}
	
	public Node retTipo(){
		return type;
	}
	
	public String retId(){
		return id;
	}
	
	public Node retParams(){
		return parametros;
	}	
	public Node retBloque(){
		return blq;
	}
} 
