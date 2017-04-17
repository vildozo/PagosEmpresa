import static org.junit.Assert.*;

import org.junit.Test;

public class _PersonaTest {

	@Test
	public void objetoPersonaCreada() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertNotEquals(null, person);
	}
	
	@Test
	public void devolverNombreCompleto() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertEquals("Javier Vildozo", person.devolverNombreCompleto());
	}
	
	@Test
	public void mostrarFechaDePagoEnViernes() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		person.setDiaPagoAViernes();
		assertEquals("Viernes", person.mostrarFechaDePago());
	}
	
	@Test
	public void verFechaDePagoEnFinDeMes() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		person.setDiaDePagoAFinDeMes();
		assertEquals("Fin De Mes", person.mostrarFechaDePago());
	}
	
	@Test
	public void cambiarfechadDePagoDeFinDeMesAViernes() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		person.setDiaDePagoAFinDeMes();
		person.cambiarFechaDePago();
		assertEquals("Viernes", person.mostrarFechaDePago());
	}
	
	@Test
	public void devolverCargoDePersona() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertEquals("Estudiante", person.devolverCargo());
	}
	
	
	@Test
	public void devolverDireccion() {
		Persona person = new Persona("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertEquals("Calle Gabriel Lippmann #43", person.direccion());
	}
	
	

}
