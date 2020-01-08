package programacion.Capitulo6.Videojuego_Formula1.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import programacion.Utils;

public class Pista {
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
	protected int longitud = 100; 
	protected int WIDTH, HEIGH; 
	protected int X_POSITION = 0, Y_POSITION = 0;
	protected int esquinaSupIzq_X = 0, esquinaSupIzq_Y = 0;
	/**
	 * @param obstaculos
	 * @param longitud
	 */
	public Pista(int Y_POSITION) {
		super();		
		this.Y_POSITION = Y_POSITION;
		crearObstaculo();
	
	}
	
	public void crearObstaculo() {
		for (int i = 0; i < 4; i++) {
			int num = Utils.ObtenerNumAleatorioEntreLimites(10, 0);
			if (num <= 5) {
				obstaculos.add(new Rampa("Rampa", this.Y_POSITION));
			}
			if (num > 5) {
				obstaculos.add(new ManchaAceite("Mancha", this.Y_POSITION));
			}
			System.out.println("el obstaculo " + obstaculos.get(i).getNombre() + " está en la posición " 
					+ obstaculos.get(i).getPosicion() + " El obstaculo ocupa un espacio de:" + obstaculos.get(i).getEspacio());
		}
	}
	
	public void paint (Graphics g) {
		
		WIDTH = Frame.getInstance().getWidth();
		HEIGH = Frame.getInstance().getHeight()/4;
		esquinaSupIzq_X = this.X_POSITION;
		esquinaSupIzq_Y = this.Y_POSITION;
		g.setColor(Color.GRAY);
		g.fillRect(esquinaSupIzq_X, esquinaSupIzq_Y, WIDTH, HEIGH);	
		
		for (Obstaculo o: obstaculos) {
			o.paint(g);
		}
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

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	
	

	

}
