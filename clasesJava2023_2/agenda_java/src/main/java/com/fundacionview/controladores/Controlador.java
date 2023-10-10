package com.fundacionview.controladores;

import com.fundacionview.modelos.Contactos;
import com.fundacionview.modelos.RepositorioContactos;
import com.fundacionview.vistas.FormularioCrear;
import com.fundacionview.vistas.FormularioView;
import com.fundacionview.vistas.VistaPrincipal;

public class Controlador {


	private FormularioCrear formCreacion;
	
	private FormularioView formVisualizar;
	
	private RepositorioContactos repoContactos;
	
	private VistaPrincipal vistaPrincipal;
	
	
	public void iniciarApp() {
		
		repoContactos = new RepositorioContactos();
		
		vistaPrincipal = new VistaPrincipal("Agenda de Contactos ");
		
		formCreacion = new FormularioCrear("Crear Contacto", vistaPrincipal);
		
		formVisualizar = new FormularioView("", vistaPrincipal, new Contactos());
		
		vistaPrincipal.setVisible(true);
		
	}
	
	
	
	
	
}
