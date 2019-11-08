package programacion.Tareas;

import programacion.Utils_Arrays;

public class Matriz_Media {

	public static void main(String[] args) {
		int matriz[][]=new int [10][10];
		int num=1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=num++;
			}			
		}
		Utils_Arrays.mostrarMatriz(matriz);
		
		
		
		
		
		

	}

}
