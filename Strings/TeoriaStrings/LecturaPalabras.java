package Strings.TeoriaStrings;

import java.util.Scanner;
// Lee un cierto número de palabras (en este caso, 10).

public class LecturaPalabras {
public static final int NUM_PALABRAS = 10;
 
static StringBuilder sb = new StringBuilder();

public static void EscribePalabras(String palabra){
    Scanner lector = new Scanner(System.in);
    System.out.println(sb.append("Escribe " + NUM_PALABRAS + " palabras separadas por espacios" 
   +"\nlas puedes escribir en líneas de texto diferente, si quieres."));

    for(int i=0; i<NUM_PALABRAS; i++) {
        palabra = lector.next();
        System.out.println("Palabra " + i + ": Has escrito: " + palabra);
    }
    lector.close();
}
public static void main (String [] args) {
    String palabra="";
    EscribePalabras(palabra);
}
}
