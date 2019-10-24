package programacion.Capitulo05.bloque02;

import javax.swing.JOptionPane;

import programacion.Utils;
import programacion.Utils_Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
				
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de desplazamientos que desee"));
		
			
		int direccion= Utils.obtenerNumUsuarioEntreLimites("Indique direccion del ciclo\n"+
				"\n0.-Ciclo a derecha"+
				"\n1.-Ciclo a izquierda", 0, 1);
		
		
		//bucle que repite tantas veces como pide el usuario
		for (int i = 0; i < num; i++) {
			switch (direccion) {
			case 0: // a derecha
				
				int aux = array[array.length - 1];
				for (int j = array.length - 1; j > 0; j--) {
					array[j] = array[j-1];
				}
				array[0] = aux;
				
				break;
			case 1: // a izquierda
				
				aux = array[0];
				
				for (int j = 0; j < array.length - 1; j++) {
					array[j] = array[j+1];
				}
				
				array[array.length-1] = aux;
				break;
			}

		}
		
		Utils_Arrays.mostrarArray(array);
	}

}
