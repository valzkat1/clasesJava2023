package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GraficoBarras extends JFrame{
	private JPanel panelPpal;
	
	int valorCambio = 50;
	
	
	public GraficoBarras() {
		panelPpal = new JPanel();
		setBounds(100,100,600,300);
		panelPpal.setBorder(new EmptyBorder(5,5,5,5));
		panelPpal.setLayout(null);
		setContentPane(panelPpal);	
		
		JButton botonActualizar = new JButton("Actualizar");
		botonActualizar.setSize(100, 50);
		panelPpal.add(botonActualizar);
		
		botonActualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valorCambio=10;
				repaint();
				
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				GraficoBarras graf=new GraficoBarras();
				graf.setVisible(true);
			}
		});
		
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.blue);
		g.drawRect(50, 50+valorCambio, 40, 250-valorCambio);
		
		g.setColor(Color.red);
		g.drawRect(140, 140, 40, 160);
		
		g.setColor(Color.orange);
		g.drawRect(230, 70, 40, 230);
		
		g.setColor(Color.green);
		g.drawRect(320, 170, 40, 130);
		
	}

}
