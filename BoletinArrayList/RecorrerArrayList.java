package BoletinArrayList;

import java.util.ArrayList;

/*2. Código Java para para recorrer todos los elementos de un array list.*/

public class RecorrerArrayList {
    
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        for (String color : colores) {
            System.out.println(color);
        }
    }

}
