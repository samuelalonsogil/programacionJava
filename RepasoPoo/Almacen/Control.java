package RepasoPoo.Almacen;
import RepasoPoo.Almacen.AlmacenNeg;

import java.util.Scanner;

public class Control {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AlmacenNeg cerca = new AlmacenNeg((byte) 2);
        AlmacenNeg medio = new AlmacenNeg((byte) 4);
        AlmacenNeg lejos = new AlmacenNeg((byte) 8);

        String Accion;

        do {
            System.out.println("Hey, introduce 'm' para meter o 's' para sacar");
            System.out.println("Escribe 'Salir' para finalizar");
            Accion = sc.nextLine();
            if (Accion.equals("m")) // meter contenedor

                if (cerca.HayHueco())
                    cerca.MeteContenedor();

                else if (medio.HayHueco())
                    medio.MeteContenedor();
                else if (lejos.HayHueco())
                    lejos.MeteContenedor();
                else
                    System.out.println("Lleno, hay que esperar a que vengan a quitar un contenedor");
            else if (Accion.equals("s"))
                if (cerca.HayContenedor())
                    cerca.SacaContenedor();
                else if (medio.HayContenedor())
                    medio.SacaContenedor();
                else if (lejos.HayContenedor())
                    lejos.SacaContenedor();
                else
                    System.out.println("Vacio, hay que esperar a que vengan a poner un contenedor");
        } while (!Accion.equals("Salir"));
    }
}
