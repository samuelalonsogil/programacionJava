package Fichero.BoletinFicheros;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;


//argumentos = palabras
public class Ejercicio4 {

    static ArrayList<String> palabra = new ArrayList<String>();

    public static void main(String[] args) {
        try {

            BufferedReader lector = new BufferedReader(new FileReader(args[0]));


            while (true) {
                String linea = lector.readLine();
                if (linea == null) break;
                linea.split(" ");
                palabra.add(linea);
            }

            Collections.sort(palabra);

            BufferedWriter escribano2 = new BufferedWriter(new FileWriter("palabras_sort"));

            for (String pal : palabra) {
                escribano2.write(pal);
            }

            lector.close();
            escribano2.close();

        } catch (FileNotFoundException fne) {
            System.out.println("No se encuentra");
        } catch (IOException io) {
            System.out.println("Error");
        }
    }
}
