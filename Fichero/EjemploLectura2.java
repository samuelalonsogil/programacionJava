package Fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class EjemploLectura2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduzca el nombre del archivo dende se encuentran los números: ");
        String nombreFichero = sc.nextLine();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(nombreFichero));
            String linea="0";
            int i=0;
            double suma=0;

            while(linea != null){
                i++;
                suma+= Double.parseDouble(linea);

                linea=bf.readLine();
            }
            i--;
            bf.close();
            System.out.println("Media: " + suma/(double) i);
        }catch(FileNotFoundException e){

            System.out.println(e.getMessage());
        }catch (IOException e){

            System.out.println("No se puede leer el fichero texto.txt");
        }
    }

}
