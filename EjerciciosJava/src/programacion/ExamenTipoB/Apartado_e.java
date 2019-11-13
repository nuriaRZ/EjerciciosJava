package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class Apartado_e {

	public static void main(String[] args) {
		
		int array[] = new int [100]; // declaro array con longitud maxima de 100
		// le asigno a las dos primeras posiciones el valor uno como indica la serie de Fibonacci
		array[0]=1;
		array[1]=1;
		
		//recorro el array a partir de la posicion 2
		for (int i = 2; i < array.length; i++) {
			//guardo en la posicion actual la suma del los numeros guardados en las 2 posiciones anteriores
			array[i]=array[i-1]+array[i-2];
		}	
		Utils_Arrays.mostrarArray(array); // muestro el array

	}

}
