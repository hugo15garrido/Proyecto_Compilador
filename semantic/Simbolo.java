package compiler.semantic;
import java.io.*;
import java.util.*;
import java.util.List;

public class Simbolo{
	//campos
	 String simboloprinc;	
	 String tiposimbolo1;
	Integer Offset;
	Integer array;
	String argumt;
	
	//constructor  SYmbol varible
	public Simbolo(String simbolo1, Integer Offset1, String tiposimbolo){
		simboloprinc= simbolo1;
		tiposimbolo1 = tiposimbolo;
		array=null;
		Offset=Offset1;
	}

	//constructor  SYmbol varible array
	public Simbolo(String simbolo1,Integer array1, Integer Offset1, String tiposimbolo){
		simboloprinc= simbolo1;
		tiposimbolo1 = tiposimbolo;
		array = array1;
		Offset=Offset1;
	}
	
	//Constructor Symbol Metodos
	public Simbolo (String simbolo1, String  argumt1, String tiposimbolo){
	tiposimbolo1 = tiposimbolo;
	array=null;
	Offset=null;
	simboloprinc = simbolo1;
	argumt=argumt1;
	}

	public String toString(){
		return "simbolo: " + simboloprinc + ", Offset: " + (String.valueOf(Offset)) + ", Tipo : "+ tiposimbolo1 + ", Parametros : "+ argumt + ", Tam Arreglo : "+ (String.valueOf(array)) +"\n";
	}
	
	public String RetSimbolo(){
	 return this.simboloprinc;
	}
	
	public String RetTipo(){
	 return this.tiposimbolo1;
	}
	public String RetParametros(){
	 return this.argumt;
	}

} 
