package programacion.ExamenTipoA;

import programacion.Utils_Arrays;

public class Apartado_c {

	public static void main(String[] args) {
		
		int array[]=new int[20];
		
		boolean esImpar = true;
		
		for (int i = 0; i < array.length; i++) {		
			
			do {
				int num = Utils_Arrays.ObtenerNumAleatorio(25, 100);
				if (num%2==0) {
					array[i]=num;
					esImpar = false;
				}
			}while(esImpar);
		}
		Utils_Arrays.mostrarArray(array);

	}

}
