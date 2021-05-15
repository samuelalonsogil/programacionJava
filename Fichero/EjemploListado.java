package Fichero;

import java.io.File;
import java.io.IOException;

public class EjemploListado {

    public static void main(String[] args) {
        File cantoso = new File(".");

        try {
            cantoso.createNewFile();
        }catch(IOException e){
            e.getMessage();
        }


        File fichero = new File("."); //se indica la ruta entre comillas

        /*el '.' es el directorio actuaal*/

        String [] listaArchivos = fichero.list();

        System.out.println("Elemento del directorio activo");
        for (int i=0; i<listaArchivos.length;i++){
            System.out.println(listaArchivos[i]);
        }
    }
}
