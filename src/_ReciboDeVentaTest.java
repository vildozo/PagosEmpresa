import static org.junit.Assert.*;

import org.junit.Test;

public class _ReciboDeVentaTest {

	@Test
	public void objetoReciboDeVentaCreado() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		assertNotEquals(null,recibo);
	}
	
	@Test
	public void asignarYMostrarCliente() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		recibo.setNombreCliente("CPP");
		assertEquals("CPP",recibo.getNombreCliente());
	}
	
	@Test
	public void asignarYMostrarVendedor() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		recibo.setNombreVendedor("CPP");
		assertEquals("CPP",recibo.getNombreVendedor());
	}
	
	@Test
	public void asignarYMostrarFecha() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		recibo.setFecha("5 de Abril");
		assertEquals("5 de Abril",recibo.getFecha());
	}
	
	
	@Test
	public void asignarYMostrarDescripcion() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		recibo.setDescripcion("Venta por software por cps");
		assertEquals("Venta por software por cps",recibo.getDescripcion());
	}
	
	@Test
	public void asignarYMostrarMonto() {
		ReciboDeVenta recibo = new ReciboDeVenta("Arqui", "Javier Vildozo", "16 de Abril", "Venta de software", 30.00);
		recibo.setMonto(43.13);;
		assertEquals(43.13,recibo.getMonto(),0.0);
	}
	
	

}
