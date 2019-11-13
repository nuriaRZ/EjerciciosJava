package programacion.ExamenTipoC;

import programacion.Utils_Arrays;

public class Apartado_c {

	public static void main(String[] args) {
		
		int array[]= Utils_Arrays.crearArrayNumAleatorio(3, 0, 100); // declaro el array con una longitud de 20 y con numeros 
		//aleatorios entre el 0 y el 100
		Utils_Arrays.mostrarArray(array);//muestro el array
		//recorro el array
		for (int i = 0; i < array.length; i++) {
			boolean noEsDivisor;//bandera que me ayudara a saber si el numero es divisor o no
			
			System.out.println("\nDivisores de "+array[i]);//imprimo el elemento del que quiero saber sus divisores
			do { // hago un bucle que se repetira mientras la bandera noEsDivisor sea true
				noEsDivisor=true;// lo pongo a true en cada vuelta
				for (int j = 1; j <= array[i]; j++) { // este bucle sacara todos los numeros que existen desde el 1 hasta el valor del array
					if (array[i]%j==0) { //si el valor del array entre este numero su resto es cero , el numero es divisor
						noEsDivisor=false;// cambio el valor de la bandera
						System.out.print(j+" ");//imprimo todos los divisores
					}
				}				
			}while(noEsDivisor);				
		}
	}
}
