package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexion.Conexion;

public class IntroducirDatos {

	public static String listarClientesPasandoLosDatos(String s) {
		
		Conexion conexion = new Conexion();
		
		//preparar la consulta
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			System.out.println(s);
			return (new BufferedReader (new InputStreamReader (System.in))).readLine();
		} catch (IOException ioe) {
			
			System.out.println("Error interno");
		}
		return "";
		
	}

}
