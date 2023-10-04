package com.fundacionview.vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fundacionview.modelos.Categoria;
import com.fundacionview.modelos.Contactos;

public class FormularioJframe extends TemlateJframe{

	private JLabel labelNombre,labelApellido,labelEmail,labelDir,labelFecha;
	
	private JTextField txtNombre,txtApellido,txtEmail,txtDir,txtFecha;
	
	private JPanel panelDatos;
	
	private JButton botonGuardar;
	
	public FormularioJframe(String titulo, Component parent) {
		super(titulo, parent);
		
		labelNombre = new JLabel();
		labelApellido = new JLabel();
		labelDir = new JLabel();
		labelEmail = new JLabel();
		labelFecha = new JLabel();
		
		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(5,1));
		
		panelDatos.add(txtNombre);
		panelDatos.add(txtApellido);
		panelDatos.add(txtDir);
		panelDatos.add(txtEmail);
		panelDatos.add(txtFecha);
		
		panelDatos.add(labelNombre);
		panelDatos.add(labelApellido);
		panelDatos.add(labelEmail);
		panelDatos.add(labelDir);
		panelDatos.add(labelFecha);
		
		botonGuardar = new JButton("Guardar");
		panelDatos.add(botonGuardar);
		this.add(panelDatos);
		
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtDir = new JTextField();
		txtFecha = new JTextField();
		txtEmail = new JTextField();
		
		txtNombre.setFont(new Font("Lato",0,20));
		txtNombre.setForeground(new Color(24,20,10));
		
		txtApellido.setFont(new Font("Lato",0,20));
		txtApellido.setForeground(new Color(24,20,10));
		
		txtDir.setFont(new Font("Lato",0,20));
		txtDir.setForeground(new Color(24,20,10));
		
		txtFecha.setFont(new Font("Lato",0,20));
		txtFecha.setForeground(new Color(24,20,10));
		
		txtEmail.setFont(new Font("Lato",0,20));
		txtEmail.setForeground(new Color(24,20,10));
		
	}
 public Contactos getContacto() {
       // validarDatos();
        String nom = this.txtNombre.getText();
        String ape = this.txtApellido.getText();
        String mail = this.txtEmail.getText();
        String dir = this.txtDir.getText();
        
        String nac =(this.txtFecha.getText());
       // Categoria cat = (Categoria) this.jComboBoxCategoria.getSelectedItem();
        return new Contactos(0, nom, ape, mail, new Date(),dir);
    }
	
	protected JPanel getJPanelBotonera() {
        return panelDatos;
    }
	
}
