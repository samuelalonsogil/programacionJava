package BoletinPoo.Ejercicios.Vehiculo;

public class Vehiculo {
    static int numeroVehiculos=0;
	static int kilometrosTotales=0;
	
	int numRuedas;
	int kilometrosRecorridos=0;
	
	Vehiculo(int nR){
		numeroVehiculos++;
	}
	
	public void setKilometrosTotales() {
		kilometrosTotales+=kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int km) {
		this.kilometrosRecorridos=km;
	}
	
	
	
	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	//metodo andar
	public void andar() {
		System.out.println("el vehiculo se mueve");
	}
}
