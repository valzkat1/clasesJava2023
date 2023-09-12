package con_inyeccion;

public class Computador implements ControlesMovimiento {

	public int posX =0;
	public int posY = 0;
	


	@Override
	public void moverUp() {
		this.posY++;
		
	}

	@Override
	public void moverDown() {
		this.posY--;
		
	}

	@Override
	public void moverRight() {
		this.posX++;
		
	}

	@Override
	public void moverLeft() {
		this.posX--;
		
	}

}
