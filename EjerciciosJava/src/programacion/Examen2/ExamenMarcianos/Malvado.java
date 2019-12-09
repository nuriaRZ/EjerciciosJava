package programacion.Examen2.ExamenMarcianos;

public class Malvado {
	private int puntosVida;
	private String nombre;
	private boolean estaVivo;
	/**
	 * 
	 */
	public Malvado() {
		
	}
	/**
	 * @param puntosVida
	 * @param nombre
	 * @param estaVivo
	 */
	public Malvado(int puntosVida, String nombre) {
		super();
		this.puntosVida = puntosVida;
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
	/**
	 * 
	 */
	public boolean vivo (boolean estaVivo) {
		if (this.puntosVida==0) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Malvado [puntosVida=" + puntosVida + ", nombre=" + nombre + ", estaVivo=" + vivo(estaVivo) + "]";
	}
	



}
