package programacion.Capitulo05.bloque02;

import programacion.Utils_Arrays;

public class Ejercicio02_3_Arrays {

	public static void main(String[] args) {
		
		int array1[]= Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		int array2[]= Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		int array3[]= new int [5];
		
		Utils_Arrays.mostrarArray(array1);
		System.out.println();
		Utils_Arrays.mostrarArray(array2);
		
		System.out.println();
		System.out.println("Contenido del tercer array");
		
		for (int i = 0; i < array3.length; i++) {
				
			if (i%2!=0) {
				array3[i]=array1[i];
			}
			
			if (i%2==0) {
				array3[i]=array2[i];
			}
			
			System.out.print(array3[i]+" ");
			
		}
		
		
		
	

		
		
	}
}	


