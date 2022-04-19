package control;

import modelo.dao.EstacionDAO;
import vista.Entrada;
import vista.Salida;

public class Principal {

	public static void main(String[] args) {

		
	//	Salida.mostrarListaProvincia(EstacionDAO.mostrarEstacion());
		
		System.out.println("-----lista Ordena-----");
		Salida.mostrarFechaOrdenada(EstacionDAO.mostrarEstacion());
	
	System.out.println();
	System.out.println("------------- MAP------------");
	
	//Salida.mostrarListaMap(EstacionDAO.mostrarCantidad());
	
	System.out.println("---------------Insertar----------------");
	
//	Entrada.leerInsertado();
	
	}
	

}
