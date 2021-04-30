package RepasoPreExamen2aEv;

import java.util.Arrays;

/*generar un array de 60 posiciones con valores entre 0 y 100,
separe en dos arrays los valores, no las posiciones, pares e impares-
Ordene ambos arrays por quicksort*/

public class Ejercicio2 {


public static int[] RellenarAleatorios(int[] array){
    int longit=array.length;
    for (int i = 0; i<longit;i++){
        array[i]=(int)(Math.random()*100); }
        return array;
}

public static void MostrarArray(int[] array){
    System.out.println(Arrays.toString(array));
}

public static int[] SepararValoresPares(int[] array,int[] arraypar){
    int longit=array.length;
    for (int i=0, j=0;i<longit;i++){
         if(array[i]%2==0){
            arraypar[j]=array[i];
            j++;};
        }return arraypar;
} 


public static int ContadorPares(int[] array, int contpar){
    int longit=array.length;
    for (int i=0;i<longit;i++){
        if(array[i]%2==0){ contpar++;};
    } 
     return contpar;
    }


public static int[] SepararValoresImpares(int[] array,int[] arrayimpar){
    int longit=array.length;
    for (int i=0,j=0;i<longit;i++){
        if(array[i]%2!=0){ 
            arrayimpar[j]=array[i];
            j++;
        }
    }return arrayimpar;
} 

public static int ContadorImpares(int[] array, int contimpar){
    int longit=array.length;
    for (int i=0;i<longit;i++){
        if(array[i]%2!=0){ contimpar++;};
        
    }return contimpar;
}

public static void main(String[] args) {
    int[] array = new int[60];
    array=RellenarAleatorios(array);
    MostrarArray(array);

    int contpar=0;
    contpar=ContadorPares(array, contpar);
    int contimpar=0;
    contimpar=ContadorImpares(array, contimpar);

    System.out.println("Pares: " + contpar + "\nImpares: " + contimpar);

    int[] arraypar = new int[contpar];
    arraypar=SepararValoresPares(array, arraypar);

    
    int[] arrayimpar = new int[contimpar];
    arrayimpar=SepararValoresImpares(array, arrayimpar);

    MostrarArray(arraypar);
    MostrarArray(arrayimpar);


    

    



}
    
}
