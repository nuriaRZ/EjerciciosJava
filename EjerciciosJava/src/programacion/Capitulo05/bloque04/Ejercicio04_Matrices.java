package programacion.Capitulo05.bloque04;

import programacion.Utils_Arrays;

public class Ejercicio04_Matrices {
	
	

	public static void main(String[] args) {
		//int matriz[][]=new int[5][5]; // creo la matriz
		int matriz[][]= new int[][] {{1,	2,	3,	4,	5},
			{2,	3,	4,	5, 1,	2,},
			{3,	4,	5,	1, 2,	3,},
			{4,	5,	1,	2, 3,	4},
			{5,	1,	2,	3,	4,	5}};
		matrizSimetrica(matriz);
	
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void matrizPositiva(int matriz[][]) {
		
		
		//inicializo la matriz dandole numeros al azar
		for (int i=0; i<matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=Utils_Arrays.ObtenerNumAleatorio(100, 0);							
			}			
		}		
		//recorro la matriz y la muestro por pantalla
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { //matriz[i].lentgh cantidad de elementos que tiene el primer array matriz[n]
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		boolean matrizPositiva=false; //bandera si el elemento de la matriz es positiva la inicializo en falso
		int i;
		do {		
		matrizPositiva=true; // le doy el valor de true para que cada vez que se ejecute el bucle el valor de la bandera este en true		
		int j;
		//recorro la matriz
			for ( i = 0; i < matriz.length; i++) {
				
				for (j = 0; j < matriz[i].length-1; j++) {
					if (matriz[i][j]>=0) {// si el elemento de la matriz es positivo sigo ejecutando el bucle
						matrizPositiva=true;						
					}
					else { // si encuentra un elemento negativo salgo del bucle
						matrizPositiva=false;
						break;
					}					
				}
			}

		}while(matrizPositiva==true && i!=matriz.length); // el bucle se ejecutara mientras se haya encontrado un elemento positivo y la iteraccion del bucle for
				// sea distinta de la longitud del array
			if (matrizPositiva==false) { // si el valor de la bandera es false, se ha encontrado un elemento negativo, matriz negativa
				System.out.println("Matriz negativa");
			}
			else System.out.println("Matriz positiva");
			
			
	}
	/**
	 * 
	 * @param matriz
	 */
	
	public static void matrizDiagonal (int matriz[][]) {		
		//1� diagonal el numero de la fila coincide con el numero de la columna
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i]==matriz[j]) {
					matriz[i][j]=Utils_Arrays.ObtenerNumAleatorio(100, 0);				
				}				
			}
		}
		
		//2� diagonal la suma de las posiciones es igual a la longitud de la matriz
/**		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				if (i+j==matriz.length-1) {
					matriz[i][j]=Utils_Arrays.ObtenerNumAleatorio(100, 0);
				}				
			}
		}*/
		boolean esDiagonal=false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i!=j) esDiagonal=true;								
			}
		}		
		Utils_Arrays.mostrarMatriz(matriz);	
		if (esDiagonal==true)System.out.println("Es diagonal");
		else System.out.println("No es diagonal");
	}
	/**
	 * 
	 * @param matriz
	 */
	
	public static void matrizTriangularSuperior (int matriz[][]) {
		
		
		
		for (int i = 0; i < matriz.length; i++) {//filas
			for (int j = 0; j<matriz[i].length; j++) {//columnas
				if(j<i) {//si el indice de las columnas es menor que el indice de las filas, su elemento es 0
					matriz[i][j]=0;	
				} // si no se genera un numero al azar
				else matriz[i][j]=Utils_Arrays.ObtenerNumAleatorio(100, 0);						
			}			
		}
		Utils_Arrays.mostrarMatriz(matriz);		
	}
	/**
	 * 
	 * @param matriz
	 */
	
	public static void matrizDispersa (int matriz[][]) {
	
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i=Utils_Arrays.ObtenerNumAleatorio(matriz.length-1, 0)][j]=0;
				matriz[i][j=Utils_Arrays.ObtenerNumAleatorio(matriz.length-1, 0)]=0;
				matriz[i][j]=Utils_Arrays.ObtenerNumAleatorio(100, 0);
			}			
		}
		boolean esDispersa=false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]==0) esDispersa=true;				
			}			
		}
		
		Utils_Arrays.mostrarMatriz(matriz);
		if (esDispersa==true) System.out.println("Es dispersa");
		else System.out.println("No es dispersa");
	}
	/**
	 * 
	 * @param matriz
	 */
	
	//i*longitud de la fila + j para matrices cuadradas
	public static void arrayUnidimensional (int matriz[][]) {
		matriz=Utils_Arrays.crearMatrizNumAleatorio(5, 5, 0, 100);
		
		Utils_Arrays.mostrarMatriz(matriz);
		int contadorPosiciones=0;
		
		for (int i = 0; i < matriz.length; i++) {
			contadorPosiciones += matriz[i].length;			
		}
		int array[] = new int [contadorPosiciones];
		
		int k=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k]=matriz[i][j];
				k++;
			}
		}
		Utils_Arrays.mostrarArray(array);	

	}
		
	
	
	/**
	 * 
	 * @param matriz
	 */
	
	public static void matrizSimetrica (int matriz[][]) {
	/**	int matriz[][]= new int[][] {{1,	2,	3,	4,	5},
									{2,	3,	4,	5, 1,	2,},
									{3,	4,	5,	1, 2,	3,},
									{4,	5,	1,	2, 3,	4},
									{5,	1,	2,	3,	4,	5}};*/
		
		boolean esSimetrica = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j]!=matriz[j][i])
				esSimetrica = false;
			}
			
		}
		if (esSimetrica) System.out.println("Matriz simetrica");
		else System.out.println("Matriz no simetrica");
		Utils_Arrays.mostrarMatriz(matriz);
		
		
	}
	/**
	 * 
	 */
	//public static int[][] matrizMenosUnafila (int matriz [][], int filaAEliminar) {
		
		
		//if(filaAEliminar < 0 || filaAEliminar >= matriz.length) {
			//return matriz;
		//}
		
		//int nuevaMatriz[][]
		
									
									
	//}								
	
}	

