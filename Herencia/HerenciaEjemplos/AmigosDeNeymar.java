package Herencia.HerenciaEjemplos;

import Herencia.HerenciaEjemplos.SeleccionFutbol;

public class AmigosDeNeymar extends SeleccionFutbol {
    private String idAmigosDeNeymar;

    public AmigosDeNeymar(int id, String nombre, String apellidos, int edad, String idAmigosDeNeymar) {
        super(id, nombre, apellidos, edad);
        this.idAmigosDeNeymar = idAmigosDeNeymar;
    }

    public String getIdAmigosDeNeymar() {
        return idAmigosDeNeymar;
    }

    public void setIdAmigosDeNeymar(String idAmigosDeNeymar) {
        this.idAmigosDeNeymar = idAmigosDeNeymar;
    }

    public void Viajar() {
        System.out.println("borrachos perdidos");
    }

    public void animarAlPersonal() {
        System.out.println("samba do brazil");
    }
}
