package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio08_Num_Al_Azar {

	public static void main(String[] args) {
	
	int num = obtenerNumeroAzar();
	int numPedido=-1;
	
		for (;num!=numPedido;) {
			
			numPedido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de 0-100"));
		
			if (num == numPedido) {
					JOptionPane.showMessageDialog(null,"HAS ACERTADO!! El numero es "+numPedido);
			}
			else {
				if (num > numPedido) {
					JOptionPane.showMessageDialog(null,"Has fallado!! El numero es mayor que "+numPedido+"\nVuelve a intentarlo");
				}
				if (num < numPedido) {
					JOptionPane.showMessageDialog(null,"Has fallado!! El numero es menor que "+numPedido+"\nVuelve a intentarlo");
				}
		
			}

		}
	}
		
		
		
	
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
}
