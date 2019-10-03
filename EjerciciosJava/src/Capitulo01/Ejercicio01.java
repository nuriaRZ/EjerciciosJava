package Capitulo01;
import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String var1 = JOptionPane.showInputDialog("Introduce un numero");
		String var2 = JOptionPane.showInputDialog("Introduce otro numero");
		
		System.out.println("NUMEROS INICIALES:\n"
				+ "Numero 1: "+var1
				+ "\nNumero 2: "+var2);
		
		int num2= Integer.parseInt(var1);
		int num1 = Integer.parseInt(var2);	
		System.out.println("\n"
				+ "NUMEROS FINALES\n"
				+ "\nNumero 1: "+num1 
				+ "\nNumero 2: "+num2);
	}

}
