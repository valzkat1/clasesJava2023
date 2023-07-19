package paquete2;

import javax.swing.JOptionPane;

import calculadora.ClasePrincipal;

public class ClaseTres {

	
	
	public static void main(String[] args) {
		ClasePrincipal objClasePPal=new ClasePrincipal();
		String opcion=objClasePPal.menu();
		int op= objClasePPal.convertirEntero(opcion);
		while(op<=0) {
			//Customizar el mensaje desde la segunda solucitud de menu.
			 opcion = objClasePPal.menu();
			 op= objClasePPal.convertirEntero(opcion);
		}
		
		String nume1=JOptionPane.showInputDialog("Por favor ingrese el primer numero a operar");
		int num1 = objClasePPal.convertirEntero(nume1);
		//VAlidacion datos numericos
		String nume2=JOptionPane.showInputDialog("Por favor ingrese el segundo numero a operar");
		int num2 = objClasePPal.convertirEntero(nume2);
		//VAlidacion datos numericos
		// Si es division no cero
		
		double retorno=0;
		switch (op) {
		case 1: 
			retorno= num1+num2;
			break;
		case 2: 
			retorno= num1-num2;
			break;
		case 3: 
			retorno= num1*num2;
			break;
		case 4: 
			retorno= num1/num2;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
	}
	
	
	double retorno=0;
	switch (op) {
	case 1: 
		retorno= num1+num2;
		break;
	case 2: 
		retorno= num1-num2;
		break;
	case 3: 
		retorno= num1*num2;
		break;
	case 4: 
		retorno= num1/num2;
		break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + op);
	}
	
	JOptionPane.showMessageDialog(null, "Resultado Operacion: "+retorno);
	
	
    opcion=objClasePPal.menu();
    op= objClasePPal.convertirEntero(opcion);
	while(op<=0) {
		//Customizar el mensaje desde la segunda solucitud de menu.
		 opcion = objClasePPal.menu();
		 op= objClasePPal.convertirEntero(opcion);
	}
	
 }
}
}
