package programacion.ExamenTipoA;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class Apartado_b {

	public static void main(String[] args) {
		
		int limInferior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un limite inferior"));
		int limSuperior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un limite superior"));
		
		int array[] = Utils_Arrays.crearArrayNumAleatorio(100, limInferior, limSuperior);
		
		Utils_Arrays.mostrarArray(array);
		System.out.println();
		for (int i = array.length-1; i >= 0; i--) {
		
		System.out.print(array[i]+" ");	
		}
		

	}

}
