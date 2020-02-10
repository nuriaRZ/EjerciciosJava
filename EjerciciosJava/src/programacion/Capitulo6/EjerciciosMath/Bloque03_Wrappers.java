package programacion.Capitulo6.EjerciciosMath;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bloque03_Wrappers {

	public Bloque03_Wrappers() {
		
	}
	
	public static void ejercicio01() {
		System.out.println("*********************"+"********************"+"********************"+
						   "\n*      UNIDAD       *"+"      MAXIMO       *"+"      MINIMO       *"+
						  "\n*********************"+"***********************"+"*****************************"+
						"\n*      byte         *"+"\t"+Byte.MAX_VALUE+"\t"+"*"+"\t\t"+Byte.MIN_VALUE+"\t"+"*"+
						 "\n*********************"+"*************************"+"******************************"+
						"\n*      int         *"+"\t"+Integer.MAX_VALUE+"\t"+"*"+"\t"+Integer.MIN_VALUE+"\t"+"*"+
						"\n*********************"+"**************************"+"*******************************"+
						"\n*      short         *"+ "\t"+Short.MAX_VALUE+"\t"+   "*"+"\t\t"+Short.MIN_VALUE+"\t"+"*"+
						"\n*********************"+"**************************"+"*******************************"+
						"\n*      long         *"+"\t"+Long.MAX_VALUE+"\t"+   "*"+"\t"+Long.MIN_VALUE+"\t"+"*"+
						"\n*********************"+"**************************"+"*******************************"+
						"\n*      Float        *"+"\t"+Float.MAX_VALUE+"\t"+   "*"+"\t"+Float.MIN_VALUE+"\t"+"*"+
						"\n*********************"+"**************************"+"********************************"+
						"\n*      Double        *"+"\t"+Double.MAX_VALUE+"\t"+"*"+"\t"+Double.MIN_VALUE+"\t"+"*"+
						"\n*********************"+"***************************"+"******************************");
		

	}
	
	public static void ejercicio02() {
	
	boolean mayuscula = false;
	boolean minuscula = false;
	boolean digito = false;
	boolean noAlfanumerico = false;
	String str;
	
	
		do {
		 str = JOptionPane.showInputDialog("Introduce una contrase�a, debe contener:\n"+
			"- Al menos una may�scula.\n-Al menos una min�scula.\n-Al menos un d�gito.\n- Al menos un car�cter no alfanum�rico.");
			char cadenaCaracteres[] = new char [str.length()] ;
			for (int i = 0; i < cadenaCaracteres.length; i++) {
				cadenaCaracteres[i] = str.charAt(i);
				
				if(Character.isUpperCase(cadenaCaracteres[i])) mayuscula = true;
		
				if (Character.isLowerCase(cadenaCaracteres[i])) minuscula = true;
				if 	(Character.isDigit(cadenaCaracteres[i])) digito = true;
				if (!(Character.isLetterOrDigit(cadenaCaracteres[i]))) noAlfanumerico = true;
					
			}
			if (minuscula ==false || mayuscula==false || digito==false || noAlfanumerico ==false) {
				System.out.println("La contrase�a introducida es:" + str.toString());
				System.out.println("La contrase�a no es v�lida");
			}
			
		}while(!(mayuscula && minuscula && digito && noAlfanumerico));
		System.out.println("La contrase�a introducida es:" + str.toString());
		System.out.println("La contrase�a es v�lida");
		
	
	
	}
	
	public static void ejercicio03() {
		
		for (int i =  0; i < 100; i ++) {
			
			System.out.println(i +"\t"+ Integer.toHexString(i));
			
		}
	}

	public static void main(String[] args) {
		ejercicio02();

	}

}
