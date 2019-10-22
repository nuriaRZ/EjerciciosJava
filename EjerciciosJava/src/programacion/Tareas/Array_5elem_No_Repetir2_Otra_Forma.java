package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_No_Repetir2_Otra_Forma {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		
		int aux;
		boolean yaExiste=false;
		
		
			
		for (int i = 0; i<array.length-1; i++) {
			
			do {
				array[i]=Utils_Arrays.ObtenerNumAleatorio(5, 0);
				aux=array[i];
				for(int j=array[i-1]; j<array.length-1; j--);
				
				if (array[i]==aux) {
					yaExiste=true;
				}
				
			}while(yaExiste==true);
			
		}	
			
			
			
				
		
		
	for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
	}		
	

	}

}
