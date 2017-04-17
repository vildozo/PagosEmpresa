import static org.junit.Assert.*;

import org.junit.Test;

public class _KardexPersonaSueldoPorHora {

	@Test
	public void objetoKardexPersonaSueldoPorHoraCreado() {
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertNotEquals(null,persona);
	}
	
	@Test
	public void asignarYMostrarSalirioPorHora() {
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarSalarioHora(23.15);
		assertEquals(23.15,persona.mostrarSalarioPorHora(),0.0);
	}

	@Test
	public void calcular125HorasTrabajadasA32PorHora() {
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarSalarioHora(32.00);
		assertEquals(4000.00,persona.calcularSalarioPorHorasTrabajadas(125),0.0);
	}

}
