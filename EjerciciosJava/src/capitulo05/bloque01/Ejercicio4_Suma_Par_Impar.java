package capitulo05.bloque01;

public class Ejercicio4_Suma_Par_Impar {

	public static void main(String[] args) {
		
		int num[]= new int[5];
		int par=0;
		int impar=0;
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)Math.round(Math.random()*100);
			System.out.print(num[i]+" ");
			
			//CONDICION PARA SABER SI EL INDICE DEL NUMERO ES PAR
			if (i%2==0) {
				
				par+=num[i]; //SUMA DE NUMEROS CUYO INDICE ES PAR
											
			}
			else { //LOS NUMEROS QUE NO CUMPLAN LA CONDICION DE IF TENDRAN INDICE IMPAR
				impar+=num[i];
			}
		}
		
		System.out.println("\nSuma de numeros cuyo indice es par: "+par
						+"\nSuma de numeros cuyo indice es impar: "+impar);
		
	}

}
