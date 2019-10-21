package programacion.Capitulo05.bloque02;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class ejercicio05_Desplazar_Num_Usuario {

	public static void main(String[] args) {
		
		int array[]=Utils_Arrays.crearArrayNumAleatorio(5, 0, 100);
		Utils_Arrays.mostrarArray(array);
				
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de desplazamientos que desee"));
		int aux=0;
		int i;	
		
		
		System.out.println();
		
		for (int j=0; j<num;j++) {
			aux=array[array.length-1];	
			
			for ( i= array.length -1; i>0; i--) {
				array[i]=array[i-1];
				array[i-1]=aux;
			}
				
		}	
			
		array[0]=aux;
		
			System.out.println();
		
		for ( i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
		}
				
	}	
				
}						
			
			
			
	


