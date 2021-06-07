package Fichero.BoletinFicheros;

import java.io.*;

public class Ejercicio6 {

    /* nombre del archivo: "palabrasAcontar"    palabra a contar: "hola" */
    public static void main(String[] args) throws IOException {
        try {

            BufferedReader lector = new BufferedReader(new FileReader(args[0]));

            int cont=0;

            while (true) {
                String linea = lector.readLine();
                if (linea==null) break;

                String[] palabras = linea.split(" ");
                    for (int i=0; i<palabras.length;i++){
                        if (palabras[i].equals(args[1])) cont++;
                    }
            }
            lector.close();

            System.out.println(cont);

        }catch (FileNotFoundException fne){
            System.out.println("no se encuentra el archivo");
        }

    }
}
