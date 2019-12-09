package programacion.Examen2.Repaso.RepasoCartas;

public class Principal {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		
		baraja.mostrar();
		baraja.abajoArriba();
		baraja.arribaAbajo();
		baraja.mezclar();
		baraja.ordenar();
		
		Poker poker = new Poker(baraja);

	}

}
