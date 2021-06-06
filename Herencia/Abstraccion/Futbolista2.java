package Herencia.Abstraccion;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;


    public void jugarPartido() {
    System.out.println("Juego un partido");
    }

    public void entrenar() {
        System.out.println("Entreno como un lobo");
    }

    public void Viajar(){
        System.out.println("Con cascos y a dormir");
    }
}

