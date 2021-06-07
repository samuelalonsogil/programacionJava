package Fichero.RepasoPreExamen;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEjemplo {
    public static void main(String[] args) {

        /*hay que pasarle la ruta donde crear/escribir/leer el fichero
        si no existiera un fichero al escribir se crea*/

        /*en este caso es de escritura*/

        /*tiene que ir dentro de un try/catch siempre*/

        try {
            FileWriter fw = new FileWriter("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\holaMundo.txt", true);
            fw.write(" \nheey");

            /*lo que se va a escribir en el fichero, se puede volver a ejecutar y sobreescribes lo que está,
             * si lo que se quiere es añadir a continuación hay que añadirle el true en la creación del objeto*/

            fw.close();/*cada vez que se pasa información hay que cerrar el flujo después*/

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


            /*si el objeto se mete dentro del parentesis del try no hace falta cerrar el flujo y se pueden meter los que se quiera*/
        try (FileWriter fw2 = new FileWriter("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\holaMundo.txt", true);
             FileWriter fw3 = new FileWriter("E:\\Clase\\Programacion\\Fichero\\RepasoPreExamen\\holaMundo.txt", true);) {

            fw2.write("\nFileWriter2");
            fw3.write("\nFileWriter3");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
