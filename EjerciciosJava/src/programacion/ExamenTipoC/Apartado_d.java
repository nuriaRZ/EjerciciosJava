package programacion.ExamenTipoC;

import javax.swing.JOptionPane;

import programacion.Utils_Arrays;

public class Apartado_d {

	public static void main(String[] args) {
		
		int array[] = Utils_Arrays.crearArrayNumAleatorio(100, 0, 100);//declaro un array con longitud de 100 con numeros al azar entre 0 y 100
		
		int cifra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero")); //pido un numero al usuario que guardo en la 
																				//variable cifra
		Utils_Arrays.mostrarArray(array);//muestro array
		System.out.println();//salto de linea
		System.out.println("\nNumeros que acaban en "+cifra);
		
		//recorro el array
		for (int i = 0; i < array.length; i++) {
			int resto = array[i]%10; //el elemento del array lo divido entre diez y guardo su resto en la variable resto ya que al ser de 
			//dos cifras al dividir entre diez su resto siempre va a ser la ultima cifra del numero
			
			if(resto==cifra) {//si el resto coincide con la cifra que ha introducido el usuario imprime en pantalla todos los elementos que 
							//acaben en dicha cifra
				System.out.print(array[i]+" ");
			}
		}

	}

}
