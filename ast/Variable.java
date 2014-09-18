package compiler.ast;
import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class Variable extends Node{
	//campos
	private String tipo;
	private String id;
	private String printID;

	//constructor
	public Variable(String t, String i, String j){
		tipo = t;
		id = i;
		printID = j;
	}

	//metodos	
	public void print(String padding){
			System.out.println(padding + printID);
			System.out.println(padding + "\t" + tipo);
			System.out.println(padding + "\t" + id);
	}
	
	public void printAlt(String padding){
			System.out.println(padding + printID);
			System.out.println(padding + "\t" + tipo);
			System.out.println(padding + "\t" + id);
	}

	public String retTipo(){
		return tipo;
	}
	
	public String retID(){
		return id;
	}
	
} 
