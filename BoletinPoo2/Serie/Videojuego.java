package BoletinPoo2.Serie;

public class Videojuego implements Entregable{
    String titulo, genero, compañia;
    int horasEstimadas;
    boolean entregado;

    public Videojuego() {}

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        if (this.entregado) {
            return true;
        }
        else {
            return false;
        }
    }

    public Videojuego(String titulo, String genero, String compañia, int horasEstimadas, boolean entregado) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
    }


    public void compareTo(Object a) {
        int horasObjeto1 = this.horasEstimadas;
        int horasObjeto2 = ((Videojuego) a).horasEstimadas;

        if (horasObjeto1 < horasObjeto2) {
            System.out.println(((Videojuego) a).titulo + " tiene mas horas jugables");
        }
        else if (horasObjeto1 > horasObjeto2) {
            System.out.println(this.titulo + " tiene mas horas jugables");
        }
        else if (horasObjeto1 == horasObjeto2) {
            System.out.println("Los dos juegos duran lo mismo");
        }

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }


}
