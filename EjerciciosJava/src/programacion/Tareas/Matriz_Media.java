package programacion.Tareas;

import programacion.Utils_Arrays;

public class Matriz_Media {

	public static void main(String[] args) {
		int matrizA[][]=new int [10][10];
		int num=1;
		int i=0, j=0;
		for ( i = 0; i < matrizA.length; i++) {
			for ( j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j]=num++;
			}			
		}
		Utils_Arrays.mostrarMatriz(matrizA);
		int matrizB[][]=new int [3][3];
		do {
		inicializarMatrizPequenia(matrizA, matrizB);
		elementoPrincipal(matrizA, matrizB);
		}while (matrizB[1][1]!=matrizA[i=matrizA.length-1][j=matrizA.length-1]);
	}	
	/**
	 * 	
	 */
		
	public static void inicializarMatrizPequenia (int matrizA[][], int matrizB [][]) {
	int i =0, j=0;
			
		
			for ( i = 0; i< matrizB.length-1; i++) {			
				for ( j = 0; j < matrizB[i].length-1; j++) {
					matrizB[i+1][j+1]=matrizA[i][j];
				
					if(i==0||j==0) matrizB[i][j]=0;								
				}
			
			}
			Utils_Arrays.mostrarMatriz(matrizB);
	}		
	
	
	public static void elementoPrincipal (int matrizA[][], int matrizB[][]) {
		
		int numCeros=0;
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				if (matrizB[i][j]==0) numCeros++;
			}
		}
		
		// resto el numCeros a la longitud de la matriz -1 no se cuenta el elemento que
		// va a ser modificado
		
		int resta = numCeros-(matrizB.length-1);
		int suma=0;
		int aux;
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				
				if (i!=1 && j!=1) {
					 aux=matrizB[i][j];
					 suma=aux+matrizB[i][j];
				}				
			}
		}
		
		int media = suma/resta;
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				
				if (i==1 && j==1) matrizB[i][j]=media;
			}
		}
		
		Utils_Arrays.mostrarMatriz(matrizB);
	
	
	// INTERCAMBIO ENTRE MATRICES
	
		for (int i = 0; i < matrizB.length-1; i++) {
			for (int j = 0; j < matrizB[i].length-1; j++) {
				matrizA[i][j]=matrizB[i+1][j+1];
				
			}
		}
	
		Utils_Arrays.mostrarMatriz(matrizA);
	}
		
		
		

	

}
