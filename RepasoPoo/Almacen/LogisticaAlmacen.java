package RepasoPoo.Almacen;

public class LogisticaAlmacen {
    private byte Capacidad;
    private byte NumeroDeHuecos;

    //constructor de una capacidad y vacío
    LogisticaAlmacen(byte Capacidad) {
        this.Capacidad = Capacidad;
        NumeroDeHuecos = Capacidad;
    }

    public byte getNumeroDeHuecos() {
        return (NumeroDeHuecos);
    }

    public byte getCapacidad() {
        return (Capacidad);
    }

    public boolean HayHueco() {
        return (NumeroDeHuecos != 0);
    }

    public boolean HayContenedor() {
        return (NumeroDeHuecos != Capacidad);
    }

    public void MeteContenedor() {
        NumeroDeHuecos--;
        System.out.println(this.toString());
    }

    public void SacaContenedor() {
        NumeroDeHuecos++;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "LogisticaAlmacen [Capacidad=" + Capacidad + ", NumeroDeHuecos=" + NumeroDeHuecos + "]";
    }
    

}
