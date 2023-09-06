package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grafico1 extends JFrame{

	private JPanel panelPpal;
	
	
	public Grafico1() {
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
				Grafico1 graf=new Grafico1();
				graf.setVisible(true);
			}
		});
		
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.blue);
		g.drawLine(10, 50, 100, 50);
		
		g.drawRect(130, 50, 80, 50);
		
		g.drawOval(240, 50, 60, 50);	
		
		int[] ptsX = {400,450,350};
		int[] ptsY = {70,120,120};
		g.setColor(Color.red);
		g.drawPolygon(ptsX, ptsY, 3);
		
		g.drawRoundRect(30, 120, 80, 50, 35, 35);
		
		
	}
	
}
