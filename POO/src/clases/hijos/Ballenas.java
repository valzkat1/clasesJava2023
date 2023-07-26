package clases.hijos;

import clases.padre.Mamiferos;

public class Ballenas extends Mamiferos{

	// Encapsulamiento.
	protected int edad;
	//Solo permiten acceso directo a la misma clase y las hijas
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ballenas() {
		
	}
	
	public Ballenas(int edad_) {
		this.edad=edad_;
	}
	
	public Ballenas(String especie_) {
		this.especie =especie_;
	}
	
	public Ballenas(int edad_,String especie_) {
		this.edad=edad_;
		this.especie=especie_;
	}
	
	@Override
	public String toString() {
		return "Ballenas [peso=" + peso + ", cuadrupedo=" + cuadrupedo + ", especie=" + especie + ", getPeso()="
				+ getPeso() + ", isCuadrupedo()=" + isCuadrupedo() + ", getEspecie()=" + getEspecie() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	

	
}
