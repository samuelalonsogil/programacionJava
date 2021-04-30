package Strings.TeoriaStrings;

import java.util.Scanner;

public class RevisionDatos {
    static Scanner sc = new Scanner(System.in); 
    
    public static void ComprobarSiEsInt(int valor){
        System.out.println("Escribe un entero: ");
        
        if (sc.hasNextInt()) {
            valor=sc.nextInt();
            System.out.println("El valor entero es: " + valor);
        }else {sc.next(); System.out.println("El valor no es entero");}
    }
    
    public static void main(String[] args) {
        int valor=0;
        ComprobarSiEsInt(valor);
    }
}
