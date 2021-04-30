package BoletinArrayList;

import java.util.ArrayList;

/*6. Código Java para eliminar el tercer elemento de un array list.*/

public class EliminarElemento {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        colores.remove(2);

        for (String color : colores) {
            System.out.println(color);
        }
    }
}
