package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_Condicional3Num {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca el primer numero");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo numero");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el tercer numero");
		int num3 = Integer.parseInt(str);
		
		if (num1 > num2) {
			System.out.println("Los numeros son: "+num1+", "+num2+" , "+num3
					+"\nEl numero mayor es " + num1);
		}
		else { 
			 if (num2 > num1) {
				 System.out.println("Los numeros son: "+ num1 +", "+num2+" , "+num3
						+"\nEl numero mayor es " + num2);
			 }
			 else {
				 if (num1 > num3){
					 System.out.println("Los numeros son: "+ num1 +", "+num2+" , "+num3
								+"\nEl numero mayor es " + num1);	 
				 }
				 else {
					 if (num2 > num3){
						 System.out.println("Los numeros son: "+ num1 +", "+num2+" , "+num3
									+"\nEl numero mayor es " + num2);
					 }
					 else {
						 System.out.println("Los numeros son: "+ num1 +", "+num2+" , "+num3
									+"\nEl numero mayor es " + num3);
					 }
				 }
			 }	 
		}

	}

}
