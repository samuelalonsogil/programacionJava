package Herencia.Libro;

public class Libro extends Publicacion {
    public String Titulo;
    public String TipoPortada;
    public String ISBN;
    public String NombreAutor;
    public String Editorial;

    public Libro() {
        super();
    }

    public Libro(int NumeroDePagainas, float Precio) {
        super(NumeroDePagainas, Precio);
    }

    public Libro(int numeroDePaginas, float precio, String titulo, String tipoPortada, String iSBN, String nombreAutor,
            String editorial) {
        this(titulo, tipoPortada, iSBN, nombreAutor, editorial);
        this.setnumeroDePaginas(numeroDePaginas);
        this.setprecio(precio);
    }

    public Libro(String titulo, String tipoPortada, String iSBN, String nombreAutor, String editorial) {
        super();
        Titulo = titulo;
        TipoPortada = tipoPortada;
        ISBN = iSBN;
        NombreAutor = nombreAutor;
        Editorial = editorial;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getTipoPortada() {
        return TipoPortada;
    }

    public void setTipoPortada(String tipoPortada) {
        TipoPortada = tipoPortada;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        NombreAutor = nombreAutor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public void Cortar() {
        System.out.println("Te corto al pasar lapágina");
    }

    @Override
    public String toString() {
        return "Libro [Editorial=" + Editorial + ", ISBN=" + ISBN + ", NombreAutor=" + NombreAutor + ", TipoPortada="
                + TipoPortada + ", Titulo=" + Titulo + "]";
    }

    public void Quemar() {
        super.Quemar();
        System.out.println("Estoy quemando un libro");
    }

}
