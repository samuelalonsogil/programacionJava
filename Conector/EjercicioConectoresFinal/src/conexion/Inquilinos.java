package conexion;

public class Inquilinos {
	private String inDNI;
	private String inNombre;
	private String inDirecion;
	private String inCiudad;
	private int inCodPostal;
	private String inTelefono;
	private double inSalario;
	
	
	public Inquilinos() {
		super();
	}


	public Inquilinos(String inDNI, String inNombre, String inDirecion, String inCiudad, int inCodPostal,
			String inTelefono, double inSalario) {
		super();
		this.inDNI = inDNI;
		this.inNombre = inNombre;
		this.inDirecion = inDirecion;
		this.inCiudad = inCiudad;
		this.inCodPostal = inCodPostal;
		this.inTelefono = inTelefono;
		this.inSalario = inSalario;
	}


	public String getInDNI() {
		return inDNI;
	}


	public void setInDNI(String inDNI) {
		this.inDNI = inDNI;
	}


	public String getInNombre() {
		return inNombre;
	}


	public void setInNombre(String inNombre) {
		this.inNombre = inNombre;
	}


	public String getInDirecion() {
		return inDirecion;
	}


	public void setInDirecion(String inDirecion) {
		this.inDirecion = inDirecion;
	}


	public String getInCiudad() {
		return inCiudad;
	}


	public void setInCiudad(String inCiudad) {
		this.inCiudad = inCiudad;
	}


	public int getInCodPostal() {
		return inCodPostal;
	}


	public void setInCodPostal(int inCodPostal) {
		this.inCodPostal = inCodPostal;
	}


	public String getInTelefono() {
		return inTelefono;
	}


	public void setInTelefono(String inTelefono) {
		this.inTelefono = inTelefono;
	}


	public double getInSalario() {
		return inSalario;
	}


	public void setInSalario(double inSalario) {
		this.inSalario = inSalario;
	}
	
	

}
