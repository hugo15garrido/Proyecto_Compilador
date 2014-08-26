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
public Stack<String> stack2 ;
	public CC4Parser (Scanner name){    
		file=name;
	}      

	public void Parse (PrintStream out, boolean deb, boolean print){ /* imprimiendo en pantalla "stage: scanning". */
			if(print == true){
			out.println("Stage: parsing");
			printParser(out, deb);
			}
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("parsing");
			}
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
	stack2 = parser.stack2;
	
	//parser.start();

	if(deb==true){
		System.out.println(" Debugging:  parser");
		int stack1_size = stack1.size();
			for(int i= 0;i<stack1_size;i++){
				out.println("\n"+stack1.pop()); 
			}
		int stack2_size = stack2.size();
			for(int i= 0;i<stack2_size;i++){
				System.out.println("\n"+stack2.pop()); 
			}
			
	}else{
		int stack1_size = stack1.size();
			for(int i= 0;i<stack1_size;i++){
				out.println("\n"+stack1.pop()); 
			}
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
