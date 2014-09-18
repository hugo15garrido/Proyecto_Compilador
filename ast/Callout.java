package compiler.ast;
import java.util.List;
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
public class Callout extends Node{

	private String callout;
	private String id;
	private Node argumentos;

	public Callout(String call, String idd, Node arg){
		callout = call;
		id = idd;
		argumentos = arg;
	}
	
	public void print(String padding){
		System.out.println(padding + "\t" + callout);
		System.out.println(padding + "\t" + id);
		argumentos.print(padding + "\t");
	}
	
	public void printAlt(String padding){
		System.out.println(padding + "\t" + callout);
		System.out.println(padding + "\t" + id);
		argumentos.print(padding + "\t");
	}
} 
