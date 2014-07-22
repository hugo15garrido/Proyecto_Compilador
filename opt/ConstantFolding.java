package compiler.opt;
import compiler.codegen.Codegen;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ConstantFolding{
Codegen archivo;
	public ConstantFolding(Codegen name){    /*constructor, que recibe el nombre del .txt*/
		this.archivo= name;
	}      
	public void ConstantPrint (PrintStream out){ /* imprimiendo stage: optimizer-algebraic*/    
		//System.out.println("Optimizing: constant folding");
		out.println("Optimizing: constant folding");
	 }
	public String toString(){  /* imprimiendo optimizing: constant folding" */
		String s= "Optimizing: constant folding";
		return s;
	}
}
