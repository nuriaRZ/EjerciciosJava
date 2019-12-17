package programacion.Capitulo6.Videojuego_Formula1;

import programacion.Utils;

public class Obstaculo {
	private int posicion;
	private int espacio;
	private int impulso;
	
	/**
	 * @param posicion
	 * @param espacio
	 */
	public Obstaculo() {
		super();
		this.posicion = Utils.ObtenerNumAleatorioEntreLimites(80, 0);
		this.espacio = Utils.ObtenerNumAleatorioEntreLimites(3, 1);
		this.posicion+=this.espacio;
		this.impulso = 5;
	}
	/**
	 * 
	 */
	
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
	
	

	

}
