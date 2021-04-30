package Votacion;

public class VotacionTest {
    public static void main(String[] args) {

        System.out.println(Votacion.getNombreDelMasVotado() + ": " + Votacion.getvotosDelMasVotado());

        // Tenemos tres candidatos en esta votacion
        Votacion Juan = new Votacion("Juan Peire");
        Votacion Ana = new Votacion("Ana Garcia");
        Votacion Adela = new Votacion("Adela Sancho");

        // empieza la votacion
        Juan.Voto();
        Ana.Voto();
        Ana.Voto();
        Ana.Voto();
        Adela.Voto();
        System.out.println(Votacion.getNombreDelMasVotado() + ": " + Votacion.getvotosDelMasVotado());

        Juan.Voto();
        Juan.Voto();
        Juan.Voto();
        Adela.Voto();
        System.out.println(Votacion.getNombreDelMasVotado() + ": " + Votacion.getvotosDelMasVotado());

        Adela.Voto();
        Adela.Voto();
        Ana.Voto();
        Ana.Voto();
        System.out.println(Votacion.getNombreDelMasVotado() + ": " + Votacion.getvotosDelMasVotado());

        System.out.println(Juan.getNombrepersona() + ": " + Juan.getVotos());
        System.out.println(Ana.getNombrepersona() + ": " + Ana.getVotos());
        System.out.println(Adela.getNombrepersona() + ": " + Adela.getVotos());

        

    }

    @Override
    public String toString() {
        return "VotacionTest []";
    }
}
