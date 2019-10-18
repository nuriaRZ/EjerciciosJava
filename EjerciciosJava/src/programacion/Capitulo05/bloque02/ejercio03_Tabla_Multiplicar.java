package programacion.Capitulo05.bloque02;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class ejercio03_Tabla_Multiplicar {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		
		int num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		
		int multiplicar;
			
		
		for (int i = 0; i < array.length; i++) {
			
			multiplicar=array[i]*num;
			
			System.out.println(array[i]+"*"+num+"="+multiplicar);
			
		}

	}

}
