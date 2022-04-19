package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnlaceJDBC {

private Connection connection;
	
	public EnlaceJDBC()  throws SQLException{
		
	}
	
	public boolean insert(String sql) throws SQLException{
		
		connection= Conexion.getInstanceConexion(); //llamo a la clase que tiene el metodo de conectar
		
		Statement statement= connection.createStatement();//aqui estara guardada para ejecutar la sentencia sql
		
		
		boolean rowInserted = statement.executeUpdate(sql) >0;//si ha ido bien me devolvera algo mayor a cero si no me devolvera 0 
		
		statement.close();//si ejecuta bien cerrar y desconectara la sentencia
		Conexion.desconectar();
		
		
		return  rowInserted;
	}

	public ResultSet seleccionRegistros(String consultaSql) {
		
		Statement sentencia = null;
		ResultSet filas= null;
		
		try {
			connection= Conexion.getInstanceConexion();
			sentencia= connection.createStatement(); //aqui se guardara la sentencia sql
			
		   filas= sentencia.executeQuery(consultaSql); //y esta sera la consulta
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return filas;

	}


}
