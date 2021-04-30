package Strings.TeoriaStrings;
import java.util.Scanner;

public class BuscaCaracter {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirLinea(String linea){
        System.out.println("Introduce un línea de texto cualquiera: ");
        return linea=sc.nextLine();
    }

    public static char IntroducirCaracterABuscar(char caracter){
        System.out.println("Introduce el carácter que quieras buscar: ");
        return caracter=sc.nextLine().charAt(0);
    }

    public static int PrimeraPosicionCaracter(int primposicion, String linea, char caracter){
        return primposicion= linea.indexOf(caracter);
    }

    public static int UltimaPosicionCaracter(int ultposicion, String linea, char caracter){
        return ultposicion= linea.lastIndexOf(caracter);
    }

    public static void MostrarPrimeraPosicion(int primposicion){
        System.out.println("El carácter aparece por primera vez en la posición: " + primposicion);
    }

    public static void MostrarUltimaPosicion(int ultposicion){
        System.out.println("El carácter aparece por última vez en la posición: " + ultposicion);
    }
    public static void main(String[] args) {
        String linea="";
        linea=IntroducirLinea(linea);

        char caracter=0;
        caracter=IntroducirCaracterABuscar(caracter);

        int primposicion=0;
        primposicion=PrimeraPosicionCaracter(primposicion, linea, caracter);
        MostrarPrimeraPosicion(primposicion);

        int ultposicion=0;
        ultposicion=UltimaPosicionCaracter(ultposicion, linea, caracter);
        MostrarUltimaPosicion(ultposicion);


    }
}
