package compiler.codegen;
import compiler.irt.Irt;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Codegen{
Irt archivo;
	public Codegen (Irt name){    
		this.archivo= name;
	}      
	public void Codegenerator (PrintStream out, boolean deb){ 
		out.println("Stage: Codegen");
		if(deb==true){
			Debug debug = new Debug();
			debug.DebugPrint("codegen");
		}
	 }
	public String toString(){ 
		String s= " stage: Codegen";
		return s;
	}
}