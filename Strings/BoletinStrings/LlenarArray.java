package Strings.BoletinStrings;

import java.util.Scanner;

/*3 Llenar un "array" de cadenas de texto 
El objetivo de esta actividad es aprender a leer palabras por el 
teclado y llenar arrays que contienen cadenas de texto. 
Haga un programa en Java llamado InvierteArrayTexto que lea 5 palabras 
(no frases) desde el teclado. Cada palabra debe estar en una línea de 
texto diferente. Si en una misma línea de texto se escribe más de una 
palabra, sólo hay que prever la primera, y el resto se ignoran. Con las 5 palabras leídas, es necesario rellenar un array. Al 
terminar, usando este array, hay que mostrar las palabras en orden 
inverso respecto a cómo han entrado (primero la última, después la 
penúltima, etc.).*/

public class LlenarArray {

    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto) {
        
        return texto = sc.next();
    }

    public static void Repeticion(String texto){
        for (int i=0; i<5; i++) {
            System.out.println("Introduce la palabra número " + i + ":");
            IntroducirTexto(texto);
        }
    }

    public static void main(String[] args) {
        String texto="";

        Repeticion(texto);
    }
    
}
