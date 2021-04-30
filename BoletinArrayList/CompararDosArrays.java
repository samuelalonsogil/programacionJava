package BoletinArrayList;
import java.util.ArrayList;


/*13. Código Java para comparar dos array lists.*/

public class CompararDosArrays {
    static ArrayList<String> colores = new ArrayList<String>();
    static ArrayList<String> colores2 = new ArrayList<String>();
    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        colores2.add("azul");
        colores2.add("rojo");
        colores2.add("verde");
        colores2.add("negro");

        int contador =0;
        for(String color:colores){
            contador++;
            System.out.println(color);
        }System.out.println(contador);

        int contador2 =0;
        for(String color2:colores){
            contador2++;
            System.out.println(color2);
        }System.out.println(contador2);

        if (contador>contador2) {
            System.out.println("El arraylist 1 es mayor");
        }else if (contador2>contador){
            System.out.println("El arraylist 2 es mayor");
        }else if(contador==contador2){
            System.out.println("Los dos son iguales");
        }

        

        
    }
}
