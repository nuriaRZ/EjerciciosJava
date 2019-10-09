package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04_Menor {

	public static void main(String[] args) {
	
		int menor=0;
		int num=-1;		
		for ( int i=0; num!=0; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (i==0) {
				menor=num;
				
			}
			else
				if (num<menor && num!=0) {
				menor=num;
				}
		
		}
		System.out.println("El numero menor es: "+ menor);
	}

}
