package Arrays.BoletinArrays;

import java.util.Scanner;

/*5. Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1º de A, el 1º de
B, el 2º de A, el 2º de B, etc. */

public class Ejercicio5 {
    
  static  Scanner sc = new Scanner(System.in);
    
    public static int LongitudArray1(int num){
        System.out.println("Introduce la longitud que quieres que tenga el primer array: ");
        return num=sc.nextInt();
    }
    
    public static int[] RellenarArray1(int array1[]){
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array1[i]=sc.nextInt();
        }
         return array1;
    }

    public static int LongitudArray2(int num2){
        System.out.println("Introduce la longitud que quieres que tenga el segundo array: ");
        return num2=sc.nextInt();
    }
    
    public static int[] RellenarArray2(int array2[]){
        for(int i=0;i<array2.length;i++){
            System.out.println("Introduce la posición " + i + " del segundo array : ");
            array2[i]=sc.nextInt();
        }
         return array2;
    }

    public static int[] RellenarArray3(int array1[], int array3[], int array2[]){
        int j=0;
        int array3long=array1.length+array2.length;
        for(int i=0;i<array3long;i++){
            array3[j]=array1[i];
            j++;
            
            array3[j]=array2[i];
            j++;
        }
         return array3;
    }

    public  void MostrarArray(int array3[]){
        for(int i = 0; i<array3.length;i++){
            System.out.println("La posición " + i + " : " + array3[i]);
        }
    }
    
    public static void main(String[] args) {
        int num=0;
        int num2=0;
       
        num = LongitudArray1(num);
        int array1[]=new int[num];
        array1=RellenarArray1(array1);
        for(int i = 0; i<num;i++){
            System.out.println("La posición " + i + " : " + array1[i]);
        }
        
        num2= LongitudArray2(num2);
        int array2[]=new int[num2];
        array2=RellenarArray2(array2);
        for(int i = 0; i<num2;i++){
            System.out.println("La posición " + i + " : " + array2[i]);
        }
        System.out.println("-------------------------------------------");
        
        int num3 = num+num2;
        int array3[]= new int[num3];
        array3=RellenarArray3(array1, array3, array2);
        
        Ejercicio5 Array3 = new Ejercicio5();
        Array3.MostrarArray(array3);

        
    }
}
