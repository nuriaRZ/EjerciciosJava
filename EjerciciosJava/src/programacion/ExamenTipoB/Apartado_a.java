package programacion.ExamenTipoB;

import programacion.Utils_Arrays;

public class Apartado_a {

	public static void main(String[] args) {
		
		int array [] = Utils_Arrays.crearArrayNumAleatorio(100, 0, 100);
		int suma=0;
		int mayor=0;
		int menor=0;
		Utils_Arrays.mostrarArray(array);
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println("\nSuma: "+suma
							+"\nMedia: "+(suma/array.length));
		
		for (int i = 0; i < array.length; i++) {
			if (i==0) {
				mayor=array[i];
				menor=array[i];
			}
			else {
				if (array[i]>mayor){
					mayor = array[i];
				}
				if (array[i]<menor){
					menor = array[i];
				}
			}
		}
		
		System.out.println("\nMayor: "+mayor
							+"\nMenor: "+menor);
	}

}
