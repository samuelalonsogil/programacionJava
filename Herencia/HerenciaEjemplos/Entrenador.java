package HerenciaEjemplos;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Dirijo partido");
    }

    public void dirigirEntreno() {
        System.out.println("Dirijo entreno");
    }

    public void Viajar() {
        System.out.println("Atento a todos");
    }
}
