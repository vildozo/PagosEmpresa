import static org.junit.Assert.*;

import org.junit.Test;

public class _TarjetaDiariaTest {

	@Test
	public void objetoTarjetaDiariaCreado() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 3.45);
		assertNotEquals(null, tarjeta);
	}
	
	@Test
	public void obtenerNombreCompleto() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 3.45);
		assertEquals("Javier Vildozo",tarjeta.getNombreCompleto());
	}
	
	@Test
	public void asignarYObtenerFecha() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 3.45);
		tarjeta.setFecha("23 de Mayo");
		assertEquals("23 de Mayo",tarjeta.getFecha());
	}
	
	@Test
	public void asignarYObtenerHoras() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 3.45);
		tarjeta.setHoras(7.09);
		assertEquals(7.09,tarjeta.getHoras(),0.0);
	}
	
	

	
}
