package BoletinArrayList2;

public class moneda {
    private static String posiciones[] = {"cara","cruz"};
    private static String cantidades[] = {"1 cent","2 cent","5 cent","10 cent","20 cent","50 cent","1 €","2 €"};
    private String cantidad;
    private String posicion;



    public moneda() {
        this.posicion = posiciones[(int)(Math.random()*2)];
        this.cantidad = cantidades[(int)(Math.random()*8)];
        }

    public String getCantidad() {
        return this.cantidad;
    }

    public String getPosicion() {
        return this.posicion;
    }

    @Override
    public String toString() {
         return this.cantidad + " - " + this.posicion;
    }
}
