import static org.junit.Assert.*;

import org.junit.Test;

public class _PapeletaDePagoTest {

	@Test
	public void test() {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 4);
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier", "Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		PapeletaDePago papeleta = new PapeletaDePago();
		
		persona.asignarSalarioHora(23.00);
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarPersonaAListaPersonaPorHora(persona);
		assertEquals(184, papeleta.pagarPorHoraA("Javier Vildozo"),0.0);
	}

}
