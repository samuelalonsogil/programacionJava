package Strings.TeoriaStrings;

import java.util.Scanner;

// Muestra una pregunta tipo test y mira si acierta.
public class LecturaCaracter {
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
        char letra=0;
        Opciones();
        letra=Respuesta(letra);
        ComprobarOpcion(letra);
    
    }
    }