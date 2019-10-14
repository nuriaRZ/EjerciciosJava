package capitulo05.bloque01;

public class Ejercicio5_Indice_Par_Impar {

	public static void main(String[] args) {
		
		int num[]= new int[150];
		int par=0;
		int impar=0;
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			System.out.print(num[i]+" ");
			
			//CONDICION PARA SABER SI EL NUMERO ES PAR
			if (num[i]%2==0) {
				
				par+=num[i]; //SUMA DE NUMEROS PARES
											
			}
			else { //LOS NUMEROS QUE NO CUMPLAN LA CONDICION DE IF SERAN IMPAR
				impar+=num[i];
			}
		}
		
		System.out.println("\nSuma de numeros pares: "+par
						+"\nSuma de numeros impares: "+impar);
		
	}

}
