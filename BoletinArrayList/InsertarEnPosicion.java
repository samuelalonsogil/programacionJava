package BoletinArrayList;
import java.util.ArrayList;

/*3. Código Java para insertar un elemento en un array list en su primera
posición.*/

public class InsertarEnPosicion {
    static ArrayList<String> colores = new ArrayList<String>();

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");
        colores.add(0, "lila");
        

        for (String color : colores) {
            System.out.println(color);
        }
    }
}
