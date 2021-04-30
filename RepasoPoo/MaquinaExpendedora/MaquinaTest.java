

import java.util.Scanner;

public class MaquinaTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String accion;
        char caracter;

        // crear el constructor
        ModeloSencillo MiMaquina = new ModeloSencillo();

        // setear los precios
        MiMaquina.setPrecios(1.1f, 1.3f, 0.8f);

        // introducimos bebidas
        MiMaquina.DepositoCocaCola.RellenaDeposito();
        MiMaquina.DepositoNaranja.RellenaDeposito();
        MiMaquina.DepositoAgua.RellenaDeposito();

        // MiMaquina.Deposito1Euro.RellenaDeposito();
        // No ha llegado el suministro de agua

        do {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println
            ("Introduzca 'c' para pedir una Coca-Cola\nIntroduzca 'n' para pedir Naranjada\nIntroduzca 'a' para pedir Agua\nIntroduzca 's' para salir");
            System.out.println("--------------------------------------------------------------------------");
            accion = sc.nextLine();
            caracter = accion.charAt(0);
            
            switch (caracter) {
            case 'c':
            System.out.println("--------------------------------------------------------------------------");
                System.out.println("Ha seleccionado Coca cola");
            System.out.println("--------------------------------------------------------------------------");
                
            if (MiMaquina.DepositoCocaCola.HayElemento()) {
                    System.out.println("Hay " + MiMaquina.DepositoCocaCola.getnumeroDeElementos() + " coca-colas");
                    
                if (ControlMaquina.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioCocaCola())) {
                        MiMaquina.DepositoCocaCola.SacaElemento();

                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("No olvide coger su cocacola");
                        System.out.println("Quedan " + MiMaquina.DepositoCocaCola.getnumeroDeElementos() + " Coca-Colas");
                        System.out.println("--------------------------------------------------------------------------");
                        // Sacaracter fisicamente la CocaCola
                    }
                } else
                System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Producto agotado");
                System.out.println("--------------------------------------------------------------------------");
                break;

            case 'n':
            System.out.println("--------------------------------------------------------------------------");
                System.out.println("Ha seleccionado Naranja");
            System.out.println("--------------------------------------------------------------------------");
                
            if (MiMaquina.DepositoNaranja.HayElemento()) {
                    System.out.println("Hay " + MiMaquina.DepositoNaranja.getnumeroDeElementos() + "naranjadas");

                if (ControlMaquina.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioNaranja())) {
                    MiMaquina.DepositoNaranja.SacaElemento();

                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("No olvide coger su naranjada");
                    System.out.println("Quedan " + MiMaquina.DepositoNaranja.getnumeroDeElementos() + " naranjadas");
                    System.out.println("--------------------------------------------------------------------------");
                    // Sacaracter fisicamente la Naranja
                }
                } else
                System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Producto agotado");
                System.out.println("--------------------------------------------------------------------------");
                break;

            case 'a':
            System.out.println("--------------------------------------------------------------------------");
                System.out.println("Ha seleccionado Agua");
            System.out.println("--------------------------------------------------------------------------");
            
            if (MiMaquina.DepositoAgua.HayElemento()) {
                    System.out.println("Hay " + MiMaquina.DepositoAgua.getnumeroDeElementos() + " agua");

                if (ControlMaquina.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioAgua())) {
                    MiMaquina.DepositoAgua.SacaElemento();
                            
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("No olvide coger su agua");
                System.out.println("Quedan " + MiMaquina.DepositoAgua.getnumeroDeElementos() + " botellas de agua");
                System.out.println("--------------------------------------------------------------------------");
                // Sacaracter fisicamente el agua
                    }
                } else
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Producto agotado");
                System.out.println("--------------------------------------------------------------------------");
                break;
                
            default:
                System.out.println("Error de seleccion, intentelo de nuevo");
                break;
            }
        } while (!accion.equals("s") );
    }
}
