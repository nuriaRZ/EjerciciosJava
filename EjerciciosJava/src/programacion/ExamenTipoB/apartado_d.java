package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class apartado_d {

	public static void main(String[] args) {
		int array []= new int[100];
		
		
		
		for (int i = 0; i <= 10; i++) {
			int posicion;
			boolean existePosicion;
			
			do {
				posicion = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
				existePosicion=false;
				
				for (int j = 0; j < array.length; j++) {
					
					if (array[j]==posicion) existePosicion=true;
				}				
				
			}while(existePosicion);
		
			array[posicion]=1;
		}
		
		Utils_Arrays.mostrarArray(array);
		

	}

}
