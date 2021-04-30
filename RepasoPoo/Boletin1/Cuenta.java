package RepasoPoo.Boletin1;

import java.util.Scanner;

public class Cuenta {

    /*1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
    El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
    Crea sus métodos get, set y toString.
    Tendrá dos métodos especiales:
	ingresar(double cantidad): se ingresa una cantidad a la cuenta,
    si la cantidad introducida es negativa, no se hará nada.
	retirar(double cantidad): se retira una cantidad a la cuenta,
    si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/

    static Scanner sc = new Scanner(System.in);

    private String titular;
    private double cantidad;


    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad ;
    }

    public double Ingreso(double ingreso) {
        System.out.print("Introduce la cantidad: ");
        ingreso = sc.nextDouble();
        if (ingreso < 0) {
            System.out.println("Operación incorrecta");
        } else ingreso = cantidad + ingreso;

        return ingreso;
    }

    public double Retiro(double retiro) {
        System.out.print("Introduce la cantidad: ");
        retiro = sc.nextDouble();
        return cantidad - retiro;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
