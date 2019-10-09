package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio08_Num_Al_Azar {

	public static void main(String[] args) {
	
	int num = obtenerNumeroAzar();
	int numPedido=0;
	
		for (;num!=numPedido;) {
			
			numPedido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		
			if (num == numPedido) {
					JOptionPane.showMessageDialog(null,"HAS ACERTADO!!");
			}
			else {
				if (num > numPedido) {
					JOptionPane.showMessageDialog(null,"Has fallado!! El número es mayor"+"\nVuelve a intentarlo");
				}
				if (num < numPedido) {
					JOptionPane.showMessageDialog(null,"Has fallado!! El número es menor"+"\nVuelve a intentarlo");
				}
		
			}

		}
	}
		
		
		
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
}
