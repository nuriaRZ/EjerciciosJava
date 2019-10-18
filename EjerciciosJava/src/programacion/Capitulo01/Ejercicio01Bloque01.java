package programacion.Capitulo01;

import javax.swing.JOptionPane;

public class Ejercicio01Bloque01 {   

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un numero entero");
		int NumEntero = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un numero flotante");
		Float NumFloat = Float.parseFloat(str);
		str= JOptionPane.showInputDialog("Introduce un numero doble");
		Double NumDouble = Double.parseDouble(str);		
		
		float media = (float) ((NumEntero+NumFloat+NumDouble) / 3);
		
		
		System.out.println("La media de los numeros es:" + media );
		
		

	}

}
