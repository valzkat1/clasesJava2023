package promedios;

// Modificadores (Public, private, protected) Niveles de acceso


// Programacion Orientada a Objetos POO
public class operativas {

	public String _nombre;
	public int edad;
	public double promedio;
	
	// constructor de la clase (por defecto)
	public operativas() {
		
	}
	
	//Polimorfismo en java (del constructor)
	public operativas(String nombre) {
		this._nombre=nombre;
	}
	
	
	public String getNombre() {
		
		return _nombre;
		
	}
	
	public void setNombre(String nom) {
		this._nombre=nom;
	}
	
	
	public int convertirEntero(String cadena) {
		int retorno;
		try {
			retorno=Integer.parseInt(cadena);
		}catch (Exception e) {
			retorno = 0;
		}
		return retorno;
	}
	
	
	public double convertirReal(String cadena) {
		double retorno;
		try {
			retorno=Double.parseDouble(cadena);
		}catch (Exception e) {
			retorno = -1;
		}
		return retorno;
	}
	
}
