package compiler.CC4Parser;
import compiler.scanner.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class CC4Parser{
Scanner file;

	public CC4Parser (Scanner name){    
		file=name;
	}      

	public void printParser (PrintStream out, boolean deb){ /* imprimiendo en pantalla "stage: scanning". */   
			out.println("Stage: parsing");
			if(deb==true){System.out.println(" Debugging:  parsing");}
	 }
	 
		public String toString(){  
			String s= " stage: parsing";
			return s;
		}
}
