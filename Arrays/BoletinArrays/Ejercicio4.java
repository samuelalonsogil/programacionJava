package Arrays.BoletinArrays;
/*4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);

    public static int LongitudArray(int num){
        System.out.println("Introduce la longitud que quieres que tenga el array: ");
        return num=sc.nextInt();
    }
    
    public static int[] RellenarArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println("Introduce la posición " + i + " : ");
            array[i]=sc.nextInt();
        }
         return array;
    }

    public void ImprimirArray(int array[]){
        for(int i=0;i<array.length/2;i++){
            System.out.println("La posición número " + i +  " vale: " + array[i]);
            System.out.println("La posición número " + ((array.length-1)-i) +  " vale: " + array[((array.length-1)-i)]);
        }
    }
    public static void main(String[] args) {
        Ejercicio4 array1 = new Ejercicio4();
        
        int num=0;
        int num1=LongitudArray(num);

        int array[] = new int[num1];
        array=RellenarArray(array);
        
        array1.ImprimirArray(array);
    }
}
