package Herencia.Abstraccion;

public class Masajista2 extends SeleccionFutbol2 {

    private String titulacion;
    private int aniosExperiencia;

    // constructor, getter y setter

    public Masajista2(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    public void darMasaje() {
        System.out.println("Da un Masaje");
    }
}
