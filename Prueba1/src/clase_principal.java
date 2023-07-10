import java.math.MathContext;

import org.w3c.dom.Text;

public class clase_principal {

	 //Scope variables
	 
	// Ambito (scope) Global
	Integer num1; 

	static String cadena1;
	
	Boolean logico;
	
	int num2;
	double num3;	
	boolean logico2;
	
	static segundaclase objtoClasedos;
	
	
	
	
	 
	 
	public static void main(String[] args) {
		
		cadena1 = new String();
		objtoClasedos = new segundaclase();
		
		String retorno=objtoClasedos.responderCadena();
		

		objtoClasedos.mostrarDesdeSegundaClase("Lo que deseamos mostrar");
		
		
		// variable local
		Integer num1; 
		metodo1();
		
		// Llamado a metodo static
		Math.abs(0);
		
		// Llamado con instacia de objeto.
		//Math objMate=new Math();
		//objeMate.abs();
		
	}
	
	// Metodos void no retornan informacion.
	public static void metodo1() {
		
		System.out.print("Hola mundo metodos java");
	}

}
