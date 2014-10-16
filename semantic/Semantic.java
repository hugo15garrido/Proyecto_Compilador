package compiler.semantic;
import compiler.ast.Ast;
import compiler.ast.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import compiler.lib.*;

public class Semantic{
Ast archivo;
	public Semantic (Ast name){    
		archivo= name;
	}      
	public void Semant (PrintStream out, boolean deb, boolean printSemantic) throws IOException{
		out.println("Stage: semantic");
		VisitorRoot Simbolos1 = (VisitorRoot) archivo.getTreeRoot().getList().get(0);
		Root variables = (Root) Simbolos1.retFiel();
		Root metodos = (Root) Simbolos1.retMethod();
		
		List<Node> listaCampos = variables.getList();
		List<Node> listaMetodos = metodos.getList();
		
		List<Simbolo> tablaSimbolos = new LinkedList<Simbolo>();
		Hashtable TablaMain = new Hashtable();
		
		Variable Var;
		Metodo Met;
		int Offsetaux = 0;

		for (int i=0; i< listaCampos.size(); i++){
			//System.out.println ("entro");
			TablaMain.put("Root", tablaSimbolos);
			Var = (Variable) ((Root) listaCampos.get(i)).getList().get(0);
			if (ValidaLista(tablaSimbolos, Var.retID())){
				if ((Var.retID()).contains("]")){
					int pos=(Var.retID()).indexOf('[');
					int pos1=(Var.retID()).indexOf(']');
					String tama = (Var.retID()).substring(pos + 1, pos1);
					String idarr =(Var.retID()).substring(0, pos);
					int tamano = Integer.parseInt(tama);
					//System.out.println(tama);
					//System.out.println(idarr);
					if (tamano > 0){
						tablaSimbolos.add(new Simbolo(idarr + "[]", tamano, (Offsetaux), Var.retTipo()));
						tamano = tamano * 4;
						Offsetaux = Offsetaux + tamano;
					}else{
						System.err.println("Error: El tamano en la definicion del arreglo " + idarr + " debe de ser mayor a 0");
					}
				}else{
				tablaSimbolos.add(new Simbolo(Var.retID(), (Offsetaux), Var.retTipo()));
				Offsetaux = Offsetaux + 4;
				}		
			}else{
				System.err.println("Error: Variable " + Var.retID() + " Definida Previamente en metodo main");
			}
			
		}
		for (int i=0; i< listaMetodos.size(); i++){
			Met = (Metodo) listaMetodos.get(i);
			boolean validacion;
			if (TablaMain.containsKey("main")){
				System.err.println("Error: El metodo " + Met.retId() + " no puede estar definido posterio al metodo main, no sera ejecutado");
			}else{
			validacion = ValidaHash (TablaMain, Met.retId());
			if (validacion){
				TablaMain.put(Met.retId(), new LinkedList<Simbolo>());
			}
			String tipoMet = (String)Met.retTipoMet();
			//System.out.println (tipoMet);
			Node parametros1 = Met.retParams();
			Root parametros2 = (Root)(parametros1);
			List<Node> listaParametros = parametros2.getList();
			Variable Var4;
			String paramstr = "";
			for (int m=0; m < listaParametros.size(); m++){
				Var4 = (Variable)listaParametros.get(m);
					paramstr = paramstr + Var4.retTipo() + " ";
			}
			//System.out.println (paramstr);
			if ((Met.retId().equals("main")) && (!(paramstr.equals("")))){
				System.err.println("Error: Metodo main no debe llevar argumentos");
			}

			
				tablaSimbolos.add(new Simbolo(Met.retId(), paramstr, tipoMet));
				int offsetBloq = 0;
				List<Simbolo> tablabloque = (List<Simbolo>)TablaMain.get(Met.retId());
				ValidaParametros(Met.retParams(), tablabloque, TablaMain, offsetBloq);
				ValidaBloque(Met.retBloque(), tablabloque, TablaMain, offsetBloq, Met.retId());
			}
		}
		if (!TablaMain.containsKey("main")){
			System.err.println("Error: No existe la definicion de un metodo main");
		}
		//System.out.println(printSemantic);
		if (printSemantic == true) {
		//System.out.println(tablaSimbolos);
		Enumeration e = TablaMain.keys();
		Object clave;
		while( e.hasMoreElements() ){
		  clave = e.nextElement();
		  out.println( "Tabla de Simbolos Metodo : " + clave );
		  List<Simbolo> tablatemp = (List<Simbolo>)TablaMain.get(clave);
		  out.println(tablatemp);
		}
			
		}
		if (deb == true){
			Enumeration e1 = TablaMain.keys();
			Object clave1;
			while( e1.hasMoreElements() ){
			  clave1 = e1.nextElement();
			  System.out.println( "Tabla de Simbolos Metodo : " + clave1 );
			  List<Simbolo> tablatemp1 = (List<Simbolo>)TablaMain.get(clave1);
			  System.out.println(tablatemp1);
			}
		}
		if(deb==true){
			Debug debug = new Debug();
			debug.DebugPrint("semantic");
		}
	 }
	 public void ValidaBloque(Node Bloque, List<Simbolo> tablaSimbolos1, Hashtable tabla_hash1, int offsetaux, String BloqueVal){
			//Bloque.print("");
			Variable Var1;
			Block var_declar = (Block)Bloque;
			Root declaracion = (Root)(var_declar.retVar_decl());
			List<Node> listaVariables = declaracion.getList();
			for (int i=0; i< listaVariables.size(); i++){
			//System.out.println ("entro");
			Var1 = ((Variable)listaVariables.get(i));
				String[] variables1 = (Var1.retID()).split(",");
				for (int i3 = 0; i3 < variables1.length; i3++) {
				boolean validaprin = ValidaHash (tabla_hash1, variables1[i3]);
				if(validaprin){
					if (ValidaLista(tablaSimbolos1, variables1[i3])){
					if ((variables1[i3]).contains("]")){
							int pos=(variables1[i3]).indexOf('[');
							int pos1=(variables1[i3]).indexOf(']');
							String tama = (variables1[i3]).substring(pos + 1, pos1);
							String idarr =(variables1[i3]).substring(0, pos);
							int tamano = Integer.parseInt(tama);
							System.out.println(tama);
							System.out.println(idarr);
							tablaSimbolos1.add(new Simbolo(idarr, tamano, offsetaux, Var1.retTipo()));
							tamano = tamano * 4;
							offsetaux = offsetaux + tamano;
						}else{
						tablaSimbolos1.add(new Simbolo(variables1[i3], offsetaux, Var1.retTipo()));
						offsetaux = offsetaux + 4;
						}
					}else{
						System.err.println("Error: Variable Definida Previamente " + variables1[i3]);
						}
				}
				}
			}
			Root Statementl = (Root)(var_declar.retStatement());
			List<Node> listaStatement = Statementl.getList();
			for (int k=0; k< listaStatement.size(); k++){
				if (listaStatement.get(k) instanceof Assign_op){
					Assign_op asgnacion = (Assign_op)listaStatement.get(k);

				}
				if (listaStatement.get(k) instanceof Location){
					Location callmetodo = (Location)listaStatement.get(k);
					String isMetodo = callmetodo.retId();
					if ((!(isMetodo.equals("else"))) && (!(isMetodo.equals("!"))) && (!(isMetodo.equals("-")))&& (!(isMetodo.equals("return")))){
						ValidaMetodo (callmetodo, tabla_hash1, BloqueVal);
					}
				}
			}
		
	}
	public void ValidaParametros(Node Parametros, List<Simbolo> tablaSimbolos1, Hashtable tabla_hash1, int offset){
			Root parametros = (Root)(Parametros);
			List<Node> listaParametros = parametros.getList();
			Variable Var3;
			for (int i3=0; i3< listaParametros.size(); i3++){
				Var3 = (Variable)listaParametros.get(i3);
				boolean validaprin = ValidaHash (tabla_hash1, Var3.retID());
				if (validaprin){
					if (ValidaLista(tablaSimbolos1, Var3.retID())){
						if ((Var3.retID()).contains("]")){
							int pos=(Var3.retID()).indexOf('[');
							int pos1=(Var3.retID()).indexOf(']');
							String tama = (Var3.retID()).substring(pos + 1, pos1);
							String idarr =(Var3.retID()).substring(0, pos);
							int tamano = Integer.parseInt(tama);
							System.out.println(tama);
							System.out.println(idarr);
							tablaSimbolos1.add(new Simbolo(idarr, tamano, (offset), Var3.retTipo()));
							tamano = tamano * 4;
							offset = offset + tamano;
						}else{
							tablaSimbolos1.add(new Simbolo(Var3.retID(), offset, Var3.retTipo()));
							offset = offset + 4;
						}
					}else{
						System.err.println("Error: Variable Definida Previamente ingresando a parametros " + Var3.retID());
					}
				}	
		}
	}
	
