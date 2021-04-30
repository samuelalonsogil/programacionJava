package BoletinArrayList;

import java.util.ArrayList;

/*16. Código Java para clonar un array list en otro array list.*/

public class ClonarEnOtro {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        ArrayList<String> coloresclon = new ArrayList<String>(colores);
        
        System.out.println(coloresclon);
    }
}
