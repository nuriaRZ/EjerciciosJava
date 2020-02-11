package programacion.Capitulo6.excepciones.ej01_bloque04;

import programacion.Utils;


public class Ejercicio01 {
	

	public static int pideNumeroPar() throws NumImparException {
		int num = Utils.obtenerNumUsuario();
		if(num % 2 == 0) {
			return num;
			
		}
		else throw new NumImparException("Numero impar");
		
	}
	

	

	public static void main(String[] args) {
		
		try {
			pideNumeroPar();
		} catch (NumImparException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		

	

}
