package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public final static int TAMAÑO_ARRAY=10;

    public static int introduceNum(int num){
        int cont=0;
        System.out.println("Introduce los números: ");
        return num = sc.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>(TAMAÑO_ARRAY);
        int num=0;
        num = introduceNum(num);

        int cont=1;
        while(cont!=10){
            cont++;
            introduceNum(num);

            numeros.add(num);
        }

        Collections.sort(numeros);
        System.out.println(numeros);


    }
}
