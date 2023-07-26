package clases.implementaciones;

import clases.interfaces.ReproductorFM;

public class MovilIOS implements ReproductorFM{

	private int version;
	
	public MovilIOS(int versio) {
		this.version=versio;
	}
	
	@Override
	public void SintonizarEmisora(double frecuencia) {
		System.out.println("Moviendo a la frecuencia *** "+frecuencia+" *** IOS");

		
	}

	@Override
	public void CambiarVolumen(double nivelAnte, double nivelAct) {
		String cambio="";
		if(nivelAct>nivelAnte) {cambio="Aumentando ";}else {cambio="Disminuyendo ";}
		System.out.println(cambio+" el volumen *** "+nivelAnte+" -> "+nivelAct+" *** IOS");

		
	}

	@Override
	public void encender() {
		System.out.println("Buscando Emisoras *** IOS");
	}

}
