package Strings.Retos;

import java.util.Scanner;

/*Reto 2: modifique el programa anterior para permitir hasta tres
intentos de respuesta en lugar de uno.  #LecturaCaracter*/

public class Reto2 {

    public static final char RESPOSTA_CORRECTA = 'b';
    static Scanner sc = new Scanner(System.in);

    public static void Opciones(){
        System.out.println("Acierta la pregunta.");
        System.out.println("¿Cuál de los siguientes no es un tipo primitivo?");
        System.out.println("a) Entero");
        System.out.println("b) Scanner");
        System.out.println("c) Carácter");
        System.out.println("d) Booleano");
    }

    public static char Respuesta(char letra){
        System.out.println("Introduce tu respuesta");
        return letra=sc.nextLine().charAt(0);
    }

    public static void ComprobarOpcion(char letra){
         if ((letra >= 'a') && (letra <= 'd')) {
            if (letra == RESPOSTA_CORRECTA) {
                System.out.println("Efectivamente, la respuesta era " + RESPOSTA_CORRECTA + ".");
            }else{
            System.out.println("La respuesta " + letra + " es incorrecta.");
            }
        }else{
        System.out.println("" + letra + " es una opción incorrecta.");
        }
     }

    

    public static void main(String[] args) {
        int intentos=0;
        char letra=0;
        do {
        Opciones();
        letra=Respuesta(letra);
        ComprobarOpcion(letra);
        intentos++;
        if(letra=='b') break;
        } while (intentos<3);
    
    }
    
}
