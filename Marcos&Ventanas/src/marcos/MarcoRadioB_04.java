package marcos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MarcoRadioB_04 extends JFrame{

	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup grupoBotones;
	
	public MarcoRadioB_04() {
		
		grupoBotones = new ButtonGroup();
		
		radio1 = new JRadioButton("Animal");
		radio1.setBounds(10,20,200,30);
		add(radio1);
		grupoBotones.add(radio1);
		
		radio2 = new JRadioButton("Vegetal");
		radio2.setBounds(10,60,200,30);
		add(radio2);
		grupoBotones.add(radio2);
		
		radio3 = new JRadioButton("Mineral");
		radio3.setBounds(10,100,200,30);
		add(radio3);
		grupoBotones.add(radio3);
		
		iniciarMarco();
		
	}
	
	public void iniciarMarco() {
		
		setLayout(null);
		setTitle("Marco con CheckBox");
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new MarcoRadioB_04();
	}
	
	
}
