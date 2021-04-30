package Strings.Retos;

import java.util.Scanner;

/*Reto 5: haga un programa que muestre por pantalla cada una de las
palabras individuales de una frase en líneas diferentes. Para ello,
antes deberá ir averiguando las posiciones donde hay espacios en
blanco para poder delimitar dónde empieza y termina cada palabra.*/

public class Reto5 {
    
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto){
        System.out.println("Introduce el texto que quieras: ");
        return texto=sc.nextLine();
    }

    public static void RevisorCaracteres(String texto){
        int principioPalabra=0;
        String caracter;
        for (int i=0;i<texto.length();i++) {
            caracter=texto.substring(i, i+1);
            if(caracter.equals(" ")){
                System.out.println(texto.substring(principioPalabra,i));
                principioPalabra=i+1;
                i++;
            }
            if(i==(texto.length())-1){
                System.out.println(texto.substring(principioPalabra, i+1));
            }
        }
    }

    public static void main(String[] args) {
        String texto="";
        texto=IntroducirTexto(texto);

        RevisorCaracteres(texto);
    }

}
