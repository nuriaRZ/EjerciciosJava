package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicio07_NumImparBinario {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un numero");
		int num = Integer.parseInt(str);
		
		if (num % 2 == 1) {
			System.out.println("El numero introducido "+num+" es impar");			
		}
		else {
			System.out.println("El numero introducido "+num+" es par");
		}
	}

}
