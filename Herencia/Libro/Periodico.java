package Herencia.Libro;

class Periodico extends Publicacion {
    private String nombre;
    private String fecha;

    //lamada a publicación (padre)
    Periodico() {
        super();
        nombre = null;
        fecha = null;
    }

    Periodico(String nombre, String fecha) {
        super();
        this.nombre = nombre;
        this.fecha = fecha;
    }

    Periodico(int numeroDePaginas, float precio) {
        super(numeroDePaginas, precio);
        this.nombre = null;
        this.fecha = null;
    }

    Periodico(String nombre, String fecha, int numeroDePaginas, float precio) {
        super(numeroDePaginas, precio);
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public void Limpiar() {
        System.out.println("Usame para limpiar algunas superficies");
    }

    @Override
    public void Quemar() {
        super.Quemar();
        System.out.println("Soy un periódico y ardo");
    }

    @Override
    public String toString() {
        return "Periodico [fecha: " + fecha + ", nombre: " + nombre + ", Número de páginas: " + getnumeroDePaginas() + "]";
    }

    

}
