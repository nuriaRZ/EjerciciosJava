package programacion.ExamenTipoC;

import programacion.Utils_Arrays;

public class Apartado_a {

	public static void main(String[] args) {
		
		int array [] = Utils_Arrays.crearArrayNumAleatorio(100, 0, 100); // declaro el array con una longitud de 100 y con numeros 
																//generados al azar entre 0 y 100
		int suma=0; //declaro la variable suma que la inicializo en 0
		int mayor=0; //declaro la variable mayor que la inicializo en 0
		int menor=0; //declaro la variable menor que la inicializo en 0
		Utils_Arrays.mostrarArray(array); // muetro el array
		
		//recorro el array
		for (int i = 0; i < array.length; i++) {
			suma += array[i]; // en suma guardo las sumas de los numeros guardados en el array
		}
		System.out.println("\nSuma: "+suma //imprimo la suma
							+"\nMedia: "+(suma/array.length)); //imprimo la media que es la suma entre el numero de elementos que contiene
																//el array
		//vuelvo a recorrer el array
		for (int i = 0; i < array.length; i++) {
			if (i==0) { // si el indice del array es 0 le asigno a los dos el valor del array pues es el primer numero y seria el mayor y el menor
				mayor=array[i];
				menor=array[i];
			}
			else {
				if (array[i]>mayor){ // si recorriendo el array encuentra un numero mayor que el que hay guardado en la variable mayor
					mayor = array[i]; // guarda ese numero en la variable mayor
				}
				if (array[i]<menor){// si recorriendo el array encuentra un numero menor que el que hay guardado en la variable menor
					menor = array[i];// guarda ese numero en la variable menor
				}
			}
		}
		
		System.out.println("\nMayor: "+mayor
							+"\nMenor: "+menor); //imprimo los valores de las variables mayor y menor 
	}

}
