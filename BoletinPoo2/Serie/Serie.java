package BoletinPoo2.Serie;



public class Serie implements Entregable{
    String titulo, genero, creador;
    int horasEstimadas;
    int numTemporadas;
    boolean entregado;

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, int numTemporadas, boolean entregado) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numTemporadas = numTemporadas;
        this.entregado = entregado;
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


    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                '}';
    }


}
