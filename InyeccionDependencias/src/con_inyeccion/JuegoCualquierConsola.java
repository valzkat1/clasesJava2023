package con_inyeccion;

public class JuegoCualquierConsola {
	
	private ControlesMovimiento controles;

	private static String plataforma="PS";
	// Inyeccion a partir del contructor de la clase.
	public JuegoCualquierConsola(ControlesMovimiento contro) {
		this.controles = contro;
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
	
	
	public static void main(String[] args) {

		ControlesMovimiento cm=null;
		if(plataforma.equals("COM")) {
			cm= new Computador();

		}else if(plataforma.equals("PS")) {
			cm = new PlayStation();			
		}
		JuegoCualquierConsola consola= new  JuegoCualquierConsola(cm);
		consola.Ejecutar('U');
	}

}
