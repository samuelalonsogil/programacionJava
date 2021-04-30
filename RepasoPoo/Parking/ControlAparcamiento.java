package RepasoPoo.Parking;

import RepasoPoo.Parking.Parking;
import RepasoPoo.Parking.Puerta;

import java.util.Scanner;

public class ControlAparcamiento {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char porta, operacion;
        Puerta PuertaUtilizada = null;

        Parking berbes = new Parking((short) 5);
        Puerta Puerta1 = new Puerta(berbes);
        Puerta Puerta2 = new Puerta(berbes);

        do {
            porta = IntroduceCaracter("Puerta de acceso: (1, 2): ");
            switch (porta) {
            case '1':
                PuertaUtilizada = Puerta1;
                break;
            case '2':
                PuertaUtilizada = Puerta2;
                break;
            default:
                System.out.println("Puerta seleccionada no valida");
                break;
            }

            operacion = IntroduceCaracter("Entrar/Salir vehiculo (e, s): ");
            switch (operacion) {
            case 'e':
                PuertaUtilizada.EntraVehiculo();
                break;
            case 's':

                break;
            default:
                System.out.println("Operacion seleccionada no valida");
                break;
            }

        } while (true);

    } // main

    static public char IntroduceCaracter(String Mensaje) {
        String Entrada;

        System.out.print(Mensaje);
        Entrada = sc.nextLine();
        System.out.println();
        Entrada = Entrada.toLowerCase();
        return Entrada.charAt(0);
    }

}
