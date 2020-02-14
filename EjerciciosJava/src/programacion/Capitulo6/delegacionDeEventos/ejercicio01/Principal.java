package programacion.Capitulo6.delegacionDeEventos.ejercicio01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	private static List<TresDigitosIntroducidosListener> tresDigitosIntroducidos = new ArrayList<TresDigitosIntroducidosListener>();

	public static void main(String[] args) {
		
		while (true){
			Scanner sc = new  Scanner(System.in);
			System.out.println("Introduzca una frase");
			String frase = sc.nextLine();
			int i=0;
			int contador=0;

			
			do {
			
				char caracter = frase.charAt(i);
				
				
				if (Character.isDigit(caracter)) {
					contador++;
					System.out.println("funciona");
				}
				i++;
			}while(i<frase.length() && contador<3);
			
			if(contador == 3) {
				
			}

		}
		

	}

}
