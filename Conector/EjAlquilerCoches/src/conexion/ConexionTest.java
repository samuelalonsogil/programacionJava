package conexion;

public class ConexionTest {
	
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		
		if(conexion != null) System.out.println("Conexi�n OK");
		else System.out.println("La conexi�n no se ha podido realizar");
		
		conexion.desconectar();
	}

}
