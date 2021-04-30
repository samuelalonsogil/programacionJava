package Strings.TeoriaStrings;

import java.util.Scanner;

/*Haga un programa en Java llamado SumarEntreComas que lea desde el
teclado una única línea de texto. Esta debe estar siempre compuesta de
números enteros separados entre sí por comas. El programa debe mostrar
la suma de todos los valores individuales.

Por ejemplo, si se escribe "3,8,5,4,11,5", el resultado mostrado será
"36" (3 + 8 + 5 + 4 + 11 + 5).
Esta vez, puede considerarse que la línea escrita siempre es correcta.
No hay que prever errores debido a un formato incorrecto del texto.*/

public class SumaNumsStrings {

    static Scanner sc = new Scanner(System.in);

    public static String IntroducirNumeros(String nums){
        System.out.println("Introduce los números separados por comas: ");
        return nums=sc.nextLine();
    }

    public static String[] DividirString(String nums){
        String[] numeros = nums.split(",");
        return numeros;
    }

    public static int Suma(String[] numeros){
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            suma=suma+Integer.parseInt(numeros[i]);
        }
        return suma;
    }

    public static void MostrarSuma(int suma){
        System.out.println("La suma de los números es: " + suma);
    }

    public static void main(String[] args) {
        String nums="";
        nums=IntroducirNumeros(nums);

        String[] numeros=DividirString(nums);
        
        int suma=Suma(numeros);

        MostrarSuma(suma);
        
        
        
    }

    
}
