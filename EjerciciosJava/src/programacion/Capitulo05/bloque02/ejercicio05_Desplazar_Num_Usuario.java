package programacion.Capitulo05.bloque02;

import programacion.Utils_Arrays;

public class ejercicio05_Desplazar_Num_Usuario {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
		
		int aux=array[array.length-1];
		
		
		
		System.out.println();
		for (int i= array.length -1; i>0; i--) {
			array[i]=array[i-1];
			
			
			
		}
		
		array[0]=aux;
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
				
						
			
			
			
	}

}
