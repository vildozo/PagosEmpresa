import static org.junit.Assert.*;

import org.junit.Test;

public class _PapeletaDePagoTest {

	@Test
	public void papeletaDePagoParaEmpleadoPorHora() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 4);
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		PapeletaDePago papeleta = new PapeletaDePago();
		
		persona.asignarSalarioHora(23.00);
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarPersonaAListaPersonaPorHora(persona);
		assertEquals(184, papeleta.pagarPorHoraA("Javier Vildozo"),0.0);
	}
	
	@Test
	public void papeletaDePagoParaEmpleadoDeHorarioFijoMasComision() {
		ReciboDeVenta recibo = new ReciboDeVenta("cps", "Javier Vildozo", "12 de Abril", "audo", 40000);
		KardexPersonaSueldoFijoConComision persona = new KardexPersonaSueldoFijoConComision("Javier Vildozo", "Calle Gabriel Lippmann", "Vendedor");
		PapeletaDePago papeleta = new PapeletaDePago();
	
		
		persona.asignarSueldo(10000);
		persona.asignarPorcentajeDeComision(.10);
		
		papeleta.agregarPersonaAListaPersonaSueldoFijoYComision(persona);
		papeleta.agregarReciboDeVentaALista(recibo);
		papeleta.agregarReciboDeVentaALista(recibo);
		
		assertEquals(18000, papeleta.pagarPorSueldoFijoYComision("Javier Vildozo"),0.0);
	}
	
	

}
