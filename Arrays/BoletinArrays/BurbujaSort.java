package Arrays.BoletinArrays;

public class BurbujaSort {
    public static void main(String[] args) {

		float[] listaNotas = { 5.5f, 9f, 2f, 10f, 4.9f };
		// Bucle externo.
		// Se irá poniendo en cada posición tratada, empezando por la 0,
		// el valor más bajo que se encuentre.
		for (int i = 0; i < listaNotas.length - 1; i++) {
			// Bucle interno.
			// Se busca entre el resto de posiciones cuál es el valor más bajo.
			for (int j = i + 1; j < listaNotas.length; j++) {
				// La posición tratada tiene un valor más alto que el de la búsqueda. Los
				// intercambiamos.
				if (listaNotas[i] > listaNotas[j]) {
					// Para intercambiar valores hay una variable auxiliar.
					float aux = listaNotas[i];
					listaNotas[i] = listaNotas[j];
					listaNotas[j] = aux;
				}
			}
		}
		// Lo mostramos por pantalla.
		System.out.print("El array ordenado es: [");
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.print(listaNotas[i] + " ");

		}
		System.out.println("]");
	}
}
