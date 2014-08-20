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
	public CC4Parser (Scanner name){    
		file=name;
	}      

	public void Parse (PrintStream out, boolean deb, boolean print)throws IOException { /* imprimiendo en pantalla "stage: scanning". */
		ParseTree tree = ExecParse();
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
		public String toString(){  
			String s= " stage: parsing";
			return s;
		}
}
