package RepasoPoo.Vehiculos;

import java.awt.Color;

public class VehiculosTest {


    public static void main(String[] args) {
        Vehiculo CarriCoche = new Vehiculo(Color.BLACK, (byte) 3, (short) 5, (short) 10);
        System.out.println(CarriCoche.toString());

        CarriCoche.movimiento();
        CarriCoche.soyConducido();

        Camion Truck = new Camion(Color.red, (byte) 8, (short) 4, (short) 1000);
        System.out.println(Truck.toString());

        Truck.movimiento();
        Truck.soyConducido();

        Motocicleta Chopper = new Motocicleta(Color.yellow, (short) 1000, (short) 2000);

        System.out.println(Chopper.toString());

        Chopper.movimiento();
        Chopper.soyConducido();



    }


}
