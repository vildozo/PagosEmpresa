import java.util.ArrayList;

public class PapeletaDePago {
	ArrayList <TarjetaDiaria> listaDeTarjetas = new ArrayList<TarjetaDiaria>();
	ArrayList <ReciboDeVenta> listaDeRecibo =new ArrayList<ReciboDeVenta>();
	ArrayList <KardexPersonaSueldoPorHora> listaPersonaPorHora = new ArrayList<KardexPersonaSueldoPorHora>();
	ArrayList <KardexPersonaSueldoFijo> listaPersonaSueldoFijo = new ArrayList<KardexPersonaSueldoFijo>();
	ArrayList <KardexPersonaSueldoFijoConComision> listaPersonaSueldoFijoConComision = new ArrayList<KardexPersonaSueldoFijoConComision>();
	
	void agregarPersonaAListaPersonaSueldoFijo (KardexPersonaSueldoFijo persona){
		listaPersonaSueldoFijo.add(persona);
	}
	
	void quitarPersonaAListaPersonaSueldoFijo (KardexPersonaSueldoFijo persona){
		listaPersonaSueldoFijo.remove(persona);
	}
	
	void agregarPersonaAListaPersonaSueldoFijoYComision (KardexPersonaSueldoFijoConComision persona){
		listaPersonaSueldoFijoConComision.add(persona);
	}
	
	void quitarPersonaAListaPersonaSueldoFijoYComision (KardexPersonaSueldoFijoConComision persona){
		listaPersonaSueldoFijoConComision.remove(persona);
	}
	
	void agregarPersonaAListaPersonaPorHora (KardexPersonaSueldoPorHora persona){
		listaPersonaPorHora.add(persona);
	}
	
	void quitarPersonaAListaPersonaPorHora (KardexPersonaSueldoPorHora persona){
		listaPersonaPorHora.remove(persona);
	}
	
	void agregarTarjetaDiariaALista (TarjetaDiaria tarjeta){
		listaDeTarjetas.add(tarjeta);
	}
	
	void quitarTarjetaDiariaDeLista (TarjetaDiaria tarjeta){
		listaDeTarjetas.remove(tarjeta);
	}
	
	void agregarReciboDeVentaALista(ReciboDeVenta recibo){
		listaDeRecibo.add(recibo);
	}
	
	void quitarReciboDeVentaDeLista(ReciboDeVenta recibo){
		listaDeRecibo.remove(recibo);
	}
	
	double pagarPorHoraA(String nombreCompletoTrabajador){
		double sueldo=0.0;
		double horas = 0.0;
		for(TarjetaDiaria tarjeta : listaDeTarjetas){
			if(nombreCompletoTrabajador==tarjeta.nombreCompleto){
				horas+=tarjeta.getHoras();
				System.out.println(horas);
			}
		}
		
		for(KardexPersonaSueldoPorHora persona : listaPersonaPorHora){
			if(nombreCompletoTrabajador == persona.devolverNombreCompleto()){
				sueldo=persona.calcularSalarioPorHorasTrabajadas(horas);
				
			}
		}
		return sueldo;
	}
	
	double pagarPorSueldoFijoYComision(String nombreCompletoTrabajador){
		double sueldo=0.0;
		double montoTotalVendido = 0.0;
		for(ReciboDeVenta recibo : listaDeRecibo){
			if(nombreCompletoTrabajador== recibo.nombreVendedor){
				montoTotalVendido += recibo.getMonto();
			}
		}
		
		for(KardexPersonaSueldoFijoConComision persona : listaPersonaSueldoFijoConComision){
			if(nombreCompletoTrabajador == persona.devolverNombreCompleto()){
				sueldo=persona.CalcularSueldo(montoTotalVendido);
				
			}
		}
		return sueldo;
		
	}
	

}
