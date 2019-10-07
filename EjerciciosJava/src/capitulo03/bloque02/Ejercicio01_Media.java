package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01_Media {

	public static void main(String[] args) {
	
		int acumMayor = 0;
		//PETICION DE NUMEROS AL USUARIO
		int numPedir = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir"));
		
		for (int i=0; i<numPedir; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 if (num >= 10) {
			  acumMayor+=num;
			  						 
			 }

		}
		//MUESTRA DE LA SUMA MAYORES DE 10
		System.out.println("La suma es: "+ acumMayor);
	}
}	
