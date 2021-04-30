package Strings.EjerciciosExamenEjemplo;

import java.util.Scanner;

/*Hacer un programa que al recibir como datos dos cadenas de caracteres forme una tercera
cadena intercalando los caracteres de las palabras de las cadenas recibidas */

public class Ejercicio3A {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirCadena1(String texto1) {
        System.out.println("Introduce el texto: ");
        return texto1 = sc.nextLine();
    }

    public static String IntroducirCadena2(String texto2) {
        System.out.println("Introduce el texto: ");
        return texto2 = sc.nextLine();
    }
    
    public static String RellenarFraseNueva(String texto1,String texto2,String texto3){
        
        int longitud1=texto1.length();
        int longitud2=texto2.length();
        int contador=0;

        while((longitud1>contador) && (longitud2>contador)){
            texto3+=texto1.charAt(contador);
            
            texto3+=texto2.charAt(contador);
            
            contador++;
        }

        if(longitud1>longitud2){
            for (int i=contador;i<longitud1;i++) {
                texto3+=texto1.charAt(i);
            }
        }else if(longitud2>longitud1){
            for (int i=contador;i<longitud2;i++) {
                texto3+=texto2.charAt(i);
            }
        }
        return texto3;
    }

    public static void Mostrar(String texto3){
        System.out.println("La frase combinada es: " + texto3);
    }

    public static void main(String[] args) {
        
        String texto1="";
        texto1=IntroducirCadena1(texto1);

        String texto2="";
        texto2=IntroducirCadena2(texto2);
        
        String texto3="";
        texto3=RellenarFraseNueva(texto1, texto2, texto3);

        Mostrar(texto3);
    }   

}
