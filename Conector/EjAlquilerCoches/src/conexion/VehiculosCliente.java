package conexion;

import java.util.Date;

public class VehiculosCliente {
	private String dni;
	private String matricula;
	private Date fecInicio;
	private int numDias;
	private String seguro;
	public VehiculosCliente() {
		super();
		
	}
	public VehiculosCliente(String dni, String matricula, Date fecInicio, int numDias, String seguro) {
		super();
		this.dni = dni;
		this.matricula = matricula;
		this.fecInicio = fecInicio;
		this.numDias = numDias;
		this.seguro = seguro;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getFecInicio() {
		return fecInicio;
	}
	public void setFecInicio(Date fecInicio) {
		this.fecInicio = fecInicio;
	}
	public int getNumDias() {
		return numDias;
	}
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}
	public String getSeguro() {
		return seguro;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	
	
	

}
