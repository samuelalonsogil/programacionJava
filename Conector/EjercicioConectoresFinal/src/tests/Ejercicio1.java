package tests;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import conexion.Conexion;

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		insertarContratos();
	}
	
	/*	Eduardo Pereira Muguerza quiere alquilar un piso con las siguientes caracter�sticas 
		Zona: Las Avenidas, Superficie 150 m2 y con garaje. Insertar el nuevo contrato. 
		Actualizar los datos necesarios*/
	
	public static void insertarContratos() {
		Conexion conexion = new Conexion();
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO Contratos(coCodigo, coDNIInquilino, coCodInmueble, coFechaContrato, coFechaVencimiento, coPrecio)"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		String fechaContrato = IntroducirDatos.listarClientesPasandoLosDatos("Fecha de contrato: ");
		Date fecContrato = ConvertirFechas.convertirStringDate(fechaContrato);
		
		String fechaVencimiento = IntroducirDatos.listarClientesPasandoLosDatos("Fecha de vencimiento: ");
		Date fecVencimiento = ConvertirFechas.convertirStringDate(fechaVencimiento);
		
		try {

			ps = conexion.getConexion().prepareStatement(sql);
			ps.setString(1, IntroducirDatos.listarClientesPasandoLosDatos("C�digo: ")); 
			ps.setString(2, IntroducirDatos.listarClientesPasandoLosDatos("DNI Inquilino: "));
			ps.setString(3, IntroducirDatos.listarClientesPasandoLosDatos("C�digo inmueble: "));
			ps.setDate(4, ConvertirFechas.convertirJavaDateASqlDate(fecContrato));
			ps.setDate(5, ConvertirFechas.convertirJavaDateASqlDate(fecVencimiento));
			ps.setDouble(6, Integer.parseInt(IntroducirDatos.listarClientesPasandoLosDatos("Precio: ")));
			

			int filas = ps.executeUpdate();
			if (filas != 0)
				System.out.println("Inserci�n correcta");
			else
				System.out.println("La inserci�n no se ha realizado");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
	

}
