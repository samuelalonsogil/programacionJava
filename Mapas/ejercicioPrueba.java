package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicioPrueba {

    static Scanner sc = new Scanner(System.in);

    public static int introducePrefijo(int prefijo){
        System.out.println("Introduce el prefijo telefónico");
        return prefijo = sc.nextInt();
    }

    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(981, "A Coruña");
        mapa.put(982, "Lugo");
        mapa.put(986, "Pontevedra");
        mapa.put(988, "Ourense");

        //comprobacion de existencia de clave


        int prefijo = 0;
        prefijo = introducePrefijo(prefijo);

        if (mapa.containsKey(prefijo)) {
            System.out.println("El prefijo " + prefijo + " corresponde a ");
            System.out.println(mapa.get(prefijo));
        } else {
            System.out.println("El prefijo introducido no existe");
        }
    }
}