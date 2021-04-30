package Strings.EjerciciosExamenEjemplo;

import java.util.Scanner;

/*Programa en java que pida dos cadenas y devuelva la primera cadena pero transformando
en mayúsculas la parte coincidente*/

public class Ejercicio4A {

    static Scanner sc = new Scanner(System.in);

    public static String IntroducirCadena1(String texto1) {
        System.out.println("Introduce el texto: ");
        return texto1 = sc.nextLine();
    }

    public static String IntroducirCadena2(String texto2) {
        System.out.println("Introduce el texto: ");
        return texto2 = sc.nextLine();
    }

    public static String ComprobarCadenas(String texto1,String texto2){
        String[] palabras;
        palabras=texto1.split(" ");
        texto1="";
        for(int i=0;i<palabras.length;i++){
            if(palabras[i].equals(texto2)){
                palabras[i]=palabras[i].toUpperCase();
            }
            texto1+=palabras[i] + " ";
        }
        return texto1;
    }

    public static void Mostrar(String texto1){
        System.out.println("El texto es:" + texto1);
    }

    public static void main(String[] args) {
        String texto1="";
        texto1=IntroducirCadena1(texto1);

        String texto2="";
        texto2=IntroducirCadena2(texto2);

        texto1=ComprobarCadenas(texto1, texto2);

        Mostrar(texto1);
    }
    
}
