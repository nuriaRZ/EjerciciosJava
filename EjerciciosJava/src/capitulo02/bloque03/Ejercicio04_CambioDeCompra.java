package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04_CambioDeCompra {

	public static void main(String[] args) {
	
	String str = JOptionPane.showInputDialog("Introduzca la cantidad del importe");
	int importe = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("Introduzca la cantidad recibida");
	int cantRecibida = Integer.parseInt(str);
	int cantDevolver = cantRecibida - importe;

	//CALCULO CANT BILLETES DE 100
	System.out.println("Devuelvo "+(cantDevolver/10000) +" Billetes de 100.00€");
	cantDevolver = cantDevolver % 10000;		
		
	//CALCULO CANT BILLETES DE 50
		System.out.println("Devuelvo "+(cantDevolver/5000) +" Billetes de 50.00€");
		cantDevolver = cantDevolver % 5000;		
		
	//CALCULO CANT BILLETES DE 20
	System.out.println("Devuelvo "+(cantDevolver/2000) +" Billetes de 20.00€");
	cantDevolver = cantDevolver % 2000;
	
	//CALCULO CANT BILLETES DE 10
	System.out.println("Devuelvo "+(cantDevolver/1000) +" Billetes de 10.00€");
	cantDevolver = cantDevolver % 1000;
	
	//CALCULO CANT BILLETES DE 5
	System.out.println("Devuelvo "+(cantDevolver/500) +" Billetes de 5.00€");
	cantDevolver = cantDevolver % 500;
	
	//CALCULO CANT MONEDAS DE 2.00€
	System.out.println("Devuelvo "+(cantDevolver/200) +" Billetes de 100.00€");
	cantDevolver = cantDevolver % 200;
	
	//CALCULO CANT MONEDAS DE 1.00€
	System.out.println("Devuelvo "+(cantDevolver/100) +" MONEDAS DE 1.00€");
	cantDevolver = cantDevolver % 100;	
			
	//CALCULO CANT MONEDAS DE 0.50€
	System.out.println("Devuelvo "+(cantDevolver/0.50) +" MONEDAS DE 0.50€");
	cantDevolver = cantDevolver % 5;
	
	//CALCULO CANT MONEDAS DE 0.20€
	System.out.println("Devuelvo "+(cantDevolver/2) +" MONEDAS DE 0.20€");
	cantDevolver = cantDevolver % 2;	
	
	//CALCULO CANT MONEDAS DE 0.10€
	System.out.println("Devuelvo "+(cantDevolver/1) +" MONEDAS DE 0.10€");
	cantDevolver = cantDevolver % 1;	



	}	
}	
	

