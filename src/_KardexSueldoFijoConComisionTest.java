import static org.junit.Assert.*;

import org.junit.Test;

public class _KardexSueldoFijoConComisionTest {

	@Test
	public void objetoKardexPersonaSueldoFijoConComisionCreado() {
		KardexPersonaSueldoFijoConComision persona = new KardexPersonaSueldoFijoConComision("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertNotEquals(null,persona);
	}
	
	@Test
	public void asignarYMostrarSueldoFijo() {
		KardexPersonaSueldoFijoConComision persona = new KardexPersonaSueldoFijoConComision("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarSueldo(1000);
		assertEquals(1000,persona.retornarMontodeSueldoFijo(),0.0);
	}
	
	@Test
	public void asignarYMostrarPorcentajeDeComision() {
		KardexPersonaSueldoFijoConComision persona = new KardexPersonaSueldoFijoConComision("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarPorcentajeDeComision(.015);
		assertEquals(.015,persona.retornarProcentajeDeComision(),0.0);
	}
	
	@Test
	public void calcularSueldoMasComisionPorVentasA23PorcientoPorVentaDe1000bs() {
		KardexPersonaSueldoFijoConComision persona = new KardexPersonaSueldoFijoConComision("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarSueldo(1000);
		persona.asignarPorcentajeDeComision(.23);
		assertEquals(1230,persona.CalcularSueldo(1000),0.0);
	}

}
