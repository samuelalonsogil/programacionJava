package BoletinPoo.Ejercicios.Fraccion;

/*Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
los métodos pueden ser invierte, simplifica, multiplica, divide, etc.*/
public class Fraccion {

	// atributos
	int num;
	int den;

	
	
	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	// constructor
	public Fraccion(int n, int d) {
		this.num = n;

		if (d == 0) {
			System.out.println("no se pudo crear la fraccion");
		} else {
			this.den = d;
		}
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	public static Fraccion invierte(Fraccion f) {
		
		Fraccion inv= new Fraccion(f.getDen(),f.getNum());
		
		return inv;
	}

	public static Fraccion divide(Fraccion a, Fraccion b){
		Fraccion div = new Fraccion(a.getNum()*b.getDen(), a.getDen()+b.getNum());
		return div;
	}
	
	public  void simplificar() throws InterruptedException{
		int n=this.getNum();
		int d=this.getDen();
		int max = McdMcm.maximoComunDivisor(n,d);
		System.out.println(max);
		
	}
}
