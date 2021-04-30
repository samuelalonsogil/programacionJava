package Mapas;

import java.util.HashMap;
import java.util.Map;

public class ejemplo3 {

    public static void main(String[] args) {
        HashMap<Integer,String> mapa = new HashMap<Integer,String>();
        mapa.put(001, "Amalia Nuñez");
        mapa.put(002, "Samuel Alonso");
        mapa.put(003, "Samuel Balseiro");
        mapa.put(004, "Yariana Lopez");

        //info entrySet
        System.out.println("Todas las entradas del diccionario extraidas con entrySet");
        System.out.println(mapa.entrySet());

        //info con foreach y toString
        System.out.println("Entradas extraidas una a una");

        for (Map.Entry pareja:mapa.entrySet()) {
            System.out.println(pareja);
        }


    }
}
