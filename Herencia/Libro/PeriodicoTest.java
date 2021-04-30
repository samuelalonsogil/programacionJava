package Libro;

public class PeriodicoTest {
    public static void main(String[] args) {
        Periodico MiPeriodico = new Periodico();
        MiPeriodico.setnombre("Faro de Vigo");
        MiPeriodico.setnumeroDePaginas(65);
        MiPeriodico.setprecio(0.9f);
        MiPeriodico.setfecha("22/02/2003");
        System.out.println(MiPeriodico.getnumeroDePaginas());
        System.out.println(MiPeriodico.toString());

        MiPeriodico.Quemar();
        MiPeriodico.Limpiar();
    }
}
