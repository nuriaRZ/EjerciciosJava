package capitulo04_WHILE;

import javax.swing.JOptionPane;

public class Ejercicio03_Mayor {

	public static void main(String[] args) {
	
		int mayor=0;
		int num=-1;		
		
		while ( num!=0) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero \n Pulse 0 para salir"));			
			if (num>mayor) mayor=num;
					
		}
		
		System.out.println("El numero mayor es: "+ mayor);	
		
		
	}

}
