package BoletinPoo.Ejercicios.Fraccion;

public class McdMcm {
    // mcd recursivo
	public static int euclidesMCD(int num, int den) {
		if (den == 0) {
			return num;
		} else {
			return euclidesMCD(den, num % den);
		}
	}
	//minimo comun multiplo
	public static int mcm(int num, int den) {
		int mcd = euclidesMCD(num, den);
		return (num * den) / mcd;
	}

	//mcd iterativo
	public static int maximoComunDivisor(int num, int num2) throws InterruptedException {
		int temporal;
		while (num2 != 0) {
			System.out.println("DIVIDENDO: "+num+" DIVISOR: "+num2+ " MODULO: "+(num%num2));
			Thread.sleep(1000);
			temporal = num2;
			num2 = num % num2;
			num = temporal;
		}
		return num;
	}
}
