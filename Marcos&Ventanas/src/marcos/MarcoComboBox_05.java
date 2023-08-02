package marcos;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoComboBox_05 extends JFrame{

	private JComboBox combo1;
	private JLabel label1;
	
	
	public MarcoComboBox_05() {
		
		combo1 = new JComboBox();
		combo1.setBounds(20,20,100,30);
		add(combo1);
		
		combo1.addItem("Opcion 1");
		combo1.addItem("Opcion 2");
		combo1.addItem("Opcion 3");
		combo1.addItem("Opcion 4");
		
		label1 = new JLabel("Selecciona una Opción");
		label1.setBounds(20,70,150,30);
		add(label1);
		iniciarMarco();
	}

	public void iniciarMarco() {
		
		setLayout(null);
		setTitle("Marco con ComboBox");
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MarcoComboBox_05();
	}

}
