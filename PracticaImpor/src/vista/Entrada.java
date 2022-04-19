package vista;

import java.util.Scanner;

import modelo.Estacion;
import modelo.dao.EstacionDAO;

public class Entrada {
static Scanner scan= new Scanner(System.in);
	


public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

	}



public static void leerInsertado() {

	System.out.println("Dime el tipo de estacion ");
	EstacionDAO.insertarEstacion(scan.next());
}

}
