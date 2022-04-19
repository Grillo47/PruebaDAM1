package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection jdbcConnection=null;
	private static final String URL= "jdbc:mysql://localhost:3306/practia_examen";
	private static final String USER="root";
	private static final String PWD="";
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";


public Conexion() throws  SQLException{
	
	
	if(jdbcConnection==null|| jdbcConnection.isClosed()) {
		
		try {
			
			Class.forName(DRIVER);
			
			jdbcConnection=DriverManager.getConnection(URL, USER, PWD);
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}


public static Connection getInstanceConexion() throws SQLException{
	
	if(jdbcConnection==null || jdbcConnection.isClosed()) {
		
	new Conexion();
		
	}
	
	return jdbcConnection;
	
}


public static void desconectar() throws SQLException{
	
	if(jdbcConnection !=null &&  !jdbcConnection.isClosed()) {
		
		
		jdbcConnection.isClosed();
	
	
	}
	
}
}
