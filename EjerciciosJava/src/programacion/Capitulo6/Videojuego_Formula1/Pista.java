package programacion.Capitulo6.Videojuego_Formula1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import programacion.Utils;

public class Pista extends Canvas {
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
	private int WIDTH; //ANCHO
	private int HEIGH; //ALTO 
	private int X_POSITION, Y_POSITION;
	private int esquinaSupIzq_X, esquinaSupIzq_Y;
	/**
	 * @param obstaculos
	 * @param longitud
	 */
	public Pista() {
		super();
		this.obstaculos = obstaculos;
		
		
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
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		WIDTH = Frame.getInstance().getWidth()/4;
		HEIGH = Frame.getInstance().getHeight();
		esquinaSupIzq_X = this.X_POSITION * WIDTH;
		esquinaSupIzq_Y = this.Y_POSITION * HEIGH;
		g.setColor(Color.BLACK);
		g.fillRect(esquinaSupIzq_X, esquinaSupIzq_Y, WIDTH, HEIGH);		
	}

	/**
	 * @return the obstaculos
	 */
	public List<Obstaculo> getObstaculos() {
		return obstaculos;
	}

	/**
	 * @param obstaculos the obstaculos to set
	 */
	public void setObstaculos(List<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}

	/**
	 * @return the wEIDTH
	 */
	public int getWIDTH() {
		return WIDTH;
	}

	/**
	 * @param wEIDTH the wEIDTH to set
	 */
	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	/**
	 * @return the hEIGH
	 */
	public int getHEIGH() {
		return HEIGH;
	}

	/**
	 * @param hEIGH the hEIGH to set
	 */
	public void setHEIGH(int hEIGH) {
		HEIGH = hEIGH;
	}
	
	
	
	

	

}
