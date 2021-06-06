package conexion;

public class Propietarios {
	
	private String prDNI;
	private String prNombre;
	private String prApellidos;
	private String prDireccion;
	private String prCiudad;
	private int prCodPostal;
	private String prProvincia;
	private int prTelefono;
	
	
	public Propietarios() {
		super();
	}


	public Propietarios(String prDNI, String prNombre, String prApellidos, String prDireccion, String prCiudad,
			int prCodPostal, String prProvincia, int prTelefono) {
		super();
		this.prDNI = prDNI;
		this.prNombre = prNombre;
		this.prApellidos = prApellidos;
		this.prDireccion = prDireccion;
		this.prCiudad = prCiudad;
		this.prCodPostal = prCodPostal;
		this.prProvincia = prProvincia;
		this.prTelefono = prTelefono;
	}


	public String getPrDNI() {
		return prDNI;
	}


	public void setPrDNI(String prDNI) {
		this.prDNI = prDNI;
	}


	public String getPrNombre() {
		return prNombre;
	}


	public void setPrNombre(String prNombre) {
		this.prNombre = prNombre;
	}


	public String getPrApellidos() {
		return prApellidos;
	}


	public void setPrApellidos(String prApellidos) {
		this.prApellidos = prApellidos;
	}


	public String getPrDireccion() {
		return prDireccion;
	}


	public void setPrDireccion(String prDireccion) {
		this.prDireccion = prDireccion;
	}


	public String getPrCiudad() {
		return prCiudad;
	}


	public void setPrCiudad(String prCiudad) {
		this.prCiudad = prCiudad;
	}


	public int getPrCodPostal() {
		return prCodPostal;
	}


	public void setPrCodPostal(int prCodPostal) {
		this.prCodPostal = prCodPostal;
	}


	public String getPrProvincia() {
		return prProvincia;
	}


	public void setPrProvincia(String prProvincia) {
		this.prProvincia = prProvincia;
	}


	public int getPrTelefono() {
		return prTelefono;
	}


	public void setPrTelefono(int prTelefono) {
		this.prTelefono = prTelefono;
	}
	
	
}
