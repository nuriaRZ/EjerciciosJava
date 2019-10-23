package programacion.Capitulo05.bloque03;

import programacion.Utils_Arrays;

public class Ejercicio01_Burbuja {

	public static void main(String[] args) {
		//CREO EL ARRAY
		int array[]= Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);
		//MUESTRO EL ARRAY
		Utils_Arrays.mostrarArray(array);
		
		int contador=0;
		boolean esMayor = true;
		
		
		do {
			
			esMayor=false;
			contador++;
			Utils_Arrays.mostrarArray(array);
			for (int i = 0; i < array.length-1; i++) {
				
			
				for (int j =0; j<array.length-1; j++) {
				
					if (array[j]<array[j+1]) {
					
						int aux = array[j+1];
						array[j]=aux;
						esMayor=true;
					
					
				}
			}	
				
			
			}
		}while(esMayor);		
				
				
					
					
			
		
		
		
		Utils_Arrays.mostrarArray(array);
		
	}

}
