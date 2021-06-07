package Fichero.FicherosDos;

import java.io.Serializable;

public class Amigo implements Serializable {
    protected String nombre;
    protected long tlf;

    public Amigo(String nombre, long tlf){
        this.nombre = nombre;
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Amigo{" + "nombre='" + nombre + '\'' + ", tlf=" + tlf +'}';
    }
}
