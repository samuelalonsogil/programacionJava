package BoletinPoo.Ejercicios.Tiempo;

public class TiempoTest {
    
    public static void main(String[] args) {
		
		Tiempo plus=new Tiempo();
		Tiempo less=new Tiempo();
		Tiempo ocho = new Tiempo(3,15,22);
		System.out.println(ocho.toString());
		Tiempo nueve = new Tiempo(5,55,45);
		System.out.println(nueve.toString());
		System.out.println("SUMAR__________________");
        System.out.println(plus.suma(ocho,nueve));	
        System.out.println("RESTAR__________________");
        System.out.println(less.resta(ocho,nueve));	
	}

}
