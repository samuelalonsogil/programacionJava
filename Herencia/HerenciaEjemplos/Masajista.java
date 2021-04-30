package HerenciaEjemplos;

public class Masajista extends SeleccionFutbol {
    private String Titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        Titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }


    public void darMasaje() {
        System.out.println("Te dejo fino");
    }

    public void Viajar(){
        System.out.println("Puestísimo");
    }
}
