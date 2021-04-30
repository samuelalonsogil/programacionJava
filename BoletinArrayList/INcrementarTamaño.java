package BoletinArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*20. Código Java para incrementar el tamaño de un array list.*/

public class INcrementarTamaño {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> colores = new ArrayList<String>();

    public static String AñadirColores(String color) {
        System.out.println("Añade un color, introduzca 'fin' para parar: ");
        return color = sc.nextLine();
    }

    public static ArrayList<String> Repeticion(String color) {
        while (!color.equals("fin")) {
            color = AñadirColores(color);
            colores.add(color);
        }
        return colores;
    }

    public static int UltimoElemento(int longitud) {
        return longitud = colores.size() - 1;
    }

    public static ArrayList<String> EliminarUltimoElemento(int longitud) {
        colores.remove(longitud);
        return colores;
    }

    public static void Mostrar(String color) {
        System.out.println(colores);
    }

    public static void main(String[] args) {

        String color = "";
        colores = Repeticion(color);

        int longitud = 0;
        longitud = UltimoElemento(longitud);

        colores = EliminarUltimoElemento(longitud);

        Mostrar(color);

    }
}
