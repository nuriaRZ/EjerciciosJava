package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02_NumBucle {

	public static void main(String[] args) {
		boolean menorNum;
		int acumMayor = 0;
		int numPedir = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir"));
		
		for (int i=0; i<numPedir; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			menorNum=true;
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 if (num >= 10) {
			  acumMayor+=num;
			  						 
			 }
			 else {
				 menorNum=false;
				 
			 }
			
			 
				 

	}
		System.out.println("La suma es: "+ acumMayor);


	}
}	
