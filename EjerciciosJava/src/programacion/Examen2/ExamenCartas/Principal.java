package programacion.Examen2.ExamenCartas;

public class Principal {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		
		baraja.imprimirBaraja();
		
		baraja.pasarAbajoArriba();
		
		baraja.pasarArribaAbajo();
		
		baraja.mezclarBaraja();
		
		baraja.ordenarBaraja();
		
		Poker poker = new Poker(baraja);
		
	}

}
