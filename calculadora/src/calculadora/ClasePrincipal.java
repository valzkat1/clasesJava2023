package calculadora;

import javax.swing.JOptionPane;

public class ClasePrincipal {

	
	// sobrecarga del contructor 
	// Polimorfismo.
 
	
	public String menu() {
		return JOptionPane.showInputDialog("Seleccione la operacion a realizar:"+
											"\r\n1) Sumar"+
											"\r\n2) Restar "+
											"\r\n3) Multiplicar "+
											"\r\n4) Dividir "+
											"\r\n5) Salir ");
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
	
	
	
}
