package Examen_2a_ev;

import java.util.Scanner;

/*Ejercicio 1B

Crear un programa que lea por teclado una tabla de 10 números
enteros y la desplace un numero N de posiciones pedidas al
usuario. Los números que salgan por el final del ARRAY deberán
entrar de nuevo por el principio del mismo.*/

public class Ejercicio1B {

    static Scanner sc = new Scanner(System.in);

    public static int[] RellenarArray1(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int Numero(int num){
        System.out.println("Introduce el número de posiciones a desplazar: ");
        return num=sc.nextInt();
     }

  


    }


