package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import programacion.Utils;

public class Pista {
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
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
		
		for (int i = 0; i < 4; i++) {
			int num = Utils.ObtenerNumAleatorioEntreLimites(1, 0);
			if (num < 0.5f) {
				obstaculos.add(new Rampa());
			}
			if (num > 0.5f) {
				obstaculos.add(new ManchaAceite());
			}
		}
	}
	
	public void paint (Graphics g) {
		
	}
	
	

	

}
