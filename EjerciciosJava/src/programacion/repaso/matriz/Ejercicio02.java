package programacion.repaso.matriz;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int matriz[][] = Utils_Arrays.crearMatrizNumAleatorio(4, 4, 0, 10);
		Utils_Arrays.mostrarMatriz(matriz);
		
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila que quieres sumar"));
		int col = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna que quieres sumar"));
		if (fila > matriz.length-1) {
			
			 fila = Integer.parseInt(JOptionPane.showInputDialog("El numero de filas existentes son de 0-3\n"
					+"Introduce la fila que quieres sumar"));
		}
		if (col > matriz.length-1) {
			
			 col = Integer.parseInt(JOptionPane.showInputDialog("El numero de columnas existentes son de 0-3\n"
					+"Introduce la columna que quieres sumar"));
		}
		int sumaFilas=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==fila) {
				sumaFilas+=matriz[i][j];	
				}
			}
		}
		System.out.println("suma de la fila "+fila+ " : "+sumaFilas);
		
		int sumaCol=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j==col) {
				sumaCol+=matriz[i][j];	
				}
			}
		}
		System.out.println("suma de la columna "+col+ " : "+sumaCol);
		int sumaDiagonal=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==j) {
					sumaDiagonal+=matriz[i][j];
				}
			}
		}
		System.out.println("suma de la diagonal principal: "+sumaDiagonal);
		
		int sumaDiagonalInv=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i+j==matriz.length-1) {
					sumaDiagonalInv+=matriz[i][j];
				}
			}
		}
		System.out.println("suma de la diagonal inversa: "+sumaDiagonalInv);
		
		int suma=0;
		int cantElem=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				cantElem++;
				suma+=matriz[i][j];
				
			}
		}
		System.out.println("Media de la matriz: "+suma/cantElem);
	}

}
