package compiler.ast;
import compiler.parser.CC4Parser;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Ast{
CC4Parser file;
	public Ast (CC4Parser name){  
		file= name;
	}      
	public void AsPrint (PrintStream out, boolean deb){ 
			out.println("Stage: ast");
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("ast");
			}
	 }
	public String toString(){ 
		String s= " stage: ast";
		return s;
	}
}