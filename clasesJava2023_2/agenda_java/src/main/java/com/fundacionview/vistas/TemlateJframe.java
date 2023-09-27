package com.fundacionview.vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TemlateJframe  extends JFrame{

	private JPanel PanePPal;
	private JPanel PanelFooter;
	private Component padre;
	
	
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
