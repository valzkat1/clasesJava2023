package clases.padre;

public class Mamiferos {

	public Mamiferos() {
		// TODO Auto-generated constructor stub
	}

	protected int peso;
	
	protected boolean cuadrupedo;
	
	//Private
	//Solo permite acceso a la misma clase.
	
	
	protected String especie;

	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isCuadrupedo() {
		return cuadrupedo;
	}

	public void setCuadrupedo(boolean cuadrupedo) {
		this.cuadrupedo = cuadrupedo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
}
