package Mapas;

import java.util.HashMap;
import java.util.Map;

public class ejemplo4 {

    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(001, "Amalia Nuñez");
        mapa.put(002, "Samuel Alonso");
        mapa.put(003, "Samuel Balseiro");
        mapa.put(004, "Yariana Lopez");

        //info con getKey y getValue

        System.out.println("Codigo\tNombre\n------\t------------");
        for (Map.Entry pareja : mapa.entrySet()){
            System.out.println(pareja.getKey() + "\t");
            System.out.println(pareja.getValue());
        }



    }
}
