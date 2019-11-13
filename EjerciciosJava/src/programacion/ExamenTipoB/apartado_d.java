package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class apartado_d {

	public static void main(String[] args) {
		int array []= new int[100];
		
		int contador=0;
		
		for (int i = 0; i < array.length; i++) {
			int posicion;
			boolean existePosicion;
			
			do {
				posicion = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
				existePosicion=false;
				
				for (int j = 0; j < array.length; j++) {
					contador++;
					if (array[j]==posicion) existePosicion=true;
				}				
				
			}while(existePosicion && contador<10);
		
			array[posicion]=1;
		}
		
		Utils_Arrays.mostrarArray(array);
		

	}

}
