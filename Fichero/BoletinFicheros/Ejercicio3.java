package Fichero.BoletinFicheros;

import java.io.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            BufferedReader lector1 = new BufferedReader(new FileReader("primos.dat"));
            BufferedReader lector2 = new BufferedReader(new FileReader("texto"));
            BufferedWriter escribano = new BufferedWriter(new FileWriter("mezcla2"));

            String linea1="";
            String linea2="";

            while ( (linea1 != null) || (linea2 != null) ){
                linea1 = lector1.readLine();
                System.out.println(linea1);

                linea2 = lector2.readLine();
                System.out.println(linea2);


                if (linea1 != null) escribano.write(linea1 + "\n");
                if (linea2 != null) escribano.write(linea2 + "\n");

            }

            lector1.close();
            lector2.close();
            escribano.close();

        } catch (FileNotFoundException fne) {
            System.out.println("No se encontró");
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
}
