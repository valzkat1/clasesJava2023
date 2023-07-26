package clases;

import clases.hijos.Ballenas;
import clases.hijos.Orcas;

public class Ejecutable {

	// Herencia Simple.
	// Herencia Multiple
	// Abstraccion.
	// Clases
	// Atributos
	// Metodos o Funciones
	// UML 
	// Objetos  - Instancias
	// Interfaces 
	
	
	public static void main(String[] args) {
	
		Ballenas balle=new Ballenas();
		
		Ballenas cacha=new Ballenas(20, "Grandes ballenas");
		
		
		System.out.println(balle.toString());
		System.out.println(cacha.toString());
		
		Orcas orc = new Orcas();
		System.out.println(orc.toString());
		
		orc.setEdad(10);

	}

}
