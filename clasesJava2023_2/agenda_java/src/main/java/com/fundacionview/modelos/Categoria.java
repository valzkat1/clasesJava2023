package com.fundacionview.modelos;

public enum Categoria {

	FAMILIA("Familiar","Familiares"),
	AMIGOS("Amigo","Amigos"),
	COMPA("Campañero","Compañeros"),
	TODOS("Todos","Todos"),
	OTROS("Otro","Otros");
	
	
	private String singular;
	private String plural;
	
	private Categoria(String s, String p) {
		this.singular = s;
		this.plural = p;
	}
	
	public String getSingular() {
		return this.singular;
	}
	
	public String getPlural() {
		return this.plural;
	}

	@Override
	public String toString() {
		return this.plural;
	}
}
