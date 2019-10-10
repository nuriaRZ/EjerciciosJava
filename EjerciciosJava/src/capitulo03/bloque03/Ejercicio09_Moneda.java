package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio09_Moneda {

	public static void main(String[] args) {
		int numAzar = (int) Math.random()*(2-1)+1;
		int numUsuario = 0;
		
		for (;numAzar!=numUsuario;) {
			numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige un lado de la moneda"
					+"\n1->Cara"
					+"\n2->Cruz"));
			
			if (numAzar==numUsuario) {
				JOptionPane.showMessageDialog(null, "HAS GANADO");
			}
			else {
				JOptionPane.showMessageDialog(null, "HAS PERDIDO");
				}
				
			}
	}
		
		
		

}


