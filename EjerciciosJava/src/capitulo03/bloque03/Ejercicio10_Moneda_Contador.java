package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio10_Moneda_Contador {

	public static void main(String[] args) {
		int numAzar = (int) Math.random()*(2-1)+1;
		int numUsuario = 0;
		int contPersona=0;
		int contMaquina=0;
		
		
		if (contPersona!=2 && contMaquina!=2) {
			for (;numAzar!=numUsuario;) {
				numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige un lado de la moneda"
					+"\n1->Cara"
					+"\n2->Cruz"));
			
				if (numAzar==numUsuario) {
				contPersona++;
				JOptionPane.showMessageDialog(null, "HAS GANADO");
				}
				else {
					contMaquina++;
					JOptionPane.showMessageDialog(null, "HAS PERDIDO");
				}
				
			}
			JOptionPane.showMessageDialog(null, "HAS PERDIDO "+ contMaquina+" veces");
			JOptionPane.showMessageDialog(null, "HAS GANADO "+ contPersona+" veces");
		}
		
		
		
	}	

}


