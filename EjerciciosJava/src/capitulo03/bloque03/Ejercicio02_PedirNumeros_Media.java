package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02_PedirNumeros_Media {

	public static void main(String[] args) {
	
		int acumNum=0;
		int num =-1;
		int contador=0;
		
		for (; num!=0;) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		acumNum+=num;
		contador++;
			
		}
		System.out.println("La media de los numeros es: "+ ((float) acumNum/(contador)));			
	}
		
		
}


