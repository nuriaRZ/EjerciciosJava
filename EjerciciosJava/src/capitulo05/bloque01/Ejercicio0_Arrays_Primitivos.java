package capitulo05.bloque01;

public class Ejercicio0_Arrays_Primitivos {

	public static void main(String[] args) {
		
		int num[]= new int[150];
		int suma=0;
		int mayor=0;
		int menor=0;
		
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			System.out.print(num[i]+" ");
			
			suma+=num[i];
			
			if (i==0) {
				mayor=num[i];
				menor=num[i];
			}
			else {
				if (num[i]>mayor) mayor=num[i];
				if (num[i]<menor) menor=num[i];
			}
			
			
			
		}
		System.out.println("\nLa suma de todos los numeros es: "+suma
						+"\n El numero mayor es: "+ mayor
						+"\n El numero menor es: "+ menor
						+"\n La media de los numeros es: "+ (float) suma/num.length);
						
		

	}

}
