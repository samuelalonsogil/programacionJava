package Fichero;

import java.io.File;
import java.util.Scanner;

public class EjemploFile2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del archivo que desea borrar: ");
        String nombreFichero = sc.nextLine();

        File fichero = new File(nombreFichero);
        if (fichero.exists()){
            fichero.delete();
            System.out.println("Borrado correctamente");
        }else{
            System.out.println("vanpiros no esisten");
        }
    }

}
