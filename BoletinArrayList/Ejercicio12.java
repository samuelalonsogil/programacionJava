package BoletinArrayList;

import java.util.ArrayList;

/*12. Código Java para extraer una parte de un array list.*/
public class Ejercicio12 {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        ArrayList<String> coloresclon = new ArrayList<String>(colores);
        
        System.out.println(coloresclon);
    }
}
