package BoletinPoo2.Aula;

public class Profesor extends Persona {
    String materiaImpartida;
   static String[] materias = {"matematicas", "filosofia", "fisica"};

    Profesor() {
        super();
        this.materiaImpartida = materias[numeroRandom(0, 2)];
        super.edad = numeroRandom(30, 67);
    }

    @Override
    public void disponible() {
        int probabilidad = numeroRandom(0, 100);
        super.asistencia = probabilidad >= 80; //if else simplificado
    }

}