	public void ValidaMetodo(Location llamadamet, Hashtable tabla_hash2, String BloqueVal){
	String variableop = "";
	String variableop1 = "";
		if (tabla_hash2.containsKey((llamadamet.retId()))){
			Root expresiones = (Root)(llamadamet.retExpr1());
			List<Node> listaParametros = expresiones.getList();
			for (int i4=0; i4< listaParametros.size(); i4++){
				//System.out.println ("entro Aqui " + llamadamet.retId());
				if (listaParametros.get(i4) instanceof SimpleNode){
				//System.out.println ("entro Aqui2 " + llamadamet.retId());
					SimpleNode variablesimple = (SimpleNode)(listaParametros.get(i4));
					variableop = variablesimple.retName();
					List<Simbolo> tablatemp = (List<Simbolo>)tabla_hash2.get("Root");
					 variableop1 = ObtieneTipo(tablatemp, variableop);
					if (variableop1.equals("")){
						List<Simbolo> tablatemp1 = (List<Simbolo>)tabla_hash2.get(BloqueVal);
						variableop1 = ObtieneTipo(tablatemp1, variableop);
						if (variableop1.equals("")){
							System.err.println("Error: Parametro en llamada a metodo  " + llamadamet.retId() + " no existe" + variableop);
						} else {
							variableop = variableop + ", ";
						}
					}
				}
				if (listaParametros.get(i4) instanceof Location){
					//System.out.println ("entro Aqui2 " + llamadamet.retId());
					Location variablesimple = (Location)(listaParametros.get(i4));
					variableop = variablesimple.retId();
					List<Simbolo> tablatemp = (List<Simbolo>)tabla_hash2.get("Root");
					 String variableop2 = ObtieneTipo(tablatemp, variableop);
					 //System.out.println ("aqui1 "+ variableop2);
					if (variableop2.equals("")){
						List<Simbolo> tablatemp1 = (List<Simbolo>)tabla_hash2.get(BloqueVal);
						variableop2 = ObtieneTipo(tablatemp1, variableop);
						//System.out.println ("aqui2 "+ variableop2);
						if (variableop2.equals("")){
							System.err.println("Error: Parametro en llamada a metodo  " + llamadamet.retId() + " no existe" + variableop);
						} else {
							variableop1 = variableop1 + " " + variableop2;
						}
					}else{
						variableop1 = variableop1 + " " + variableop2;
					}
				}				
			}
			//System.out.println (variableop1);
			variableop1 = variableop1.trim();
			List<Simbolo> tablatemp = (List<Simbolo>)tabla_hash2.get("Root");
			String paramini = ObtieneParametros (tablatemp, llamadamet.retId());
			if (!(paramini.equals(variableop1))){
				System.err.println("Error: Llamada a metodo " + llamadamet.retId() + " Con cantidad o tipo de parametos incorrectos");
			}
			
		}else{
			System.err.println("Error: El metodo  " + llamadamet.retId() + " no ha sido declarado previamente por lo que no puede ser invocado");
		}
	
	}
	
