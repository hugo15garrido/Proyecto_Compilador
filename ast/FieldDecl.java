package compiler.ast;
import java.util.List;
import compiler.parser.*;

public class FieldDecl extends Node{
	private Node type;
	private Node id;
	private List<Node> Parametros;
	
	public FieldDecl(Node op, Node l, List<Node> r){
		type = op;
		id = l;
		Parametros = r;
	}
	
	public void print(String padding){
		System.out.println(padding + "METODO");
		type.print(padding + "\t");
		id.print(padding + "\t");
	}
} 
