package Herencia.Abstraccion;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public void dirigirPartido() {
        System.out.println("Dirijo partido");
    }

    public void dirigirEntreno() {
        System.out.println("Dirijo entreno");
    }

    public void Viajar() {
        System.out.println("Atento a todos");
    }
}
