package Herencia.Abstraccion;

public abstract class SeleccionFutbol {

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;



    public void setEdad(int edad) {
        Edad = edad;
    }

    public void Concentrarse() {
    System.out.println("Me concentro");
    }

    public void Viajar() {
        System.out.println("Viajo");
    }
}
