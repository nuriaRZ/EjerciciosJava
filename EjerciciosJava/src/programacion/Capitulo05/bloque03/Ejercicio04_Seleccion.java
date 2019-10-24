package programacion.Capitulo05.bloque03;

import programacion.Utils_Arrays;

public class Ejercicio04_Seleccion {

	public static void main(String[] args) {
		int array[]= Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
		int j;
			//	RECORRER EL ARRAY
			for (int i = 0; i < array.length; i++) {
					int menor = i; // GUARDAR EL INDICE DE CUYO CONTENIDO VA A SER COMPARADO CON ARRAY[J]
					
					// RECORRER ARRAY DESDE LA POSICION DE i 
				for ( j = i; j < array.length; j++) {
					if (array[j]<array[menor]) { // SI EL CONTENIDO QUE SE ENCUENTRA EN LA POSICION J ES MENOR QUE LA ANTES GUARDADA
						menor=j; // GUARDAMOS SU POSICION
					
					}
				}
				// CREAR UNA VARIABLE AUXILIAR DONDE SE GUARDA EL VALOR DE LA POSICION ACTUAL
				int aux=array[i]; 
				array[i]=array[menor]; //EN LA POSICION ACTUAL GUARDAMOS EL VALOR MENOR ENCONTRADO EN UNA POSICION GUARDADA EN LA VARIABLE MENOR 
				array[menor]=aux; // INTERCAMBIAMOS VALORES DEL QUE ESTABA EN LA POSICION GUARDADA EN LA VARIABLE MENOR POR EL GUARDADO EN
								  // LA VARIABLE AUX	
	
		}
	
		Utils_Arrays.mostrarArray(array);

	}

}
