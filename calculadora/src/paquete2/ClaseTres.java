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
	
 while(op<5) {	
	String nume1=JOptionPane.showInputDialog("Por favor ingrese el primer numero a operar");
	while(!objClasePPal.esNumerico(nume1)) {
		nume1=JOptionPane.showInputDialog("Por favor ingrese el primer numero a operar(Debe ser datos numericos)");
	}	
	double num1 = Double.parseDouble(nume1); 
	//VAlidacion datos numericos
	String nume2=JOptionPane.showInputDialog("Por favor ingrese el segundo numero a operar");
	while(!objClasePPal.esNumerico(nume2)) {
		nume2=JOptionPane.showInputDialog("Por favor ingrese el segundo numero a operar (Debe ser dato numerico)");
	}
	double num2 = Double.parseDouble(nume2);
	//VAlidacion datos numericos
	// Si es division no cero
	
	// mostrar mensaje segun el caso( letras o cero)
	if(op==4) {
		while(num2==0) {
			nume2=JOptionPane.showInputDialog("Por favor ingrese el segundo numero a operar (No esta permitido en cero como denominador)");
			if(objClasePPal.esNumerico(nume2)) {
				num2=Double.parseDouble(nume2);
			}else {
				nume2=JOptionPane.showInputDialog("Por favor ingrese el segundo numero a operar (No letras)");	
				if(objClasePPal.esNumerico(nume2)) {
					num2=Double.parseDouble(nume2);
				}
				
			}
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
