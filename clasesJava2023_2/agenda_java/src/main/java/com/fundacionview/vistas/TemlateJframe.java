package com.fundacionview.vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TemlateJframe  extends JFrame{

	private JPanel PanePPal;
	private JPanel PanelFooter;
	private Component padre;
	protected final static String RUTA_RECURSOS = "/com/fundacionview/rosources/";
	
	
	public TemlateJframe(String titulo,Component parent) {
		super(titulo);
		this.PanePPal = new JPanel();
		this.padre= parent;
		this.PanelFooter = new PanelPie();
	}
	
	
	public void Cargar() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(300, 200, 300, 200);
		this.setVisible(true);
		
		super.getContentPane().setLayout(new BorderLayout());
		super.getContentPane().add(PanePPal,BorderLayout.CENTER);
		super.getContentPane().add(PanelFooter,BorderLayout.PAGE_END);
		
		this.PanePPal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
	}
	
	
	protected void cargarIcono(JLabel label,String nombreIcono) {
		label.setIcon(new ImageIcon(getUrlImagen(nombreIcono)));
		
	}
	
	protected void cargarIcono(AbstractButton boton,String nombreIcono) {
		boton.setIcon(new ImageIcon(getUrlImagen(nombreIcono)));
		
	}
	
	private URL getUrlImagen(String nombreIcono) {

		URL uri = getClass().getResource(RUTA_RECURSOS+""+nombreIcono);
		if(uri  == null) {
			System.out.println("Uri inexistente.*********");
			throw new RuntimeException("Error con recursos para imagenes");
		}
		
		return uri;
	}


	public class PanelPie extends JPanel{
		
		private JLabel lebelAutor;
		private JLabel labelVinculo;
		
		
		public PanelPie() {
			lebelAutor = new JLabel("Victor Ramirez");
			labelVinculo = new JLabel("https://github.com/valzkat1/clasesJava2023");
			
			this.setLayout(new BorderLayout());
			this.add(lebelAutor,BorderLayout.WEST);
			this.add(labelVinculo,BorderLayout.EAST);
		}
		
		public void ajustarComponentes() {
			for(Component cmp: this.getComponents()) {
				JLabel jl= (JLabel) cmp;
				jl.setAlignmentX(Component.CENTER_ALIGNMENT);
				jl.setAlignmentY(CENTER_ALIGNMENT);
				jl.setFont(new Font("lato",0,18));
			}
		}
		
		
	}
	
	
}
