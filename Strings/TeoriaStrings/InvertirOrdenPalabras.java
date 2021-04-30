package Strings.TeoriaStrings;
import java.util.Scanner;

// Programa que invierte el orden de las palabras de una frase.

public class InvertirOrdenPalabras {
   static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto){
        System.out.println("Escribe un texto:");
        return texto = sc.nextLine();}

    
    public static void InvertirPalabras(String texto){
        String[] textoinv=texto.split(" ");
        
        for(int i=textoinv.length-1;i>=0;i--){
            System.out.println(textoinv[i]);
        }
    }
     public static void main(String[] args) {
        String texto="";
        texto=IntroducirTexto(texto);

        InvertirPalabras(texto);
    }
}
