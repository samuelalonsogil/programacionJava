package BoletinPoo2.Electrodomesticos;

public class Electrodomestico {
    double precioBase, peso;
    String color; //String[] color = {"blanco", "negro", "rojo", "azul", "gris"};
    char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoElectrico(consumoEnergetico);
    }

    public char comprobarConsumoElectrico(char letra) {
        char[] nivelCalidad = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < nivelCalidad.length; i++) {
            if (letra == nivelCalidad[i]) this.consumoEnergetico = letra;
            else this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }

    public String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

        for (int i = 0; i < colores.length; i++) {
            if (color.equals(colores[i]) || color.equals(colores[i].toUpperCase())) this.color = color;
            else this.color = "blanco";
        }
        return this.color;
    }

    public double precioFinal() {

       if (this.consumoEnergetico == 'A') this.precioBase+=100;
        else if (this.consumoEnergetico == 'B') this.precioBase+=80;
        else if (this.consumoEnergetico == 'C') this.precioBase+=60;
        else if (this.consumoEnergetico == 'D') this.precioBase+=50;
        else if (this.consumoEnergetico == 'E') this.precioBase+=30;
        else if (this.consumoEnergetico == 'F') this.precioBase+=10;

        if (this.peso==0 && this.peso <= 19) this.precioBase+=10;
        if (this.peso>=20 && this.peso <= 49) this.precioBase+=50;
        if (this.peso>=50 && this.peso <= 79) this.precioBase+=80;
        if (this.peso >= 80) this.precioBase+=100;

        return this.precioBase;
        }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}



