package Arrays.BoletinArrays;

import java.util.Scanner;

public class Ejercicio2 {
    /*2. Leer 5 números y mostrarlos en orden inverso al
introducido. */

    static Scanner sc = new Scanner(System.in);

    public static void RellenarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce la posición " + i + " :");
            array[i] = sc.nextInt();
        }
    }

    public static void ImprimirArray(int array[]){
        for(int i=array.length-1;i>=0;i--){
            System.out.println("Posición " + i + " : " + array[i]);
             }  
    }

    
    public static void main(String[] args) {

    int[] array = new int[5];
    
    RellenarArray(array);
    ImprimirArray(array);
        
    }
}
