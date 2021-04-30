package Libro;

public class PublicacionTest {
   static Libro DiarioDeGreg = new Libro();
   static Periodico Marca = new Periodico();
    
    public static void main(String[] args) {
        DiarioDeGreg.Quemar();
        System.out.println("-----------------");
        DiarioDeGreg.Cortar();
        System.out.println("-----------------");
        Marca.Quemar();
        System.out.println("-----------------");
        Marca.Limpiar();
    }
    
}
