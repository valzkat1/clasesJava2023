package calculadora;

import javax.swing.JOptionPane;

public class ClasePrincipal {

	public ClasePrincipal() {
		
	}
	public ClasePrincipal(String nombre) {
		
	}
	
	// sobrecarga del contructor 
	// Polimorfismo.
    public ClasePrincipal(int nombre) {
		
	}
	
	public String menu() {
		return JOptionPane.showInputDialog("");
	}
	
	
	
}
