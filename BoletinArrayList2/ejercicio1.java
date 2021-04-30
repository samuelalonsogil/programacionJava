package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Samuel");
        alumnos.add("Max");
        alumnos.add("Balseiro");
        alumnos.add("Cristian");
        alumnos.add("Yariana");
        alumnos.add("Oitaben");

        for (String nombres : alumnos) {
            System.out.println(nombres);
        }

        Collections.sort(alumnos);

        for (String nombres : alumnos) {
            System.out.println(nombres);
        }
    }


}
