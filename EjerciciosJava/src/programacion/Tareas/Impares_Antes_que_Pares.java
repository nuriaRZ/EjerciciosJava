package programacion.Tareas;

import programacion.Utils_Arrays;

public class Impares_Antes_que_Pares {

	public static void main(String[] args) {
		int array[] = Utils_Arrays.crearArrayNumAleatorio(10, 0, 9);
		 
		// Mostrar array original
		Utils_Arrays.mostrarArray(array);
		
		
		// CREO UN ARRAY AUX QUE CONTIENE NUM IMPARES
		
		int impares[]= new int [array.length];
		int aux;
		// RECORRO ARRAY ALAMACENANDO LOS NUM IMPARESS
		int indiceArrayImpares = 0;
		int pares[]= new int [array.length];// ARRAY AUX PARA LOS NUM PARES
		int indiceArrayPares= 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==1) {
				impares[indiceArrayImpares]=array[i];
				indiceArrayImpares++;
				
				
			}

		}
		
		for (int j = 0; j < array.length; j++) {
			if (array[j]%2==0) {
				pares[indiceArrayPares]=array[j];
				indiceArrayPares++;
							
			}
		
		}
		
		
		// COPIAMOS EL CONTENIDO DE LOS DOS ARRAY
		System.arraycopy(impares, 0, array, 0, indiceArrayImpares);
		// ESTE COPIA EL CONTENIDO DE LOS PARES DONDE TERMINA LOS IMPARES
		System.arraycopy(pares, 0, array, indiceArrayImpares, indiceArrayPares);
	// MUESTRO ARRAY
		Utils_Arrays.mostrarArray(array);
		
	}

}


