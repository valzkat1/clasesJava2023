package com.fundacionview.controladores;

import com.fundacionview.modelos.Contactos;
import com.fundacionview.modelos.RepositorioContactos;
import com.fundacionview.vistas.FormularioCrear;
import com.fundacionview.vistas.FormularioView;

public class Controlador {


	private FormularioCrear formCreacion;
	
	private FormularioView formVisualizar;
	
	private RepositorioContactos repoContactos;
	
	
	public void iniciarApp() {
		
		repoContactos = new RepositorioContactos();
		
		formCreacion = new FormularioCrear("Crear Contacto", null);
		
		formVisualizar = new FormularioView("", null, new Contactos());
		
		
	}
	
	
	
	
	
}
