package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class testBrisca {

    static ArrayList<Carta> mano = new ArrayList<Carta>();
    static HashMap<Integer,Integer> puntos = new HashMap<Integer, Integer>();

    public static void poblarMapa() {
        puntos.put(0, 11);
        puntos.put(1, 0);
        puntos.put(2, 10);
        puntos.put(3, 0);
        puntos.put(4, 0);
        puntos.put(5, 0);
        puntos.put(6, 0);
        puntos.put(7, 2);
        puntos.put(8, 3);
        puntos.put(9, 4);
    }


    public static void main(String[] args) {


        poblarMapa();
        System.out.println(puntos);

        int valor=0;
        int cont = 0;
        int puntuaje=0;
        do {
            for (int i = 0; i < 5; i++) {
                Carta magna = new Carta();
                mano.add(magna);
                cont++;


            }
        } while (cont < 5);
        Collections.sort(mano);
        //ver ordenadas
        System.out.println("mano ordenada");
        //checkeo
        for (Carta c : mano) {
            //System.out.println(c.getNumero() + " " + c.getPalo());
            //valor=c.getNumero();
            //System.out.println(valor);
            //System.out.println(puntos.get(c.getNumero()));
            puntuaje+=(int) puntos.get((c.getNumero()));
        }
        System.out.println(puntuaje);


    }
}
