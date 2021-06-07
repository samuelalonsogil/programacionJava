package Herencia.Abstraccion;

import java.util.ArrayList;

public class SeleccionFutbolTest2 {
    // ArrayList de objetos SeleccionFutbol.
    //Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol2> integrantes = new ArrayList<SeleccionFutbol2>();

    public static void main(String[] args) {

        SeleccionFutbol2 delBosque = new Entrenador2(1, "Vicente", "Del Bosque", 60, "28489");
        SeleccionFutbol2 iniesta = new Futbolista2(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol2 raulMartinez = new Masajista2(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();

        }

        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // ENTRENAMIENTO
        System.out.println("Entrenamiento");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }

}
}
