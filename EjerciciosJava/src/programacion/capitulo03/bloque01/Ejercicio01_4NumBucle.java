package programacion.capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_4NumBucle {

	public static void main(String[] args) {
		
		int acumMayor = 0;
		
		
		for (int i=0; i!=4; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 if (num >= 10) {
			  acumMayor+=num;			  
			  						 
			 }
				 

		}
		//MUESTRA DE LA SUMA MAYORES DE 10
		System.out.println("La suma es: "+ acumMayor);


	}
}	
