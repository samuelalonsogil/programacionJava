package RepasoPoo.Objeto3D;

public class Objeto3DConConstructor {
    private double X = 0d;
    private double Y = 0d;
    private double Z = 0d;
    private String TipoMedida = "centimetro";

    public void Dimensiones3D(double Ancho, double Alto, double Profundo) {
        X = Ancho;
        Y = Alto;
        Z = Profundo;
    }

    public void TipoMedida(String Medida) {
        TipoMedida = Medida;
    }

    

    Objeto3DConConstructor(double Ancho, double Alto, double Profundo, String Medida) {
        Dimensiones3D(Ancho, Alto, Profundo);
        TipoMedida(Medida);
    }

    Objeto3DConConstructor(String Medida, double Ancho, double Alto, double Profundo) {
        this(Ancho, Alto, Profundo, Medida);
    }

    Objeto3DConConstructor(double Ancho, String Medida, double Alto, double Profundo) {
        this(Ancho, Alto, Profundo, Medida);
    }

    Objeto3DConConstructor(double Ancho, double Alto, String Medida, double Profundo) {
        this(Ancho, Alto, Profundo, Medida);
    }

    Objeto3DConConstructor(String Medida) {
        TipoMedida(Medida);
    }

    Objeto3DConConstructor(double Ancho, double Alto, double Profundo) {
        Dimensiones3D(Ancho, Alto, Profundo);
    }

    //Constructor por defecto porque sí
    Objeto3DConConstructor() {
        
    }

    public double GetAncho() {
        return X;
    }

    public double GetAlto() {
        return Y;
    }

    public double GetProfundo() {
        return Z;
    }

    public String GetMedida() {
        return TipoMedida;
    }

    @Override
    public String toString() {
        return "Objeto3DConConstructor [TipoMedida=" + TipoMedida + ", X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
    }
}
