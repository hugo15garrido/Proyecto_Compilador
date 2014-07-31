
package compiler.scanner;
import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import compiler.lib.ErrorHandler;
import compiler.lib.Debug;

public class Scanner{
public static Decaf ds;
public Hashtable<Integer,String> tokenTable;
File file;

	public Scanner (File name){    /*constructor, que recibe el nombre del .txt*/
		this.file=name;		
	}      

	public void Scan (PrintStream out, boolean deb)throws Exception{ /* imprimiendo en pantalla "stage: scanning". */   
			out.println("Stage: scanning");
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint("scanning");
			}
			Metodo(this.file, out, deb);
	 }
	 	 	public void Metodo(File file, PrintStream salida, boolean deb)throws Exception{
			ErrorHandler e = new ErrorHandler();
			CharStream input = new ANTLRFileStream(file.getName());
			Decaf ds = new Decaf(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("scanner/Decaf.tokens")));
			tokenTable = new Hashtable<Integer,String>(100);
			String line;
			String dato[];
			while((line = br.readLine()) != null){
				tokenTable.put(Integer.valueOf(line.substring(line.lastIndexOf('=') + 1)),line.substring(0, (line.lastIndexOf('='))));
			}
			br.close();
				
	}
	public String toString(){  /* imprimiendo en pantalla "stage: scanning" */
		String s= " stage: scanning...";
		return s;
	}

}
