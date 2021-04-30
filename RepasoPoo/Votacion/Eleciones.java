package Votacion;

import java.util.Scanner;

public class Eleciones {

    static Votacion Juan = new Votacion("Juan");
    static Votacion Ana = new Votacion("Ana");
    static Votacion Adela = new Votacion("Adela");

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = "";

        System.out.println("Introduce el nombre del candidato (escribe 'salir' para finalizar):");
        while (!nombre.equals("salir")) {
            nombre = sc.nextLine();
            switch (nombre) {
            case "Ana":
                Ana.Voto();
                break;
            case "Juan":
                Juan.Voto();
                break;
            case "Adela":
                Adela.Voto();
                break;
            case "salir":
                System.out.println("Victoria para " + Votacion.getNombreDelMasVotado() + "con un total de " + Votacion.getvotosDelMasVotado() + " votos");
                break;

            default:
                System.out.println("Opción no válida");
                break;
            }

        }
    }
}
