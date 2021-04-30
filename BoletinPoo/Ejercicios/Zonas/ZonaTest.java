package BoletinPoo.Ejercicios.Zonas;

import java.util.Scanner;

/*El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir*/

public class ZonaTest {

    /*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
	Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
	la zona de compra-venta con 200 entradas disponibles y la zona vip
	con 25 entradas disponibles. Hay que controlar que existen entradas antes de
	venderlas.*/
	
      static  Zona vip;
      static  Zona comven;
      static  Zona publico;
      static int opcion=0;
      static Scanner sc = new Scanner(System.in);


   
    public static void Menu(){
        System.out.println("1: Mostrar \n2: Vender entradas \n3: Salir");
        System.out.println("Selecciona una opción: ");
        opcion=sc.nextInt();
        }
        
    public static void Listar(){
        System.out.println("Listado de entradas disponibles");//listar
        System.out.println("VIP: " + vip.getEntradasPorVender() + 
            " \nCOMVEN: " + comven.getEntradasPorVender() + 
            " \nPUBLICO: " + publico.getEntradasPorVender() + 
            "\n--------------------");
        }
        
    public static void Venta(){
        int z=0;
        int entradas=0;
        do{
            System.out.println("Zonas disponibles:" + "\n1: VIP: " 
            + "\n2: Compra/Venta: "
            + "\n3: Público: "
            + "n\4: Salir.");

            System.out.println("Selecciona la zona: ");
            z=sc.nextInt();

            switch(z){
                case 1: System.out.println("Cuántas entradas para VIP: ");
                entradas=sc.nextInt();
                vip.vender(entradas);
                break;

                case 2: System.out.println("Cuántas entradas para Compra/Venta: ");
                entradas=sc.nextInt();
                comven.vender(entradas);
                break;

                case 3:  System.out.println("Cuántas entradas para público: ");
                entradas=sc.nextInt();
                publico.vender(entradas);
                break;

                case 4: System.out.println("chau <3");
                break;

                default: System.out.println("prueba otra vez");
            }
        }while((1<=z)&&(z<=3));
    }
    
    public static void main(String[] args) {

        vip = new Zona(25);
		comven= new Zona(200);
		publico= new Zona(1000);
		
        //menu principal
        do{
            Menu();
            switch(opcion){
            case 1: 
                Listar();
                break;
            case 2: 
                Venta();
                break;
                
            case 3: System.out.println("Gracias y chao");//salir
                break;

            default: System.out.println("Opción incorrecta");
                break;
            }
        }while(opcion!=3);
    }
}
