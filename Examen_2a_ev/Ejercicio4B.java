package Examen_2a_ev;

import java.util.Scanner;

/*Ejercicio 4B

Crea un programa que reciba una cadena de caracteres y la
devuelva invertida con efecto espejo, esto es, se concatena a la
palabra original su inversa, compartiendo la última letra, que
hará de espejo, por lo que la palabra obtenida se lee igual
hacia adelante que hacia atrás. Por ejemplo, al introducir

“teclado” devolverá “tecladodalcet” y al introducir “goma”
devolverá “gomamog”.*/


public class Ejercicio4B {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto){
        System.out.println("Escribe un texto:");
        return texto = sc.nextLine();}

    
    public static void InvertirPalabras(String texto){
        
        for(int i=texto.length()-1;i>=0;i--){
            char caracter=texto.charAt(i);
            texto=texto+caracter;
        }System.out.println(texto);
    }
     public static void main(String[] args) {
        String texto="";
        texto=IntroducirTexto(texto);

        InvertirPalabras(texto);
    }
}
