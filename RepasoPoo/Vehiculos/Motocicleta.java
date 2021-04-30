package RepasoPoo.Vehiculos;

import java.awt.Color;

public class Motocicleta extends Vehiculo {

    private byte numeroDePlazas;

    Motocicleta() {
        super((byte) 2);
    }

    Motocicleta(byte numeroDePlazas) {
        super((byte) 2);
        setNumeroDePlazas(numeroDePlazas);
    }

    Motocicleta(Color color) {
        super(color, (byte) 2);
    }

    Motocicleta(Color color, short Cilindrada) {
        super(color, (byte) 2, Cilindrada);
    }

    Motocicleta(Color color, short Cilindrada, short Potencia) {
        super(color, (byte) 2, Cilindrada, Potencia);
    }

    public byte getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    public void movimiento(){
        System.out.println("Soy una moto y hago brrruuum");
    }

    public void soyConducido(){
        System.out.println("Soy una moto y tengo un motorista");
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta [numeroDePlazas=" + numeroDePlazas +  "]";
    }

    

}

