


import static org.junit.Assert.*;

import org.junit.Test;

public class _fechaDePagoTest {
	String viernes;

	@Test
	public void objetoPagoEnViernesCreado() {
		MostrarFechaDePago dia = new Viernes();
		assertNotEquals(null, dia);
	}
	
	@Test
	public void objetoPagoEnFinDeMesCreado() {
		MostrarFechaDePago dia = new FinDeMes();
		assertNotEquals(null, dia);
	}
	
	@Test
	public void PagoEnViernes() {
		MostrarFechaDePago dia = new Viernes();
		assertEquals("Viernes", dia.mostrarFechaDePago());
	}
	
	@Test
	public void PagoEnFinDeMes() {
		MostrarFechaDePago dia = new FinDeMes();
		assertEquals("Fin De Mes", dia.mostrarFechaDePago());
	}
	
	@Test
	public void CambioDeFechaDePagoDeFinDeMesAViernes() {
		MostrarFechaDePago dia = new FinDeMes();
		assertEquals("Fin De Mes", dia.mostrarFechaDePago());
		dia = new Viernes();
		assertEquals("Viernes", dia.mostrarFechaDePago());
	}
	
	@Test
	public void CambioDeFechaDePagoEnViernesAFinDeMes() {
		MostrarFechaDePago dia = new Viernes();
		assertEquals("Viernes", dia.mostrarFechaDePago());
		dia = new FinDeMes();
		assertEquals("Fin De Mes", dia.mostrarFechaDePago());
		
	}


}
