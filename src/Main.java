import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		TarjetaDiaria tarjeta = new TarjetaDiaria("Javier Vildozo", "16 de Abril 2016", 4);
		KardexPersonaSueldoPorHora persona = new KardexPersonaSueldoPorHora("Javier Vildozo", "Calle Gabriel Lippmann #43", "Estudiante");
		PapeletaDePago papeleta = new PapeletaDePago();
		
		persona.asignarSalarioHora(23.00);
		System.out.println(persona.devolverNombreCompleto());
		System.out.println(persona.mostrarSalarioPorHora());
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarTarjetaDiariaALista(tarjeta);
		papeleta.agregarPersonaAListaPersonaPorHora(persona);
		System.out.println(papeleta.listaPersonaPorHora.size());
		System.out.println(papeleta.pagarPorHoraA("Javier Vildozo"));
		System.out.println(persona.devolverNombreCompleto());
		
		
		

	}

}
