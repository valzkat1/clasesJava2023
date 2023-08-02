package marcos;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoCheckBox_03 extends JFrame implements ChangeListener{

	private JCheckBox check1,check2,check3;
	private JLabel label1;
	
	public MarcoCheckBox_03() {
		
		check1 = new JCheckBox("Java");
		check1.setBounds(10, 10, 150, 30);	
		check1.addChangeListener(this);
		add(check1);
		
		check2 = new JCheckBox("Python");
		check2.setBounds(10, 50, 150, 30);	
		check2.addChangeListener(this);
		add(check2);
		
		check3 = new JCheckBox("Javascript");
		check3.setBounds(10, 90, 150, 30);	
		check3.addChangeListener(this);
		add(check3);
		
		label1 = new JLabel("Lenguajes de programación");
		label1.setBounds(10, 130, 250, 30);
		add(label1);
		
		iniciarMarco();
	}
	
	public void iniciarMarco() {
		
		setLayout(null);
		setTitle("Marco con CheckBox");
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new MarcoCheckBox_03();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		String texto = "Lenguajes: ";
		
		if(check1.isSelected()) {
			texto = texto +" Java,";
		}
		
		if(check2.isSelected()) {
			texto = texto + " Python,";
		}
		
		if(check3.isSelected()) {
			texto = texto + " Javascript";
		}
		label1.setText(texto);
		
	}
	
	
	
}
