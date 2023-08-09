package marcos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Marco_Calculadora_07 extends JFrame implements ActionListener{

	JButton listBtn[], btnResultado;
	JTextField display;
	JPanel panelTeclas;
	
	FlowLayout layoutFlow;
	GridLayout layoutGrid;
	int alto = 50;
	int ancho = 50;
	
	public Marco_Calculadora_07() {
		initDisplay();
		initBotones();
		iniciarMarco();
		initResultado();
		
	}
	
	public void initResultado() {
		btnResultado = new JButton(" = ");
		btnResultado.setFont(new Font(Font.MONOSPACED,0,18));
		btnResultado.setPreferredSize(new Dimension(230,alto));
		btnResultado.setBackground(Color.BLUE);
		btnResultado.setForeground(Color.white);
		btnResultado.setOpaque(true);
		btnResultado.setBorder(new LineBorder(Color.gray));
		add(btnResultado);
	}
	
	
	public void initDisplay() {
		display = new JTextField("0");
		display.setPreferredSize(new Dimension(230,60));
		display.setBackground(Color.black);
		display.setFont(new Font(Font.MONOSPACED,0,24));
		display.setForeground(Color.green);
		display.setBorder(new LineBorder(Color.gray));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		add(display);
	}
	
	public void initBotones() {
		panelTeclas = new JPanel();
		panelTeclas.setBackground(Color.black);
		
		//Inicializamos grid layout con 4 col, 4 filas y 10px entre elemento 
		//vertical y horizontalmente.
		layoutGrid = new GridLayout(4, 4, 10, 10);
		// Asignamos el layout al panel
		panelTeclas.setLayout(layoutGrid);
		// Asignamos el panel al Jframe.
		add(panelTeclas);
		
		String txtlistaBoton[]=new String[] {"7","8","9","/",
										  "4","5","6","*",
										  "1","2","3","-",
										  "C","0",",","+"};
		listBtn = new JButton[16];
		
		for(int i=0;i<16;i++) {
			
			listBtn[i]= new JButton(txtlistaBoton[i]);			
			listBtn[i].setPreferredSize(new Dimension(ancho,alto));
			listBtn[i].setBackground(Color.DARK_GRAY);
			listBtn[i].setOpaque(true);
			listBtn[i].setFont(new Font(Font.MONOSPACED,0,16));
			listBtn[i].setForeground(Color.white);
			panelTeclas.add(listBtn[i]);
		}
		
		listBtn[12].addActionListener(this);
		
	}
	
	

	public static void main(String[] args) {
		
		new Marco_Calculadora_07();

	}

	 public void iniciarMarco() {
			
		    layoutFlow = new FlowLayout(FlowLayout.CENTER,10,10);
		    
		    setLayout(layoutFlow);
			setTitle("Calculadora");
			setMinimumSize(new Dimension(255,420));
			setResizable(false);
			getContentPane().setBackground(Color.black);
			setVisible(true);
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		display.setText("0");
		// TODO Auto-generated method stub
		
	}
	
	
}
