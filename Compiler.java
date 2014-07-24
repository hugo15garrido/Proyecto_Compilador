
import java.io.*;
import java.util.Hashtable;
import java.lang.*;
import compiler.scanner.*;
import compiler.parser.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.irt.*;
import compiler.codegen.*;
import compiler.opt.*;
import compiler.lib.*;

public class Compiler{

	public static void main(String[] args) throws Exception{
		File ErrorHandler = new File("ErrorHandler.txt"); //Creamos archivo de salida
		FileOutputStream Errores = new FileOutputStream(ErrorHandler);
		PrintStream ErrorOutput = new PrintStream(Errores);	
		
		try{
			int stage = 0;
			int stage1= 0;
			boolean scan=false;
			boolean irt=false;
			boolean ast=false;
			boolean parse=false;
			boolean semantic=false;
			boolean codegen=false;
				
			if (args.length==0 ||((args.length==1) && (args[args.length-1].equals("-h")))){
				Ayuda(); 
				System.exit(0);
			}else{
				
				Hashtable Menu = new Hashtable(); //Hash table que se utilizara para el manejo de todas las opciones
				
				if (!(args[args.length-1].endsWith(".decaf"))){
					ErrorHandler manejoError7 = new ErrorHandler();
					manejoError7.ErrorPrint(ErrorOutput, "La extensión del archivo de entrada no es válida");
					System.exit(0);
				}
				Menu.put("input", args[args.length-1]);//mAlmacenamos archivo de entrada en hash table
				
				for(int k=0;k<(args.length);k++){
					if(args[k].equals("-h")){//Para todos los -h que existan desplegamos la ayuda
						 Ayuda();
					}
				
					if(args[k].equals("-o")){//Si existe un nombre de entrada se coloca
						 Menu.put("-o", args[k+1]);
					}
					
					if(args[k].equals("-target")){//almacenamos el valor del target en la hash table
						Menu.put("-target", args[k+1]);
					}
					
					if(args[k].equals("-opt")){//Almacenamos la optimizacion en el Hash Table
					 Menu.put("-opt", args[k+1]);
					}
				
					if(args[k].equals("-debug")){//Almacenamos el debug en el hash table
					 Menu.put("-debug", args[k+1]);
					}
				}
				
				if (!(Menu.containsKey("-o"))){ //Si no hay un archivo de salida se debe llamar igual al de entrada
					Menu.put("-o", args[args.length-1]);
					Menu.put("-o",((String)Menu.get("-o")).replaceAll(".decaf", ".s"));
				}
				
				File Input = new File(((String)Menu.get("input")));
				FileInputStream Program = new FileInputStream(Input);
				
				File Output = new File(((String)Menu.get("-o"))); //Creamos archivo de salida
				FileOutputStream Codigo = new FileOutputStream(Output);
				PrintStream CodigoOut = new PrintStream(Codigo);	
				
				if(Menu.containsKey("-debug")){//Si hay una opción debug almacenamos todo en un arreglo
					String [] debug= (((String)Menu.get("-debug")).split(":"));
					for(int j=0;j<(debug.length);j++){
						if(debug[j].equals("scan")){scan=true;}
						else if(debug[j].equals("parse")){parse=true;}
						else if(debug[j].equals("ast")){ast=true;}
						else if(debug[j].equals("irt")){irt=true;}
						else if(debug[j].equals("semantic")){semantic=true;}
						else if(debug[j].equals("codegen")){codegen=true;}
						else {
							ErrorHandler manejoError4 = new ErrorHandler();
							manejoError4.ErrorPrint(ErrorOutput, "el debug " + debug[j] + " es incorrecto");
						}
					}	
				}
				
				if(Menu.containsKey("-target")){
				String target = (String)Menu.get("-target");
					if(target.equals ("scan")){
						Scanner scannner= new Scanner (Input);
						scannner.Scan(CodigoOut,scan);
					 }else if(target.equals ("parse")){
								Scanner scannner= new Scanner (Input);//hace una instancia de la clase
								scannner.Scan(CodigoOut,scan);//manda a llamar al metodo que imprime
								CC4Parser cc4parser= new CC4Parser(scannner);
								cc4parser.Parse(CodigoOut,parse);
							}else if (target.equals ("ast")){
										Scanner scannner= new Scanner (Input);//hace una instancia de la clase
										scannner.Scan(CodigoOut,scan);//manda a llamar al metodo que imprime
										CC4Parser cc4parser= new CC4Parser(scannner);
										cc4parser.Parse(CodigoOut,parse);
										Ast ast1=new Ast(cc4parser);
										ast1.AsPrint(CodigoOut,ast);
									}else if (target.equals ("semantic")){
											Scanner scannner= new Scanner (Input);//hace una instancia de la clase
											scannner.Scan(CodigoOut,scan);//manda a llamar al metodo que imprime
											CC4Parser cc4parser= new CC4Parser(scannner);
											cc4parser.Parse(CodigoOut,parse);
											Ast ast1=new Ast(cc4parser);
											ast1.AsPrint(CodigoOut,ast);
											Semantic semantic1= new Semantic(ast1);
											semantic1.Semant(CodigoOut,semantic);
										}else if (target.equals ("irt")){
												Scanner scannner= new Scanner (Input);//hace una instancia de la clase
												scannner.Scan(CodigoOut,scan);//manda a llamar al metodo que imprime
												CC4Parser cc4parser= new CC4Parser(scannner);
												cc4parser.Parse(CodigoOut,parse);
												Ast ast1=new Ast(cc4parser);
												ast1.AsPrint(CodigoOut,ast);
												Semantic semantic1= new Semantic(ast1);
												semantic1.Semant(CodigoOut,semantic);
												Irt irt1= new Irt (semantic1);
												irt1.IrPrint(CodigoOut,irt);
											}else if (target.equals ("codegen")){
													Scanner scannner= new Scanner (Input);//hace una instancia de la clase
													scannner.Scan(CodigoOut,scan);//manda a llamar al metodo que imprime
													CC4Parser cc4parser= new CC4Parser(scannner);
													cc4parser.Parse(CodigoOut,parse);
													Ast ast1=new Ast(cc4parser);
													ast1.AsPrint(CodigoOut,ast);
													Semantic semantic1= new Semantic(ast1);
													semantic1.Semant(CodigoOut,semantic);
													Irt irt1= new Irt (semantic1);
													irt1.IrPrint(CodigoOut,irt);
													Codegen codegen1= new Codegen(irt1);
													codegen1.Codegenerator(CodigoOut,codegen);
													if (Menu.containsKey("-opt")){
														String optimizacion = (String)Menu.get("-opt");
															if ((optimizacion.equals ("algebraic"))||(optimizacion.equals ("constant"))){
																if((optimizacion.equals ("algebraic"))){
																	Algebraic algebraic=new Algebraic(codegen1);
																	algebraic.AlgebraicPrint(CodigoOut);
																}else{
																	ConstantFolding constant=new ConstantFolding(codegen1);
																	constant.ConstantPrint(CodigoOut);	
																}
															}else{
																ErrorHandler manejoError3 = new ErrorHandler();
																manejoError3.ErrorPrint(ErrorOutput, "La optimizacion " + optimizacion + " no es valida");
															}
													}
												}else{
													ErrorHandler manejoError2 = new ErrorHandler();
													manejoError2.ErrorPrint(ErrorOutput, "El target " + target + " no es valido");
												}
				}else if (Menu.containsKey("input")){
					ErrorHandler manejoError = new ErrorHandler();
					manejoError.ErrorPrint(ErrorOutput, "Debe ingresar un target para que el compilador funciona para el archivo de entrada");
				}
			}
		}
		catch(FileNotFoundException  error1){
				ErrorHandler manejoError1 = new ErrorHandler();
				manejoError1.ErrorPrint(ErrorOutput, "El archivo no existe");
		}	
	} 
	
