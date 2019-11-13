package programacion.ExamenTipoA;

import programacion.Utils_Arrays;

public class Apartado_e {

	public static void main(String[] args) {
		int array[]= new int [20]; //Declaro el array con una longitud de 20
		
		//para llenarlo de numeros al azar recorro el array
		for (int i = 0; i < array.length; i++) {
			int num; // declaro la variable num 
			boolean numYaExiste;// bandera que me ayudara a saber si un numero ya ha salido
			
			do {
				numYaExiste = false;
				num = Utils_Arrays.ObtenerNumAleatorio(40, 0); // se le asigna numeros aleatorios entre un limite sup de 40 y un inferior de 0
				
				for (int j = 0; j < array.length; j++) {//se vuelve a recorrer el array para saber si el numero guardado en num ha salido antes
				
					if (num==array[j]) numYaExiste = true; // si es asi el valor de la bandera cambia a true
				}		
			}while(numYaExiste); // este bucle se ejecutara mientras el valor de la bandera sea false por eso es necesario asignarlo al inicio del do
			
			array[i]=num;//se guarda en la posicion actual del array el numero que se ha guardado en la variable num
		}
		Utils_Arrays.mostrarArray(array);//mostrar array

	}

}
