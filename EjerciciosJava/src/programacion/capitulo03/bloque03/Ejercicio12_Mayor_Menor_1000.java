package programacion.capitulo03.bloque03;

public class Ejercicio12_Mayor_Menor_1000 {

	public static void main(String[] args) {
		
		
		int mayor=-1;
		int menor=-1;
		
		for (int i=0; i<1000; i++) {
			int num=(int)Math.round(Math.random()*1000);
			System.out.println(num);
			if (i==0) {
			mayor=num;
			menor=num;
			}
			else {
			
				if (num>mayor) {
					mayor=num;
				}
			
				if (num<menor) {
					menor=num;
				}
			
		}
		

		}
		System.out.println("El mayor es: "+mayor
				+"\nEl menor es: "+menor);
	}

}
