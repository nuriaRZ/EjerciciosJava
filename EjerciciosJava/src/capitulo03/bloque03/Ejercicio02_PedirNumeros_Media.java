package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02_PedirNumeros_Media {

	public static void main(String[] args) {
	
		int acumNum=0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		acumNum+=num;
		int media=0;
		
		for (int i=0; num!=0; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		media++;
			if (i==0) {
				acumNum+=num;
			}
			else {
				if (num!=0) {
					acumNum+=num;
					
				}
				else {
					if (num==0) {
						break;
					}
				}
			}
				
		}
		System.out.println("La media de los numeros es: "+ acumNum/media);
		
	}

}
