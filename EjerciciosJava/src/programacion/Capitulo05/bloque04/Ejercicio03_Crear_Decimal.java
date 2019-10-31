package programacion.Capitulo05.bloque04;

import programacion.Utils_Arrays;

public class Ejercicio03_Crear_Decimal {

	public static void main(String[] args) {
		int arrayEntero[]=Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);		
		float arrayDecimal[]=Utils_Arrays.crearArrayFloatNumAleatorio(10, 0, 100);
		float arrayResultado[]=new float[10];
		int contador=0;
		
		System.out.println("Array entero:");
		Utils_Arrays.mostrarArray(arrayEntero);
		
		System.out.println("Array Decimal:");
		for (int i = 0; i < arrayDecimal.length; i++) {
			arrayDecimal[i]=arrayDecimal[i]/100;
			System.out.print(arrayDecimal[i]+" ");
			
			if(arrayDecimal[i]<0.50 && arrayDecimal[i]>0.00) {
				contador++;
				
			}
			
			
		}
		
		System.out.println("\nArray resultante");
		
		for (int i = 0; i < arrayResultado.length; i++) {
			arrayResultado[i]=arrayEntero[i]+arrayDecimal[i];
			System.out.print(arrayResultado[i]+" ");
		}
		

		System.out.println("\nCantidad de numeros cuya parte decimal se encuentra entre .00 y 0.49: "+contador);
		
		

	}

}
