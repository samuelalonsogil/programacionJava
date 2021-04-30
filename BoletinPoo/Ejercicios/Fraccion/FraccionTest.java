package BoletinPoo.Ejercicios.Fraccion;

public class FraccionTest {

	public static void main(String[] args) {
		
		Fraccion mitad=new Fraccion(1,2);
		System.out.println(mitad.toString());
		
		Fraccion raruna=new Fraccion(4,13);
		System.out.println(raruna.toString());
		
		Fraccion invRaruna = Fraccion.invierte(raruna);
		System.out.println(invRaruna.toString());
	}

}
