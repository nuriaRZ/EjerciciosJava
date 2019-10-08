package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01_PedirNumeros {

	public static void main(String[] args) {
	
		int acumNum=0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		acumNum+=num;
		for (int i=0; num!=0; i++) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
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
		
		System.out.println("La suma de los numeros es: "+ acumNum);
	}

}
