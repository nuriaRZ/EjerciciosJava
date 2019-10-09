package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio07_Positivo_Nega_Hasta_Que_El_Usuario_Decicda {

	public static void main(String[] args) {
		
		int positivo=0;
		int negativo=0;
		int num=-1;		
		for ( ; num!=0;) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (num > 0) positivo++; 
				
			if 	(num < 0) negativo++;
			
			
			}
		System.out.println("Cantidad de numeros positivos: "+ positivo
				+"\nCantidad de numeros negativos: "+ negativo);
	}	
		
}


