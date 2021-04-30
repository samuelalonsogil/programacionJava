package BoletinPoo2.Aula;

public abstract class Persona {
    String nombre;
    char sexo;
    int edad;
    boolean asistencia;

    final String[] NOMBRES_CHICOS = {"Samuel", "Nicolas", "Carlos", "Ilian"};
    final String[] NOMBRES_CHICAS = {"Antia", "Paula", "Isa", "Maria"};

    final int CHICO =0;
    final int CHICA =1;

    public static int numeroRandom(int min, int max){
        return (int) Math.floor (Math.random() * (min - (max + 1)) +(max + 1));
    }

    public Persona() {
        int determinarSexo = numeroRandom(0,1);

        if (determinarSexo==CHICO) {
            this.sexo = 'H';
            this.nombre = NOMBRES_CHICOS[numeroRandom(0,3)];
        }else{
            this.sexo= 'M';
            this.nombre = NOMBRES_CHICAS[numeroRandom(0,3)];
        }

        disponible();
    }

    public boolean asiste() {
        return asistencia;
    }

    public abstract void disponible();


}
