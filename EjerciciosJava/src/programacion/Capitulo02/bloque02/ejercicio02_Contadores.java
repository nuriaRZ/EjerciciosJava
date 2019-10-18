package programacion.Capitulo02.bloque02;

import javax.swing.JOptionPane;

public class ejercicio02_Contadores {

	public static void main(String[] args) {
		
		int numBajos = 0; //>=0 y =<25
		int numMedio = 0; // >25 =<250
		int numAlto = 0; // >250
		
		// PRIMER NUMERO
		String str = JOptionPane.showInputDialog("Introduzca un numero");
		int num = Integer.parseInt(str);
		
	
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				numBajos += 1;
				//numBajos++;
			}
			else {
				if (num <=250 ) {
					numMedio += 1;
				}
				else {
					numAlto += 1;
				}
			}
		}
		
		// SEGUNDO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				numBajos += 1;
			}
			else {
				if (num <=250 ) {
					numMedio += 1;
				}
				else {
					numAlto += 1;
				}
			}
		}
		// TERCER NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				numBajos += 1;
			}
			else {
				if (num <=250 ) {
					numMedio += 1;
				}
				else {
					numAlto += 1;
				}
			}
		}	
		// CUARTO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				numBajos += 1;
			}
			else {
				if (num <=250 ) {
					numMedio += 1;
				}
				else {
					numAlto += 1;
				}
			}
		}		
		// QUINTO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			return;
		}
		else {
			if (num <= 25) {
				numBajos += 1;
			}
			else {
				if (num <=250 ) {
					numMedio += 1;
				}
				else {
					numAlto += 1;
				}
			}
		}
		
		System.out.println("Numeros bajos: "+numBajos+
							"\nNumeros medios: "+numMedio+
							"\nNumeros Altos: "+numAlto);
	}

}
