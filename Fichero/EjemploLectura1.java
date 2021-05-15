package Fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLectura1 {

    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("texto.txt"));
            String linea="";

            //lee línea a línea
            while(linea != null){
                System.out.println(linea);
                linea=bf.readLine();
            }
            bf.close();
        }catch(FileNotFoundException e){
            //qué hace si no encuentra el fichero
                System.out.println("No se encuentra el fichero texto.txt");
        }catch (IOException e){
            //qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero texto.txt");
        }
    }
}
