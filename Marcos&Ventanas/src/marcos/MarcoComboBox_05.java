package marcos;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoComboBox_05 extends JFrame implements ItemListener{

	private JComboBox combo1;
	private JLabel label1;
	
	
	public MarcoComboBox_05() {
		
		combo1 = new JComboBox();
		combo1.setBackground(new Color(192, 192, 192));
		combo1.setBounds(20,20,100,30);
		getContentPane().add(combo1);
		combo1.addItem("-- Seleccionar --");
		combo1.addItem("Opcion 1");
		combo1.addItem("Opcion 2");
		combo1.addItem("Opcion 3");
		combo1.addItem("Opcion 4");
		
		combo1.addItemListener(this);
		
		label1 = new JLabel("Selecciona una Opción");
		label1.setBounds(20,70,200,30);
		getContentPane().add(label1);
		iniciarMarco();
	}

	public void iniciarMarco() {
		
		getContentPane().setLayout(null);
		setTitle("Marco con ComboBox");
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MarcoComboBox_05();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getSource()==combo1) {
			
			String itemSeleccionado = (String) combo1.getSelectedItem();
			// Clase String y sus metodos.
			//String arregloCadena[] = itemSeleccionado.split("");
			if(itemSeleccionado.equals("-- Seleccionar --")) {
				label1.setText("Por favor seleccione una opcion");
			}else
			 label1.setText("Ha seleccionado: "+itemSeleccionado);
			
			
		}
		
		
	}

}
