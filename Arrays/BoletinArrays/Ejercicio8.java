package Arrays.BoletinArrays;

import java.util.Scanner;

/*8. Diseñar una aplicación que declare una tabla de 10 
elementos enteros. Leer mediante el teclado 8 números. 
Después se debe pedir un número y una posición, insertarlo 
en la posición indicada, desplazando los que estén detrás. */

public class Ejercicio8 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int[] RellenarArray1(int array1[]){
        
        for(int i=0;i<array1.length-2;i++){
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array1[i]=sc.nextInt();
        }
        return array1;
     }

    public static int Numero(int num){
        System.out.println("Introduce el número a introducir en el array: ");
        return num=sc.nextInt();
     }

    public static int Posicion(int h){
        System.out.println("Introduce la posición: ");
        return h=sc.nextInt();
     }

    public static int[] Introducir(int array1[],int num, int h){
        array1[9]=num;
        int numdesp=9-h;
        int ultpos=8;
        for(int i=1;i<numdesp;i++){
            array1[ultpos]=array1[ultpos-1];
            ultpos--;
        }
         array1[h]=array1[9];
         array1[9]=0;
         return array1;
        }


     public  void MostrarArray(int array3[]){
        for(int i = 0; i<array3.length;i++){
            System.out.println("La posición " + i + " : " + array3[i]);
        }
    }


     public static void main(String[] args) {
        
        int array1[]=new int[10];
        array1=RellenarArray1(array1);

        int num=0;
        num=Numero(num);

        int h=0;
        h=Posicion(h);

        Introducir(array1, num, h);

        Ejercicio8 Array1 = new Ejercicio8();
        Array1.MostrarArray(array1);


     }


    }
