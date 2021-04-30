package BoletinArrayList;
import java.util.ArrayList;
import java.util.Collections;

/*8. Código Java para ordenar un array list dado.*/

public class Ordenar {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        Collections.sort(colores);
    }
}
