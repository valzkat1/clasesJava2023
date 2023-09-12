package con_inyeccion;

public class InyectarSetter {

	ControlesMovimiento controles;
	private static String plataforma="PS";
	
	public InyectarSetter() {
		
	}
	
	
	public void Ejecutar(char direccion) {
		switch (direccion) {
		case 'U':
			this.controles.moverUp();
			break;
		case 'D':
			this.controles.moverDown();
			break;			
		case 'R':
			this.controles.moverRight();
			break;
		case 'L':
			this.controles.moverLeft();
			break;
			
		}
		
	}
	
	public void setControlMovimiento(ControlesMovimiento conmov) {
		this.controles=conmov;
	}
	
	public static void main(String[] args) {

		ControlesMovimiento cm=null;
		if(plataforma.equals("COM")) {
			cm= new Computador();

		}else if(plataforma.equals("PS")) {
			cm = new PlayStation();			
		}
		InyectarSetter consola= new  InyectarSetter();
		consola.setControlMovimiento(cm);
		consola.Ejecutar('U');
	}
	
	
}
