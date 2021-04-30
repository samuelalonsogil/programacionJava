package Examen_2a_ev;

public class ProductoFresco extends EmpresaAgro{
    String fechaEnvasado;
    String paisOrigen;

    public ProductoFresco(String fechaCad, int numeroLote, String info,String fechaEnvasado, String paisOrigen) {
        super(fechaCad, numeroLote, info);
        this.fechaEnvasado=fechaEnvasado;
        this.paisOrigen=paisOrigen;
        
    }

   

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
}
