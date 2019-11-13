package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class Apartado_b {

	public static void main(String[] args) {
		
		int num = 7;
		System.out.println("Numero: "+ num);
	System.out.println();
	
	// como sabemos que el 1 es divisor si o si empezamos a dividir el num desde la posicion hasta si mismo
	for (int i = 2; i < num-1; i++) {
		if (num%i==0) { // si el num dividido por cualquier otro num que no sea el su resto es 0 el num es compuesto
			System.out.println("El numero no es primo");
			return; // si es igual a 0 sale del bucle 
		}		
	}
	//si no es igual a cero tras a ver dividido por todos los nums
	System.out.println("El numero es primo");
	

	}

}
