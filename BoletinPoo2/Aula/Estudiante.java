package BoletinPoo2.Aula;

public class Estudiante extends Persona {

    int calificacion;

    public Estudiante() {
        super();
        this.calificacion = numeroRandom(0, 10);
        super.edad = numeroRandom(18, 25);
    }

    @Override
    public void disponible() {
        int probabilidad = numeroRandom(0, 100);

        super.asistencia = probabilidad >= 50; //if else simplificado
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "calificacion=" + calificacion +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
