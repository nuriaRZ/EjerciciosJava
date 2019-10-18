package programacion.Capitulo05.bloque02;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class ejercicio05_Desplazar_Num_Usuario {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
				
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de desplazamientos que desee"));
		int aux=array[array.length-num];
			
		
		System.out.println();
		
		for (int i= array.length-(num); i>0; i--) {
			array[i]=array[i-(num)];
						
		}
		
			array[0]=aux;
		
			System.out.println();
		
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
		}
			
	}	
				
}						
			
			
			
	


