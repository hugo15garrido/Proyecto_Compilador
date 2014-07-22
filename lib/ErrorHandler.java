package compiler.lib;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ErrorHandler{
	public ErrorHandler(){    /*constructor, que recibe el nombre del .txt*/
	}      
	public void ErrorPrint (PrintStream out, String Error){ /* imprimiendo stage: optimizer-algebraic*/    
		System.err.println(Error);
		out.println(Error); //Enviamos a escribir todos los errores a un archivo de salida
	 }
	public String toString(){  /* imprimiendo optimizing: constant folding" */
		String s= "Error";
		return s;
	}
}
