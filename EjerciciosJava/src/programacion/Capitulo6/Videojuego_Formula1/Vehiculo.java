package programacion.Capitulo6.Videojuego_Formula1;

import java.io.ObjectInputStream.GetField;

import programacion.Utils;

public abstract class Vehiculo {
	private String nombre;
	private int posicion;
	private String color;
	private Pista p;
	/**
	 * @param nombre
	 * @param posicion
	 * @param color
	 */
	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = 0;
		this.p = new Pista();
	}
	/**
	 * 
	 */
	public void seMueve() {
		this.posicion += Utils.ObtenerNumAleatorioEntreLimites(6, 1); 
		
	}
	/**
	 * 
	 */
	public abstract void caerEnObstaculo();
	
	
	public abstract void paint();
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
		this.posicion += posicion;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the p
	 */
	public Pista getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Pista p) {
		this.p = p;
	}
	
	

	

}
