package Examen_2a_ev;

public class ProductoRefrigerado extends EmpresaAgro {
   
    int codOrg;

    public ProductoRefrigerado(String fechaCad, int numLote, String info,int codOrg) {
        super(fechaCad, numLote, info);
        this.codOrg=codOrg;
    }

    public int getCodOrg() {
        return codOrg;
    }

    public void setCodOrg(int codOrg) {
        this.codOrg = codOrg;
    }

    

   
    
}
