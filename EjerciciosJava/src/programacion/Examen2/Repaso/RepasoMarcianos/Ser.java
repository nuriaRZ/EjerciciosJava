package programacion.Examen2.Repaso.RepasoMarcianos;

import programacion.Utils;

public class Ser {
	private String nombre;
	private int puntosVida = Utils.ObtenerNumAleatorioEntreLimites(100, 50);
	private boolean estaVivo=true;
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
		
	}
	public Ser() {
		
	}
	/**
	 * 
	 */
	public boolean vivo() {
		if (this.puntosVida<=0) {
			return false;
		}
		return true;
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
		return "Ser [nombre=" + nombre + ", puntosVida=" + puntosVida + ", estaVivo=" + this.vivo() + "]";
	}
	
	
	

}
