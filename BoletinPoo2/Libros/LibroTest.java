package BoletinPoo2.Libros;

public class LibroTest {


    public static void main(String[] args) {

        Libro DiarioDeGreg = new Libro("1234566789M", "Diario de Greg 6", "Greg", 200);
        Libro ElHobbit = new Libro("000066789M", "El Hobbit", "Tolkien", 400);

        System.out.println(DiarioDeGreg.toString());
        System.out.println("----------------------");
        System.out.println(ElHobbit.toString());

        if (DiarioDeGreg.numPaginas > ElHobbit.numPaginas) {
            System.out.println("Diario de greg tiene más páginas");
        } else if (DiarioDeGreg.numPaginas == ElHobbit.numPaginas) {
            System.out.println("Ambos tienen las mismas páginas");
        } else if (DiarioDeGreg.numPaginas < ElHobbit.numPaginas) {
            System.out.println("El Hobbit tiene más páginas");

        }


    }
}
