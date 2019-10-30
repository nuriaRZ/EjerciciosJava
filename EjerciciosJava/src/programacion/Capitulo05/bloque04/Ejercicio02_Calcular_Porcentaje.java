package programacion.Capitulo05.bloque04;

import programacion.Utils_Arrays;

public class Ejercicio02_Calcular_Porcentaje {

	public static void main(String[] args) {
		int array[] = Utils_Arrays.crearArrayNumAleatorio(10, 0, 10);
		Utils_Arrays.mostrarArray(array);
		System.out.println();
		int contadorAprobados=0;
		int contadorSuspensos=0;
		float porcentajeAprobados;
		float porcentajeSuspensos;
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>=5) {
				contadorAprobados++;
				
			}
			if (array[i]< 5) {
				contadorSuspensos++;
				
			}
			
		}
		System.out.println("Aprobados: "+contadorAprobados
						+"\nSuspensos: "+contadorSuspensos);
		System.out.println();
		porcentajeAprobados=(contadorAprobados/(float)array.length)*100;
		porcentajeSuspensos=(contadorSuspensos/(float)array.length)*100;
		System.out.println("Porcentaje de aprobados: "+porcentajeAprobados
						+"\nPorcentaje de suspensos: "+porcentajeSuspensos);

	}
	

}
