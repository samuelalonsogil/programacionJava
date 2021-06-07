package Herencia.Libro;

class Publicacion {
    int numeroDePaginas;
    private float precio;

    //Constructor por defecto (sin parámetros)
    Publicacion() {
        numeroDePaginas = 0;
        precio = 0f;
    }


    Publicacion(int numeroDePaginas) {
        setnumeroDePaginas(numeroDePaginas);
    }

    Publicacion(float precio) {
        setprecio(precio);
    }

    //llama a un constructor dentro dentro constructor se identidica porque solo tiene un parámetro
    Publicacion(int numeroDePaginas, float precio) {
        this(numeroDePaginas);
        setprecio(precio);
    }

    Publicacion(float precio, int numeroDePaginas) {
        this(numeroDePaginas, precio);
    }

    public int getnumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setnumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }

    public void Quemar() {
        System.out.println("Préndeme y ardo");

    }

    @Override
    public String toString() {
        return "Publicacion [numeroDePaginas=" + numeroDePaginas + ", precio=" + precio + "]";
    }

}
