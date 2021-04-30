package Strings.Retos;

import java.util.Scanner;

/*Reto 6: haga un programa que genere automáticamente acrónimos.
Partiendo de una frase determinada, debe mostrar por pantalla el texto
compuesto por las iniciales de cada palabra individual que forma la
frase.*/

public class Reto6 {

    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto){
        System.out.println("Escribe un texto:");
        return texto = sc.nextLine();}

    public static String[] DividirPalabras(String texto){
        String[] palabras = texto.split(" ");
        return palabras; 
    }

    public static void PrimeraLetra(String[] palabras){
        String acronimo="";
        for(int i=0;i<palabras.length;i++){
            acronimo+=palabras[i].charAt(0);
        }
        System.out.println(acronimo.toUpperCase());
    }


    public static void main(String[] args) {
        String texto="";
        texto=IntroducirTexto(texto);

        String[] palabras=DividirPalabras(texto);
        PrimeraLetra(palabras);
        
    }
}
