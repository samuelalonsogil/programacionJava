package Strings.Retos;

import java.util.Arrays;

/*Reto 4: usando el método compareTo, debe ORDENAR un array de cadenas
de texto ya exixtentes. */

public class Reto4 {
    static String[] burbuja(String[] paso) {

        for (int i = 0; i < paso.length - 1; i++) {
            // Bucle interno.
            // Se busca entre el resto de posiciones cuál es el valor más bajo.
            for (int j = i + 1; j < paso.length; j++) {
                // La posición tratada tiene un valor más alto que el de la búsqueda. Los
                // intercambiamos.
                if (paso[i].compareTo(paso[j]) > 0) {

                    // Para intercambiar valores hay una variable auxiliar.
                    String aux = paso[i];
                    paso[i] = paso[j];
                    paso[j] = aux;
                }
            }
        }
        return paso;
    }

    public static void main(String[] args) {

        String[] cads = { "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn" };
        System.out.println(Arrays.toString(cads));
        burbuja(cads);

        System.out.println(Arrays.toString(cads));
    }
}
