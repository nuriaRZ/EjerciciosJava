package programacion.Tareas;

import programacion.Utils_Arrays;

public class Array_5elem_No_Repetir2_Otra_Forma {

	public static void main(String[] args) {
		
		int array[] = new int [10];
		
		int aux;
		
		
		
			
		for (int i = 0; i<array.length; i++) {
			
			boolean yaExiste=false; // Bandera que indica que indique que el cantidato es utilizado
			do {
				aux=Utils_Arrays.ObtenerNumAleatorio(9, 0);
				// COMPRUEBO SI AUX EXISTE EN LAS POSICIONES PREVIAS A i
				
				
				for(int j=0; j<i; j++);
				
				if (array[i]==aux) {
					yaExiste=true;
				}
				
			}while(yaExiste);
			array[i]=aux;
			
		}
		
		Utils_Arrays.mostrarArray(array);

	}

}
