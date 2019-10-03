package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02_Calculadora {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("1.-Raiz enésima "
				+ "\n2.-Potencia"
				+ "\n3.-Modulo"
				+ "\n\nElige una opción");
		int opcion = Integer.parseInt(str);
		
		switch (opcion) {
		case 1:
			//LECTURA DEL RADICANDO Y DEL INDICE DE LA RAIZ
			str = JOptionPane.showInputDialog("numero del radicando");
			int radicando = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("indice de la raiz");
			float indice = Integer.parseInt(str);
			float raiz = (float)Math.pow(radicando, (1/indice));
			System.out.println("El resultado de tu raiz es " + raiz);
			break;
		
		case 2:	//POTENCIA
			str = JOptionPane.showInputDialog("Introduzca la base");
			int base = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Introduzca el exponente");
			float exponente = Float.parseFloat(str);
			float potencia = (float)Math.pow(base, exponente);
			System.out.println("El resultado de la potencia es " + potencia);
			break;
			
		case 3:	//MODULO
			str = JOptionPane.showInputDialog("Dividendo");
			int dividendo = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Divisor");
			int divisor = Integer.parseInt(str);
			 int modulo = dividendo % divisor;
			System.out.println("El resultado de tu resto es " + modulo);
			break;
		default:
			System.out.println("Error, el valor no pertenece a ninguna opcion");	
			
		}

	}

}
