package programacion.Capitulo05.bloque03;

import programacion.Utils_Arrays;

public class Ejercicio03_Shell {

	public static void main(String[] args) {
		int array[]=Utils_Arrays.crearArrayNumAleatorio(10, 0, 100);
		Utils_Arrays.mostrarArray(array);
		boolean esMayor=false;
		int j;
		int multiplicador=array.length;
		do {
			esMayor=false;
		
			//RECORRER ARRAY HACIA ALANTE
			multiplicador = multiplicador / 2; 
			for (int i =multiplicador; i < array.length; i++) {
				int aux= array[i];
				//RECORRER EL MISMO ARRAY HACIA ATRAS MIENTRAS SEA MAYOR QUE LA I ANTERIOR Y SU CONTENIDO MAYOR QUE EL AUX
				for ( j = i; j >= (multiplicador) && array[j-(multiplicador)]> aux; j-=multiplicador) {
				array[j]=array[j-multiplicador];
				
				esMayor=true;
				
				}
				array[j]=aux;
			}	
			
			
		}while(esMayor==true);
		
		Utils_Arrays.mostrarArray(array);
		
	}

}
