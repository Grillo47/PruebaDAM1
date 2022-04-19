package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Estacion;
import modelo.TipoEstacion;

public class EstacionDAO {

	public static List<Estacion> mostrarEstacion(){
	
		
		List<Estacion> listaEstaciones = new ArrayList<Estacion>();
		
		ResultSet resultado=null;
		try {
			EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sql="SELECT estacion.nombre_estacion , tipo_estacion.nombre_tipo , estacion.fecha from estacion , tipo_estacion where estacion.tipo_estacion_id= tipo_estacion.id_estacion; ";
		
		resultado=enlace.seleccionRegistros(sql);
		
		while(resultado.next()) {
			
			listaEstaciones.add(new Estacion(
					resultado.getString(1) , 
					LocalDate.parse(resultado.getString(3)), 
					new TipoEstacion(1, resultado.getString(2))));
			
		}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listaEstaciones;
		
	}
	
	public static Map<String, Integer> mostrarCantidad(){
		ResultSet resultado=null;
		
		Map<String ,Integer> estacionesMap = new HashMap<String ,Integer>();
		
	try {
		EnlaceJDBC enlace= new EnlaceJDBC();
	
	String sql="SELECT `id_estacion`, `nombre_estacion`,COUNT( `tipo_estacion_id`) FROM `estacion` GROUP BY `id_estacion`, `nombre_estacion`";
	
	resultado= enlace.seleccionRegistros(sql);
	
	while(resultado.next()) {
		
		estacionesMap.put(resultado.getString(2), resultado.getInt(3));
		
		
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return estacionesMap;
		
		
	}
	
	public static void insertarEstacion(String tipoEstacionNombre) {
		
		try {
			EnlaceJDBC enlace= new EnlaceJDBC();
			
			
			String insertar="INSERT INTO `estacion`( `nombre_estacion`, `fecha`, `tipo_estacion_id`) VALUES ('Nueva Estacion' , '9999-12-31 23:59:59', (SELECT id_estacion FROM `tipo_estacion` WHERE nombre_tipo='"+tipoEstacionNombre+"'));";

			if(enlace.insert(insertar)) {
				System.out.println("la insercion " +tipoEstacionNombre+" se ha insertado correctamente");	
			}
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	}
