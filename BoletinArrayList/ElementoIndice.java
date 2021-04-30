package BoletinArrayList;
import java.util.ArrayList;

/*4. Código Java para obtener un elemento (en un índice especificado) de
un array list dado.*/

public class ElementoIndice {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");
        colores.add(0, "lila");

        System.out.println(colores.get(1));
    }
}
