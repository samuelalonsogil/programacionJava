package conexion;

import java.util.Date;

public class Contratos {
	private String coCodigo;
	private String coDNIINquilino;
	private String coCodInmueble;
	private Date coFechaContrato;
	private Date coFechaVencimiento;
	private double coPrecio;
	
	public Contratos(){super();}

	public Contratos(String coCodigo, String coDNIINquilino, String coCodInmueble, Date coFechaContrato,
			Date coFechaVencimiento, double coPrecio) {
		super();
		this.coCodigo = coCodigo;
		this.coDNIINquilino = coDNIINquilino;
		this.coCodInmueble = coCodInmueble;
		this.coFechaContrato = coFechaContrato;
		this.coFechaVencimiento = coFechaVencimiento;
		this.coPrecio = coPrecio;
	}

	public String getCoCodigo() {
		return coCodigo;
	}

	public void setCoCodigo(String coCodigo) {
		this.coCodigo = coCodigo;
	}

	public String getCoDNIINquilino() {
		return coDNIINquilino;
	}

	public void setCoDNIINquilino(String coDNIINquilino) {
		this.coDNIINquilino = coDNIINquilino;
	}

	public String getCoCodInmueble() {
		return coCodInmueble;
	}

	public void setCoCodInmueble(String coCodInmueble) {
		this.coCodInmueble = coCodInmueble;
	}

	public Date getCoFechaContrato() {
		return coFechaContrato;
	}

	public void setCoFechaContrato(Date coFechaContrato) {
		this.coFechaContrato = coFechaContrato;
	}

	public Date getCoFechaVencimiento() {
		return coFechaVencimiento;
	}

	public void setCoFechaVencimiento(Date coFechaVencimiento) {
		this.coFechaVencimiento = coFechaVencimiento;
	}

	public double getCoPrecio() {
		return coPrecio;
	}

	public void setCoPrecio(double coPrecio) {
		this.coPrecio = coPrecio;
	}
	
	
	
}
