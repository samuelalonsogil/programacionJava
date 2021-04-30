package RepasoPoo.Vehiculos;

import java.awt.Color;

public class Camion extends Vehiculo {

    private byte numeroDeEjes;

    Camion(byte NumeroDeRuedas) {
        super(NumeroDeRuedas);
    }

    Camion(Color color, byte NumeroDeRuedas) {
        super(color, NumeroDeRuedas);
    }

    Camion(Color color, byte NumeroDeRuedas, short Cilindrada) {
        super(color, NumeroDeRuedas, Cilindrada);
    }

    Camion(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
        super(color, NumeroDeRuedas, Cilindrada, Potencia);

    }

    Camion(Color color, byte NumeroDeRuedas, byte numeroDeEjes, short Cilindrada, short Potencia) {
        super(color, NumeroDeRuedas, Cilindrada, Potencia);
        setnumeroDeEjes(numeroDeEjes);
    }

    public byte getnumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setnumeroDeEjes(byte numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    public void movimiento(){
        System.out.println("Soy un camión y me muevo");
    }

    public void soyConducido(){
        System.out.println("Soy un camión y tengo un camionero");
    }

    @Override
    public String toString() {
        return "Camion [numeroDeEjes=" + numeroDeEjes + super.toString() +  "]";
    }

    

    

}
