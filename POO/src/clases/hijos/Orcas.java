package clases.hijos;


public class Orcas extends Ballenas{

	protected double porcentajeGraso;
	
	public double getPorcentajeGraso() {
		return porcentajeGraso;
	}



	public void setPorcentajeGraso(double porcentajeGraso) {
		this.porcentajeGraso = porcentajeGraso;
	}



	public Orcas() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Orcas [peso=" + peso + ", cuadrupedo=" + cuadrupedo + ", especie=" + especie + ", toString()="
				+", getPeso()=" + getPeso() + ", isCuadrupedo()=" + isCuadrupedo()
				+ ", getEspecie()=" + getEspecie() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	

	
}
