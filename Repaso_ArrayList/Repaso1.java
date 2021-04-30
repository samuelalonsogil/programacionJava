package Repaso_ArrayList;

import java.util.ArrayList;


class Empleado{
	String nombre;
	int edad;
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		}
	}


class Repaso1 {
    
    
    public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("Samuel",21));
        listaEmpleados.add(new Empleado("Carlos", 21));
        listaEmpleados.add(new Empleado("Nicolás", 21));

        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.toString());
        }
	}
}
