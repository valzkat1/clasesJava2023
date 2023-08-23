package marcos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.regex.Pattern;

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
	String operacionTxt = "";
	FlowLayout layoutFlow;
	GridLayout layoutGrid;
	int alto = 50;
	int ancho = 50;
	
	final String operaciones[]=new String[] {"/","x","-","+"};
	final String txtlistaBoton[]=new String[] {"7","8","9","/",
			  "4","5","6","x",
			  "1","2","3","-",
			  "C","0",".","+"};
	
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
		btnResultado.addActionListener(this);
		add(btnResultado);
	}
	
	
	public void initDisplay() {
		display = new JTextField("0");
		display.setPreferredSize(new Dimension(230,60));
		display.setBackground(Color.black);
		display.setFont(new Font(Font.MONOSPACED,0,18));
		display.setForeground(Color.green);
		display.setBorder(new LineBorder(Color.gray));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);
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
		
		
		listBtn = new JButton[16];
		
		for(int i=0;i<16;i++) {
			
			listBtn[i]= new JButton(txtlistaBoton[i]);			
			listBtn[i].setPreferredSize(new Dimension(ancho,alto));
			listBtn[i].setBackground(Color.DARK_GRAY);
			listBtn[i].setOpaque(true);
			listBtn[i].setFont(new Font(Font.MONOSPACED,0,16));
			listBtn[i].setForeground(Color.white);
			panelTeclas.add(listBtn[i]);
			listBtn[i].addActionListener(this);
		}
		
		//listBtn[12].addActionListener(this);
		
	}
	
	

	 public void iniciarMarco() {			
		    layoutFlow = new FlowLayout(FlowLayout.CENTER,10,10);
		    
		    setLayout(layoutFlow);
			setTitle("Calculadora");
			setMinimumSize(new Dimension(255,420));
			setResizable(false);
			getContentPane().setBackground(Color.black);
			setLocation(450, 250);
			setVisible(true);			
		}

	 
	 public String UpdateDisplay(String datoPos) {
		 String resultado="";
		 if(display.getText().equals("0")) {
				resultado=datoPos;
				}else {
					resultado=display.getText()+datoPos;
				}
		 
		 return resultado;
	 }
	 //  "cadena a testear"
	 
	 public String UpdateDisplayCalculos(String ope) {
		 String resultado="";
		 boolean encontrado=true;
		 
		 String displa = display.getText();
		
		 encontrado = isCalculo();
		 if(encontrado) {
		
			 resultado= calcular(display.getText(),operacionTxt,ope);
			 
			
			
		 }else {
			resultado=display.getText()+ope;
					 
		 }
		 
		 
		 
		 
		 
		 return resultado;
	 }
	 
	 public boolean isCalculo() {
		 boolean encontrado=false;
		 for(String op: operaciones ) {
			 // Determinar el comportamiento cuando el display solo contiene 
			 // la operacion especifica.
			 // 
			 if(display.getText().indexOf(op)==-1) {
				 encontrado=false;
			 }else {
				 encontrado=true;
				 operacionTxt=op;
				 break;
			 }	 
		}
		 return encontrado;
	 }
	 
	 public String calcular(String displa,String operacionTxt,String ope) {
		 String numeros[] = displa.split(Pattern.quote(operacionTxt));
		 double n1,n2,total=0;
		 String resultado="";
		 if(numeros.length>1) {
			 try {				
				 n1 = Double.parseDouble(numeros[0]);
				 n2 = Double.parseDouble(numeros[1]);
			 }catch(NumberFormatException ne) {
				n1=0;
				n2=0;
			 }
		 
			 switch (operacionTxt) {
			  case "/":
				  total=n1/n2; 
			   break;
			  case "x": 
				  total=n1*n2; 
				break; 
			  case "-": 
				  total=n1-n2; 
				break;
			  case "+": 
				  total=n1+n2; 
				break; 	
			 }
		 
			 resultado= total+""+ope;
		 }else {
			resultado = display.getText();
		 }
		 return resultado;
	 }
	 
	// API  
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnResultado) {
			
			if(isCalculo()) {
				String total=calcular(display.getText(), operacionTxt, operacionTxt);
				display.setText(total);	
			}else {
				
			}
			
		}else {
		
		for(int i=0; i<listBtn.length; i++) {
			
			if(e.getSource()==listBtn[i]) {
				if(i==3|i==7|i==11|i==15) {
					display.setText(UpdateDisplayCalculos(txtlistaBoton[i]));
				}else if(i==12) {
					 display.setText("0");
				}else if(i==13) {
					if(display.getText().equals("0")) {
					 display.setText("0");
					}else {
						display.setText(display.getText()+"0");
					}
				}else {				
				     display.setText(UpdateDisplay(txtlistaBoton[i]));
				}
			}			
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Marco_Calculadora_07();

	}
	
}
