package Strings.TeoriaStrings;

import java.util.Scanner;

public class AdivinaPalabra {
    // La palabra para adivinar es "java".
    public static final String PALABRA_SECRETA = "java";

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Empezamos el juego.");
        System.out.println("Adivina el valor de la palabra del diccionario.");

        boolean hasAcertado = false;
        while (!hasAcertado) {
            System.out.print("¿Qué palabra crees que es?");
            String palabraUsuario = lector.next();
            lector.nextLine();
            int posicion = palabraUsuario.compareTo(PALABRA_SECRETA);
            if (posicion < 0) {

                // La palabra del usuario es anterior a la secreta.
                System.out.println("Has fallado! La palabra va después ...");
            } else if (posicion > 0) {
                // La palabra del usuario es posterior a la secreta
                System.out.println("Has fallado! La palabra va antes ...");
            } else {
                // Si vale 0, es que se ha acertado.
                hasAcertado = true;
            }
        }
        System.out.println("Enhorabuena. Has acertado!");
        lector.close();
    }
}
