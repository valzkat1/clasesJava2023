package com.fundacionview.modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.fundacionview.configuracion.ConexionBD;

// Patro diseño Repository
// ORM Hibernate.  
public class RepositorioContactos {

	private Connection conect;

	public RepositorioContactos() {	
		conect = ConexionBD.getConexion();		
	}
	
	public Collection<Contactos> getContactos(Categoria cat){
		
		Collection<Contactos> contactos = new ArrayList<>();
		
		try {
			Statement stm = this.conect.createStatement();
		
			String query = "SELECT * FROM Contactos ";
			switch (cat) {
			case FAMILIA:
				query += " WHERE categoria='Familiar' ";
				break;

			case AMIGOS:
				query += " WHERE categoria='Amigo' ";
				break;
			
			case COMPA:
				query += " WHERE categoria='Compañero' ";
				break;
				
			case OTROS:
				query += " WHERE categoria='Otros' ";
				break;
			case TODOS:
				query += "";
			}
			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				contactos.add(null)
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	private Contactos generarContacto(ResultSet rs) throws SQLException {
		
		int id = rs.getInt(1);
		String nombre = rs.getString(2);
		String apellido = rs.getString(3);
		String email = rs.getString(4);
		Date fechaNaci = rs.getDate(5);
		String direccion = rs.getString(6);
		String categoria = rs.getString(7);
		
		return new Contactos(id, nombre, apellido, email, fechaNaci, direccion);
		
	}
	
	
}
