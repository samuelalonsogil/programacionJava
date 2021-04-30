package Arrays.BoletinArrays;

import java.util.Scanner;

public class Ejercicio3 {
    
    /*3. Leer 5 números por teclado y a continuación realizar la
        media de los números positivos, la media de los negativos y
        contar el número de ceros. */
   static Scanner sc = new Scanner(System.in);
    
    public static int[] RellenarArray(int array[]){
            for(int i=0;i<array.length;i++){
                System.out.println("Introduce la posición " + i + " : ");
                array[i]=sc.nextInt();
            }
            return array;
    }

    public static int sumaPosi(int array[],int sumaposi){
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                sumaposi+=array[i];
            }
        }return sumaposi;
    }
    
    public static int sumaNega(int array[],int sumanega){
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                sumanega+=array[i];
            }
        }return sumanega;
    }


    public static int Contadorpos(int array[],int contpos){
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                contpos++;
            }
        }return contpos;
    }

    public static int Contadorneg(int array[],int contneg){
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                contneg++;
            }
        }return contneg;
    }

    public static int Contadorceros(int array[],int cont){
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                cont++;
            }
        }return cont;
    }


    public static double Mediaposi(int sumaposi,int contpos){
        
        return sumaposi/contpos;
    }

    public static double Medianega(int sumanega,int contneg){
        
        return sumanega/contneg;
    }
     public static void main(String[] args) {
        int array[]=new int[5];
        array =RellenarArray(array);
        
        int cont=0;
        cont= Contadorceros(array,cont);
        System.out.println("El número de ceros es: " + cont);
       
        int contpos=0;
        contpos=Contadorpos(array, contpos);
        
        
        int contneg=0;
        contneg=Contadorneg(array, contneg);
        

        int sumapos=0;
        sumapos=sumaPosi(array, sumapos);
       

        int sumanega=0;
        sumanega=sumaNega(array, sumanega);
       
        while(contpos>0){
            System.out.println("La media de los positivos es: " + Mediaposi(sumapos, contpos));
            break;
        }
        
        while(contneg>0){
            System.out.println("La media de los negativos es: " + Medianega(sumanega, contneg));
            break;
        }
    }
}
