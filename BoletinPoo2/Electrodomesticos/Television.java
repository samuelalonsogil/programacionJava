package BoletinPoo2.Electrodomesticos;

public class Television extends Electrodomestico {
    double pulgadas;
    boolean TDT;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, double pulgadas, boolean TDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        if (this.pulgadas > 40) this.precioBase += (this.precioBase * 0.3);
        if (this.TDT = true) this.precioBase += 50;
        return this.precioBase;
    }

    @Override
    public String toString() {
        return "Television{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", pulgadas=" + pulgadas +
                ", TDT=" + TDT +
                '}';
    }
}
