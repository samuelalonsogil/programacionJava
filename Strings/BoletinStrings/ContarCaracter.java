package Strings.BoletinStrings;

import java.util.Scanner;

/*1 Contar Letras a
El objetivo de esta actividad es aprender a recorrer un objeto string
(una cadena de texto) para tratar los valores que contiene.
Generar un programa en Java llamado CuentaAesString que cuente cuántas
letras a contiene una cadena de texto. El texto para tratar puede ser
cualquiera y lo puede declarar como una constante en el código fuente.*/

public class ContarCaracter {

    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto) {
        System.out.println("Introduce el texto: ");
        return texto = sc.nextLine();
    }

    public static char IntroducirCaracter(char letra) {
        System.out.println("Introduce el caracter a buscar: ");
        return letra = sc.nextLine().charAt(0);
    }

    public static int ContarCaracteres(String texto, char letra) {
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void MostrarContador(int contador,char letra) {
        System.out.println("El número de veces que aparece el caracter es: " + contador);
    }

    public static void main(String[] args) {
        String texto = "";
        texto = IntroducirTexto(texto);

        char letra=0;
        letra=IntroducirCaracter(letra);
        
        int contador = 0;
        contador = ContarCaracteres(texto,letra);

        MostrarContador(contador,letra);
    }

}
