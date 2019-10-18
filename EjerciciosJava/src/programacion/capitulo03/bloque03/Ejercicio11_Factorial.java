package programacion.capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio11_Factorial {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for (int i=num; i>1; i--) {
			System.out.println(num+"x"+(i-1)+"="+(i-1)*num);
			
		}
		

	}

}
