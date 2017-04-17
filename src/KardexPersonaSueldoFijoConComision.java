
public class KardexPersonaSueldoFijoConComision extends Persona {
	double sueldoFijo;
	double porcentajeComision;
	
	KardexPersonaSueldoFijoConComision(String nombre, String direccion, String cargo) {
		super(nombre, direccion, cargo);
		// TODO Auto-generated constructor stub
	}
	
	void asignarSueldo(double monto){
		this.sueldoFijo = monto;
	}
	
	double retornarMontodeSueldoFijo(){
		return sueldoFijo;
	}
	
	void asignarPorcentajeDeComision(double monto){
		this.porcentajeComision = monto;
	}
	
	double retornarProcentajeDeComision(){
		return this.porcentajeComision;
	}

	
	double CalcularSueldo(double montoPorComision){
		return (this.porcentajeComision *montoPorComision + sueldoFijo );
	}
	
	

}
