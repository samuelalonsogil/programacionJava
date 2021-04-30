package Strings.TeoriaStrings;
import java.util.Scanner;

/*Un programa que extrae todo el texto de una frase, excepto la
primera y la última palabra.*/

public class ExtraerPalabras {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirFrase(String frase){
        System.out.println("Escribe una frase de texto y pulsa retorno:");
        return frase = sc.nextLine();
    }

    public static void SubString(String frase,int inicio, int fin){
        inicio = frase.indexOf(' ');
        fin = frase.lastIndexOf(' ');

        if(inicio==fin){System.out.println("Nada que escribir");
        }else{
            System.out.println("La frase sin la primera y última palabra es: " + frase.substring(inicio+1, fin));
        }
    }
    public static void main(String[] args) {
       String frase="";
       frase=IntroducirFrase(frase);
       int inicio=0;
       int fin=0; 
       SubString(frase, inicio, fin);
     }
    }

