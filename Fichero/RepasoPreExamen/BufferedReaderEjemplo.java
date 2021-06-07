package Fichero.RepasoPreExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEjemplo {

    public static void main(String[] args) {


        /*lee linea a linea*/
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\pruebaBuffered.txt"))){
            String linea="";

            /*lee la linea y la muestra hasta que no haya más*/
            while ((linea= br.readLine())!=null){
                System.out.println(linea);
            }

        }catch (IOException ioe){
            System.out.println("error");
        }
    }
}
