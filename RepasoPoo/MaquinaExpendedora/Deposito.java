

public class Deposito {
    private short capacidad;
    private short numeroDeElementos = 0;

    public Deposito(short capacidad) {
        this.capacidad = capacidad;
    }

    

    public short getnumeroDeElementos() {
        return (numeroDeElementos);
    }

    public short getcapacidad() {
        return (capacidad);
    }

    public boolean HayElemento() {
        return (numeroDeElementos != 0);
    }

    public boolean HayHueco() {
        return (numeroDeElementos != capacidad);
    }

    public void MeteElemento() {
        numeroDeElementos++;
    }

    public void SacaElemento() {
        numeroDeElementos--;
    }

    public void RellenaDeposito() {
        numeroDeElementos = capacidad;
    }



   

    
}
