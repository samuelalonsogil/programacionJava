package BoletinArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*14. Código Java para intercambiar (swap) dos elementos de un array list.*/
public class SwapElementos {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        Collections.swap(colores, 0, 2);

        System.out.println(colores);
    }
}
