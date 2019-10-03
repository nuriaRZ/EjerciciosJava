package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class ejercicioCondicionales {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce el primer numero");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo numero");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el tercer numero");
		int num3 = Integer.parseInt(str);
		
		if (num1>num2 && num1>num3 ) {
			System.out.println("Los numeros introducidos son: "+num1+","+num2+","+num3
					+ "\nEl numero mayor es el "+num1 );
		}	
			else {
				if (num2>num1 && num2>num3) {
					System.out.println("Los numeros introducidos son: "+num1+","+num2+","+num3
							+"\nEl numero mayor es el "+num2 );
				}
				else {
					System.out.println("Los numeros introducidos son: "+num1+","+num2+","+num3
							+"\nEl numero mayor es el "+num3);
					
			}
		
		
		}
		
		

	}

}
