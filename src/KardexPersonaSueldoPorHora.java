
public class KardexPersonaSueldoPorHora extends Persona{
	double salarioPorHora;

	KardexPersonaSueldoPorHora(String nombre, String direccion, String cargo) {
		super(nombre, direccion, cargo);
		// TODO Auto-generated constructor stub
	}
	
	void asignarSalarioHora(double montoPorHora){
		salarioPorHora=montoPorHora;
	}
	
	double mostrarSalarioPorHora(){
		return salarioPorHora;
	}
	
	double calcularSalarioPorHorasTrabajadas(double horas){
		return salarioPorHora*horas;
	}

}
