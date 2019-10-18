package programacion.capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03_Multiplos {

	public static void main(String[] args) {
		
		int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
		
		
		 
		for (int multiplo=0; (numPedido*multiplo)<100; multiplo++) {
		
			System.out.println(numPedido+" x " +multiplo+" = " +(numPedido*multiplo));
			}
			
			
		}
		
	
	
}