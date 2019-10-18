
package programacion.capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio10_Moneda_Contador {

	public static void main(String[] args) {
		int numAzar = (int) Math.random()*(2-1)+1;
		int numUsuario = 0;
		int contPersona=0;
		int contMaquina=0;
		
		
		
			for (;contPersona!=2 && contMaquina!=2;) {
				numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige un lado de la moneda, \ntienes 3 intentos"
					+"\n1->Cara"
					+"\n2->Cruz"));
				
			if (numUsuario!=1 && numUsuario!=2 ) JOptionPane.showMessageDialog(null, "Numero no valido");
				if (numAzar==2 && numUsuario==2) {
				contPersona++;
				JOptionPane.showMessageDialog(null, "HAS ACERTADO CRUZ");
				}
				if (numAzar==1 && numUsuario==1) {
					contPersona++;
					JOptionPane.showMessageDialog(null, "HAS ACERTADO CARA");
				}
				else {
					if (numAzar==1 && numUsuario==2) {
					contMaquina++;
					JOptionPane.showMessageDialog(null, "HAS PERDIDO CARA");
					}
					if (numAzar==2 && numUsuario==1) {
						contMaquina++;
						JOptionPane.showMessageDialog(null, "HAS PERDIDO CRUZ");
					}
								
				}
			if (contPersona==2) {
				JOptionPane.showMessageDialog(null, "ENHORABUENA!!!! HAS GANADO");
			}
			if (contMaquina==2) {
				JOptionPane.showMessageDialog(null, "HAS PERDIDO VUELVE A JUGAR");	
			}
			
			}
		
		
	}	
		
		

}


