package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03_NumPositivos_Negat {

	public static void main(String[] args) {
		
		int NumPositivos = 0;
		int NumNegativos = 0;
		int numPedir = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea introducir"));
		
		for (int i=0; i<numPedir; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 if (num >= 0) {
			  NumPositivos++;
			  						 
			 }
			 else {
				 NumNegativos++;
				 
			 }
			
			 
				 

	}
		System.out.println("Numeros positivos introducidos: "+ NumPositivos
							+"\nNumeros negativos introducidos: "+ NumNegativos);


	}
}	