	public static void Ayuda(){
		System.out.println(" ");
		System.out.println("Ayuda Compilador");
		System.out.println("|============================================|");
		System.out.println("|-o <outname> Escribir el output a un archivo de texto llamado <outname>.		   |");
		System.out.println("|==================================================================================|");
		System.out.println("|-target <stage> Donde <stage> es uno de: scan, parse, ast, semantic, irt, codegen; la|");
		System.out.println("| compilación debe proceder hasta la etapa indicada.  Por ejemplo, si <stage> es 	  |");
		System.out.println("| scan, una instancia de scan debe ser creada imprimiendo en el archivo		 	      |");
		System.out.println("| de salida 'stage: scanning'.  Si es parse una instancia de parser debe ser creada   |");
		System.out.println("| a partir de la instancia de scanner imprimiendo 'stage: parsing', además del        |");
		System.out.println("| mensaje de scanner y así sucesivamente.										      |");
		System.out.println("|=====================================================================================|");
		System.out.println("|-opt <optimzation>	<optimization> es uno de: constant, algebraic; la compilación debe hacer solo la|");
		System.out.println("|optimización que se le pida, y debe imprimir como en -target 					  |");
		System.out.println("|'optimizing: constant folding' o 'optimizing: algebraic simplification'.		  |");
		System.out.println("|======================================================================================|");
		System.out.println("|-debug <stage>		Imprimir información de debugging. Debe haber un mensaje por cada etapa listada   |");
		System.out.println("|de la forma 'Debugging <stage>'.  <stage> tiene las mismas opciones de -target,   |");
		System.out.println("|con la diferencia que se pueden 'debuggear' varias etapas, separandolas con ':'   |");
		System.out.println("|de la forma scan:parse:etc en <stage>.											  |");
		System.out.println("|=======================================================================================|");
		System.out.println("|-h Muestra esta ayuda al usuario.														|");
		System.out.println("|=======================================================================================|");
		System.out.println(" ");
	}
}

