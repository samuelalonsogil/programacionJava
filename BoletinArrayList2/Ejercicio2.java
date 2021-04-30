package BoletinArrayList2;

import java.util.ArrayList;

public class Ejercicio2 {

    public static Integer numeroRandom(){
        return (Integer)((int)(Math.random()*100));
    }

    public static int tamañoArray(){
        return ((int)(10 + Math.random()*10));
    }

    public static void main(String[] args) {

        int tamañoArray=tamañoArray();

        ArrayList<Integer> numeros = new ArrayList<Integer>(tamañoArray);

        for(int i=0; i<tamañoArray;i++){
            numeros.add(numeroRandom());
        }

        double suma=0;
        int cont=0;

        int max=0;
        int min =100;
        for (Integer numero: numeros) {
            cont++;
            suma+=numero;

            if (numero > max) max = numero;
            if (numero < min) min = numero;
        }
        double media = suma/cont;
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        
        System.out.println("Número mayor: " + max + " Número menor: " + min);








    }
}
