package BoletinArrayList2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> palabras = new ArrayList<String>();


    public static String introducePalabras(String palabra) {
        System.out.println("Introduce la palabra: ");
        return palabra = sc.nextLine();
    }

    public static void añadirPalabras(String palabra) {
        for (int i = 0; i < 10; i++) {
            palabra = introducePalabras(palabra);
            palabras.add(palabra);
        }
    }

    public static ArrayList<String> ordenar(ArrayList<String> palabras){
        Collections.sort(palabras);
        return palabras;
    }

    public static void mostrarArray(ArrayList<String> palabras){
        System.out.println(palabras);;
    }

    public static void main(String[] args) {
        String palabra = " ";
        añadirPalabras(palabra);
        ordenar(palabras);
        mostrarArray(palabras);




    }
}
