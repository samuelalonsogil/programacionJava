package RepasoPreExamen2aEv;

import java.util.Arrays;
import java.util.Scanner;

/*Hacer un programa que al recibir como datos dos cadenas de caracteres forme 
una tercera cadena intercalando las palabraas de las cadenas recibidas*/

public class Ejercicio3 {
  static  Scanner sc = new Scanner(System.in);

    
    public static String IntroducirCadenaUno(String uno){
        System.out.println("Primera cadena: ");
        return uno=sc.nextLine();
    }

    public static String IntroducirCadenaDos(String dos){
        System.out.println("Segunda cadena: ");
        return dos=sc.nextLine();
    }

    public static void MostrarString(String uno){
        System.out.println(uno);
        
    }
    
    public static String[] DividirCadenaUno(String uno){
        return uno.split(" ");
    }

    public static String[] DividirCadenaDos(String dos){
        return dos.split(" ");
    }

    public static void MostrarArray(String[] primero, String[] segundo){
        System.out.println(Arrays.toString(primero));
        System.out.println(Arrays.toString(segundo));
    }

    public static String RellenarCadena(String[] primero, String[] segundo, String fusion,int comunes){
        for ( comunes = 0; comunes < primero.length && comunes<segundo.length; comunes++) {
            fusion += primero[comunes] + " ";
            fusion+=segundo[comunes] + " ";
        }
        
        if(primero.length>comunes){
            for (int j = comunes; j <primero.length; j++) {
                fusion+=primero[j] + " ";
            }
        }else if(segundo.length>comunes){
            for (int j = comunes; j <segundo.length; j++) {
                fusion+=segundo[j] + " ";
            }
        }
        return fusion;
    }



    public static void main(String[] args) {
        String[] primero;
        String[] segundo;
        String fusion="";
        int comunes=0;

        String uno = "";
        String dos = "";

        uno=IntroducirCadenaUno(uno);
        dos=IntroducirCadenaDos(dos);
        
        primero=DividirCadenaUno(uno);
        segundo=DividirCadenaDos(dos);

        MostrarArray(primero, segundo);

        fusion= RellenarCadena(primero, segundo, fusion, comunes);
        
        MostrarString(fusion);
        

        
    }
}
