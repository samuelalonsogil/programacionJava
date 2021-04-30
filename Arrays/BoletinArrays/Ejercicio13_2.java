package Arrays.BoletinArrays;

import java.util.Arrays;

public class Ejercicio13_2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = { 1, 2, 5, 6, 7, 8, 4, 9, 3, 11 };
		

		

		int[] ind_par = new int[5];
		int[] ind_impar = new int[5];

		int j = 0;
		int k = 0;
		// recorrido
		for (int i = 0; i < tabla.length; i++) {
			if (i % 2 == 0) {
				ind_par[j] = tabla[i];
				j++;
			} else {
				ind_impar[k] = tabla[i];
				k++;
			}
		}

		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(ind_par));
		System.out.println(Arrays.toString(ind_impar));
		
	}
}
