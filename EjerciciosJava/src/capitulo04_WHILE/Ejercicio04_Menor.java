package capitulo04_WHILE;

import javax.swing.JOptionPane;

public class Ejercicio04_Menor {

	public static void main(String[] args) {
	
		int menor=0;
		int num=-1;		
		
		while (num!=0) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero \n Pulse 0 para salir"));			
			if (num==-1)menor=num;
			else {
				if (num<menor && num != 0) menor=num;
			}
			
					
		}
		
		System.out.println("El numero menor es: "+ menor);	
		
		
	}

}
