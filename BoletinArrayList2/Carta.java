package BoletinArrayList2;

import java.util.Objects;

public class Carta implements Comparable<Carta>{

    private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] p = {"bastos", "copas", "espadas", "oros"};

    private Integer numero;
    private String palo;


    //generar de carta
    public Carta() {
        this.numero = (int)(Math.random()*10);
        this.palo = p[(int)(Math.random()*4)];
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return n[numero] + " de " + palo;
    }

    @Override
    public boolean equals(Object obj) {
        //si no pasa objeto
        if (obj == null) {
            return false;
        }

        //si el objeto no es una carta
        if (getClass() != obj.getClass()) {
            return false;
        }

        //pasa una carta
        final Carta other = (Carta) obj;

        //usamos la libreria objects para tirar del metodo equals
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }

    //ordenar
    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
}
