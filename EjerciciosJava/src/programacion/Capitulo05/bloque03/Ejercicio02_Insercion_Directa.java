package programacion.Capitulo05.bloque03;

import programacion.Utils_Arrays;

public class Ejercicio02_Insercion_Directa {

	public static void main(String[] args) {
		
		int array[] = Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);
		Utils_Arrays.mostrarArray(array);
		int j;
		
		for (int i = 0; i < array.length; i++) {
			
			int aux=array[i];
			
			for ( j = i; j >0 && array[j-1]>aux; j--) {
				array[j]=array[j-1];
				
				
			}
			
			array[j]=aux;
			
		}
		Utils_Arrays.mostrarArray(array);
		

	}

}
