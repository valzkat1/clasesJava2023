package ui;

import javax.swing.*;


public class FrameLocal {

	public FrameLocal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		JFrame contadorFrame= new JFrame("Titulo del Marco");

		contadorFrame.getContentPane().add(new ContenidoFrame());
		
		contadorFrame.pack();
		
		contadorFrame.setVisible(true);
		
	}

}
