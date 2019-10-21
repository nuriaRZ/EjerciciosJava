package programacion.Capitulo05.bloque02;

import programacion.Utils_Arrays;

public class Ejercicio01_Pasar_Positivo_Negat {

	public static void main(String[] args) {
		
		int num[] = Utils_Arrays.crearArrayNumAleatorio(10, -100, 100);
		Utils_Arrays.mostrarArray(num);
		
		
		
		System.out.println();
		for (int i=0; i<num.length; i++) {
		
			//EN EL CASO DE QUE SEA PAR Y POSITIVO
			if (num[i]%2==0) {
				
				//MULTIPLICAMOS POR -1 PARA QUE SEAN NEGATIVOS
				
				num[i]=num[i]*(-1);
																	
			}
			
							
			}
		Utils_Arrays.mostrarArray(num);
			
		}
		

	

	

}
