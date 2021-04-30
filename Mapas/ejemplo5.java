package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejemplo5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(001, "Amalia Nuñez");
        mapa.put(002, "Samuel Alonso");
        mapa.put(003, "Samuel Balseiro");
        mapa.put(004, "Yariana Lopez");

        //comprobacion de existencia de clave

        System.out.println("Introduce clave");
        int codigo = sc.nextInt();

        if (mapa.containsKey(codigo)){
            System.out.println("El código " + codigo + " corresponde a ");
            System.out.println(mapa.get(codigo));
        }else{
            System.out.println("El código introducido no existe");
        }



    }
}
