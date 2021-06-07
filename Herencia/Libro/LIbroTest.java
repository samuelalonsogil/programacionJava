package Herencia.Libro;

public class LIbroTest {

    public static void main(String[] args) {
        Libro MiLibro = new Libro();
        MiLibro.NombreAutor = "Frederick Forsyth";
        MiLibro.Titulo = "El manifiesto negro";
        MiLibro.Editorial = "Circulo de lectores";
        MiLibro.TipoPortada = "Dura";
        MiLibro.numeroDePaginas = 575;

        MiLibro.Quemar();
        MiLibro.Cortar();

        
    }
}
