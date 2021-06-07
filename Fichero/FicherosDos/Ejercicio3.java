package Fichero.FicherosDos;

import java.io.PrintWriter;

public class Ejercicio3 {

    /*PrintWritter a consola*/
    public static void main(String[] args) {
        PrintWriter pantalla = new PrintWriter(System.out);

        char[] letras = {'m','a','m','a'};
        String st = new String("papa");

        pantalla.write(letras, 1, 3);
        //System.out.println("");
        pantalla.write("--------");
        //System.out.println("");
        pantalla.write("______");
        pantalla.flush();
    }

}
