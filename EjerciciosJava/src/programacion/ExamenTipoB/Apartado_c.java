package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class Apartado_c {

	public static void main(String[] args) {
		
		int array[] = new int [20];
		
		// como sabemos que el 1 es divisor si o si empezamos a dividir el num desde la posicion hasta si mismo
		for (int i = 0; i < array.length; i++) {
			int num;
			boolean esPrimo;
			do {
				esPrimo = true;
				num=Utils_Arrays.NumAlAzar();
				for( int j=2; j<num-1; j++) {
					if (num%j==0) { // si el num dividido por cualquier otro num que no sea el su resto es 0 el num es compuesto
						esPrimo = false;						
					}
				}
			}while(!esPrimo);
			
			array[i]=num;
		}
		//si no es igual a cero tras a ver dividido por todos los nums
		Utils_Arrays.mostrarArray(array);

	}

}
