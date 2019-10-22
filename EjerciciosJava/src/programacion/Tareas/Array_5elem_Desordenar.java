package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_Desordenar {

	public static void main(String[] args) {
		
		int array1[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array1);
		int array2[]=new int [5];
		int longitud= array2.length*2;
		
		int aux=0;
		
		System.out.println();
		
		for (int j =0 ; j < longitud; j++) {
			
			aux=array2[j];
		
			for (int i=0; i < array2.length; i=Utils_Arrays.ObtenerNumAleatorio(5, 0)) {
			
			
			array2[i]=array1[i];
			aux=array2[i]; 
					
			}
			
			
			System.out.print(aux+" ");	
			
					
		}

	}

}
