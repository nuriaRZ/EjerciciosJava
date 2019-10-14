package capitulo05.bloque01;

public class Ejercicio1_Arrays_Num_Limite {

	public static void main(String[] args) {
		
		int num[]= new int[150];
		
		
		for (int i=0; i<num.length; i++) {
			int limite = (500-(-500));
			num[i]=(int)Math.round(Math.random()*limite+(-500));
			
			System.out.print(num[i]+" ");
	
		}

	}

}
