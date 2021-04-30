package Strings.TeoriaStrings;

// Programa que escribe por pantalla los argumentos de un programa.

public class LecturaArgumentos {

    // Los argumentos están a la variable "args".

    public static void main(String[] args) {
        // Primero hay que mirar si hay alguno.
        if (args.length > 0) {
            // Hay. Se muestran por pantalla ordenadamente.
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumento " + i + " :" + args[i]);
            }
        } else {
            // No hay ninguno.
            System.out.println("No hay ningún argumento.");
        }
    }

}
