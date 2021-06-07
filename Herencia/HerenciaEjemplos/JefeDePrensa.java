package Herencia.HerenciaEjemplos;

import Herencia.HerenciaEjemplos.SeleccionFutbol;

public class JefeDePrensa extends SeleccionFutbol {
    private String idPrensa;

    public JefeDePrensa(int id, String nombre, String apellidos, int edad, String idPrensa) {
        super(id, nombre, apellidos, edad);
        this.idPrensa = idPrensa;
    }

    public String getIdPrensa() {
        return idPrensa;
    }

    public void setIdPrensa(String idPrensa) {
        this.idPrensa = idPrensa;
    }

    public void Viajar() {
        System.out.println("Sobado perdido");
    }

    public void Informar() {
        System.out.println("Informo a la prensa");
    }
}
