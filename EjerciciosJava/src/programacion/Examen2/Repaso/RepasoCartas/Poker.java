package programacion.Examen2.Repaso.RepasoCartas;

public class Poker {
	Jugador jugadores[] = new Jugador[5];
	Baraja baraja = new Baraja();
	/**
	 * @param jugadores
	 * @param baraja
	 */
	public Poker(Baraja baraja) {	
		this.baraja = baraja;
		
		jugadores[0] = new Jugador("A");
		jugadores[1] = new Jugador("B");
		jugadores[2] = new Jugador("C");
		jugadores[3] = new Jugador("D");
		jugadores[4] = new Jugador("A");
		
		for (int i = 0; i < jugadores.length; i++) {
			baraja.repartirMano(jugadores[i]);
			System.out.println("Jugador: "+jugadores[i].getNombre());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println(jugadores[i].getMano()[j].toString());
			}
			jugadores[i].Jugada();
		}

		
	}
	
	
	

	
	

}
