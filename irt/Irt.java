package compiler.irt;
import compiler.semantic.Semantic;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Irt{
Semantic file;
	public Irt(Semantic name){    
		file= name;
	}      
	public void IrPrint (PrintStream out, boolean deb){   
		out.println("Stage: irt");
		if(deb==true){
			Debug debug = new Debug();
			debug.DebugPrint("irt");
		}
	 }
	public String toString(){  
		String s= " stage: Irt";
		return s;
	}
}