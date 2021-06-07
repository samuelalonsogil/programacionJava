package Fichero.BoletinFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("primos.dat"));
            String linea = "";

            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }
            lector.close();

        } catch (FileNotFoundException fne) {
            System.out.println("No se encontró");
        } catch (IOException ioe) {
            System.out.println("Error");
        }

    }
}
