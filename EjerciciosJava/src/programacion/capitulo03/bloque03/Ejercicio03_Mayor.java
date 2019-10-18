package programacion.capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_Mayor {

	public static void main(String[] args) {
	
		int mayor=0;
		int num=-1;		
		for ( int i=0; num!=0; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (i==0) {
				mayor=num;
				
			}
			else
				if (num>mayor && num!=0) {
				mayor=num;
				}
		
		}
		System.out.println("El numero mayor es: "+ mayor);
	}

}
