package BoletinArrayList;

import java.util.ArrayList;

/*7. Código Java para buscar un elemento en un array list.*/

public class BuscarElemento {
    
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        int posicion = colores.indexOf("verde");
        System.out.println(posicion);

        
    }
}
