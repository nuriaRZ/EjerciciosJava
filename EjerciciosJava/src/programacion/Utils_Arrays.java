package programacion;

public class Utils_Arrays {
	
	public static int NumAlAzar() {
		return (int) Math.round(Math.random()*100);
	}
	
	/**
	 * 
	 * @return
	 */
	
	
	public static int ObtenerNumAleatorio (int limiteSup, int limiteInf) {
		return (int) Math.round(Math.random()*(limiteSup - limiteInf))+limiteInf;
		
	}
	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	
	public static int[] crearArrayNumAleatorio (int longitud, int limInf, int limSup) {
		int array[] = new int [longitud];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = ObtenerNumAleatorio(limInf, limSup);
			
		}
		return array;		
		
		
	}
	
	/**
	 * 
	 */
	public static float[] crearArrayFloatNumAleatorio (int longitud, int limInf, int limSup) {
		float array[] = new float [longitud];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = ObtenerNumAleatorio(limInf, limSup);
			
		}
		return array;		
		
		
	}
	
	/**
	 * 
	 */
	
	public static void mostrarArray (int[] array) {
		System.out.println("\nContenido del array");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+" ");
		}
	}

}
