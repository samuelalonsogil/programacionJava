package Fichero.FicherosDos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo7 {
    public static void main(String[] args) {
        String[] amigos={"Andres Rosique", "Pedro Ruiz", "Isaac Sanchez", "Juan Serrano"};
        File fs = new File("amigos.txt");

        try {
            FileWriter fw = new FileWriter(fs);
            for (String s:amigos) {
                /*escribe parte de la */
                fw.write(s,0,s.length());
                fw.write("\r\n");
            }
            if (fw!= null) fw.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
