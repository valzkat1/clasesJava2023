package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GraficoBarras extends JFrame{
	private JPanel panelPpal;
	
	
	public GraficoBarras() {
		panelPpal = new JPanel();
		setBounds(100,100,600,300);
		panelPpal.setBorder(new EmptyBorder(5,5,5,5));
		panelPpal.setLayout(null);
		setContentPane(panelPpal);		
		
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
		g.drawRect(50, 100, 40, 200);
		
		g.setColor(Color.red);
		g.drawRect(140, 140, 40, 160);
		
	}

}
