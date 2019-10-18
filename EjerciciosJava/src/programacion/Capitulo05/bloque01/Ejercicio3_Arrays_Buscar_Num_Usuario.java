package programacion.Capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio3_Arrays_Buscar_Num_Usuario {

	public static void main(String[] args) {
		
		int num[]= new int[150];		
		boolean encontrado=false;
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			
		}
		for (int i=0; i<num.length; i++) {
			
			System.out.print(num[i]+" ");
		}
		
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
		
		//linea en blanco
		System.out.println();
		
		for (int i=0; i<num.length && !encontrado; i++) {
			
			if (numUsuario==num[i]) {				
				System.out.println("Tu numero "+numUsuario+" ha sido encontrado en la posicion "+i);
			encontrado=true;
			}
		}	
			if (!encontrado) {
				
				System.out.println("Tu numero "+numUsuario+" no ha sido encontrado");
				
			}
		
	
		
			
			

		
	}
		
		



}


