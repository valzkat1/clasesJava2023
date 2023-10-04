package com.fundacionview.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	private final String TABLE_NAME = "Contactos";
	
	

	public RepositorioContactos() {	
		conect = ConexionBD.getConexion();		
	}
	
	public Collection<Contactos> getContactos(Categoria cat){
		
		Collection<Contactos> contactos = new ArrayList<>();
		
		try {
			Statement stm = this.conect.createStatement();
		
			String query = "SELECT * FROM "+TABLE_NAME+" ";
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
				contactos.add(generarContacto(rs));
			}
			
			return contactos;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactos;	

	}
	
	// Vulnerable a SqlInjectios.
	public Contactos getByID(int id) throws SQLException {
		
		String query = "SELECT *FROM "+TABLE_NAME+" WHERE id="+id;
		
		Statement stm = this.conect.createStatement();
		ResultSet rs = stm.executeQuery(query);
		rs.next();
		Contactos c= generarContacto(rs);
		
		return c;
	}
	
	
	public void insertContacto(Contactos co) throws SQLException {
		
		String query = "INSERT INTO "+TABLE_NAME+" values (null, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = this.conect.prepareStatement(query);
		CompletarStatement(co, ps);
		
		ps.executeUpdate();
		
	}
	
	
	public void actualizarContacto(Contactos co) throws SQLException {
		
		String query = "UPDATE "+TABLE_NAME+" set nombre=?, apellidos=?, email=?, fechaNacimiento=?,direccion=?, categoria=? "+
					   " WHERE id='"+co.getId()+"' ";
		
		PreparedStatement ps = this.conect.prepareStatement(query);
		CompletarStatement(co, ps);
		ps.executeUpdate();
		
		
	}
	
	
	public void borrarContacto(int id) throws SQLException {
		
		String queryDelete = "DELETE FROM "+TABLE_NAME+" WHERE id="+id;
		
		Statement stm = this.conect.createStatement();
		
		stm.executeUpdate(queryDelete);
	}
	
	
	public void eliminarTodos() throws SQLException {
		String queryDelete = "DELETE FROM "+TABLE_NAME+" ";		
		Statement stm = this.conect.createStatement();		
		stm.executeUpdate(queryDelete);
	}
	
	
	private void CompletarStatement(Contactos co, PreparedStatement ps ) throws SQLException {
		ps.setString(2, co.getNombre());
		ps.setString(3, co.getApellidos());
		ps.setString(4, co.getEmail());
		ps.setDate(5, (java.sql.Date) co.getFechaNacimiento());
		ps.setString(6, co.getDireccion());
		ps.setString(7, co.getCategoria());
		
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
