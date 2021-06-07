package Fichero.RepasoPreExamen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEjemplo {

    public static void main(String[] args) {

        String texto1="texto 1";
        String texto2="texto 2";

        /*se necesita crear un FileWriter o reader según cual usemos*/
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\pruebaBuffered.txt"))){
            bw.write(texto1);
            bw.newLine(); /*salto de linea*/
            bw.write(texto2);

        }catch (IOException ioe){
            System.out.println("error");
            ioe.printStackTrace();
        }

    }
}
