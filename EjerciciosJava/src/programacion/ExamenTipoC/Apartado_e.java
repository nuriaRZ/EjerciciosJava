package programacion.ExamenTipoC;

import programacion.Utils_Arrays;

public class Apartado_e {

	public static void main(String[] args) {
		
		int array[] = new int [20]; // declaro array con longitud de 20
		
		//recorro array
		for (int i = 0; i < array.length; i++) {
			boolean numYaExiste;//bandera para saber si el numero ya ha salido
			int num; //declaro la variable num
			
			do {
				numYaExiste = false; //le asigno el valor false en cada iteraccion del bucle do while para que asi se siga ejecutando
				num = Utils_Arrays.ObtenerNumAleatorio(40, 0);//le asigno un numero al azar entre 0 y 40 a la variable num
				//vuelvo a recorrer el array para saber si el numero guardado en num ya ha salido
				for (int j = 0; j < array.length; j++) {
					if(array[j]==num) numYaExiste=true; // si lo encuentra cambio el valor de la bandera a true
				}
				
			}while(numYaExiste);
			
			array[i]=num; //le asigno el valor de la variable num a la posicion actual del array
		}
		
		Utils_Arrays.mostrarArray(array); //muestro el array

	}

}
