package BoletinPoo.Ejercicios.Tiempo;

/*Ejercicio 6
Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.*/

public class Tiempo {

    //atributo t numero de segundos
	private int t;
	
	//constructor //NO ESTA FILTRADO
	//NO ADMITIMOS TIEMPOS NEGATIVOS
	public Tiempo(int h, int m,int s) {
		this.t=h*3600+m*60+s;
	}
	
	//defecto
	public Tiempo() {
		this.t=0;
	}

	
	
	public void setT(int t) {
		this.t = t;
	}

	public int getT() {
		return t;
	}

	@Override
	public String toString() {
		
		return "Tiempo [tiempo=" + (t/3600) + " H "+ ((t%3600)/60)+" M "+ ((t%3600)%60)+ " S]";
	}
	
	public Tiempo suma(Tiempo uno, Tiempo dos) {
		     Tiempo sum=    new Tiempo();
		     sum.setT(uno.getT()+dos.getT());
		     return sum;
	}
	//SIEMPRE EL MAYOR MENOS EL MENOR
	public Tiempo resta(Tiempo uno, Tiempo dos) {
	    
		Tiempo res=    new Tiempo();
		if(uno.getT()>=dos.getT()){
			
			res.setT(uno.getT()-dos.getT());
			return res;
			}
		else {
			res.setT(dos.getT()-uno.getT());
			return res;
		}
}

    
}
