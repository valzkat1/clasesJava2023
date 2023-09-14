package modelos;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String EPS;
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEPS() {
		return EPS;
	}

	public void setEPS(String ePS) {
		EPS = ePS;
	}

	public Usuario() {
		
	}

	public Usuario(int id, String nombre, String apellido, int edad, String genero, String ePS) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		EPS = ePS;
	}

	
	
}
