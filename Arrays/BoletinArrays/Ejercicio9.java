package Arrays.BoletinArrays;

import java.util.Arrays;
import java.util.Scanner;

/*9. Crear un programa que lea por teclado una tabla de 10 
números enteros y la desplace una posición hacia abajo: el 
primero pasa a ser el segundo, el segundo pasa a ser el 
tercero y así sucesivamente. El último pasa a ser el 
primero.*/

public class Ejercicio9 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int[] RellenarArray1(int array1[]){
        
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array1[i]=sc.nextInt();
        }
        return array1;
     }

    public static int[] ModificarArray(int[] array1){
        int aux=array1[9];
        
        for(int i=array1.length-1;i>0;i--){
           array1[i]= array1[i-1];
        }
        array1[0]=aux;
        return array1;
     }
     
    public static void MostrarArray(int array1[]){
       System.out.println( Arrays.toString(array1));
     }

     public static void main(String[] args) {
        int array1[]=new int[10];
        array1=RellenarArray1(array1);
        ModificarArray(array1);

        MostrarArray(array1);
     }

}
