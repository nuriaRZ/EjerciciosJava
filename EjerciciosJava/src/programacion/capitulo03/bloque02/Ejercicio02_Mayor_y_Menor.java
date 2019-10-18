package programacion.capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02_Mayor_y_Menor {

	public static void main(String[] args) {
	
		int acumMayor = 0;
		int acumMenor = 0;
		//PETICION DE NUMEROS AL USUARIO
		int numPedir = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir"));
		
		
		for (int i=0; i<numPedir; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 
			 if ( i==0 ) {
				 acumMayor=num;
				 acumMenor=num;
			 }
			 else {
				 if (num > acumMayor) {
					  acumMayor=num;
					  						 
				}
				 if (num < acumMenor) {
						 acumMenor=num;
				}
					
			 }
				 
		}
		
		//MUESTRA DE LA SUMA MAYORES DE 10
				System.out.println("El numero mayor es: "+ acumMayor
								+"\nEl numero menor es: "+ acumMenor);	
		
	}

}
	
