package vista;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import modelo.Estacion;

public class Salida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void mostrarListaProvincia(List<Estacion> mostrarEstacion) {
		
		for(Estacion estacion : mostrarEstacion) {
			
			System.out.printf("|%-30s |%-30s |%-30s  %n \"" , estacion.getNombre_estacion() , estacion.getTipoEstacion() , estacion.getFecha());
//		System.out.println("fecha etc " + estacion.getNombre_estacion() + estacion.getTipoEstacion() + estacion.getFecha());
		
		
		
		}
		
	}

	
	public static void mostrarFechaOrdenada(List<Estacion> fechaOrdena) {
		
		fechaOrdena.sort(null);
		
		for(Estacion estacion : fechaOrdena) {
			
			System.out.printf("|%-30s |%-30s |%-30s  %n \"" , estacion.getNombre_estacion() , estacion.getTipoEstacion() , estacion.getFecha());
		//System.out.println("fecha etc " + estacion.getNombre_estacion() + estacion.getTipoEstacion() + estacion.getFecha());
		
		
		
		}
		
		
		
	}
	
	public static void mostrarListaMap(Map<String, Integer> estacionesMap) {
		
		Iterator<String> iterador= estacionesMap.keySet().iterator(); //aqui llama a la key String
		
		while(iterador.hasNext()) {
			//System.out.println("Nombre Estacion: " + iterador.next());
			System.out.println(" numero de estaciones: " + estacionesMap.get(iterador.next())); //para mostrar primero sera el map y luego hacer un next
		}
		
	}
}
