
package compiler.scanner;
import java.io.*;
import java.util.*;
import org.antlr.runtime.*;
import compiler.lib.*;

public class Scanner{
File file;

	public Scanner (File name){    /*constructor, que recibe el nombre del .txt*/
		this.file=name;		
	}      

	public void Scan (PrintStream out, boolean deb){ /* imprimiendo en pantalla "stage: scanning". */   
			out.println("Stage: scanning");
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("scanning");
			}
	 }
	public String toString(){  /* imprimiendo en pantalla "stage: scanning" */
		String s= " stage: scanning...";
		return s;
	}

}
