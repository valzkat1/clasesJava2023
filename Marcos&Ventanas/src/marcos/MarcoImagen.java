package marcos;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class MarcoImagen extends JFrame{

	JEditorPane panelEditar;
	
	public MarcoImagen() {
		
		panelEditar= new JEditorPane();
		panelEditar.setContentType("text/html");
		panelEditar.setText("<html><body>Contenido</body></html>");
		panelEditar.setEditable(true);
	}

 public void iniciarMarco() {
		
		getContentPane().setLayout(null);
		setTitle("Marco con Imagen");
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		

	}

}
