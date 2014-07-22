package compiler.lib; 
import java.io.*;
import java.util.*;
import java.lang.*;

public class Debug{
	public Debug(){    /*constructor, que recibe el nombre del .txt*/
	}      
	public void DebugPrint (String Stage){ /* imprimiendo stage: optimizer-algebraic*/    
		System.out.println("Debugging " + Stage);
	 }
	
	public String toString(){  /* imprimiendo optimizing: constant folding" */
		String s= "Debugging";
		return s;
	}
}
