package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_No_Repetir {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		
		int aux;
		
		boolean NumRepetido=false;
		
			
		for (int i = 0; i<array.length; i++) {
			
			aux=Utils_Arrays.ObtenerNumAleatorio(5, 0);
			
			
			for (int  j = 0; j < array.length; j++) {
								
				if (array[j]==aux) {
					NumRepetido=true;
					break;
				}
			}
			
			if (NumRepetido==true) {
				NumRepetido=false;
				i--;//Volver a la posicion del array anterior
			}
			else {
				array[i]=aux;
			}
			
				
		}
		
	for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
	}		
	

	}

}
