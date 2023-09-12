package sin_inyeccion;

public class JuegoPlay {

	private static Computador controles;
	
	public static void main(String [] args) {
		
		controles = new Computador();
		
	}

	public void Ejecutar(char direccion) {
		
		switch (direccion) {
		 case 'U':
			 this.controles.moverUp();
		  break;
		 
		 case 'D':			
			 this.controles.moverDown();
			  break;
			  
		 case 'L':	
			 this.controles.moverLeft();
			  break;
			  
		 case 'R':	
			 this.controles.moverRight();
			  break;	  
		default:
			break;
		}
		
	
		
		
	}
	
	public int getPosX() {
		return this.controles.posX;
	}
	
	public int getPosY() {
		return this.controles.posY;
	}
	

}
