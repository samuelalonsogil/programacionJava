package BoletinPoo2.Serie;

public class AudioVisual {

    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] juegos = new Videojuego[5];

        for (int i = 0; i < 5; i++) {
            series[i] = new Serie();
            juegos[i] = new Videojuego();
        }

        series[1] = new Serie("Breaking Bad", "Vince Gilligan");
        series[2] = new Serie("Dragon Ball", "Akira Toriyama");
        series[3] = new Serie("Mindhunter", "Netlix");

        juegos[0] = new Videojuego("Sekiro", 80);
        juegos[1] = new Videojuego("Breath of the Wild", 100);
        juegos[2] = new Videojuego("DOOM ETERNAL", 30);

        juegos[0].entregar();
        juegos[1].entregar();

        series[3].entregar();

        int seriesEntregadas=0;
        for (Serie serie: series) {
            if (serie.entregado) seriesEntregadas++;
        }
        System.out.println("Número de series entregadas: " + seriesEntregadas);

        int juegosEntregados=0;
        for (Videojuego juego: juegos) {
            if (juego.entregado) juegosEntregados++;
        }
        System.out.println("Número de juegos entregadas: " + juegosEntregados);

        System.out.println("Serie con mas temporadas: ");
        int max = 0, pos = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].numTemporadas > max) {
                max = series[i].numTemporadas;
                pos = i;
            }
        }
        System.out.println(series[pos].toString());

        System.out.println("Videojuego con mas horas: ");

        max = 0;
        pos = 0;
        for (int i = 0; i < juegos.length; i++) {
            if (juegos[i].horasEstimadas > max) {
                max = juegos[i].horasEstimadas;
                pos = i;
            }
        }







    }
}
