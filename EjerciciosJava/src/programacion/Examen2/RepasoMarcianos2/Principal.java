package programacion.Examen2.RepasoMarcianos2;

import java.io.ObjectInputStream.GetField;

public class Principal {

	public static void main(String[] args) {
		CampoBatalla batalla = new CampoBatalla("Tatuin");
		
		
		do {
			batalla.getPrimerBichoVivoArray(batalla.getBattleDroid()).recibirDisparo();
			batalla.getPrimerBichoVivoArray(batalla.getTroopers()).recibirDisparo();
			batalla.mostrarSituacionActual();
			
			
		}while(!batalla.esFinDeJuego());
		//imprimir estadisticas
		System.out.println();
		System.out.println();
		System.out.println("Malvado con mayor num de Disparos"+"\n\t"+
		batalla.bichoConMayorNumDisparos(batalla.getBattleDroid()));
		System.out.println("Humano con mayor num de Disparos"+"\n\t"+
		batalla.bichoConMayorNumDisparos(batalla.getTroopers()));
		System.out.println("Malvado con menor num de Disparos"+"\n\t"+
		batalla.bichoConMenorNumDisparos(batalla.getBattleDroid()));
		System.out.println("Humano con menor num de Disparos"+"\n\t"+
		batalla.bichoConMenorNumDisparos(batalla.getTroopers()));

	}

}
