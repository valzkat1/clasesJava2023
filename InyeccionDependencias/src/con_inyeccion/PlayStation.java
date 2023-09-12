package con_inyeccion;

public class PlayStation implements ControlesMovimiento {

	public int posX=0;
	public int posY=0;
	
	
	@Override
	public void moverUp() {
		posY++;
		
	}

	@Override
	public void moverDown() {
		posY--;
		
	}

	@Override
	public void moverRight() {
		posX++;
		
	}

	@Override
	public void moverLeft() {
		posX--;
		
	}

}
