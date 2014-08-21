package compiler.parser;
import compiler.scanner.*;
import java.io.*;
import java.util.Stack;
import java.lang.*;
import compiler.lib.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class CC4Parser{
Scanner file;
public static Decaf lex;
public Stack<String> stack1 ;
	public CC4Parser (Scanner name){    
		file=name;
	}      

	public void Parse (PrintStream out, boolean deb, boolean print)throws IOException { /* imprimiendo en pantalla "stage: scanning". */
			if(print == true){
			out.println("Stage: parsing");
			printParser(out, deb);
			}
		//ParseTree tree = ExecParse();
	 }
	 
	 public ParseTree ExecParse () throws IOException{
			String fileName = this.file.getFileName();
			CharStream input = new ANTLRFileStream(fileName);
			Decaf lex = new Decaf (input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			DecafParse parser = new DecafParse(tokens);
			ParseTree tree = parser.program();
			return tree;
	 }
	 
	public void printParser (PrintStream out, boolean deb){ /* imprimiendo stage: parsing*/   
		try {
		String fileName = this.file.getFileName();
		CharStream input = new ANTLRFileStream(fileName);
		Decaf lex = new Decaf (input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DecafParse parser = new DecafParse(tokens);
		parser.program();
		stack1 = parser.stack1;
		
		int stack1_size = stack1.size();
			for(int i= 0;i<stack1_size;i++){
				out.println("\n"+stack1.pop()); 
			}
		} catch (Exception e) {
		System.out.print ("Error en MyParser " + e);
	}
 }
	
	
		public String toString(){  
			String s= " stage: parsing";
			return s;
		}
}
