package capitulo05.bloque01;

public class Ejercicio2_Arrays_Al_Azar {

	public static void main(String[] args) {
		
		int num[]= new int[5];
		
		
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			System.out.print(num[i]+" ");			
		}	
		
		System.out.println("\nOrden inverso");
			
		for ( int i=num.length-1; i>=0; i--) {
			
			System.out.print(num[i]+" ");
			
			
			
		}
		
						
		

	}

}
