package BoletinPoo.Ejercicios.Vehiculo;

public class Coche extends Vehiculo{
    int cilindrada;
	
	Coche(int c, int nR){
		super(nR);
		this.cilindrada=c;
		
	}
	
	public void andar() {
		System.out.println("el coche se mueve");
	}
	
	public void quemarRueda() {
		System.out.println("BRRRRRRRRRRRRRRRRRRRRr");
	}
}
