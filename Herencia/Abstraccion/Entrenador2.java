package Herencia.Abstraccion;

public class Entrenador2 extends SeleccionFutbol2 {

    private String idFederacion;

    // constructor, getter y setter


    public Entrenador2(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un Entrenamiento");
    }
}
