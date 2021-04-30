package RepasoPoo.Vehiculos;

import java.awt.Color;

public class Vehiculo {
    private Color ColorVehiculo;
    private byte numRuedas;
    private short cilindrada;
    private short potencia;

    Vehiculo(Color Color) {
        setColor(Color);
    }

    Vehiculo(byte numRuedas) {
        this.numRuedas = numRuedas;
    }

    Vehiculo(short cilindrada) {
        this.cilindrada = cilindrada;
    }

    Vehiculo(Color Color, byte numRuedas) {
        this(Color);
        this.numRuedas = numRuedas;
    }

    Vehiculo(Color Color, byte numRuedas, short cilindrada) {
        this(Color, numRuedas);
        this.cilindrada = cilindrada;
    }

    Vehiculo(Color Color, byte numRuedas, short cilindrada, short potencia) {
        this(Color, numRuedas, cilindrada);
        this.potencia = potencia;
    }

    public void setColor(Color Color) {
        ColorVehiculo = Color;
    }

    public Color getColor() {
        return ColorVehiculo;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }

    public short getCilindrada() {
        return cilindrada;
    }

    public short getPotencia() {
        return potencia;
    }

    public void movimiento(){
        System.out.println("Soy un vehículo y me muevo");
    }

    public void soyConducido(){
        System.out.println("Soy un vehículo y tengo un conductor");
    }

    @Override
    public String toString() {
        return "Vehiculo [cilindrada=" + cilindrada + ", ColorVehiculo=" + ColorVehiculo + ", numRuedas=" + numRuedas
                + ", potencia=" + potencia + "]";
    }

    
}
