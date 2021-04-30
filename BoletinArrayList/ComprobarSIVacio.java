package BoletinArrayList;

import java.util.ArrayList;

/*18. Código Java para testear si un array list esta vacío o no.*/
public class ComprobarSIVacio {
    
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        if(colores.isEmpty()) {
            System.out.println("Está vacío");
        }else {
            System.out.println("Hay cosas");
        }

        
    }

}
