package clases;

import java.util.ArrayList;

import clases.hijos.Ballenas;
import clases.hijos.Orcas;
import clases.implementaciones.MovilAndroid;
import clases.implementaciones.MovilIOS;
import clases.interfaces.ReproductorFM;

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
	/*
		Ballenas balle=new Ballenas();
		
		Ballenas cacha=new Ballenas(20, "Grandes ballenas");
	
		System.out.println(balle.toString());
		System.out.println(cacha.toString());
		
		Orcas orc = new Orcas();
		System.out.println(orc.toString());
		
		orc.setEdad(10);
		*/

		// Clases abstractas
		// Clases internas
		// Final
		// Clases enum.
		
		ReproductorFM movAnd = new MovilAndroid("Xiaomi");
		ReproductorFM movIos = new MovilIOS(12);
		
		movAnd.CambiarVolumen(0, 10);
		movIos.CambiarVolumen(10, 5);
		
		movAnd.encender();
		movIos.encender();
			
		
		ClaseExterna objExterno = new ClaseExterna();
		ClaseExterna.ClaseInterna objInterno = objExterno.new ClaseInterna();
		
		
		
	}

}
