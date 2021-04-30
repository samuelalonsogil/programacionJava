package Strings.BoletinStrings;
/*Haga un programa en Java llamado SubcadenaV que lea una frase desde el 
teclado y que muestre según el caso un mensaje diferente por pantalla: 
Si la frase no hay ninguna letra v, hay que mostrar el mensaje: "No 
hay ninguna v". 
Si en la frase sólo hay una letra v, hay que mostrar el mensaje: "Sólo 
hay una v". 
Si en la frase hay más de una letra viene, hay que mostrar todo el 
texto comprendido entre la primera y la última (incluidas).*/

import java.util.Scanner;

public class SubCadenaUves {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto) {
        System.out.println("Introduce el texto: ");
        return texto = sc.nextLine();
    }

    public static char IntroducirCaracter(char letra) {
        System.out.println("Introduce el caracter a buscar: ");
        return letra = sc.nextLine().charAt(0);
    }

    public static void Revisar(String texto, char letra) {
        char valor = 0;
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            valor = texto.charAt(i);
            if (valor == letra) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay ningún/a " + letra);
        } else if (contador == 1) {
            System.out.println("Solo hay un/a " + letra);
        } else if (contador > 1) {
            int inicio = texto.indexOf(letra);
            int fin = texto.lastIndexOf(letra);
            System.out.println("Texto entre " + letra + ":" + texto.substring(inicio + 1, fin));
        }
    }
    public static void main(String[] args) {
        String texto = "";
        texto = IntroducirTexto(texto);

        char letra = 0;
        letra = IntroducirCaracter(letra);

        Revisar(texto, letra);
    }
}
