package programacion.Tareas;

import programacion.Utils_Arrays;

public class Repaso_Examen {

	public static void main(String[] args) {
		
		int matriz [][] = new int [][] {{1,	2,	3},
										{4,	5,	6},
										{7,	8,	9}};
	Utils_Arrays.mostrarMatriz(matriz);
        int posicionI=0;
        int posicionJ=0;
        int aux1;
        int aux2;
        int guardado1=0;
        int guardado2=0;
        
        for (int i = 0; i < matriz.length; i++) {
        	int j=0;
        	
			for ( j = 0; j < matriz[i].length; j++) {
				if (j==0) {
					guardado2=matriz[i][j];
					
				/**	for (j = matriz.length-1; j>0; j--) {
						matriz[i][matriz.length-1]=guardado;
					}*/
				}
				aux2 = guardado2;
				
				if (j==matriz.length-1) {
					guardado1 = matriz[i][j];							
				}
				aux1= guardado1;
				matriz[i][0]=aux1;
				matriz[i][2] = aux2;
				
			}
		}
        
        Utils_Arrays.mostrarMatriz(matriz);
        
  /**      for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j==0) {
					guardado = matriz [i][j];
					matriz[i][j+(matriz.length-1)] = guardado;
				}
			}
		}

		Utils_Arrays.mostrarMatriz(matriz);*/
	
	}

}
