package capitulo05.bloque02;

public class Ejercicio01_Pasar_Positivo_Negat {

	public static void main(String[] args) {
		
		int num[] = new int [10];
		int par = 0;
		
		int limite= (100-(-100));
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*limite+-(-100));
			System.out.print(num[i]+" ");
			
			
			
			//EN EL CASO DE QUE SEA PAR Y POSITIVO
			if (num[i]%2==0 && num[i]>0) {
				
				//MULTIPLICAMOS POR -1 PARA QUE SEAN NEGATIVOS
				
				par=num[i]*(-1);
				
				System.out.print(par+" ");
														
			}
			
			else {
				par=num[i]*(-1);
				
				System.out.print(par+" ");
							
			}
			System.out.println("\n");
		}
		

	

	}

}
