package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class CartaTest {

    public static void main(String[] args) {
        ArrayList<Carta> mano = new ArrayList<Carta>();

        //genera 10 cartas

        int cont=0; //hasta que se añadan 10 cartas no para
        do {
            for(int i=0;i<10;i++){

                Carta magna = new Carta();
                if (!mano.contains(magna)){ //si no está en el array se añaden
                    mano.add(magna);
                    cont++;
                }
            }
        }while(cont<10);




        for (Carta c : mano) {
            System.out.println(c);
        }

        Collections.sort(mano); //ordenas

        System.out.println("Lista ordenada");
        for (Carta c : mano) {

            System.out.println(c);
        }
    }
}
