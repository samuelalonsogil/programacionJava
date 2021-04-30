package RepasoPoo.Almacen;

public class AlmacenNeg {
    private byte Capacidad;
    private byte Contenedores;

    //constructor de una capacidad y vacío
    AlmacenNeg(byte Capacidad) {
        this.Capacidad = Capacidad;
        Contenedores = 0;
        
    }

    public byte getNumeroDeHuecos() {
        return (byte)(Capacidad-Contenedores);
    }

    public byte getCapacidad() {
        return (Capacidad);
    }

    public boolean HayHueco() {
        return (Contenedores != Capacidad);
    }

    public boolean HayContenedor() {
        return (Contenedores != 0);
    }

    public void MeteContenedor() {
        Contenedores++;
        System.out.println(this.toString());
    }

    public void SacaContenedor() {
        Contenedores--;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "LogisticaAlmacen [Capacidad=" + Capacidad + ", NumeroDeContenedores=" + Contenedores + "]";
    }
}
