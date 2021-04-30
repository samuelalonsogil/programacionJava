package Examen_2a_ev;

public class ProductoCongelado extends EmpresaAgro{
    int temperatura;
    public ProductoCongelado(String fechaCad, int numeroLote, String info,int temperatura) {
        super(fechaCad, numeroLote, info);
        this.temperatura=temperatura;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    

    
    
}
