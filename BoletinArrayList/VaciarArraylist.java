package BoletinArrayList;
import java.util.ArrayList;

/*17. Código Java para vaciar un array list.*/

public class VaciarArraylist {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        colores.clear();

        System.out.println(colores);
    }
}
