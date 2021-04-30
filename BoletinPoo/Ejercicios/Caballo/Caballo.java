package BoletinPoo.Ejercicios.Caballo;

public class Caballo {
    private String nombre;
	  private String color;
	  private int edad;
	  private int carrerasGanadas;
	  
	  Caballo (String n, String c, int e, int cg) {
	    this.nombre = n;
	    this.color = c;
	    this.edad = e;
	    this.carrerasGanadas = cg;
	  }

	  public String getNombre() {
	    return this.nombre;
	  }

	  public void cabalga() {
	    System.out.println("Tocotoc tocotoc tocotoc");
	  }

	  public void relincha() {
	    System.out.println("Hiiiiiiieeeeee");
	  }

	  public void rumia() {
	    System.out.println("Ñam ñam ñam");
	  }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public String getColor() {
          return color;
      }

      public void setColor(String color) {
          this.color = color;
      }

      public int getEdad() {
          return edad;
      }

      public void setEdad(int edad) {
          this.edad = edad;
      }

      public int getCarrerasGanadas() {
          return carrerasGanadas;
      }

      public void setCarrerasGanadas(int carrerasGanadas) {
          this.carrerasGanadas = carrerasGanadas;
      }
}
