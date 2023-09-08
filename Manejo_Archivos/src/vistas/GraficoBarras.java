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
		setBounds(100,100,600,450);
		panelPpal.setBorder(new EmptyBorder(5,5,5,5));
		panelPpal.setLayout(null);
		setContentPane(panelPpal);	
		
		JButton botonActualizar = new JButton("Actualizar");
		botonActualizar.setSize(100, 40);
		panelPpal.add(botonActualizar);
		botonActualizar.setLocation(470, 350);
		
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
		
		g.setColor(Color.gray);
		g.drawRoundRect(20, 40, 560, 300, 20, 20);
		
		g.drawLine(50, 300, 450, 300);
		
		g.setColor(Color.gray);
		g.drawRect(50, 50+valorCambio, 40, 250-valorCambio);
		g.setColor(Color.blue);
		g.fillRect(50, 50+valorCambio, 40, 250-valorCambio);
		g.fillRect(470, 150, 30, 15);
		g.drawString("Item 1", 510, 160);
		
		g.setColor(Color.gray);
		g.drawRect(140, 140, 40, 160);
		g.setColor(Color.red);
		g.fillRect(140, 140, 40, 160);
		g.fillRect(470, 170, 30, 15);
		g.drawString("Item 2", 510, 180);
		
		g.setColor(Color.gray);
		g.drawRect(230, 70, 40, 230);
		g.setColor(Color.orange);
		g.fillRect(230, 70, 40, 230);
		g.fillRect(470, 190, 30, 15);
		g.drawString("Item 3", 510, 200);
		
		g.setColor(Color.gray);
		g.drawRect(320, 170, 40, 130);
		g.setColor(Color.green);
		g.fillRect(320, 170, 40, 130);
		g.fillRect(470, 210, 30, 15);
		g.drawString("Item 4", 510, 220);
		
		
	}

}
