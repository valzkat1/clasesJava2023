package marcos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Marco_Boton_02 extends JFrame{

	private JButton boton;
	
	public Marco_Boton_02() {
		//Boton y sus atributos 
		boton=new JButton("Boton 1");
		boton.setBounds(10, 10, 150, 50);		
		add(boton);
		
		//Atributos del marco. 
		setLayout(null);
		setTitle("Ejemplo Boton");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	public static void main(String args[] ) {
		new Marco_Boton_02();
	}
}
