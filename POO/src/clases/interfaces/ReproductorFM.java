package clases.interfaces;

public interface ReproductorFM {

	public void SintonizarEmisora(double frecuencia);
	public void CambiarVolumen(double nivelAnte,double nivelAct);
	
	default void encender() {
		System.out.println("Buscando Emisoras");
	};
	/*
	default void encender() {
		System.out.println("Buscando Emisoras");
	}
	default void apagar() {
		System.out.println("StandBy");
	}*/
}
