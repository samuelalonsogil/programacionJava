package BoletinArrayList;

import java.util.ArrayList;

public class ImprimirElementosPorPosicion {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        for (String color:colores) {
            System.out.println(color);
        }
    }
}
