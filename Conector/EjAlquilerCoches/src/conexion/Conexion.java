package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	String bd = "bdalquilervehiculos";
	String user = "root";
	String password = "contraseña";
	
	
	
	String url = "jdbc:mysql://127.0.0.1/" + bd + "?serverTimezone = Europe/Madrid&useSSL=false" ;
	
	Connection conexion = null;
	
	public Conexion() {
		//obtener el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//obtener la conexion
			conexion=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException cl) {
			cl.printStackTrace();
		}catch(SQLException sq) {
			sq.printStackTrace();
		}
		
	}
	
	public Connection getConexion() {
		return conexion;
	}
	
	public void desconectar() {
		conexion=null;
	}

}
