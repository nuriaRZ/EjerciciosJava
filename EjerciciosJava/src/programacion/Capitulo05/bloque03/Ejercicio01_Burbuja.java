package programacion.Capitulo05.bloque03;

import programacion.Utils_Arrays;

public class Ejercicio01_Burbuja {

	public static void main(String[] args) {
		//CREO EL ARRAY
		int array[]= Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);
		//MUESTRO EL ARRAY
		Utils_Arrays.mostrarArray(array);
		
		boolean esMayor = false;
		
		int contador=0;
		
		
		do {
			
			esMayor=false;
			
			
			Utils_Arrays.mostrarArray(array);
			for (int i = 0; i < array.length-1; i++) {
			
					if (array[i]>array[i+1]) {
					
						int aux = array[i];
						array[i]=array[i+1];
						array[i+1]=aux;
						esMayor=true;
					
					
				}
			}
			contador++;
			System.out.println("Vuelta nº: " + contador);
				
			
			
		}while(esMayor);		

		
	}

}
