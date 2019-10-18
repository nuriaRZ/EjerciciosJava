package programacion.Capitulo05.bloque02;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class ejercicio04_Desplazar_Num {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
		
		int aux=array[array.length-1];
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las posiciones que quieres que se desplace"));
		
		
		System.out.println();
		for (int i= array.length -1; i>0; i--) {
			array[i]=array[i-1];
			
			
			
		}
		
		array[0]=aux;
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
				
						
			
			
			
	}

}
