package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.ConexionBD;
import modelos.Usuario;

public class Persistencia {

	Connection con;
	
	public Persistencia() {
	
		con = ConexionBD.getConexion();
	}
	
	
	public void initDB() {
		PreparedStatement pst=null;
		String query= "CREATE TABLE IF NOT EXISTS Usuarios ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "nombre varchar(255), "
				+ "apellido varchar(255), "
				+ "edad INTEGER, "
				+ "genero char,"
				+ "EPS varchar(255))";
		try {
			 pst = con.prepareStatement(query);
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void crearUsuario(Usuario u) throws SQLException {
		
		String queryCreate= "INSERT INTO Usuarios VALUES (null,?,?,?,?,?)";
		PreparedStatement pst= con.prepareStatement(queryCreate);
		pst.setString(1,u.getNombre());
		pst.setString(2, u.getApellido());
		pst.setInt(3, u.getEdad());
		pst.setString(4, u.getGenero());
		pst.setString(5, u.getEPS());
		
		pst.execute();
		
	}
	
	public void updateUsuario(Usuario u) throws SQLException {
		
		String queryCreate= "UPDATE Usuarios set nombre=?, apellido=?, edad=?, genero=?, EPS=?";
		PreparedStatement pst= con.prepareStatement(queryCreate);
		pst.setString(1,u.getNombre());
		pst.setString(2, u.getApellido());
		pst.setInt(3, u.getEdad());
		pst.setString(4, u.getGenero());
		pst.setString(5, u.getEPS());
		
		pst.execute();
		
	}
	
	
	public static void main(String [] args) {
		
		Usuario u= new Usuario(2, "Pepe", "PapoEditado", 10, "M", "SURA");
		try {
			new Persistencia().updateUsuario(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	

}
