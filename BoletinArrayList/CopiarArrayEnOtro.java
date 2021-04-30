package BoletinArrayList;

import java.util.ArrayList;

/*9. Código Java para copiar un array list en otro.*/

public class CopiarArrayEnOtro {
    static ArrayList<String> colores = new ArrayList<String>();
    static ArrayList<String> colores2 = new ArrayList<String>();
    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        for (String color :colores) {
            colores2.add(color);
        }

        System.out.println(colores2);
    }  
}
