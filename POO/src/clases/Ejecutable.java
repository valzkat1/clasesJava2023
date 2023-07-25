package clases;

import clases.hijos.Ballenas;
import clases.hijos.Orcas;

public class Ejecutable {


	public static void main(String[] args) {
	
		Ballenas ball=new Ballenas();
		
		System.out.println(ball.toString());
		
		Orcas orc = new Orcas();
		System.out.println(orc.toString());

	}

}
