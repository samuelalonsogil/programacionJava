package BoletinPoo2.Electrodomesticos;

public class Lavadora extends Electrodomestico {

    double carga;

    //constructor por defecto
    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        if (this.carga > 30) this.precioBase += 50;
        return this.precioBase;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", carga=" + carga +
                '}';
    }
}
