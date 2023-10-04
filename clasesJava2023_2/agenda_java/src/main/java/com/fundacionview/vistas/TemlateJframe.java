package com.fundacionview.vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TemlateJframe  extends JFrame{

	private JPanel PanePPal;
	private JPanel PanelFooter;
	private Component padre;
	protected final static String PATH_RECURSOS = "/com/fundacionview/rosources/";

	
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
	
	 protected void cargarIcono(JLabel label, String nameIcon) {
        label.setIcon(new ImageIcon(getURL(PATH_RECURSOS + nameIcon)));
    }

    protected void cargarIcono(AbstractButton btn, String nameIcon) {
        btn.setIcon(new ImageIcon(getURL(PATH_RECURSOS + nameIcon)));
    }

	private URL getURL(String ruta) {
        URL u = getClass().getResource(ruta);
        if (u == null) {
            throw new RuntimeException("No se pudo cargar recurso " + ruta);
        }
        return u;
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
	  public void mostrarCartelDeError(String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarCartelDeInfo(String mensaje) {
        JOptionPane.showMessageDialog(padre, mensaje, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
	
}
