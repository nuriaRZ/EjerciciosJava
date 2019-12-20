package programacion.Capitulo6.Videojuego_Formula1;

public class Main {
	

	public static void main(String[] args) {
		Race kart = new Race();
		
		do {
			kart.avanzar();
		}while(!kart.esFinDeJuego());
		
		
		

	}

}
