package Arrays.BoletinArrays;

import java.util.Scanner;

/*6. Leer los datos correspondientes a dos tablas de 12 
elementos numéricos, y mezclarlos en una tercera de la 
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de 
la B, etc */

public class Ejercicio6 {
    
    static  Scanner sc = new Scanner(System.in);
    
    public static int[] RellenarArray1(int array1[]){
        
        for(int i=0;i<array1.length;i++){
            System.out.println("Introduce la posición " + i + " del primer array : ");
            array1[i]=sc.nextInt();
        }
         return array1;
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
        
        for(int i=0;i<array1.length;i+=3){
            array3[j]=array1[i];
            j++;
            array3[j]=array1[i+1];
            j++;
            array3[j]=array1[i+2];
            j++;
            array3[j]=array2[i];
            j++;
            array3[j]=array2[i+1];
            j++;
            array3[j]=array2[i+2];
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

        int[]array1 = new int[12];
        int[]array2 = new int[12];
        int array3long= array1.length+array2.length;
        int[]array3= new int[array3long];
        
        array1=RellenarArray1(array1);
        array2=RellenarArray2(array2);
        array3=RellenarArray3(array1, array3, array2);

        Ejercicio6 Array3 = new Ejercicio6();
        Array3.MostrarArray(array3);
    }
}


