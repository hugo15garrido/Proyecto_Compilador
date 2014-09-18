
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

	public void Scan (PrintStream out, boolean deb, boolean print) throws Exception{ /* imprimiendo en pantalla "stage: scanning". */   
			if (print == true){
			out.println("Stage: scanning");
			}
			Metodo(this.file, out, deb, print);

	 }
	 	public void Metodo(File file, PrintStream salida, boolean deb, boolean prints)throws Exception{
			ErrorHandler e = new ErrorHandler();
			CharStream input = new ANTLRFileStream(file.getName());
			//System.out.println(file.getName());
			Decaf ds = new Decaf(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("scanner/Decaf.tokens")));
			tokenTable = new Hashtable<Integer,String>(100);
			String line;
			String dato[];
			while((line = br.readLine()) != null){
				tokenTable.put(Integer.valueOf(line.substring(line.lastIndexOf('=') + 1)),line.substring(0, (line.lastIndexOf('='))));
			}
			br.close();
				
		Token t;
		while ((t = ds.nextToken()).getType() != Token.EOF){
				String s1 = new String(tokenTable.get(new Integer(t.getType())));
				String out=new String(s1);
				
				String s2 = new String("@"+String.valueOf(t.getLine())+':'+String.valueOf(t.getCharPositionInLine()));
				out = out.concat(s2);
				
				String s3 = new String(t.getText());
				out = out.concat(s3);
				if (prints == true){
				salida.println(out);
				}
			if(deb==true){
				Debug debug = new Debug();
				debug.DebugPrint(out);
			}
		}
	}
	public String getFileName(){  /* imprimiendo en pantalla "stage: scanning" */
		String s = this.file.getName();
		return s;
	}
	public String toString(){  /* imprimiendo en pantalla "stage: scanning" */
		String s= " stage: scanning...";
		return s;
	}

}
