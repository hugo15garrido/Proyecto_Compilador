package compiler.lib;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ErrorHandler{
 
	public void ErrorPrint (PrintStream out, String Error){ /* imprimiendo stage: optimizer-algebraic*/    
		System.err.println(Error);
		out.println(Error); //Enviamos a escribir todos los errores a un archivo de salida
	 }
    public void scannerError(String msg, int line) {
	System.err.println("Scanner error: " + msg + " @line " + line);
    }
	    public void parserError(String msg, int line) {
	System.err.println("Parser error: " + msg + " @line " + line);
    }
	public String toString(){  /* imprimiendo optimizing: constant folding" */
		String s= "Error";
		return s;
	}
}
