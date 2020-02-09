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
	
	String str = JOptionPane.showInputDialog("Introduce una contraseña, debe contener:\n"+
	"- Al menos una mayúscula.\n-Al menos una minúscula.\n-Al menos un dígito.\n- Al menos un carácter no alfanumérico.");
	
	boolean mayuscula = false;
	boolean minuscula = false;
	boolean digito = false;
	boolean noAlfanumerico = false;
	char cadenaCaracteres[] = new char [str.length()] ;
		
		for (int i = 0; i < cadenaCaracteres.length; i++) {
			cadenaCaracteres[i] = str.charAt(i);
			
			if(Character.isUpperCase(cadenaCaracteres[i])) mayuscula = true;
	
			if (Character.isLowerCase(cadenaCaracteres[i])) minuscula = true;
			if 	(Character.isDigit(cadenaCaracteres[i])) digito = true;
			if (!(Character.isLetterOrDigit(cadenaCaracteres[i]))) noAlfanumerico = true;
				
		}
		System.out.println("La contraseña introducida es:" + str.toString());
		if (mayuscula == true && minuscula == true && digito == true && noAlfanumerico == true) {
			
			System.out.println("Tu contraseña es válida");
		}else {
			System.out.println("Su contraseña no es válida");
		}	
	
	}
	
	public static void ejercicio03() {
		
		for (int i =  0; i < 100; i ++) {
			
			System.out.println(i +"\t"+ Integer.toHexString(i));
			
		}
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
