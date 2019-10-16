package capitulo05.bloque02;

public class Ejercicio02_3_Arrays {

	public static void main(String[] args) {
		
		int array1[]= new int [5];
		int array2[]= new int [5];
		int array3[]= new int [5];
		int impar=0;
		
		for (int i=0; i<array1.length; i++) {
			array1[i]=numAleatorio();
			System.out.print(array1+" ");
			
			if (i%2!=0) {
				impar=array1[i];
			}
		}	
			
		for (int j=0; j<array3.length; j++) {
			array3[j]=numAleatorio();
			
			System.out.print(array3+" ");
			
				if (j%2!=0) {
					array3[j]=impar;
				}
			
		}
		System.out.println(array3);
	}
	
	/**
	 * 
	 * @return
	 */
	
	private static int numAleatorio() {
		return (int) Math.round(Math.random()*100);
	}

}
