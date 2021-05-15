package Fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploArgumentos3 {

    //el nombre del fichero se pasa en args[0]
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Este programa calcula la media de los números contenidos en un fichero");
            System.out.println("el nombre del fichero se pasa en args[0]");
        }

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null) {
                i++;
                suma += Double.parseDouble(linea);
                linea = bf.readLine();
            }
            i--; //tenemos que descontar
            bf.close();
            System.out.println("La media es " + suma / (double) i);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
