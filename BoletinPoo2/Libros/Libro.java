package BoletinPoo2.Libros;

public class Libro {
    String ISBN, titulo, autor;
    int numPaginas;

    public Libro() {}

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{"+ "El libro " + this.titulo + " con ISBN " + this.ISBN + " creado por el autor " + this.autor
        + " tiene " + numPaginas + " páginas " +'}';
    }
}
