package Strings.BoletinStrings;

import java.util.Scanner;

/*2 Palabras impares 
El objetivo de esta actividad es aprender a dividir frases en palabras 
individuales, que puedan ser fácilmente procesadas.
Haga un programa en Java llamado PalabrasImpares que lea una frase 
escrita en una sola línea desde el teclado y a continuación escriba 
las palabras que hay en posición impar (la primera, la tercera, etc.). 
Por ejemplo, si escribe "Había una vez un lugar ...", se mostrará 
"Habia una un". */

public class PalabrasImpares {
    
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto) {
        System.out.println("Introduce el texto: ");
        return texto = sc.nextLine();
    }

    public static String[] DividirFrase(String texto){
        String[] dividido = texto.split(" ");
        return dividido;
    }

    public static String Impares(String[] dividido, String texto){
        for(int i=0;i<dividido.length;i++){
            if(i%2!=0){
                texto+=dividido[i]+ " ";
            }
        }return texto;
    }

    public static void Mostrar(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {
        String texto="";
        
        texto=IntroducirTexto(texto);

        String[] dividido;
        dividido=DividirFrase(texto);
        
        texto="";
        
        texto=Impares(dividido, texto);
        Mostrar(texto);
        
    }

}
