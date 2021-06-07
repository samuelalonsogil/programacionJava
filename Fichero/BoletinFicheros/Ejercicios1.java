package Fichero.BoletinFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicios1 {

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try{
            BufferedWriter escribano = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    escribano.write(String.valueOf(i) + "\n");
                }
            }
            escribano.close();
        }catch(IOException ioe){
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
