package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_Mayor {

	public static void main(String[] args) {
	
		int mayor=0;
		int num=-1;		
		for ( ;num!=0;) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (num>=mayor) {
				mayor=num;
				
			}
			if (num==0) {
				break;
			}
		
		}
		System.out.println("El numero mayor es: "+ mayor);
	}

}
