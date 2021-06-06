package conexion;

import java.util.Date;

public class VencimientosMes {
	
	private int vmldVencimiento;
	private String vmDniPropietario;
	private String vmDniInquilino;
	private String vmCodContrato;
	private Date vmFechaContrato; 
	private Date vmFechaVencimiento;
	private double vmPrecio;
	
	
	public VencimientosMes() {
		super();
	}


	public VencimientosMes(int vmldVencimiento, String vmDniPropietario, String vmDniInquilino, String vmCodContrato,
			Date vmFechaContrato, Date vmFechaVencimiento, double vmPrecio) {
		super();
		this.vmldVencimiento = vmldVencimiento;
		this.vmDniPropietario = vmDniPropietario;
		this.vmDniInquilino = vmDniInquilino;
		this.vmCodContrato = vmCodContrato;
		this.vmFechaContrato = vmFechaContrato;
		this.vmFechaVencimiento = vmFechaVencimiento;
		this.vmPrecio = vmPrecio;
	}


	public int getVmldVencimiento() {
		return vmldVencimiento;
	}


	public void setVmldVencimiento(int vmldVencimiento) {
		this.vmldVencimiento = vmldVencimiento;
	}


	public String getVmDniPropietario() {
		return vmDniPropietario;
	}


	public void setVmDniPropietario(String vmDniPropietario) {
		this.vmDniPropietario = vmDniPropietario;
	}


	public String getVmDniInquilino() {
		return vmDniInquilino;
	}


	public void setVmDniInquilino(String vmDniInquilino) {
		this.vmDniInquilino = vmDniInquilino;
	}


	public String getVmCodContrato() {
		return vmCodContrato;
	}


	public void setVmCodContrato(String vmCodContrato) {
		this.vmCodContrato = vmCodContrato;
	}


	public Date getVmFechaContrato() {
		return vmFechaContrato;
	}


	public void setVmFechaContrato(Date vmFechaContrato) {
		this.vmFechaContrato = vmFechaContrato;
	}


	public Date getVmFechaVencimiento() {
		return vmFechaVencimiento;
	}


	public void setVmFechaVencimiento(Date vmFechaVencimiento) {
		this.vmFechaVencimiento = vmFechaVencimiento;
	}


	public double getVmPrecio() {
		return vmPrecio;
	}


	public void setVmPrecio(double vmPrecio) {
		this.vmPrecio = vmPrecio;
	}
	
	
}
