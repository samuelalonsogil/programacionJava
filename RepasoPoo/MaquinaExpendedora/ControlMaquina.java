

import java.util.Scanner;

public class ControlMaquina {
    
    // ***************************************************
    // * Recoge monedas en 'Maquina' para cobrar 'Precio'.
    // * Devuelve 'true'
    // * si el pago se ha realizado con exito y 'false' en
    // * caso contrario
    // ****************************************************

    static Scanner sc = new Scanner(System.in);

    
    
    
    public static boolean IntroduccionMonedas(ModeloSencillo Maquina, float Precio) {

        char accion;

        boolean anulado = false;
        float acumulado = 0;
        

        do {
            // un euro, diez cents, anular

            System.out.println(
                    "Introduzca 'u' para añadir 1€\nIntroduzca 'd' para añadir 10 cents \nIntroduzca 'a' para Anular");

            accion = sc.nextLine().charAt(0);

            switch (accion) {
            case 'u':
                if (Maquina.Deposito1Euro.HayHueco()) {

                    Maquina.Deposito1Euro.MeteElemento();
                    acumulado = acumulado + 1f;
                    
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Has introducido " + Maquina.Deposito1Euro.getnumeroDeElementos() + "€ y "
                            + Maquina.Deposito10Cents.getnumeroDeElementos()*10 + " cents");
                    System.out.println("--------------------------------------------------------------------------");
                } else
                        System.out.println("--------------------------------------------------------------------------");
                            System.out.println("Temporalmente esta  maquina no acepta monedas de un euro");
                        System.out.println("--------------------------------------------------------------------------");
                        break;

            case 'd':
                if (Maquina.Deposito10Cents.HayHueco()) {
                    Maquina.Deposito10Cents.MeteElemento();
                    acumulado = acumulado + 0.1f;
                    
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Has introducido " + Maquina.Deposito1Euro.getnumeroDeElementos() + "€ y "
                            + Maquina.Deposito10Cents.getnumeroDeElementos()*10 + " cents");
                    System.out.println("--------------------------------------------------------------------------");
                } else
                        System.out.println("--------------------------------------------------------------------------");
                            System.out.println("Temporalmente esta  maquina no acepta monedas de 0.1 euros");
                        System.out.println("--------------------------------------------------------------------------");
                        break;

            case 'a':
                    System.out.println("--------------------------------------------------------------------------");    
                    System.out.println("Operación anulada");
                    System.out.println("--------------------------------------------------------------------------");
                    anulado = true;
                    break;
            }// fin switch u,d,a

            
        } while (acumulado < Precio || !anulado); // fin while

        if (anulado)
            Devolver(Maquina, acumulado);
        else if (CambioDisponible(Maquina, acumulado - Precio)) {
            Devolver(Maquina, acumulado - Precio);
        } else {
            System.out.println("La maquina no dispone del cambio necesario");
            Devolver(Maquina, acumulado);
            anulado = true;
        }
        return (!anulado);
    }

    // **************************************************
    // * Devuelve la cantidad de dinero indicada,
    // * actualizando los almacenes de monedas
    // **************************************************
    private static void Devolver(ModeloSencillo Maquina, float cantidad) {
        // revisar y cambiar por llamada al metodo

        int monedasEuro, monedasCents;
        
        cantidad = cantidad + 0.01f; // Evita problemas de falta de precision
        
        monedasEuro = (int) cantidad;

        cantidad = cantidad - (float) monedasEuro;
        
        monedasCents = (int) Math.floor((double) cantidad * 10f);

        for (int i = 1; i <= monedasEuro; i++) {
            Maquina.Deposito1Euro.SacaElemento();
            // Sacaracter 1 moneda de un euro
        }

        for (int i = 1; i <= monedasCents; i++) {
            Maquina.Deposito10Cents.SacaElemento();
            // Sacaracter 1 moneda de 0.1 euro
        }
        
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(    "Recoja el importe: " + monedasEuro + "€\n"+ monedasCents*10 + " cents");
            System.out.println("--------------------------------------------------------------------------");
    }


    // ******************************************************
    // * Indica si es posible devolver 'cantidad' euros en
    // * 'Maquina'
    // ******************************************************
    private static boolean CambioDisponible(ModeloSencillo Maquina, float cantidad) {

        int monedasEuro, monedasCents;

        cantidad = cantidad + 0.01f; // Evita problemas de falta de precision

        monedasEuro = (int) cantidad;

        cantidad = cantidad - (float) monedasEuro;
        
        monedasCents = (int) Math.floor((double) cantidad * 10f);
        
        return ((Maquina.Deposito1Euro.getnumeroDeElementos() >= monedasEuro)
                && (Maquina.Deposito10Cents.getnumeroDeElementos() >= monedasCents));
    }

    

    
}
