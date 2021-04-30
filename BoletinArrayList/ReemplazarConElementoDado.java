package BoletinArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ReemplazarConElementoDado {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> colores = new ArrayList<String>();

    public static String AñadirElemento(String elemento) {
        System.out.println("Añade un elemento: ");
        return elemento = sc.nextLine();
    }

    public static int Posicion(int posicion){
        System.out.println("Añade una posición: ");
        return posicion = sc.nextInt();
    }

    public static ArrayList<String> Reemplazar(String elemento,int posicion){
        colores.set(posicion, elemento);
        return colores;
    }

    public static void Mostrar(ArrayList<String> colores){
        System.out.println(colores);
    }

    public static void main(String[] args) {
        colores.add("azul");
        colores.add("rojo");
        colores.add("verde");

        
        String elemento="";
        elemento=AñadirElemento(elemento);
        int posicion=0;
        posicion = Posicion(posicion);

        colores = Reemplazar(elemento, posicion);

        Mostrar(colores);
    }
}
