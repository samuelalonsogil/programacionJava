package BoletinArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*11. Código Java para invertir el orden de los elementos de un array
list.*/

public class InvertirOrden {
    static ArrayList<String> colores = new ArrayList<String>();
    
    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        Collections.reverse(colores);

        System.out.println(colores);
    }  
}
