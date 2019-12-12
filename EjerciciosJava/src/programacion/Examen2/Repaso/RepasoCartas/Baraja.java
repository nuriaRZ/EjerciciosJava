package programacion.Examen2.Repaso.RepasoCartas;

import programacion.Utils_Arrays;

public class Baraja {
	Carta cartas[] = new Carta[52];
	
	/**
	 * 
	 */
	public Baraja() {
		int contador = 0;
		for (int i = 0; i < 13; i++) {
			cartas[i] = new Carta(i+1, "picas", i);
			contador++;			
		}
		for (int i = 0; i < 13; i++) {
			cartas[contador] = new Carta(i+1, "diamantes", contador);
			contador++;
		}
		for (int i = 0; i < 13; i++) {
			cartas[contador] = new Carta(i+1, "treboles", contador);
			contador++;
		}
		for (int i = 0; i < 13; i++) {
			cartas[contador] = new Carta(i+1, "corazones", contador);
			contador++;
		}
	}
	/**
	 * 
	 */	
	public void mostrar() {
		System.out.println("Baraja:");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	/**
	 * 
	 */
	public void abajoArriba() {
		System.out.println("Desplazar la primera carta hacia abajo");
		Carta aux = cartas[0];
		for (int i= 1; i < cartas.length; i++) {
			cartas[i-1]=cartas[i];			
		}
		cartas[cartas.length-1]=aux;
		mostrar();
	}
	/**
	 * 
	 */	
	public void arribaAbajo() {
		System.out.println("Desplazar la ultima carta hacia arriba");
		Carta aux = cartas[cartas.length-1];
		for (int i= cartas.length-1; i>0; i--) {
			cartas[i]=cartas[i-1];			
		}		
		cartas[0]=aux;
		mostrar();
	}
	/**
	 * 
	 */
	public void mezclar() {
		Carta aux=cartas[0];
		
		System.out.println("Mezclar baraja");
		
		for (int i =0 ; i < cartas.length*2; i++) {
			
		int i1, i2;
		 i1 = Utils_Arrays.ObtenerNumAleatorio(cartas.length-1, 0);
		 i2 = Utils_Arrays.ObtenerNumAleatorio(cartas.length-1, 0);
		 // REALIZO INTERCAMBIO DE VALORES
		 aux = cartas[i1];
		 cartas[i1]=cartas[i2];
		 cartas[i2]=aux;
		}
		mostrar();
	}
	/**
	 * 
	 */
	public void ordenar() {
		boolean esMayor = false;		
		int contador=0;		
		
		do {
			esMayor=false;			
			for (int i = 0; i < cartas.length-1; i++) {			
					if (cartas[i].getId()>cartas[i+1].getId()) {
					
						Carta aux = cartas[i];
						cartas[i]=cartas[i+1];
						cartas[i+1]=aux;
						esMayor=true;					
				}
			}
			contador++;	
		}while(esMayor);
		mostrar();
	}
	/**
	 * 
	 * @param jugador
	 */
	
	public void repartirMano(Jugador jugador) {
		Carta mano[] = new Carta[5];
		
		for (int i = 0; i < mano.length; i++) {
			int aux = 0;
			do { 
				aux =(int)Math.round(Math.random()*cartas.length-1);
				
			}while (cartas[aux]==null);
			mano[i]=cartas[aux];
			cartas[aux]=null;
		}
		jugador.setMano(mano);
		
	}
	
	

}
