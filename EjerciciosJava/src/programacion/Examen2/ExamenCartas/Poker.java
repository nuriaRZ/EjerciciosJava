package programacion.Examen2.ExamenCartas;

public class Poker {
	private Jugador jugadores[] = new Jugador[5];
	private Baraja baraja;
	/**
	 * @param jugadores
	 * @param baraja
	 */
	public Poker( Baraja baraja) {				
		this.baraja = baraja;		
		jugadores[0] = new Jugador("Tere");
		jugadores[1] = new Jugador("Paco");
		jugadores[2] = new Jugador("Maria");
		jugadores[3] = new Jugador("Antonia");
		jugadores[4] = new Jugador("Ana");
	}
	
	

}
