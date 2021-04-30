package Votacion;

public class Votacion {
    // persona a la que se vota en esta instancia y el numero de votos que lleva
    private String persona = null;
    private int votos = 0;

    // persona mas votada de todas las instancias y el numero de votos que lleva
    static private int votosMasVotado = 0;
    static private String personaMasVotada = null;

    // Constructor
    Votacion(String persona) {
        this.persona = persona;
    }

    // Se invoca cada vez que alguien vota a persona
    public void Voto() {
        votos++;
        if (votos > votosMasVotado) {
            personaMasVotada = persona;
            votosMasVotado = votos;
        }
    }

    // Devuelve el nombre de persona
    public String getNombrepersona() {
        return persona;
    }

    // Devuelve el numero de votos de persona
    public int getVotos() {
        return votos;
    }

    // Devuelve el nombre de la persona mas votada
    static public String getNombreDelMasVotado() {
        return personaMasVotada;
    }

    // Devuelve el numero de votos de la persona mas votada
    static public int getvotosDelMasVotado() {
        return votosMasVotado;
    }

    @Override
    public String toString() {
        return "Votacion [persona=" + persona + ", votos=" + votos + "]";
    }

    
}
