package programacion.Capitulo6.delegacionDeEventos.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	private static List<TresDigitosIntroducidosListener> tresDigitosIntroducidosListeners = new ArrayList<TresDigitosIntroducidosListener>();

	public static void main(String[] args) {
		BuscaDigitos bd = new BuscaDigitos();
		
		while (true){
			Scanner sc = new  Scanner(System.in);
			System.out.println("Introduzca una frase");
			String frase = sc.nextLine();
			int i=0;
			int contador=0;
			
			do {
			
				char caracter = frase.charAt(i);
				
				if (Character.isDigit(caracter)) {
					fireTresDigitosIntroducidosListener(new DigitoIntroducidoEvent(caracter));
					contador++;
				}
				i++;
			}while(i<frase.length() && contador<3);

		}
		

	}
	
	public static void addTresDigitosIntroducidosListener (TresDigitosIntroducidosListener listener) {
		tresDigitosIntroducidosListeners.add(listener);
		
	}
	
	public static void removeTresDigitosIntroducidosListener (TresDigitosIntroducidosListener listener) {
		tresDigitosIntroducidosListeners.remove(listener);
		
	}
	
	public static void fireTresDigitosIntroducidosListener (DigitoIntroducidoEvent event) {
		for (TresDigitosIntroducidosListener listener: tresDigitosIntroducidosListeners) {
			listener.tresDigitosIntroducidosListener(event);
		}
	}

}
