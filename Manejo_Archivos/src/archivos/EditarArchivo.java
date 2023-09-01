package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelos.Usuario;

public class EditarArchivo {

	File archivo;
	FileWriter editor;
	Usuario u;
	
	public EditarArchivo(Usuario user){
		this.u=user;		
	
	}
	
	public void  AdicionarDato() {
		try {
		    archivo = new File("src/datos","usuarios.txt");		
			editor = new FileWriter(archivo,true);
			
			editor.write(this.u.lineaArchivo());
			editor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  Editar(String datoNuevo,int fila,int columna) {
		try {
		    archivo = new File("src/datos","usuarios.txt");		
						
			LeerArchivo leer=new LeerArchivo();
			Object[][] data=leer.getDatosTxt();
			
			editor = new FileWriter(archivo,false);
			
			String datoViejo = (String) data[fila][columna];
			data[fila][columna]=datoNuevo;
			
			for(int i=0;i<data.length;i++) {
				if(i==0) {
				editor.write(""+data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][3]);	
				}else
				editor.write("\r\n"+data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][3]);
			}
			
			editor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
