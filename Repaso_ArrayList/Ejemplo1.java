package Repaso_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "agnora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marron", "persa"));

        for (Gato gatoaux:g) {
            System.out.println(gatoaux + "\n");
        }

        Collections.sort(g);

        for (Gato gatoaux:g) {
            System.out.println(gatoaux + "\n");
        }
    }
}
