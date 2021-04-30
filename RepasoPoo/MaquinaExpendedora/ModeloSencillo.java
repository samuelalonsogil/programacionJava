

public class ModeloSencillo {
    public Deposito Deposito1Euro = new Deposito((short) 8);
    public Deposito Deposito10Cents = new Deposito((short) 15);

    public Deposito DepositoCocaCola = new Deposito((short) 10);
    public Deposito DepositoNaranja = new Deposito((short) 5);
    public Deposito DepositoAgua = new Deposito((short) 8);

    private float PrecioCocaCola = 1.0f;
    private float PrecioNaranja = 1.3f;
    private float PrecioAgua = 0.6f; // precio recomendado

    public void setPrecios(float PrecioCocaCola, float PrecioNaranja, float PrecioAgua) {
        this.PrecioCocaCola = PrecioCocaCola;
        this.PrecioNaranja = PrecioNaranja;
        this.PrecioAgua = PrecioAgua;
    }

    public float getPrecioCocaCola() {
        return PrecioCocaCola;
    }

    public float getPrecioNaranja() {
        return PrecioNaranja;

    }

    public float getPrecioAgua() {
        return PrecioAgua;
    }

    public void MostrarEstadoMaquina() {
        System.out.print("CocaColas: " + DepositoCocaCola.getnumeroDeElementos() + " ");
        System.out.print("Naranjas: " + DepositoNaranja.getnumeroDeElementos() + " ");
        System.out.println("Agua: " + DepositoAgua.getnumeroDeElementos() + " ");

        System.out.print("1 Euro: " + Deposito1Euro.getnumeroDeElementos() + " ");
        System.out.println("0.1 Euro: " + Deposito10Cents.getnumeroDeElementos() + " ");

    }

}
