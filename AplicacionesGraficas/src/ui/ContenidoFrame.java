package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContenidoFrame extends JPanel{

	private JLabel contadorLbl;
	private int cantidad;
	private JTextField txtCampoNombre;
	
	
	public ContenidoFrame() {
		cantidad=0;
		setLayout(new BorderLayout());
		
		// Intanciamos el panel ppal para el frame.
		JPanel principal=new JPanel();
		//asignamos atributos al panel
		Color fondo = new Color(169, 169, 169);
		principal.setBackground(fondo);
		contadorLbl = new JLabel("Contador: "+cantidad);
		//Boton para incrementar el contador (event)
		JButton boton = new JButton(" +1 ");
		boton.addActionListener(new ListenerBoton());
		
		//Definir tamaño y posicion para elementos del panel
		int widthPanel = 300;
		int widthLabel = 150;
		int widthButton = 100;
		int widthJText = 150;
		
		int margenesLabel= (widthPanel - widthLabel)/2;
		principal.setPreferredSize(new Dimension(widthPanel,400));
		contadorLbl.setBounds(margenesLabel,20,widthLabel,80);
		
		int margenesBoton= (widthPanel - widthButton)/2;
		boton.setBounds(margenesBoton,100,widthButton,80);
		
		principal.add(contadorLbl);
		principal.add(boton);
		
		int margenesJText = (widthPanel - widthJText)/2;
		txtCampoNombre = new JTextField();
		txtCampoNombre.setBounds(widthJText, 110, widthJText, 80);
		principal.add(txtCampoNombre);

		add(principal,BorderLayout.CENTER);
		
	}
	
	private class ListenerBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Incrementamos la cantidad en una unidad
			cantidad+=1;
			contadorLbl.setText("Contador: "+cantidad);
		}
		
	}
	
	
}
