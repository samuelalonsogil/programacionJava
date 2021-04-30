package BoletinPoo.Ejercicios.Vehiculo;

public class Bicicleta extends Vehiculo {
    boolean tieneTimbre;
	
	Bicicleta(boolean tim, int nR){
		super(nR);
		this.tieneTimbre=tim;
	}
	
	
	
	public void andar() {
		System.out.println("la bicicleta se mueve");
		
	}
	
public void hacerCaballito() {
	System.out.println("ZIUMMMMMMM");
	
}
}
