package BoletinPoo2.Electrodomesticos;

import java.util.ArrayList;

public class ElectrodomesticoTest {

    static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(6);


    public static void main(String[] args) {
        Electrodomestico L1 = new Lavadora(100, 80, "blanco", 'B', 50);
        Electrodomestico L2 = new Lavadora(200, 70, "rojo", 'A', 30);
        Electrodomestico L3 = new Lavadora(400, 100, "gris", 'D', 70);

        Electrodomestico T3 = new Television(500, 20, "gris", 'D', 30, true);
        Electrodomestico T4 = new Television(300, 10, "negro", 'B', 21, true);
        Electrodomestico T5 = new Television(200, 10, "blanco", 'A', 27, false);

        electrodomesticos.add(L1);
        electrodomesticos.add(L2);
        electrodomesticos.add(L3);

        electrodomesticos.add(T3);
        electrodomesticos.add(T4);
        electrodomesticos.add(T5);

        int suma=0;
        double sumaTv=0;
        double sumaLavadora=0;
        for (Electrodomestico electrodomestico : electrodomesticos) {

            electrodomestico.precioFinal();
            suma += electrodomestico.precioFinal();

            System.out.println(electrodomestico);

            if (electrodomestico instanceof Lavadora ){
                sumaLavadora+=electrodomestico.precioFinal();
            }else if(electrodomestico instanceof Television){
                sumaTv+= electrodomestico.precioFinal();
            }
        }



        System.out.println("Suma del precio de todos los productos: " + suma);
        System.out.println("Suma del precio de todos los Televisores: " + sumaTv);
        System.out.println("Suma del precio de todas las lavadoras: " + sumaLavadora);
    }
}
