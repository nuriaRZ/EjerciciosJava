package programacion.capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04_Multiplos_con_Limite {

	public static void main(String[] args) {
		
		int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite deseado:"));
		
		 
		for (int multiplo=0; (numPedido*multiplo)<=limite; multiplo++) {
		
			System.out.println(numPedido+" x " +multiplo+" = " +(numPedido*multiplo));
			}
			
			
		}
		
	
	
}