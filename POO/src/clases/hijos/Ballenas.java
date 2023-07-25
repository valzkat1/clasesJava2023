package clases.hijos;

import clases.padre.Mamiferos;

public class Ballenas extends Mamiferos{

	protected int edad;
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ballenas() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ballenas [peso=" + peso + ", cuadrupedo=" + cuadrupedo + ", especie=" + especie + ", getPeso()="
				+ getPeso() + ", isCuadrupedo()=" + isCuadrupedo() + ", getEspecie()=" + getEspecie() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	

	
}
