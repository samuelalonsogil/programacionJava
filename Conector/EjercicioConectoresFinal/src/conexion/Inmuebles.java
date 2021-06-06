package conexion;

public class Inmuebles {
	private String inCodigo;
	private String inDireccion;
	private String inCodZona;
	private String inEstado;
	private String inDNIPropietario;
	private int inSuperficie;
	private int inNumHabitaciones;
	private int inNumBanhos;
	private int inTerraza;
	private int inJardin;
	private int inPiscina;
	private int inGaraje;
	
	
	public Inmuebles() {super();}


	public Inmuebles(String inCodigo, String inDireccion, String inCodZona, String inEstado, String inDNIPropietario,
			int inSuperficie, int inNumHabitaciones, int inNumBanhos, int inTerraza, int inJardin, int inPiscina,
			int inGaraje) {
		super();
		this.inCodigo = inCodigo;
		this.inDireccion = inDireccion;
		this.inCodZona = inCodZona;
		this.inEstado = inEstado;
		this.inDNIPropietario = inDNIPropietario;
		this.inSuperficie = inSuperficie;
		this.inNumHabitaciones = inNumHabitaciones;
		this.inNumBanhos = inNumBanhos;
		this.inTerraza = inTerraza;
		this.inJardin = inJardin;
		this.inPiscina = inPiscina;
		this.inGaraje = inGaraje;
	}


	public String getInCodigo() {
		return inCodigo;
	}


	public void setInCodigo(String inCodigo) {
		this.inCodigo = inCodigo;
	}


	public String getInDireccion() {
		return inDireccion;
	}


	public void setInDireccion(String inDireccion) {
		this.inDireccion = inDireccion;
	}


	public String getInCodZona() {
		return inCodZona;
	}


	public void setInCodZona(String inCodZona) {
		this.inCodZona = inCodZona;
	}


	public String getInEstado() {
		return inEstado;
	}


	public void setInEstado(String inEstado) {
		this.inEstado = inEstado;
	}


	public String getInDNIPropietario() {
		return inDNIPropietario;
	}


	public void setInDNIPropietario(String inDNIPropietario) {
		this.inDNIPropietario = inDNIPropietario;
	}


	public int getInSuperficie() {
		return inSuperficie;
	}


	public void setInSuperficie(int inSuperficie) {
		this.inSuperficie = inSuperficie;
	}


	public int getInNumHabitaciones() {
		return inNumHabitaciones;
	}


	public void setInNumHabitaciones(int inNumHabitaciones) {
		this.inNumHabitaciones = inNumHabitaciones;
	}


	public int getInNumBanhos() {
		return inNumBanhos;
	}


	public void setInNumBanhos(int inNumBanhos) {
		this.inNumBanhos = inNumBanhos;
	}


	public int getInTerraza() {
		return inTerraza;
	}


	public void setInTerraza(int inTerraza) {
		this.inTerraza = inTerraza;
	}


	public int getInJardin() {
		return inJardin;
	}


	public void setInJardin(int inJardin) {
		this.inJardin = inJardin;
	}


	public int getInPiscina() {
		return inPiscina;
	}


	public void setInPiscina(int inPiscina) {
		this.inPiscina = inPiscina;
	}


	public int getInGaraje() {
		return inGaraje;
	}


	public void setInGaraje(int inGaraje) {
		this.inGaraje = inGaraje;
	}
	
	


}