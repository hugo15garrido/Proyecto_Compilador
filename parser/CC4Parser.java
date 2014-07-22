package compiler.parser;
import compiler.scanner.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;
public class CC4Parser{
Scanner file;

	public CC4Parser (Scanner name){    
		file=name;
	}      

	public void Parse (PrintStream out, boolean deb){ /* imprimiendo en pantalla "stage: scanning". */   
			out.println("Stage: parsing");
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("parsing");
			}
	 }
	 
		public String toString(){  
			String s= " stage: parsing";
			return s;
		}
}
