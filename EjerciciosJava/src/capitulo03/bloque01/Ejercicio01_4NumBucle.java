package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_4NumBucle {

	public static void main(String[] args) {
		boolean menor4;
		int acumMayor = 0;
		
		
		for (int i=0; i!=4; i++) { // MAXIMO DE NUMERO QUE EL USUARIO PUEDE PEDIR
			 menor4=true;
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			 
			 if (num >= 10) {
			  acumMayor+=num;
			  						 
			 }
			 else {
				 menor4=false;
				 
			 }
			
			 
				 

	}
		System.out.println("La suma es: "+ acumMayor);


	}
}	