	public String toString(){ 
		String s= " stage: Semantic";
		return s;
	}
	public boolean ValidaLista (List<Simbolo> tablaSimbolos1, String validar){
		for (int i=0; i< tablaSimbolos1.size(); i++){
		Simbolo simb1 = (Simbolo)tablaSimbolos1.get(i);
		String validado = simb1.RetSimbolo();
			if (validado.equals(validar)){
				return false;
			}
		}
	 return true;
	}
	public String ObtieneTipo (List<Simbolo> tablaSimbolos1, String variableaop){
		for (int i=0; i< tablaSimbolos1.size(); i++){
		Simbolo simb1 = (Simbolo)tablaSimbolos1.get(i);
		String validado = simb1.RetSimbolo();
			if (validado.equals(variableaop)){
				return simb1.RetTipo();
			}
		}
	 return "";
	}
	public String ObtieneParametros (List<Simbolo> tablaSimbolos1, String metodParam){
		for (int i=0; i< tablaSimbolos1.size(); i++){
		Simbolo simb1 = (Simbolo)tablaSimbolos1.get(i);
		String validado = simb1.RetSimbolo();
			if (validado.equals(metodParam)){
				return ((simb1.RetParametros()).trim());
			}
		}
	 return "";
	}
	
	public boolean ValidaHash (Hashtable tabla_hash, String validar){
			//System.out.println ("entro a validar " + validar);
			validar = validar.trim();
			boolean retorno = true;
			if (tabla_hash.containsKey(validar)){
				System.err.println("Error: " + validar + " Ha sido declarado previamente como metodo en main principal");
				retorno = false;
			}
			List<Simbolo> tablatemp = (List<Simbolo>)tabla_hash.get("Root");
			retorno = ValidaLista(tablatemp, validar);
			if (!retorno){
				System.err.println("Error: " + validar + " ha sido declarado como variable en metodo main");
				retorno = false;
			}
			
	 return retorno;
	}
}