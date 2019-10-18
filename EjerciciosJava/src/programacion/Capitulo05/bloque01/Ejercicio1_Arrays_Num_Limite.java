package programacion.Capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio1_Arrays_Num_Limite {

	public static void main(String[] args) {
		
		int limiteInf, limiteSup;
		int num[]= new int[150];
		
		limiteInf = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite inferior"));
		limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite superior"));
		
		for (int i=0; i<num.length; i++) {
			int limite = (limiteSup-(limiteInf));
			num[i]=(int)Math.round(Math.random()*limite+(limiteInf));
			
			System.out.print(num[i]+" ");
	
		}

	}

}
