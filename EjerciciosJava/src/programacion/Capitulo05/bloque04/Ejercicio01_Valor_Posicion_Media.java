package programacion.Capitulo05.bloque04;

import programacion.Utils;
import programacion.Utils_Arrays;

public class Ejercicio01_Valor_Posicion_Media {

	public static void main(String[] args) {
		
		
		boolean longitudPar=false;
		
		do {
			int longitud = Utils.obtenerNumUsuario("Introduzca la longitud del array");
			int array[]= Utils_Arrays.crearArrayNumAleatorio(longitud, 0, 100);
			Utils_Arrays.mostrarArray(array);
			
		
			for (int i = 0; i < array.length; i++) {
				
				
				if (array.length%2==0) {
							
					longitudPar=true;
					System.out.println("\nLongitud par");
					break;
					
					
			}
			
					if (array.length%2==1) {
						longitudPar=false;
						System.out.println("\nValor medio: " + array[array.length/2]);
						break;
				
					}
					
			
			
			}
		}while (longitudPar==true);	
		

	}

}
