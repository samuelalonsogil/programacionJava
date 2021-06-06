package Fichero.RepasoPreExamen;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        /*si no existiera un fichero al escribir se crea*/

        try {
            FileWriter fw = new FileWriter("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\holaMundo.txt");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
