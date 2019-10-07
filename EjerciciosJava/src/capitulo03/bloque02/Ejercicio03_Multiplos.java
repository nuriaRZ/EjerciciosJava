package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03_Multiplos {

	public static void main(String[] args) {
		
		int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
		int multiplicacion = 0;
		int num=0;
		 
		for (int i=0; i<100; i+=num) {
			multiplicacion = numPedido * num;
			
			
				
			
			System.out.println(numPedido+" x " +num+" = " +multiplicacion);
		}
		
	}
	
}