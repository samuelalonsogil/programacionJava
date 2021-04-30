package BoletinPoo2.Contraseñas;

import java.util.Scanner;

public class ContraseñaTest {
    static Scanner sc = new Scanner(System.in);


    public static int tamañoArray(int tamaño) {
        System.out.println("Introduce el tamaño del array");
        return tamaño = sc.nextInt();
    }

    public static int longitudPswrd(int longitud) {
        System.out.println("Introduce la longitud de la contraseña");
        return longitud = sc.nextInt();
    }


    public static void main(String[] args) {
        int tamaño = 0;
        tamaño = tamañoArray(tamaño);


        Password contraseña[] = new Password[tamaño];
        boolean seguridad[] = new boolean[tamaño];

        for (int i = 0; i < tamaño; i++) {
            int longitudPswrd = 0;
            longitudPswrd = longitudPswrd(longitudPswrd);
            contraseña[i] = new Password(longitudPswrd);
            System.out.println(contraseña[i].toString());

            seguridad[i] = contraseña[i].esFuerte();
            System.out.println(seguridad[i]);
        }


    }
}
