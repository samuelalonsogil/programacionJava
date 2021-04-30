package BoletinPoo.Ejercicios.Animales;

public class TestAnimales {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		String comida="pescado";
		
		Animal pitis = new Perro();
		Animal matias = new Gato();
		Animal lolo = new Lagarto();
		Animal pio = new Canario();
		Animal paraiso = new Ave();
		Animal joseLuis = new Pinguino();
		Animal juancho = new Lagarto();
		Animal palleiro = new Perro();
		Animal pepe = new Gato();
		Animal linus = new Pinguino();

		Animal[] recua = { pitis, matias, lolo, pio, paraiso, joseLuis, juancho, palleiro, pepe, linus };

		for (Animal brutus : recua) {
			System.out.println(brutus);
			brutus.come(comida);
			if(brutus instanceof Perro) {
				  (  (Perro)  brutus)   .dameLaPata();
			}else if (brutus instanceof Gato) {
				((Gato) brutus).maulla();
			}
				
			}
	}
}
