package Arrays.BoletinArrays;

import java.util.Scanner;

/*7. Leer por teclado una serie de 10 números enteros. La 
aplicación debe indicarnos si los números están ordenados 
de forma creciente, decreciente, o si están desordenados. */

public class Ejercicio7 {
    
    public static int[] RellenarArray1(int array1[]){

        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array1[i]=sc.nextInt();
        }
        sc.close();
         return array1;
    }

    public void Identificador(int array1[], boolean creciente, boolean decreciente){
        for(int i=0;i<array1.length-1;i++){
            if(array1[i]<array1[i+1]) {creciente=true;}
            if(array1[i]>array1[i+1]) {decreciente=true;}
        }
        if(creciente==true&&decreciente==false){
            System.out.println("El array es creciente");
        }else if(creciente==false&&decreciente==true){
            System.out.println("El array es decreciente");
        }else if(creciente==true&&decreciente==true){
            System.out.println("EL array está desordenado");
        }else if(creciente==false&&decreciente==false){
            System.out.println("Todos los números del array son iguales");
        }
    }

    public static void main(String[] args) {
        int array1[]=new int[10];
        array1=RellenarArray1(array1);

        Ejercicio7 Array1 = new Ejercicio7();
        Array1.Identificador(array1, false, false);
    }

}
