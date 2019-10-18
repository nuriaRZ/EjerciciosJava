package programacion.Capitulo01;

import javax.swing.JOptionPane;

public class Ejercicio6Bloque01 {

	public static void main(String[] args) {
	
	//Interés Anual = Euribor + Diferencial (Ganancia del banco o caja)
	//Capital = Cantidad de unidades monetarias de la hipoteca
	//N = Número de plazos mensuales de la hipoteca.	
		
		int N = 120;
		float capital, euribor, diferencial;
		String str = JOptionPane.showInputDialog("Introduzca valor de capital");
		capital = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca valor de Euribor");
		euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca valor de diferencial");
		diferencial = Float.parseFloat(str);
		
		float IA = euribor + diferencial;
		float IM = (IA/12)/ 100; 
			
		
		float CM =  capital*(float)(IM*Math.pow(1+IM, N)/(float)(Math.pow(1+IM, N)-1));
		
		System.out.println("Tu cuota es: " + CM);
		
	}

}
