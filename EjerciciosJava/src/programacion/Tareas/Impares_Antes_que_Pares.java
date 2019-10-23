package programacion.Tareas;

import programacion.Utils_Arrays;

public class Impares_Antes_que_Pares {

	public static void main(String[] args) {
		int array[] = Utils_Arrays.crearArrayNumAleatorio(10, 0, 9);
		
		// Mostrar array original
		Utils_Arrays.mostrarArray(array);
		
		// CREO UN ARRAY AUX QUE CONTIENE NUM IMPARES
		
		int impares[]= new int [array.length];
		
		// RECORRO ARRAY ALAMACENANDO LOS NUM IMPARESS
		int indiceArrayImpares = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==1) {
				impares[indiceArrayImpares]=array[i];
				indiceArrayImpares++;
			}
		}
		
		Utils_Arrays.mostrarArray(impares);

	}

}
