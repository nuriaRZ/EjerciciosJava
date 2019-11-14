package programacion.Tareas;

import programacion.Utils_Arrays;

public class Repaso_Examen {

	public static void main(String[] args) {
		
		int matriz [][] = new int [][] {{1,	2,	3},
										{4,	5,	6},
										{7,	8,	9}};
	Utils_Arrays.mostrarMatriz(matriz);
	
	int aux=0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				aux = matriz[i][0];
				matriz[i][0] = matriz[i][matriz.length-1];
				matriz[i][matriz.length-1]=aux;
			}
		}
		Utils_Arrays.mostrarMatriz(matriz);
	}

}
