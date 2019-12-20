package programacion.Capitulo6.Videojuego_Formula1;

import programacion.Utils;

public class Obstaculo {
	private int posicionInicial;
	private int espacio;
	private int impulso;
	private int posicionFinal;
	
	/**
	 * @param posicion
	 * @param espacio
	 */
	public Obstaculo() {
		super();
		this.posicionInicial = Utils.ObtenerNumAleatorioEntreLimites(80, 0);
		this.espacio = Utils.ObtenerNumAleatorioEntreLimites(3, 1);
		this.posicionFinal = this.posicionInicial+this.espacio;
		this.impulso = impulso;
		
		
	}
	/**
	 * 
	 */
	
	/**
	 * @return the posicion
	 */
	public int getPosicionInicial() {
		return posicionInicial;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicionInicial(int posicionInicial) {
		this.posicionInicial = posicionInicial;
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

	/**
	 * @return the posicionFinal
	 */
	public int getPosicionFinal() {
		return posicionFinal;
	}

	/**
	 * @param posicionFinal the posicionFinal to set
	 */
	public void setPosicionFinal(int posicionFinal) {
		this.posicionFinal = posicionFinal;
	}
	
	
	
	

	

}
