import static org.junit.Assert.*;

import org.junit.Test;

public class _KardexPersonaSueldoFijoTest {

	@Test
	public void objetoKardexPersonaSueldoFijoCreado() {
		KardexPersonaSueldoFijo persona= new KardexPersonaSueldoFijo("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		assertNotEquals(null, persona);
	}
	
	@Test
	public void asignarymostrarMontoASueldoFijo() {
		KardexPersonaSueldoFijo persona= new KardexPersonaSueldoFijo("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		persona.asignarSueldo(2100.50);
		assertEquals(2100.50, persona.retornarMontodeSueldo(),0.0);
	}

}
