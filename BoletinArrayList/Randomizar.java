package BoletinArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*10. Código Java para mover entre si los elementos de un array list.*/

public class Randomizar {
    
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        Collections.shuffle(colores);
        
        for (String color : colores) {
            System.out.println(color);
        }
    }
    
}