
public class Persona {
	String nombre;
	String direccion;
	String cargo;
	MostrarFechaDePago diaDePago=null;
	
	Persona(String nombre, String direccion, String cargo){
		this.nombre=nombre;
		this.direccion=direccion;
		this.cargo=cargo;
	}
	
	void setDiaPagoAViernes(){
		diaDePago=new Viernes();
	}
	
	void setDiaDePagoAFinDeMes(){
		diaDePago = new FinDeMes();
	}
	
	void cambiarFechaDePago(){
		if( "Viernes" == diaDePago.mostrarFechaDePago())
		{
			diaDePago = new FinDeMes();
		}
		else
		{
			diaDePago = new Viernes();
		}	
	}
	
	String mostrarFechaDePago(){
		return diaDePago.mostrarFechaDePago();
	}
	
	String devolverNombreCompleto(){
		return (nombre);
	}
	
	String devolverCargo(){
		return cargo;
	}
	
	String direccion(){
		return direccion;
	}
	
	
}
