package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Graphics;

import programacion.Utils;

public class Pista {
	Obstaculo obstaculos[] = new Obstaculo [4];
	private int WEIDTH; //ANCHO
	private int HEIGH; //ALTO 
	/**
	 * @param obstaculos
	 * @param longitud
	 */
	public Pista() {
		super();
		this.obstaculos = obstaculos;
		this.WEIDTH = 100;
		
		for (int i = 0; i < obstaculos.length; i++) {
			int num = Utils.ObtenerNumAleatorioEntreLimites(1, 0);
			if (num < 0.5f) {
				obstaculos[i] = new Rampa();
			}
			if (num > 0.5f) {
				obstaculos[i] = new ManchaAceite();
			}
		}
	}
	
	public void paint (Graphics g) {
		
	}
	
	

	

}
