package programacion.Examen2;

import java.util.Arrays;

public class Baraja {
	Carta[] cartas = new Carta[51];
	
	
	int contador;
	
	private String picas;
	private String diamantes;
	private String treboles;
	private String corazones;
	
	public Baraja () {
		int cartasLeidas = 0;
		for (int i = 0; i < 13; i++) {
			cartasLeidas++;
			
			cartas[i] = new Carta(i+1, "picas", i + " picas", cartasLeidas);
			
		}
		
		for (int i = 0; i < 13; i++) {
			cartasLeidas++;
			cartas[i] = new Carta(i+1, "diamantes", i + " diamantes", cartasLeidas);
		}
		
		
		for (int i = 0; i < 13; i++) {
			cartasLeidas++;
			
			cartas[i] = new Carta(i+1, "treboles", i + " trebloles", cartasLeidas);
		}
		
		for (int i = 0; i < 13; i++) {
			cartasLeidas++;
			
			cartas[i] = new Carta(i+1, "corazones", i + " corazones", cartasLeidas);
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "\n ";
	}

	



	

	
	

}
