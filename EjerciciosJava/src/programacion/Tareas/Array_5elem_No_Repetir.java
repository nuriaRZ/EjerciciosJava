package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_No_Repetir {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		int i;
		int aux;
		
		boolean NumRepetido=false;
		
			
		for (int j = 0; j>0; j++) {
			
			aux=array[array.length-1];
			
			for ( i = 0; i < array.length; i++) {
								
				array[i]=Utils_Arrays.ObtenerNumAleatorio(0, 5);
				array[i]=array[i-1];
				array[i-1]=aux;		
				
			}
			
			if (array[i]==aux) {
				array[i]=Utils_Arrays.ObtenerNumAleatorio(0, 5);
				NumRepetido=true;
			}
			else NumRepetido=false;
			
		System.out.print(array[i]+" ");	
		}

	}

}
