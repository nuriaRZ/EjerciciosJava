package programacion.repaso.arrays;

import programacion.Utils_Arrays;

public class Ejercicio00 {

	public static void main(String[] args) {
		int array [] = Utils_Arrays.crearArrayNumAleatorio(5, 0, 10);
		
		Utils_Arrays.mostrarArray(array);
		
		int suma = 0;		
		int menor=0;
		int mayor=0;
		
		
		for (int i = 0; i < array.length; i++) {
		suma += array[i];
		}
		
		System.out.println("\nSuma: "+ suma);
		System.out.println("\nMedia:"+(suma/array.length));
		
		for (int i = 0; i < array.length-1; i++) {
			if (i==0) {
				mayor=array[i];
				menor=array[i];
			}
			
			else {
				
			
				if (array[i]>mayor) {
					mayor = array[i];
				}
				if (array[i]<menor)
					menor=array[i];
			}
		}	
		System.out.println("\nMayor: "+ mayor);
		System.out.println("\nMenor: "+ menor);
	}
	
	

}
