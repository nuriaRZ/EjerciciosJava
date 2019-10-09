package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio05_TablaMultiplicar {

	public static void main(String[] args) {
	
		int num=-1;
		String tablaMultiplicar= ""; 
		
		for (; num!=0;) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (i!=0) {
				tablaMultiplicar="";
				for (int i=1; i<11; i++) {
					tablaMultiplicar+=num+" x " + i;	
			}
			
		
		}
		System.out.println("El numero menor es: "+ tablamultiplicar);
	}

}
