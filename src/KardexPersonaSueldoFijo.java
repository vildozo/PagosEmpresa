
public class KardexPersonaSueldoFijo extends Persona{
	double sueldoFijo;
	
	KardexPersonaSueldoFijo(String nombre, String apellido, String direccion, String cargo) {
		super(nombre, apellido, direccion, cargo);
		// TODO Auto-generated constructor stub
	}
	
	void asignarSueldo(double monto){
		this.sueldoFijo = monto;
	}
	
	double retornarMontodeSueldo(){
		return sueldoFijo;
	}

}
