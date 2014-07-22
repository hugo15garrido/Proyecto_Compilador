package compiler.semantic;
import compiler.ast.Ast;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Semantic{
Ast archivo;
	public Semantic (Ast name){    
		archivo= name;
	}      
	public void Semant (PrintStream out, boolean deb){ 
		out.println("Stage: semantic");
		if(deb==true){
			Debug debug = new Debug();
			debug.DebugPrint("semantic");
		}
	 }
	public String toString(){ 
		String s= " stage: Semantic";
		return s;
	}
}