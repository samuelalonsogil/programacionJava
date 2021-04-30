package BoletinPoo.Ejercicios.Fraccion;
import java.util.Scanner;

public class TestEuclides {
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int num1 = 1032;
		int num2 = 180;
		Scanner sc = new Scanner(System.in);

		System.out.println("PRIMERA PRUEBA sin pase de datos");
		System.out.println("--------------------------------------------");
		System.out.println("El primer número es: " + num1 + " el segundo número es: " + num2);
		System.out.println("El MCD es: " + McdMcm.maximoComunDivisor(num1, num2));
		System.out.println("El mcm es: " + McdMcm.mcm(num1, num2));

		System.out.println("=============================================");

		System.out.println("SEGUNDA PRUEBA con pase de datos");
		System.out.println("--------------------------------------------");
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		System.out.println("El primer número es: " + num1 + " el segundo número es: " + num2);
		System.out.println("El MCD es: " + McdMcm.euclidesMCD(num1, num2));
		System.out.println("El mcm es: " + McdMcm.mcm(num1, num2));

        sc.close();
	}
}
