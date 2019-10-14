package capitulo04_WHILE;

import javax.swing.JOptionPane;

public class Ejercicio05_Mayor_Menor_Hasta_Que_El_Usuario_Decicda {

	public static void main(String[] args) {
		
		int mayor=0;
		int menor=0;
		int num=-1;
		
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
				if (num>mayor) mayor=num;
				
				
				if (num < menor) menor=num;
				
				
		}while (num!=0);
		
		
		System.out.println("El numero menor es: "+ menor
				+"\nEl numero mayor es: "+ mayor);
			
	}
}	


