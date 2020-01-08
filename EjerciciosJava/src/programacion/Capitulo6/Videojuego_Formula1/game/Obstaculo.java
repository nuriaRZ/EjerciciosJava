package programacion.Capitulo6.Videojuego_Formula1.game;

import java.awt.Color;
import java.awt.Graphics;

import programacion.Utils;

public abstract class Obstaculo {
	protected String nombre;
	protected int posicion;
	protected int espacio;
	protected int impulso;	
	protected int Y_COORD;
	protected Color color;

	
	
	/**
	 * @param nombre
	 * @param posicion
	 * @param espacio
	 * @param impulso
	 * @param posicionFinal
	 * @param y_COORD
	 */
	public Obstaculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = Utils.ObtenerNumAleatorioEntreLimites(80, 0);
		this.espacio = Utils.ObtenerNumAleatorioEntreLimites(3, 1);
		this.impulso = impulso;		
		this.Y_COORD = Y_COORD;
	}
	/**
	 * 
	 * @param g
	 */

	public abstract void paint(Graphics g);
	/**
	 * @return the posicion
	 */

	/**
	 * @return the espacio
	 */
	public int getEspacio() {
		return espacio;
	}
	/**
	 * @param espacio the espacio to set
	 */
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}

	/**
	 * @return the impulso
	 */
	public int getImpulso() {
		return impulso;
	}

	/**
	 * @param impulso the impulso to set
	 */
	public void setImpulso(int impulso) {
		this.impulso = impulso;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the y_COORD
	 */
	public int getY_COORD() {
		return Y_COORD;
	}
	/**
	 * @param y_COORD the y_COORD to set
	 */
	public void setY_COORD(int y_COORD) {
		Y_COORD = y_COORD;
	}


}
