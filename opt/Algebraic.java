
package compiler.opt;
import compiler.codegen.Codegen;
import java.io.*;
import java.util.*;
import java.lang.*;


public class Algebraic{
Codegen archivo;

	public Algebraic(Codegen	name){    /*constructor, que recibe el nombre del .txt*/
		this.archivo= name;
	}      

	public void AlgebraicPrint (PrintStream out){ /* imprimiendo optimizing: algebraic simplification*/    
		//System.out.println("Optimizing: Algebraic Simplification");
		out.println("Optimizing: algebraic Simplification");
	 }


	public String toString(){  /* imprimiendo optimizing: algebraic simplification" */
		String s= "Optimizing: algebraic simplification";
		return s;
	}
}
