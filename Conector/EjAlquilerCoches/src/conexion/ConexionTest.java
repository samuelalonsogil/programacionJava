package conexion;

public class ConexionTest {
	
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		
		if(conexion != null) System.out.println("Conexión OK");
		else System.out.println("La conexión no se ha podido realizar");
		
		conexion.desconectar();
	}

}
