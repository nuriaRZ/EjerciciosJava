package programacion.Capitulo02.bloque02;

import javax.swing.JOptionPane;

public class ejercicio01_Acumulativos {

	public static void main(String[] args) {
		int numNeg = 0; //<0
		int numBajos = 0; //>=0 y =<25
		int numMedio = 0; // >25 =<250
		int numAlto = 0; // >250
		
		// PRIMER NUMERO
		String str = JOptionPane.showInputDialog("Introduzca un numero");
		int num = Integer.parseInt(str);
		
	
		if (num < 0) {
			numNeg += num;
		}
		else {
			if (num <= 25) {
				numBajos += num;
			}
			else {
				if (num <=250 ) {
					numMedio += num;
				}
				else {
					numAlto += num;
				}
			}
		}
		
		// SEGUNDO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			numNeg += num;
		}
		else {
			if (num <= 25) {
				numBajos += num;
			}
			else {
				if (num <=250 ) {
					numMedio += num;
				}
				else {
					numAlto += num;
				}
			}
		}
		// TERCER NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			numNeg += num;
		}
		else {
			if (num <= 25) {
				numBajos += num;
			}
			else {
				if (num <=250 ) {
					numMedio += num;
				}
				else {
					numAlto += num;
				}
			}
		}	
		// CUARTO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			numNeg += num;
		}
		else {
			if (num <= 25) {
				numBajos += num;
			}
			else {
				if (num <=250 ) {
					numMedio += num;
				}
				else {
					numAlto += num;
				}
			}
		}		
		// QUINTO NUMERO
		str = JOptionPane.showInputDialog("Introduzca un numero");
		num = Integer.parseInt(str);
		
	
		if (num < 0) {
			numNeg += num;
		}
		else {
			if (num <= 25) {
				numBajos += num;
			}
			else {
				if (num <=250 ) {
					numMedio += num;
				}
				else {
					numAlto += num;
				}
			}
		}
		
		System.out.println("Numeros negativos: "+numNeg+
							"\nNumeros bajos: "+numBajos+
							"\nNumeros medios: "+numMedio+
							"\nNumeros Altos: "+numAlto);
	}

}
