package programacion.capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02_NumBucle {

	public static void main(String[] args) {
		
		boolean var;
		int acumNum = 0;
		//PETICION DE NUMEROS AL USUARIO
		int numPedir = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir"));
		
		for (int i=0; i<numPedir; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
								 
			  acumNum+=num;
				 
		}
		//MUESTRA DE LA MEDIA AL USUARIO
		System.out.println("La Media es: "+ acumNum/numPedir);
	}
}	
