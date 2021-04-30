package BoletinPoo2.Aula;

public class Aula {

    int id;
    Profesor profesores;
    Estudiante[] estudiantes;
    String materia;

    final int MAX_ALUMNOS = 30;

    public Aula() {
    }

    public Aula(int id, Profesor profesores, Estudiante[] estudiantes, String materia) {
        this.id = id;
        this.profesores = new Profesor();
        this.estudiantes = new Estudiante[MAX_ALUMNOS];
        this.materia = Profesor.materias[Persona.numeroRandom(0, 2)];
    }

    void crearEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
        }
    }

    boolean asistenciaEstudiantes() {
        int numAsistentes = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.asiste()) numAsistentes++;
        }
        System.out.println("Hay " + numAsistentes + "estudiantes");
        return numAsistentes >= (int) estudiantes.length / 2;
    }

    boolean darClase() {
        if (!profesores.asiste()) {
            System.out.println("El profesor no está, no puede dar clase");
            return false;
        } else if (!profesores.materiaImpartida.equals(materia)) {
            System.out.println("La materia del profesor no coincide con la del aula");
            return false;
        } else if (!asistenciaEstudiantes()) {
            System.out.println("No hay suficientes estudiantes");
            return false;
        } else {
            System.out.println("Se puede dar clase");
            return true;
        }
    }

    void notas(){
        int hombresAprobados=0;
        int mujeresAprobados=0;

        for (Estudiante estudiante:estudiantes) {
            if (estudiante.calificacion >= 5){
                if (estudiante.sexo == 'H') hombresAprobados++;
                else mujeresAprobados++;
            }System.out.println(estudiantes.toString());
        }
        System.out.println("Hay " + hombresAprobados + " chicos aprobados y " +mujeresAprobados + "mujeres aprobadas" );
    }
}
