package BoletinArrayList2;
import java.util.ArrayList;

public class monedaTest {
    static ArrayList<moneda> monedas = new ArrayList<moneda>();

    public static void main(String[] args) {

        //generamos la primera y se la añadimos al array
        moneda coin = new moneda();
        monedas.add(coin);

        //obtenemos las caracteristicas de la moneda añadida
        String ultimaPosicion = coin.getPosicion();
        String ultimaCantidad = coin.getCantidad();

        //generas las demás monedas
        for (int i = 0; i<5;i++){

            //aceptar una moneda valida para la secuencia
            do {
                coin = new moneda();
                //tomas falsas
            }while(!((coin.getPosicion()).equals(ultimaPosicion)) && !((coin.getCantidad()).equals(ultimaCantidad)));

            //añade
            monedas.add(coin);

            //guarda las caracteristicas de la recien añadida
            ultimaPosicion = coin.getPosicion();
            ultimaCantidad = coin.getCantidad();
        }

        for (moneda mo:monedas ) {
            System.out.println(mo);
        }




    }
}
