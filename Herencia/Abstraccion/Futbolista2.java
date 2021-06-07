package Herencia.Abstraccion;

public class Futbolista2 extends SeleccionFutbol2 {

    private int dorsal;
    private String demarcacion;

    // constructor, getter y setter


    public Futbolista2(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega un Partido (Clase Futbolista)");
    }

    public void entrevista() {
        System.out.println("Da una Entrevista");
    }
}

