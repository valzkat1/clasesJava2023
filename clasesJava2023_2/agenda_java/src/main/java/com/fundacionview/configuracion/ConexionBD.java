package com.fundacionview.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// Patron Facade
public class ConexionBD {

	private static Connection con;
	
	public ConexionBD() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConexion(String driver,String url,String user,String pass) {
		if(con==null) {
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,user,pass);
				System.out.println("Conectado a la base de datos.");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("Error en la clase no encontrada  "+e);
			} catch (SQLException e) {		
				System.out.println("Error en la conexion  "+e);
				e.printStackTrace();
			}
			
		}
		
		return con;
	} 
	
	
	public static Connection getConexion() {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.fundacionview.rosources.bd-params");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pass = rb.getString("pass");
		
		return getConexion(driver, url, user, pass);
		
	}
	

	public static void main(String [] args) {
		getConexion();
	}
	
}
