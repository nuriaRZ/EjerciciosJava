package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_Desordenar {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);
		Utils_Arrays.mostrarArray(array);
		
		
		
		int aux=0;
		
		System.out.println();
		
		for (int i =0 ; i < array.length*2; i++) {
			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(array.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux = array[i1];
		 array[i1]=array[i2];
		 array[i2]=aux;
		}
		Utils_Arrays.mostrarArray(array);

					
		
	}

}
