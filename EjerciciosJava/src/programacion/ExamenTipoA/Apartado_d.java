package programacion.ExamenTipoA;

import programacion.Utils_Arrays;

public class Apartado_d {

	public static void main(String[] args) {
		
		int array[] = Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		
		Utils_Arrays.mostrarArray(array);
		
		int array2[] = new int [5];
		
		for (int i = 0; i < array2.length; i++) {
			int posicion;
			boolean posicionYaSalida;
			do {
				posicion = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
				 posicionYaSalida=false;
				
				for (int j = 0; j < i; j++) {
					
					if(array2[j]==posicion) {
						posicionYaSalida=true;
					}				
				}			
			
			}while(posicionYaSalida);

			array2[i]=posicion;			
		}
		Utils_Arrays.mostrarArray(array2);
		
		int arrayFinal[]= new int [array.length];
		
		for (int i = 0; i < array2.length; i++) {
			arrayFinal[i] = array[array2[i]];
			
		}
		Utils_Arrays.mostrarArray(arrayFinal);
	}

}
