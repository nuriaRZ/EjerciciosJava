package programacion.Examen2.ExamenCartas;

import programacion.Utils_Arrays;

public class Baraja {
	Carta[] cartas = new Carta[52];	
	/**
	 * 
	 */
	
	public Baraja () {
		int cartasLeidas = 0;
		for (int i = 0; i < 13; i++) {			
			cartas[cartasLeidas] = new Carta(i+1, "picas", i+1 + " de picas", cartasLeidas);
			cartasLeidas++;
		}
		
		for (int i = 0; i < 13; i++) {
			cartas[cartasLeidas] = new Carta(i+1, "diamantes", i+1 + " de diamantes", cartasLeidas);
			cartasLeidas++;
		}
		
		
		for (int i = 0; i < 13; i++) {			
			cartas[cartasLeidas] = new Carta(i+1, "treboles", i+1 + " de trebloles", cartasLeidas);
			cartasLeidas++;
		}
		
		for (int i = 0; i < 13; i++) {						
			cartas[cartasLeidas] = new Carta(i+1, "corazones", i+1 + " de corazones", cartasLeidas);
			cartasLeidas++;
		}
		
		
		
	}

	public void imprimirBaraja() {
		System.out.println("Baraja");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}
	
	public void pasarAbajoArriba() {
		Carta aux = cartas[0];
		
		System.out.println("Pasar de Abajo a arriba");
		
		for (int i= 1; i < cartas.length; i++) {
			cartas[i-1]=cartas[i];			
		}
		
		cartas[cartas.length-1]=aux;		
		System.out.println();		
		imprimirBaraja();
		
	}	
		
	public void pasarArribaAbajo() {
		Carta aux = cartas[cartas.length-1];
		
		System.out.println("Pasar de Arriba a abajo");
		
		for (int i= cartas.length-1; i>0; i--) {
			cartas[i]=cartas[i-1];			
		}
		
		cartas[0]=aux;		
		imprimirBaraja();		
	}
	
	public void mezclarBaraja() {
		System.out.println("Baraja Desordenada");
		
		for (int i =0 ; i < cartas.length*2; i++) {
			
			int i1, i2;
			 i1 = Utils_Arrays.ObtenerNumAleatorio(cartas.length-1, 0);
			 i2 = Utils_Arrays.ObtenerNumAleatorio(cartas.length-1, 0);
			 // REALIZO INTERCAMBIO DE VALORES
			 Carta aux = cartas[i1];
			 cartas[i1]=cartas[i2];
			 cartas[i2]=aux;
		}
		imprimirBaraja();			
	}
	
	public void ordenarBaraja() {
		System.out.println("Baraja ordenada");
		
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
		
		imprimirBaraja();
	}
	
	public void repartirMano(Jugador jugador) {
		Carta mano[] = new Carta[5];
		for (int i = 0; i < mano.length; i++) {
			int aux= 0;			
			
			do {
				aux=  (int)Math.round(Math.random()*(cartas.length-1));				
			}while (cartas[aux]==null);
						
			mano[i]=cartas[aux];
			cartas[aux]=null;//sacar la carta de la baraja			
		}
		
		jugador.setMano(mano);
		
	}
	

}
