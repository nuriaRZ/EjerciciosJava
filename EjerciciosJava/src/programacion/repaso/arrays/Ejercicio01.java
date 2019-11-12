package programacion.repaso.arrays;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		int limInferior = Integer.parseInt(JOptionPane.showInputDialog("Limite inferior"));
		int limSuperior = Integer.parseInt(JOptionPane.showInputDialog("Limite superior"));
		int array []= Utils_Arrays.crearArrayNumAleatorio(150, limInferior, limSuperior);
			
		Utils_Arrays.mostrarArray(array);
		
	}

}
