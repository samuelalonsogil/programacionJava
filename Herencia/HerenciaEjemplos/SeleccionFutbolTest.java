package HerenciaEjemplos;

import java.util.ArrayList;

public class SeleccionFutbolTest {
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
        SeleccionFutbol jefe1 = new JefeDePrensa(001,"Juan","Cuesta",35, "01M");
        SeleccionFutbol amigo1 = new AmigosDeNeymar(001,"Joao","Festa",22, "01n");
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        integrantes.add(jefe1);
        integrantes.add(amigo1);


        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.Concentrarse();
        }

        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.Viajar();
        }

        // ENTRENAMIENTO
        System.out.println("nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).dirigirEntreno();
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta) .entrenar();

        // MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();

        // PARTIDO DE FUTBOL
        System.out.println("nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).dirigirPartido();
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).jugarPartido();
    }
}
