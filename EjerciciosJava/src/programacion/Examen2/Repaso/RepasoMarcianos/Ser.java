package programacion.Examen2.Repaso.RepasoMarcianos;

import programacion.Utils;

public class Ser {
	private String nombre;
	private int puntosVida;
	private boolean estaVivo;
	/**
	 * 
	 */
	/**
	 * @param nombre
	 * @param puntosVida
	 * @param estaVivo
	 */
	public Ser(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = Utils.ObtenerNumAleatorioEntreLimites(100, 50);
		this.estaVivo = true;
		
	}
	public Ser() {
		
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
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}
	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	/**
	 * @return the estaVivo
	 */
	public boolean isEstaVivo() {
		return estaVivo;
	}
	/**
	 * @param estaVivo the estaVivo to set
	 */
	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}
	@Override
	public String toString() {
		return "Ser [nombre=" + nombre + ", puntosVida=" + puntosVida + ", estaVivo=" + estaVivo + "]";
	}
	
	
	

}
