package clases.implementaciones;

import clases.interfaces.ReproductorFM;

public class MovilAndroid implements ReproductorFM {

	private String marca;
	
	public MovilAndroid(String marca_) {
		this.marca = marca_;
	}
	
	@Override
	public void SintonizarEmisora(double frecuencia) {
		System.out.println("Moviendo a la frecuencia *** "+frecuencia+" *** Android");
	}

	@Override
	public void CambiarVolumen(double nivelAnter,double nivelActual) {
		String cambio="";
		if(nivelActual>nivelAnter) {cambio="Aumentando ";}else {cambio="Disminuyendo ";}
		System.out.println(cambio+" el volumen *** "+nivelAnter+" -> "+nivelActual+" *** Android");

		
	}

	@Override
	public void encender() {
		System.out.println("Buscando Emisoras *** Android");
	}

	

}
