package BoletinArrayList;
import java.util.ArrayList;

/*19. Código Java para recortar (trim) la capacidad de un array list al
tamaño ACTUAL del array list.*/

public class RecortarLongitud {
    static ArrayList<String> colores = new ArrayList<String>(9);

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        
        colores.trimToSize();

       for (String color : colores) {
           System.out.println(color);
       }

        
    }
}
