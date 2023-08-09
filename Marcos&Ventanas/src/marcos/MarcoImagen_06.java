package marcos;

import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MarcoImagen_06 extends JFrame{

	JEditorPane panelEditar;
	URL url = getClass().getResource("../img/sonrrisa.png");
	
	public MarcoImagen_06() {
		
		panelEditar= new JEditorPane();
		panelEditar.setContentType("text/html");
		panelEditar.setText("<html>"+
								"<body>"+
								"Contenido"+
								"<hr/>"+
								"<h2>Titulo h2</h2>"+
								"<font face='arial'>Algun texto en Arial.</font>"+
								"<font face='courier'>Algun texto en Courier.</font>"+
								"<font color='red'>Texto en rojo</font>"+
								"<img src='"+url+"' width=250 height=250/>"+
				"</body></html>");
		panelEditar.setEditable(true);
		
		JScrollPane panelScroll= new JScrollPane(panelEditar);
		panelScroll.setBounds(0, 0, 300, 300);
		add(panelScroll);
		iniciarMarco();
	}

	//git pull origin main
	
 public void iniciarMarco() {
		
		getContentPane().setLayout(null);
		setTitle("Marco con Imagen");
		setSize(400,350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new MarcoImagen_06(); 
	}

}
