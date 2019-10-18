package programacion.Capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_hipotenusa {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("--MENU--"  
				+ "\n1. C�lculo de la hipotenusa de un tri�ngulo"
				+"\n2. C�lculo de la superficie de una circunferencia"
				+"\n3. C�lculo del per�metro de una circunferencia" 
				+"\n4. C�lculo del �rea de un rect�ngulo"  
				+"\n5. C�lculo del �rea de un tri�ngulo" 
				+"\n0. Salir de la aplicaci�n"  
				+"\n\nElija una opcion");
		int opcion = Integer.parseInt(str);
		
		switch (opcion) {
		
		case 1: //HIPOTENUSA TRIANGULO
			str = JOptionPane.showInputDialog("Introduzca la longitud del primer cateto");
			float cateto1 = Float.parseFloat(str);;
			str = JOptionPane.showInputDialog("Introduzca la longitud del segundo cateto");
			float cateto2 = Float.parseFloat(str);
						
			float hipotenusa = (float) Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
			
			System.out.println("La longitud de la hipotenusa es: "+hipotenusa);
		break;
		
		case 2: //SUPERFICIE CIRCUNFERENCIA
			str = JOptionPane.showInputDialog("Introduzca la longitud del radio");
			float radio = Float.parseFloat(str);
			
			double areaCircunf = Math.PI * (Math.pow(radio, 2));
			
			System.out.println("La superficie de la circunferencia es: "+(float)areaCircunf);
		break;
		
		case 3: //PERIMETRO CIRCUNFERENCIA
			str = JOptionPane.showInputDialog("Introduzca la longitud del radio");
			radio = Float.parseFloat(str);
			
			double perimetro = 2 * Math.PI * radio;
			
			System.out.println("El perimetro de la circunferencia es: "+(float)perimetro);
		break;
		
		case 4: //AREA RECTANGULO
			str = JOptionPane.showInputDialog("Introduzca la longitud de la base");
			float base = Float.parseFloat(str);;
			str = JOptionPane.showInputDialog("Introduzca la longitud de la altura");
			float altura = Float.parseFloat(str);
			
			float area = base * altura;
			
			System.out.println("El area del rectangulo es: "+area);
		break;
		
		case 5: //AREA TRIANGULO
			str = JOptionPane.showInputDialog("Introduzca la longitud de la base");
			base = Float.parseFloat(str);;
			str = JOptionPane.showInputDialog("Introduzca la longitud de la altura");
			altura = Float.parseFloat(str);
			
			area = (base * altura)/2;
			
			System.out.println("El area del triangulo es: "+area);
		break;
		
		case 0: //SALIR		
			
		return;
		
		
		default :
			
			System.out.println("Opci�n incorrecta");
		break;	
		}
		

	}

}
