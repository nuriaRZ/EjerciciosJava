package programacion.ExamenTipoA;

import programacion.Utils_Arrays;

public class Apartado_d {

	public static void main(String[] args) {
		
		int array[] = Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		
		Utils_Arrays.mostrarArray(array);
		
		int array2[] = new int [5];
		
		boolean posicionYaSalida=false;
		
		for (int i = 0; i < array2.length; i++) {
			int posicion = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
			do {
				
			if(array[i]==posicion) posicionYaSalida=true;
			
			
			}while(posicionYaSalida==false);

			
			for (int j = 0; j < array.length; j++) {
				array2[i]=array[posicion];
			}
		}
		Utils_Arrays.mostrarArray(array2);

	}

}
