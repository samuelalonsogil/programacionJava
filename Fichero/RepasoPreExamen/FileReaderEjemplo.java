package Fichero.RepasoPreExamen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEjemplo {
    public static void main(String[] args) {

        String contenido = "";
        int c = 0;

        try {
            /*lee caracter a caracter*/
            FileReader fr = new FileReader("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\holaMundo.txt");

            while ((c = fr.read()) != -1) {

                /*lee en ascii por lo tanto hay que pasarlo a caracter*/
                contenido += (char) c;
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("El contenido de la cadena es: " + contenido);
    }
}
