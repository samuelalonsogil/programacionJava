package Fichero;

import Fichero.FicherosDos.Amigo;

import java.io.*;
import java.util.ArrayList;

public class LecturaAmigos{
    public static void main(String[] args) {
        ArrayList<Amigo> amigos = new ArrayList<Amigo>();

        try {
            File archivo = null;

            /*lee bytes*/
            FileInputStream lectorBytes = null;

            /*lee objetos bytes*/
            ObjectInputStream lectorObjetosBytes = null;


            try {
                archivo = new File("colegas.txt");

                if (archivo.exists()) {
                    lectorBytes = new FileInputStream(archivo);
                    lectorObjetosBytes = new ObjectInputStream(lectorBytes);

                    while (true) {
                        Amigo amigo1 = null;

                        amigo1 = (Amigo) lectorObjetosBytes.readObject();

                        System.out.println(amigo1.toString());
                        amigos.add(amigo1);
                    }
                }
            } catch (EOFException | ClassNotFoundException eof) {
                System.out.println("----------------------------");
            } catch (FileNotFoundException fne) {
                System.out.println("Archivo no encontrado" + fne);

            } catch (IOException ioe) {
                System.out.println("Ioe esxception");
                ioe.printStackTrace();
            } catch (Throwable e) {
                System.out.println("Error de programa");
            } finally {
                if (lectorObjetosBytes != null) {
                    lectorObjetosBytes.close();
                    lectorBytes.close();
                }
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
}
