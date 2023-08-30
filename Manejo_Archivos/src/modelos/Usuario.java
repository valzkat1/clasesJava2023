package modelos;

public class Usuario {

	// Java Anotation -- @Override
	private int id;
	private String nombre;
	private String apellido;
	private String cargo;
	
	// Domine drive dessing (Arquitectura por capas y hexagonal)
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public Usuario() {
		// TODO Auto-generated constructor stub
	}




	public Usuario(int id, String nombre, String apellido, String cargo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
	}

	

	public String lineaArchivo() {
		return "\r\n"+getNombre()+","+getApellido()+","+getCargo()+","+getId();
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + "]";
	}
	
	

}
