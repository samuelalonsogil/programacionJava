package BoletinArrayList2;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio6 {

    /*estructura ,ap String, Strnig*/
    static HashMap<String, String> mapa = new HashMap<String, String>();
    static Scanner sc = new Scanner(System.in);

    static String user, clave;
    static boolean entra = false;
    static int chances;

    /*poblamos el mapa*/
    public static void main(String[] args) {
        mapa.put("admin", "0000");
        mapa.put("admin1", "0001");
        mapa.put("admin2", "0002");

        System.out.println("introduce el nombre de user y clave (3 intentos)");

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        do {
            System.out.println("user: ");
            user = sc.nextLine();
            System.out.println("key: ");
            clave = sc.nextLine();
            chances++;

            if (mapa.containsKey(user)) {
                System.out.println("user existente");
                if (mapa.get(user).equals(clave)) {
                    System.out.println("clave correcta");
                    entra = true;
                } else System.out.println("clave incorrecta");
            } else System.out.println("user no existe");


        } while (chances != 3 && !entra );
    }

}
