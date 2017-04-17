
public class TarjetaDiaria {
	String nombreCompleto;
	String fecha;
	double horas;
	
	TarjetaDiaria(String nombre, String fecha, double horas){
		this.nombreCompleto = nombre;
		this.fecha = fecha;
		this.horas = horas;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	
	
	
	

}
