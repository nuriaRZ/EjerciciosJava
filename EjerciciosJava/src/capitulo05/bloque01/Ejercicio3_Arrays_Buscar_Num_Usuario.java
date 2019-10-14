package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio3_Arrays_Buscar_Num_Usuario {

	public static void main(String[] args) {
		
		int num[]= new int[150];
		
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
		
		boolean encontrado=false;
		int i;
		for ( i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			if (numUsuario==num[i]) {
				encontrado=true;
				System.out.println("Tu numero "+numUsuario+" ha sido encontrado en la posicion "+i);
			}
			else {
				encontrado=false;
				System.out.println("Tu numero "+numUsuario+" no ha sido encontrado");	
			}
		
		}



	}

}
