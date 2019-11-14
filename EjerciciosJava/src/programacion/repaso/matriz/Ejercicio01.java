package programacion.repaso.matriz;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int longitud1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca longitud de filas"));
		int longitud2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud de columnas"));
		
		int matriz[][] = Utils_Arrays.crearMatrizNumAleatorio(longitud1, longitud2, 0, 100);
		
		Utils_Arrays.mostrarMatriz(matriz);
		
		int matriz2[][] = Utils_Arrays.crearMatrizNumAleatorio(longitud1, longitud2, 0, 100);
		Utils_Arrays.mostrarMatriz(matriz2);
		int matriz3[][] = new int [longitud1][longitud2];
		
		
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3.length; j++) {
				matriz3[i][j]=matriz[i][j]+matriz2[i][j];
			}
		}
		
		Utils_Arrays.mostrarMatriz(matriz3);

	}

}
