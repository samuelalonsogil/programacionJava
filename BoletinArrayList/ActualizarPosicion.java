package BoletinArrayList;
import java.util.ArrayList;

/*5. Código Java para actualizar una posición especifica de un array list
con un elemento dado.*/

public class ActualizarPosicion {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");
        
        colores.set(1, "violeta");

        for (String color : colores) {
            System.out.println(color);
        }
    }
}
