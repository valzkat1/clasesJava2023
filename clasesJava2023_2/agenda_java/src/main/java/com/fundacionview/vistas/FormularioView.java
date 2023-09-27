package com.fundacionview.vistas;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.fundacionview.modelos.Contactos;

public class FormularioView extends FormularioJframe{

	Contactos conta;
	private JLabel labelNombre,labelApellido,labelEmail,labelDir,labelFecha;
	
	private JTextField txtNombre,txtApellido,txtEmail,txtDir,txtFecha;
	
	
	public FormularioView(String titulo, Component parent, Contactos con) {
		super(titulo, parent);
		this.conta = con;
		labelNombre = new JLabel();
		labelApellido = new JLabel();
		labelDir = new JLabel();
		labelEmail = new JLabel();
		labelFecha = new JLabel();
		
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtDir = new JTextField();
		txtFecha = new JTextField();
		txtEmail = new JTextField();
		
	}


	public JLabel getLabelNombre() {
		return labelNombre;
	}


	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}


	public JLabel getLabelApellido() {
		return labelApellido;
	}


	public void setLabelApellido(JLabel labelApellido) {
		this.labelApellido = labelApellido;
	}


	public JLabel getLabelEmail() {
		return labelEmail;
	}


	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}


	public JLabel getLabelDir() {
		return labelDir;
	}


	public void setLabelDir(JLabel labelDir) {
		this.labelDir = labelDir;
	}


	public JLabel getLabelFecha() {
		return labelFecha;
	}


	public void setLabelFecha(JLabel labelFecha) {
		this.labelFecha = labelFecha;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtApellido() {
		return txtApellido;
	}


	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}


	public JTextField getTxtEmail() {
		return txtEmail;
	}


	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}


	public JTextField getTxtDir() {
		return txtDir;
	}


	public void setTxtDir(JTextField txtDir) {
		this.txtDir = txtDir;
	}


	public JTextField getTxtFecha() {
		return txtFecha;
	}


	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}
	

	
	
	

}
