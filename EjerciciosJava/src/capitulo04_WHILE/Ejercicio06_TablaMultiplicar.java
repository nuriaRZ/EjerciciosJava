package capitulo04_WHILE;

import javax.swing.JOptionPane;

public class Ejercicio06_TablaMultiplicar {

	public static void main(String[] args) {
	
		int num=-1;
		String tablaMultiplicar= ""; 
		
		for (; num!=0;) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:\nPulse 0 para terminar"));
		
			if (num !=0) {
				tablaMultiplicar="";
				for (int i=1; i<11; i++) {
					tablaMultiplicar+= num+" x " + i + "=" + (num*i)+"\n";	
				}
			}	JOptionPane.showMessageDialog(null, tablaMultiplicar);
			
		}
		
	}

}
