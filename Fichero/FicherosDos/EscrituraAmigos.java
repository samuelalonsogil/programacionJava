package Fichero.FicherosDos;

import java.io.*;

public class EscrituraAmigos {
    public static void main(String[] args) {

        String[] nombre = {"Andrés Rosinque", "Pedro Ruiz", "Isaac Sanchez", "Juan Serrano"};
        long[] tlf = {696550102, 676404110,649053869, 607893256};

        /*Escribimos el fichero*/
        try {
            /*escritura de bytes*/
            FileOutputStream escribeBytes = new FileOutputStream("colegas.txt");

            /*escritura de objetos de bytes*/
            ObjectOutputStream escribeObjetosBytes = new ObjectOutputStream(escribeBytes);

            for (int i=0; i<4; i++){
                    Amigo a = new Amigo(nombre[i], tlf[i]);
                    escribeObjetosBytes.writeObject(a);
            }
                if (escribeObjetosBytes != null){
                    escribeObjetosBytes.close();
                    escribeBytes.close();
                }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
