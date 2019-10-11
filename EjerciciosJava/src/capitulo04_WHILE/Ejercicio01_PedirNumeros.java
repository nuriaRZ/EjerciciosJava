package capitulo04_WHILE;

import javax.swing.JOptionPane;

public class Ejercicio01_PedirNumeros {

	public static void main(String[] args) {
	
		int acumNum=0;
		int num = -1;
		while ( num!=0) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		acumNum+=num;
			
		}
		System.out.println("La suma de los numeros es: "+ acumNum);
	}
				
}
		
		

