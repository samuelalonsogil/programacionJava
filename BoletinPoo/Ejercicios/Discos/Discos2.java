package BoletinPoo.Ejercicios.Discos;

import java.util.Scanner;

public class Discos2 { 

	// N determina el tamaño del array
	static int N = 100;

	static void menu() {
		// PRESENTACION de OPCIONES
					System.out.println("\n\nCOLECCIÓN DE DISCOS");
					System.out.println("===================");
					System.out.println("1. Listado");
					System.out.println("2. Nuevo disco");
					System.out.println("3. Modificar");
					System.out.println("4. Borrar");
					System.out.println("5. Salir");
		
		
	}
	
	public static void main(String[] args) {
		// Crea el array de discos
		Disco[] album = new Disco[N];

		//PROCESO DE RECUPERACION DESDE FICHERO
		
		// Crea todos los discos que van en cada una de las celdas del array
		for (int i = 0; i < N; i++) {
			album[i] = new Disco();
		}
		
		Scanner sc = new Scanner(System.in);
		// variables
		int opcion = 0;
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		String duracionIntroducidaString;
		int duracionIntroducida;
		int primeraLibre;
		int i;

		// MENU
		do {

			menu();
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			// casos
			switch (opcion) {
			case 1://listar

				System.out.println("\nLISTADO");
		        System.out.println("=======");
		        for(i = 0; i < N; i++) {
		          if (!album[i].getCodigo().equals("LIBRE")) {
		            System.out.println(album[i]);
		          }
		        }
				
				break;
			case 2://nuevo

				    System.out.println("\nNUEVO DISCO");
			        System.out.println("===========");
			        
			        // Busca la primera posición libre del array
			        primeraLibre = -1;
			        do {
			          primeraLibre++;
			        } while ( !(  (    album[primeraLibre].getCodigo()  )   .equals("LIBRE")));
				
				//System.out.println("indice de insercion: "+primeraLibre);
				
				//PIDE DATOS
				System.out.println("Por favor, introduzca los datos del disco.");  
		        
		        System.out.print("Código: ");
		        codigoIntroducido = sc.nextLine();
		        album[primeraLibre].setCodigo(codigoIntroducido);
		        
		        System.out.print("Autor: ");
		        autorIntroducido = sc.nextLine();
		        album[primeraLibre].setAutor(autorIntroducido);
		        
		        System.out.print("Título: ");
		        tituloIntroducido = sc.nextLine();
		        album[primeraLibre].setTitulo(tituloIntroducido);
		        
		        System.out.print("Género: ");
		        generoIntroducido = sc.nextLine();
		        album[primeraLibre].setGenero(generoIntroducido);
		        
		        System.out.print("Duración: ");
		        duracionIntroducida =Integer.parseInt(sc.nextLine());
		        album[primeraLibre].setDuracion(duracionIntroducida);
					
				System.out.println("Disco insertado en posicion: "+primeraLibre);
				
				break;
			case 3://modificar

				System.out.println("\nMODIFICAR");
		        System.out.println("===========");
		  
		        //chequeo de codigo??? --> nos salimos del array de discos
		        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
		        codigoIntroducido = sc.nextLine();
		  
		        i = -1;
		        do {
		          i++;
		        } while (    !((album[i].getCodigo()).equals(codigoIntroducido)) && i<99  );
		        
		        //FILTRADO POR ENCONTRADO 
		        if( ((album[i].getCodigo()).equals(codigoIntroducido)) ) {
		        
		        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
		  
		        System.out.println("Código: " + album[i].getCodigo());
		        System.out.print("Nuevo código: ");
		        codigoIntroducido = sc.nextLine();
		        if (!codigoIntroducido.equals("")) {
		          album[i].setCodigo(codigoIntroducido);
		        }
		        
		        System.out.println("Autor: " + album[i].getAutor());
		        System.out.print("Nuevo autor: ");
		        autorIntroducido = sc.nextLine();
		        if (!autorIntroducido.equals("")) {
		          album[i].setAutor(autorIntroducido);
		        }
		        
		        System.out.println("Título: " + album[i].getTitulo());
		        System.out.print("Nuevo título: ");
		        tituloIntroducido = sc.nextLine();
		        if (!tituloIntroducido.equals("")) {
		          album[i].setTitulo(tituloIntroducido);
		        }
		        
		        System.out.println("Género: " + album[i].getGenero());
		        System.out.print("Nuevo género: ");
		        generoIntroducido = sc.nextLine();
		        if (!generoIntroducido.equals("")) {
		          album[i].setGenero(generoIntroducido);
		        }
		        
		        System.out.println("Duración: " + album[i].getDuracion());
		        System.out.print("Duración: ");
		        duracionIntroducidaString = sc.nextLine();
		        if (!duracionIntroducidaString.equals("")) {
		          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
		        }
		        } else {
		        	System.out.println("\nCODIGO NO ENCONTRADO");
		        }
		        	
				
				break;
			case 4://borrar

				System.out.println("\nBORRAR");
		        System.out.println("======");
		        
		        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
		        codigoIntroducido = sc.nextLine();
		  
		        i = -1;
		        do {
		          i++;
		        } while (!((album[i].getCodigo()).equals(codigoIntroducido)) && i<99 );
		        
		        if( ((album[i].getCodigo()).equals(codigoIntroducido)) ) {
		        album[i].setCodigo("LIBRE");
		        System.out.println("Album borrado.");
		        }else {
		        	System.out.println("\nCODIGO NO ENCONTRADO");
		        }
				
				break;
			case 5://salir
				System.out.println("\n SALIR");
//PROCESO DE SALVAR COLECCION A FICHERO
				break;
			default://no lo se
				System.out.println("\n OPCION NO VALIDA");
				break;

			}// fin Switch

		} while (opcion != 5);// FIN MENU
		sc.close();
	}// fin main

	/*
	 * testeo for(Disco d: album) { System.out.println(d.toString()); }
	 */

}
