
public class ReciboDeVenta {
	String nombreCliente;
	String nombreVendedor;
	String fecha;
	String descripcion;
	double monto;
	
	ReciboDeVenta(String nombreCliente,String nombreVendedor,String fecha,String descripcion,double monto){
		this.nombreCliente = nombreCliente;
		this.nombreVendedor = nombreVendedor;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.monto = monto;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	

}
